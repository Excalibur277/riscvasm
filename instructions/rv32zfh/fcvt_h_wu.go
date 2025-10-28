package rv32zfh

import "riscvasm.com/m/v2/instruction"

var fcvt_h_wu instruction.InstructionDefinition = instruction.NewR2FTypeDefinition(
	`fcvt.h.wu`,
	`fcvt.h.wu rd,rs1`,
	`Converts a 32-bit unsigned integer, in integer register rs1 into a half-precision floating-point number in floating-point register rd.`,
	`f[rd] = u32->f16(x[rs1])`,
	0b01010011,
    0b00000001,
    0b01101010,
)