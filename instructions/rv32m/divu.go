package rv32m

import "riscvasm.com/m/v2/instruction"

var divu instruction.InstructionDefinition = instruction.NewRTypeDefinition(
	`divu`,
	`divu rd,rs1,rs2`,
	`perform an XLEN bits by XLEN bits unsigned integer division of rs1 by rs2, rounding towards zero.`,
	`x[rd] = x[rs1] /u x[rs2]`,
	0b00110011,
    0b00000101,
    0b00000001,
)