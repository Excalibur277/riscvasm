package rv32i

import "riscvasm.com/m/v2/instruction"

var or instruction.InstructionDefinition = instruction.NewRTypeDefinition(
	`or`,
	`or rd,rs1,rs2`,
	`Performs bitwise OR on registers rs1 and rs2 and place the result in rd`,
	`x[rd] = x[rs1] | x[rs2]`,
	0b00110011,
	0b00000110,
	0b00000000,
)
