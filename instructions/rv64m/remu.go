package rv64m

import "riscvasm.com/m/v2/instruction"

var remu instruction.InstructionDefinition = instruction.NewRTypeDefinition(
	`remu`,
	`remu rd,rs1,rs2`,
	`perform an 32 bits by 32 bits unsigned integer reminder of rs1 by rs2.`,
	`x[rd] = x[rs1] %u x[rs2]`,
	0b00111011,
    0b00000111,
    0b00000001,
)