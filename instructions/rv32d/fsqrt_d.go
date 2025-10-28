package rv32d

import "riscvasm.com/m/v2/instruction"

var fsqrt_d instruction.InstructionDefinition = instruction.NewR2FTypeDefinition(
	`fsqrt.d`,
	`fsqrt.d rd,rs1`,
	`Perform double-precision square root.`,
	`f[rd] = sqrt(f[rs1])`,
	0b01010011,
	0b00000000,
	0b00101101,
)
