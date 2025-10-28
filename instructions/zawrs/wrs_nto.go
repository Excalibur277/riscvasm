package zawrs

import "riscvasm.com/m/v2/instruction"

var wrs_nto instruction.InstructionDefinition = instruction.NewConstantTypeDefinition(
	`wrs.nto`,
	`wrs.nto`,
	``,
	``,
	0b000000000110100000000000001110011,
)