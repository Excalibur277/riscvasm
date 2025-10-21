package rv32i

import "riscvasm.com/m/v2/instruction"

var pause instruction.InstructionDefinition = instruction.NewConstantTypeDefinition(
	`pause`,
	`pause`,
	`pause`,
	`pause`,
	0b000000001000000000000000000001111,
)
