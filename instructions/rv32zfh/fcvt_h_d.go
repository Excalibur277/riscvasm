package rv32zfh

import "riscvasm.com/m/v2/instruction"

var fcvt_h_d instruction.InstructionDefinition = instruction.NewR2FTypeDefinition(
	`fcvt.h.d`,
	`fcvt.h.d rd,rs1`,
	`Convert a double-precision floating-point number in floating-point register rs1 to a half-precision flaoting-point number register rd.`,
	`f[rd] = f64->f16(f[rs1])`,
	0b01010011,
    0b00000001,
    0b00100010,
)