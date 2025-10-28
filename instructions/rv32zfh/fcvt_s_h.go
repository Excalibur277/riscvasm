package rv32zfh

import "riscvasm.com/m/v2/instruction"

var fcvt_s_h instruction.InstructionDefinition = instruction.NewR2FTypeDefinition(
	`fcvt.s.h`,
	`fcvt.s.h rd,rs1`,
	`Convert a half-precision floating-point number in floating-point register rs1 to a single-precision flaoting-point number register rd.`,
	`f[rd] = f16->f32(f[rs1])`,
	0b01010011,
    0b00000010,
    0b00100000,
)