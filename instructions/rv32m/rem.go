package rv32m

import "riscvasm.com/m/v2/instruction"

var rem instruction.InstructionDefinition = instruction.NewRTypeDefinition(
	`rem`,
	`rem rd,rs1,rs2`,
	`perform an XLEN bits by XLEN bits signed integer reminder of rs1 by rs2.`,
	`x[rd] = x[rs1] %s x[rs2]`,
	0b00110011,
    0b00000110,
    0b00000001,
)