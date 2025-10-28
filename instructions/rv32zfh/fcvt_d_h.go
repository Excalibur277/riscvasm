package rv32zfh

import "riscvasm.com/m/v2/instruction"

var fcvt_d_h instruction.InstructionDefinition = instruction.NewR2FTypeDefinition(
	`fcvt.d.h`,
	`fcvt.d.h rd,rs1`,
	`Convert a half-precision floating-point number in floating-point register rs1 to a double-precision flaoting-point number register rd.`,
	`f[rd] = f16->f64(f[rs1])`,
	0b01010011,
    0b00000010,
    0b00100001,
)