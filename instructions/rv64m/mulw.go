package rv64m

import "riscvasm.com/m/v2/instruction"

var mulw instruction.InstructionDefinition = instruction.NewRTypeDefinition(
	`mulw`,
	`mulw rd,rs1,rs2`,
	`performs an 32-bit \(\times\) 32-bit multiplication of signed rs1 by signed rs2 and places the lower 32 bits in the destination register.`,
	`x[rd] = x[rs1] × x[rs2]`,
	0b00111011,
    0b00000000,
    0b00000001,
)