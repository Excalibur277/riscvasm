package rv64m

import "riscvasm.com/m/v2/instruction"

var div instruction.InstructionDefinition = instruction.NewRTypeDefinition(
	`div`,
	`div rd,rs1,rs2`,
	`perform an 32 bits by 32 bits signed integer division of rs1 by rs2, rounding towards zero.`,
	`x[rd] = x[rs1] /s x[rs2]`,
	0b00111011,
    0b00000100,
    0b00000001,
)