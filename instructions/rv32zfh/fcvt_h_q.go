package rv32zfh

import "riscvasm.com/m/v2/instruction"

var fcvt_h_q instruction.InstructionDefinition = instruction.NewR2FTypeDefinition(
	`fcvt.h.q`,
	`fcvt.h.q rd,rs1`,
	`Convert a quad-precision floating-point number in floating-point register rs1 to a half-precision flaoting-point number register rd.`,
	`f[rd] = f128->f16(f[rs1])`,
	0b01010011,
    0b00000011,
    0b00100010,
)