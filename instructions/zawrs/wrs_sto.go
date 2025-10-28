package zawrs

import "riscvasm.com/m/v2/instruction"

var wrs_sto instruction.InstructionDefinition = instruction.NewConstantTypeDefinition(
	`wrs.sto`,
	`wrs.sto`,
	``,
	``,
	0b000000001110100000000000001110011,
)