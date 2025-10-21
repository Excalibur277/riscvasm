package rv32i

import "riscvasm.com/m/v2/instruction"

var ecall instruction.InstructionDefinition = instruction.NewConstantTypeDefinition(
	`ecall`,
	`ecall`,
	`ecall`,
	`ecall`,
	0b000000000000000000000000001110011,
)
