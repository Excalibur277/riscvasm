package rv32f

import "riscvasm.com/m/v2/instruction"

var fsqrt_s instruction.InstructionDefinition = instruction.NewR2FTypeDefinition(
	`fsqrt.s`,
	`fsqrt.s rd,rs1`,
	`Perform single-precision square root.`,
	`aZf[rd] = sqrt(f[rs1])`,
	0b01010011,
    0b000000,
    0b00101100,
)