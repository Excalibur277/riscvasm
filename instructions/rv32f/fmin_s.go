package rv32f

import "riscvasm.com/m/v2/instruction"

var fmin_s instruction.InstructionDefinition = instruction.NewRTypeDefinition(
	`fmin.s`,
	`fmin.s rd,rs1,rs2`,
	`Write the smaller of single precision data in rs1 and rs2 to rd.`,
	`f[rd] = min(f[rs1], f[rs2])`,
	0b01010011,
	0b00000000,
	0b00010100,
)
