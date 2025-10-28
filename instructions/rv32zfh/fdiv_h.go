package rv32zfh

import "riscvasm.com/m/v2/instruction"

var fdiv_h instruction.InstructionDefinition = instruction.NewRFTypeDefinition(
	`fdiv.h`,
	`fdiv.h rd,rs1,rs2`,
	`Perform half-precision floating-point addition.`,
	`f[rd] = f[rs1] / f[rs2]`,
	0b01010011,
    0b00001110,
)