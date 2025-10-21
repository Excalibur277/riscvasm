package elfcreator

type Symbol struct {
	Name   string
	Offset uint64
	Size   uint32
	Bind   SymbolBind
	Type   SymbolType
}

type SymbolType uint8

const (
	STT_NOTYPE  SymbolType = 0
	STT_OBJECT             = 1
	STT_FUNC               = 2
	STT_SECTION            = 3
	STT_FILE               = 4
)

type SymbolBind uint8

const (
	STB_LOCAL  SymbolBind = 0
	STB_GLOBAL            = 1
	STB_WEAK              = 2
)
