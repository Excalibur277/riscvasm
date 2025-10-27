package rv64i

import "riscvasm.com/m/v2/instruction"

var Instructions = map[string]instruction.InstructionDefinition{
	"lwu":   lwu,
	"ld":    ld,
	"sd":    sd,
	"slli":  slli,
	"srli":  srli,
	"srai":  srai,
	"addiw": addiw,
	"slliw": slliw,
	"srliw": srliw,
	"sraiw": sraiw,
	"addw":  addw,
	"subw":  subw,
	"sllw":  sllw,
	"srlw":  srlw,
	"sraw":  sraw,
}
