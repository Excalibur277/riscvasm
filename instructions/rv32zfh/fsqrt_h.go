package rv32zfh

import "riscvasm.com/m/v2/instruction"

var fsqrt_h instruction.InstructionDefinition = instruction.NewR2FTypeDefinition(
	`fsqrt.h`,
	`fsqrt.h rd,rs1`,
	`Perform half-precision square root.`,
	`f[rd] = sqrt(f[rs1])`,
	0b01010011,
    0b00000000,
    0b00101110,
)