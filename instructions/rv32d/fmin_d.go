package rv32d

import "riscvasm.com/m/v2/instruction"

var fmin_d instruction.InstructionDefinition = instruction.NewRTypeDefinition(
	`fmin.d`,
	`fmin.d rd,rs1,rs2`,
	`Write the smaller of double precision data in rs1 and rs2 to rd.`,
	`f[rd] = min(f[rs1], f[rs2])`,
	0b01010011,
	0b00000000,
	0b00010101,
)
