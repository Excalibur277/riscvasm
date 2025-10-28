package rv32q

import "riscvasm.com/m/v2/instruction"

var fsqrt_q instruction.InstructionDefinition = instruction.NewR2FTypeDefinition(
	`fsqrt.q`,
	`fsqrt.q rd,rs1`,
	`Perform quad-precision square root.`,
	`f[rd] = sqrt(f[rs1])`,
	0b01010011,
    0b00000000,
    0b00101111,
)