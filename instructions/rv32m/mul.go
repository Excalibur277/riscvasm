package rv32m

import "riscvasm.com/m/v2/instruction"

var mul instruction.InstructionDefinition = instruction.NewRTypeDefinition(
	`mul`,
	`mul rd,rs1,rs2`,
	`performs an XLEN-bit \(\times\) XLEN-bit multiplication of signed rs1 by signed rs2 and places the lower XLEN bits in the destination register.`,
	`x[rd] = x[rs1] × x[rs2]`,
	0b00110011,
    0b00000000,
    0b00000001,
)