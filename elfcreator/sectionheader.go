package elfcreator

type SHType uint32

const (
	SHType_NULL          SHType = 0x0  // Section header table entry unused
	SHType_PROGBITS      SHType = 0x1  // Program data
	SHType_SYMTAB        SHType = 0x2  // Symbol table
	SHType_STRTAB        SHType = 0x3  // String table
	SHType_RELA          SHType = 0x4  // Relocation entries with addends
	SHType_HASH          SHType = 0x5  // Symbol hash table
	SHType_DYNAMIC       SHType = 0x6  // Dynamic linking information
	SHType_NOTE          SHType = 0x7  // Notes
	SHType_NOBITS        SHType = 0x8  // Program space with no data (bss)
	SHType_REL           SHType = 0x9  // Relocation entries, no addends
	SHType_SHLIB         SHType = 0x0A // Reserved
	SHType_DYNSYM        SHType = 0x0B // Dynamic linker symbol table
	SHType_INIT_ARRAY    SHType = 0x0E // Array of constructors
	SHType_FINI_ARRAY    SHType = 0x0F // Array of destructors
	SHType_PREINIT_ARRAY SHType = 0x10 // Array of pre-constructors
	SHType_GROUP         SHType = 0x11 // Section group
	SHType_SYMTAB_SHNDX  SHType = 0x12 // Extended section indices
	SHType_NUM           SHType = 0x13 // Number of defined types.
)

type SHFlags uint32

const (
	SHFlags_WRITE            SHFlags = 0x1        // Writable
	SHFlags_ALLOC            SHFlags = 0x2        // Occupies memory during execution
	SHFlags_EXECINSTR        SHFlags = 0x4        // Executable
	SHFlags_MERGE            SHFlags = 0x10       // Might be merged
	SHFlags_STRINGS          SHFlags = 0x20       // Contains null-terminated strings
	SHFlags_INFO_LINK        SHFlags = 0x40       // 'sh_info' contains SHT index
	SHFlags_LINK_ORDER       SHFlags = 0x80       // Preserve order after combining
	SHFlags_OS_NONCONFORMING SHFlags = 0x100      // Non-standard OS specific handling required
	SHFlags_GROUP            SHFlags = 0x200      // Section is member of a group
	SHFlags_TLS              SHFlags = 0x400      // Section hold thread-local data
	SHFlags_MASKOS           SHFlags = 0x0FF00000 // OS-specific
	SHFlags_MASKPROC         SHFlags = 0xF0000000 // Processor-specific
	SHFlags_ORDERED          SHFlags = 0x4000000  // Special ordering requirement (Solaris)
	SHFlags_EXCLUDE          SHFlags = 0x8000000  // Section is excluded unless referenced or allocated (Solaris)
)
