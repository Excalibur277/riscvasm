package rv32zfh

import "riscvasm.com/m/v2/instruction"

var fmin_h instruction.InstructionDefinition = instruction.NewRTypeDefinition(
	`fmin.h`,
	`fmin.h rd,rs1,rs2`,
	`Write the smaller of half precision data in rs1 and rs2 to rd.`,
	`f[rd] = min(f[rs1], f[rs2])`,
	0b01010011,
    0b00000000,
    0b00010101,
)