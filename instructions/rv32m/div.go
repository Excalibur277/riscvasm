package rv32m

import "riscvasm.com/m/v2/instruction"

var div instruction.InstructionDefinition = instruction.NewRTypeDefinition(
	`div`,
	`div rd,rs1,rs2`,
	`perform an XLEN bits by XLEN bits signed integer division of rs1 by rs2, rounding towards zero.`,
	`x[rd] = x[rs1] /s x[rs2]`,
	0b00110011,
    0b00000100,
    0b00000001,
)