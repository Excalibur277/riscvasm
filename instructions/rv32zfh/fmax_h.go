package rv32zfh

import "riscvasm.com/m/v2/instruction"

var fmax_h instruction.InstructionDefinition = instruction.NewRTypeDefinition(
	`fmax.h`,
	`fmax.h rd,rs1,rs2`,
	`Write the larger of half precision data in rs1 and rs2 to rd.`,
	`f[rd] = max(f[rs1], f[rs2])`,
	0b01010011,
    0b00000001,
    0b00010101,
)