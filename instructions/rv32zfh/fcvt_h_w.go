package rv32zfh

import "riscvasm.com/m/v2/instruction"

var fcvt_h_w instruction.InstructionDefinition = instruction.NewR2FTypeDefinition(
	`fcvt.h.w`,
	`fcvt.h.w rd,rs1`,
	`Converts a 32-bit signed integer, in integer register rs1 into a half-precision floating-point number in floating-point register rd.`,
	`f[rd] = u32->f16(x[rs1])`,
	0b01010011,
    0b00000000,
    0b01101010,
)