package rv32zfh

import "riscvasm.com/m/v2/instruction"

var fcvt_h_s instruction.InstructionDefinition = instruction.NewR2FTypeDefinition(
	`fcvt.h.s`,
	`fcvt.h.s rd,rs1`,
	`Convert a single-precision floating-point number in floating-point register rs1 to a half-precision flaoting-point number register rd.`,
	`f[rd] = f32->f16(f[rs1])`,
	0b01010011,
    0b00000000,
    0b00100010,
)