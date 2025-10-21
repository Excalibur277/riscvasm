package elfcreator

import "encoding/binary"

type ElfSection interface {
	Valid() bool
	Name() string
	LinkName() string
	Size() uint64
	Bytes(binary.ByteOrder) []byte
	Flags() SHFlags
	Type() SHType
	Info() uint32
	Address() uint64
	AddressAlignment() uint64
	EntrySize() uint64
	Symbols() []Symbol
}

type S_base struct{}

func (s S_base) Valid() bool              { return true }
func (s S_base) LinkName() string         { return "" }
func (s S_base) Flags() SHFlags           { return 0 }
func (s S_base) Info() uint32             { return 0 }
func (s S_base) Address() uint64          { return 0 }
func (s S_base) AddressAlignment() uint64 { return 0x08 }
func (s S_base) EntrySize() uint64        { return 0 }
func (s S_base) Symbols() []Symbol        { return []Symbol{} }

type S_bss struct{}

func (s *S_bss) Name() string                            { return ".bss" }
func (s *S_bss) Size() uint64                            { return 0 }
func (s *S_bss) Bytes(byteOrder binary.ByteOrder) []byte { return []byte{} }

type S_data struct{}

func (s *S_data) Name() string                            { return ".data" }
func (s *S_data) Size() uint64                            { return 0 }
func (s *S_data) Bytes(byteOrder binary.ByteOrder) []byte { return []byte{} }

type S_interp struct{}

func (s *S_interp) Name() string                            { return ".interp" }
func (s *S_interp) Size() uint64                            { return 0 }
func (s *S_interp) Bytes(byteOrder binary.ByteOrder) []byte { return []byte{} }

type S_rodata struct{}

func (s *S_rodata) Name() string                            { return ".rodata" }
func (s *S_rodata) Size() uint64                            { return 0 }
func (s *S_rodata) Bytes(byteOrder binary.ByteOrder) []byte { return []byte{} }

type S_text struct {
	S_base
	val     []byte
	symbols []Symbol
}

func NewTextSection(val []byte, symbols []Symbol) *S_text {
	return &S_text{val: val, symbols: symbols}
}

func (s *S_text) Name() string                            { return ".text" }
func (s *S_text) Size() uint64                            { return uint64(len(s.val)) }
func (s *S_text) Bytes(byteOrder binary.ByteOrder) []byte { return s.val }
func (s *S_text) Symbols() []Symbol                       { return s.symbols }
func (s *S_text) Type() SHType                            { return SHType_PROGBITS }
func (s *S_text) Flags() SHFlags                          { return SHFlags_ALLOC | SHFlags_EXECINSTR }
func (s *S_text) AddressAlignment() uint64                { return 0x10 }

type S_comment struct{}

func (s *S_comment) Name() string                            { return ".comment" }
func (s *S_comment) Size() uint64                            { return 0 }
func (s *S_comment) Bytes(byteOrder binary.ByteOrder) []byte { return []byte{} }

type S_dynamic struct{}

func (s *S_dynamic) Name() string                            { return ".dynamic" }
func (s *S_dynamic) Size() uint64                            { return 0 }
func (s *S_dynamic) Bytes(byteOrder binary.ByteOrder) []byte { return []byte{} }

type S_dynstr struct{ StringTable }

func (s *S_dynstr) Name() string                            { return ".dynstr" }
func (s *S_dynstr) Size() uint64                            { return 0 }
func (s *S_dynstr) Bytes(byteOrder binary.ByteOrder) []byte { return []byte{} }

type S_got struct{}

func (s *S_got) Name() string                            { return ".got" }
func (s *S_got) Size() uint64                            { return 0 }
func (s *S_got) Bytes(byteOrder binary.ByteOrder) []byte { return []byte{} }

type S_hash struct{}

func (s *S_hash) Name() string                            { return ".hash" }
func (s *S_hash) Size() uint64                            { return 0 }
func (s *S_hash) Bytes(byteOrder binary.ByteOrder) []byte { return []byte{} }

type S_note struct{}

func (s *S_note) Name() string                            { return ".note" }
func (s *S_note) Size() uint64                            { return 0 }
func (s *S_note) Bytes(byteOrder binary.ByteOrder) []byte { return []byte{} }

type S_plt struct{}

func (s *S_plt) Name() string                            { return ".plt" }
func (s *S_plt) Size() uint64                            { return 0 }
func (s *S_plt) Bytes(byteOrder binary.ByteOrder) []byte { return []byte{} }

type S_relname struct{}

func (s *S_relname) Name() string                            { return ".relname" }
func (s *S_relname) Size() uint64                            { return 0 }
func (s *S_relname) Bytes(byteOrder binary.ByteOrder) []byte { return []byte{} }

type S_relaname struct{}

func (s *S_relaname) Name() string                            { return ".relaname" }
func (s *S_relaname) Size() uint64                            { return 0 }
func (s *S_relaname) Bytes(byteOrder binary.ByteOrder) []byte { return []byte{} }

type StringTable struct {
	S_base
	bytes []byte
}

func (s *StringTable) Size() uint64 {
	if len(s.bytes) == 0 {
		s.bytes = append(s.bytes, 0)
	}
	return uint64(len(s.bytes))
}

func (s *StringTable) Bytes(byteOrder binary.ByteOrder) []byte {
	if len(s.bytes) == 0 {
		s.bytes = append(s.bytes, 0)
	}
	return s.bytes
}

func (s *StringTable) Type() SHType { return SHType_STRTAB }
func (s *StringTable) Add(val string) uint64 {
	if len(s.bytes) == 0 {
		s.bytes = append(s.bytes, 0)
	}
	index := len(s.bytes)
	s.bytes = append(s.bytes, []byte(val)...)
	s.bytes = append(s.bytes, 0)
	return uint64(index)
}

func (s StringTable) AddressAlignment() uint64 { return 0x01 }
