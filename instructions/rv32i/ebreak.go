package rv32i

import "riscvasm.com/m/v2/instruction"

var ebreak instruction.InstructionDefinition = instruction.NewConstantTypeDefinition(
	`ebreak`,
	`ebreak`,
	`ebreak`,
	`ebreak`,
	0b000000000000100000000000001110011,
)
