package elfcreator

type PHType uint32

const (
	PHType_NULL    PHType = 0x00000000 //	Program header table entry unused.
	PHType_LOAD    PHType = 0x00000001 //	Loadable segment.
	PHType_DYNAMIC PHType = 0x00000002 //	Dynamic linking information.
	PHType_INTERP  PHType = 0x00000003 //	Interpreter information.
	PHType_NOTE    PHType = 0x00000004 //	Auxiliary information.
	PHType_SHLIB   PHType = 0x00000005 //	Reserved.
	PHType_PHDR    PHType = 0x00000006 //	Segment containing program header table itself.
	PHType_TLS     PHType = 0x00000007 //	Thread-Local Storage template.
)

type PHFlags uint32

const (
	PHFlags_X PHFlags = 0x00000000 //	Executable segment.
	PHFlags_W PHFlags = 0x00000001 //	Writeable segment.
	PHFlags_R PHFlags = 0x00000004 //	Readable segment.
)
