package rv64m

import "riscvasm.com/m/v2/instruction"

var rem instruction.InstructionDefinition = instruction.NewRTypeDefinition(
	`rem`,
	`rem rd,rs1,rs2`,
	`perform an 32 bits by 32 bits signed integer reminder of rs1 by rs2.`,
	`x[rd] = x[rs1] %s x[rs2]`,
	0b00111011,
    0b00000110,
    0b00000001,
)