package elf64writer

import (
	"encoding/binary"
	"fmt"
	"io"

	"riscvasm.com/m/v2/elfcreator"
)

type elf64_Addr uint64   // Unsigned program address
type elf64_Off uint64    // Unsigned file offset
type elf64_Half uint16   // Unsigned medium integer
type elf64_Word uint32   // Unsigned integer
type elf64_Sword uint32  // Signed integer
type elf64_Xword uint64  // Unsigned long integer
type elf64_Sxword uint64 // Signed long integer
type elf64_Byte uint8    // Unsigned small integer

type elf64_Ehdr struct {
	e_ident     [eI_NIDENT]elf64_Byte // ELF identification
	e_type      elf64_Half            // Object file type
	e_machine   elf64_Half            // Machine type
	e_version   elf64_Word            // Object file version
	e_entry     elf64_Addr            // Entry point address
	e_phoff     elf64_Off             // Program header offset
	e_shoff     elf64_Off             // Section header offset
	e_flags     elf64_Word            // Processor-specific flags
	e_ehsize    elf64_Half            // ELF header size
	e_phentsize elf64_Half            // Size of program header entry
	e_phnum     elf64_Half            // Number of program header entries
	e_shentsize elf64_Half            // Size of section header entry
	e_shnum     elf64_Half            // Number of section header entries
	e_shstrndx  elf64_Half            // Section name string table index
}

type elf64_Phdr struct {
	p_type   elf64_Word  // Type of segment
	p_flags  elf64_Word  // Segment attributes
	p_offset elf64_Off   // Offset in file
	p_vaddr  elf64_Addr  // Virtual address in memory
	p_paddr  elf64_Addr  // Reserved
	p_filesz elf64_Xword // Size of segment in file
	p_memsz  elf64_Xword // Size of segment in memory
	p_align  elf64_Xword // Alignment of segment
}

type elf64_Shdr struct {
	sh_name      elf64_Word  // Section name
	sh_type      elf64_Word  // Section type
	sh_flags     elf64_Xword // Section attributes
	sh_addr      elf64_Addr  // Virtual address in memory
	sh_offset    elf64_Off   // Offset in file
	sh_size      elf64_Xword // Size of section
	sh_link      elf64_Word  // Link to other section
	sh_info      elf64_Word  // Miscellaneous information
	sh_addralign elf64_Xword // Address alignment boundary
	sh_entsize   elf64_Xword // Size of entries, if section has table
}

type elf64 struct {
	complete        bool
	byteOrder       binary.ByteOrder
	header          elf64_Ehdr
	program_headers []elf64_Phdr
	sections        []elfcreator.ElfSection
	section_headers []elf64_Shdr

	symtab   *symtab
	strtab   *strtab
	shstrtab *shstrtab
}

type padding struct {
	elfcreator.S_base
	size uint64
}

func (s padding) Valid() bool                             { return false }
func (s padding) Name() string                            { return "" }
func (s padding) Size() uint64                            { return s.size }
func (s padding) Bytes(byteOrder binary.ByteOrder) []byte { return make([]byte, s.size) }
func (s padding) Type() elfcreator.SHType                 { return elfcreator.SHType_NULL }

type shstrtab struct {
	elfcreator.StringTable
}

func (s *shstrtab) Name() string { return ".shstrtab" }

type strtab struct {
	elfcreator.StringTable
}

func (s *strtab) Name() string { return ".strtab" }

const elf64SymbolSize int = 24

type elf64Symbol struct {
	st_name  elf64_Word
	st_info  elf64_Byte
	st_other elf64_Byte
	st_shndx elf64_Half
	st_value elf64_Addr
	st_size  elf64_Xword
}

type symtab struct {
	elfcreator.S_base
	entries []elf64Symbol
}

func (s *symtab) Name() string     { return ".symtab" }
func (s *symtab) LinkName() string { return ".strtab" }
func (s *symtab) Info() uint32 {
	i := 0
	for j, entry := range s.entries {
		if entry.st_info>>4 == elf64_Byte(elfcreator.STB_LOCAL) {
			i = j
		}
	}
	return uint32(i + 1)
}
func (s *symtab) EntrySize() uint64 {
	return uint64(elf64SymbolSize)
}
func (s *symtab) Type() elfcreator.SHType { return elfcreator.SHType_SYMTAB }

func (s *symtab) Size() uint64 {
	if len(s.entries) == 0 {
		s.entries = append(s.entries, elf64Symbol{})
	}
	return uint64(len(s.entries) * elf64SymbolSize)
}

func (s *symtab) Bytes(byteOrder binary.ByteOrder) []byte {
	if len(s.entries) == 0 {
		s.entries = append(s.entries, elf64Symbol{})
	}
	buf := make([]byte, len(s.entries)*elf64SymbolSize)
	_, err := binary.Encode(buf, byteOrder, s.entries)
	if err != nil {
		panic(err)
	}
	return buf
}
func (s *symtab) Add(symbol elfcreator.Symbol, nameIndex elf64_Word, shndx elf64_Half) uint64 {
	if len(s.entries) == 0 {
		s.entries = append(s.entries, elf64Symbol{})
	}
	index := len(s.entries)
	info := ((elf64_Byte(symbol.Bind) << 4) + (elf64_Byte(symbol.Type) & 0xf))

	s.entries = append(s.entries, elf64Symbol{st_name: nameIndex, st_value: elf64_Addr(symbol.Offset), st_size: elf64_Xword(symbol.Size), st_info: info, st_other: 0, st_shndx: shndx})
	return uint64(index)
}

const eI_NIDENT uint8 = 16
const (
	eI_MAG0       uint8 = 0 // File identification
	eI_MAG1       uint8 = 1 //
	eI_MAG2       uint8 = 2 //
	eI_MAG3       uint8 = 3 //
	eI_CLASS      uint8 = 4 // File class
	eI_DATA       uint8 = 5 // Data encoding
	eI_VERSION    uint8 = 6 // File version
	eI_OSABI      uint8 = 7 // OS/ABI identification
	eI_ABIVERSION uint8 = 8 // ABI version
	eI_PAD        uint8 = 9 // Start of padding bytes
)

func Create(data elfcreator.ElfHeaderData) *elf64 {
	var byteOrder binary.ByteOrder = binary.LittleEndian
	if data.Endianness == elfcreator.EHEndianness_Big {
		byteOrder = binary.BigEndian
	}
	e := &elf64{
		complete:  false,
		byteOrder: byteOrder,
	}

	// Setup Elf64 Identifier
	e.header.e_ident[eI_MAG0] = '\x7f'
	e.header.e_ident[eI_MAG1] = 'E'
	e.header.e_ident[eI_MAG2] = 'L'
	e.header.e_ident[eI_MAG3] = 'F'
	e.header.e_ident[eI_CLASS] = 2
	e.header.e_ident[eI_DATA] = elf64_Byte(data.Endianness)
	e.header.e_ident[eI_VERSION] = 1
	e.header.e_ident[eI_OSABI] = elf64_Byte(data.OSABI)
	e.header.e_ident[eI_ABIVERSION] = elf64_Byte(data.ABIVersion)

	// Setup Elf64 Header
	e.header.e_type = elf64_Half(data.Type)
	e.header.e_machine = elf64_Half(data.Machine)
	e.header.e_version = elf64_Word(data.Version)
	e.header.e_flags = elf64_Word(data.Flags)

	return e
}

func (e *elf64) addSection(sections []elfcreator.ElfSection, section elfcreator.ElfSection, position elf64_Off) ([]elfcreator.ElfSection, elf64_Off) {
	sh_name := elf64_Word(0)
	if section.Valid() {
		sh_name = elf64_Word(e.shstrtab.Add(section.Name()))
	}

	size := elf64_Off(section.Size())
	over := size % 4096
	remaining := 4096 - (position % 4096)
	// Align to pages
	if over > remaining {
		sections = append(sections, padding{size: uint64(remaining)})
		position += remaining
	}

	sections = append(sections, section)

	shndx := len(e.section_headers)
	for _, symbol := range section.Symbols() {
		nameIndex := e.strtab.Add(symbol.Name)
		e.symtab.Add(symbol, elf64_Word(nameIndex), elf64_Half(shndx))
	}

	if section.Valid() {

		sh := elf64_Shdr{}
		sh.sh_name = sh_name
		sh.sh_type = elf64_Word(section.Type())
		sh.sh_flags = elf64_Xword(section.Flags())
		if e.header.e_type == elf64_Half(elfcreator.EHType_REL) {
			sh.sh_addr = 0 // Relocable file
		} else {
			sh.sh_addr = elf64_Addr(section.Address())
		}
		sh.sh_offset = position
		sh.sh_size = elf64_Xword(size)
		sh.sh_info = elf64_Word(section.Info())
		sh.sh_addralign = elf64_Xword(section.AddressAlignment())
		sh.sh_entsize = elf64_Xword(section.EntrySize())
		e.section_headers = append(e.section_headers, sh)
	}

	position += size

	// Align to 8 byte intervals
	if (position % 8) != 0 {
		sections = append(sections, padding{size: uint64(position % 8)})
		position += position % 8
	}

	return sections, position
}

func (e *elf64) AddSection(s elfcreator.ElfSection) {
	if e.complete {
		panic("already completed")
	}

	e.sections = append(e.sections, s)
}

func (e *elf64) Complete(filename string) {
	if e.complete {
		panic("already completed")
	}

	position := elf64_Off(0x0)
	// Setup Headers
	e.header.e_ehsize = 0x40
	position += elf64_Off(e.header.e_ehsize)

	if len(e.program_headers) > 0 {
		e.header.e_phoff = position
	} else {
		e.header.e_phoff = 0 // Mark as empt
	}
	e.header.e_phentsize = 56
	e.header.e_phnum = elf64_Half(len(e.program_headers))
	position += elf64_Off(e.header.e_phentsize) * elf64_Off(e.header.e_phnum)

	// initial null entry
	e.section_headers = []elf64_Shdr{{}}

	// Section Header String Table
	e.shstrtab = &shstrtab{}
	e.strtab = &strtab{}
	e.symtab = &symtab{}
	nameIndex := e.strtab.Add(filename)
	e.symtab.Add(elfcreator.Symbol{Name: filename, Type: elfcreator.STT_FILE}, elf64_Word(nameIndex), elf64_Half(0xfff1))

	// add sections padding for 4096 page size
	sections := make([]elfcreator.ElfSection, 0, len(e.sections))
	for _, section := range e.sections {
		if section.Name() == ".shstrtab" {
			panic("section header string table cannot be defined externally")
		}
		sections, position = e.addSection(sections, section, position)
	}

	// Symbol Table
	sections, position = e.addSection(sections, e.strtab, position)
	sections, position = e.addSection(sections, e.symtab, position)

	// String table section
	e.header.e_shstrndx = elf64_Half(len(e.section_headers))
	sections, position = e.addSection(sections, e.shstrtab, position)

	// Setup Section Links
	i := 1
	for _, section := range sections {
		if section.Valid() {
			if section.LinkName() != "" {
				j := 1
				name := section.LinkName()
				for _, section := range sections {
					if section.Valid() {
						if section.Name() == name {
							e.section_headers[i].sh_link = elf64_Word(j)
							break
						}
						j++
					}
				}
			}
			i++
		}
	}

	e.sections = sections

	if len(e.section_headers) > 0 {
		e.header.e_shoff = position
	} else {
		e.header.e_shoff = 0 // Mark as empty
	}
	e.header.e_shentsize = 64
	e.header.e_shnum = elf64_Half(len(e.section_headers))
	position += elf64_Off(e.header.e_shentsize) * elf64_Off(e.header.e_shnum)

	e.complete = true
}

func (e *elf64) Write(writer io.Writer) error {
	if !e.complete {
		return fmt.Errorf("elf64 must be complete before writing, call Complete()")
	}

	err := binary.Write(writer, e.byteOrder, e.header)
	if err != nil {
		return err
	}

	for _, ph := range e.program_headers {
		err = binary.Write(writer, e.byteOrder, ph)
		if err != nil {
			return err
		}
	}

	for _, s := range e.sections {
		_, err = writer.Write(s.Bytes(e.byteOrder))
		if err != nil {
			return err
		}
	}

	for _, sh := range e.section_headers {
		err = binary.Write(writer, e.byteOrder, sh)
		if err != nil {
			return err
		}
	}

	return nil
}
