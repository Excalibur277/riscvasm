package rv32zfh

import "riscvasm.com/m/v2/instruction"

var fcvt_q_h instruction.InstructionDefinition = instruction.NewR2FTypeDefinition(
	`fcvt.q.h`,
	`fcvt.q.h rd,rs1`,
	`Convert a half-precision floating-point number in floating-point register rs1 to a quad-precision flaoting-point number register rd.`,
	`f[rd] = f16->f128(f[rs1])`,
	0b01010011,
    0b00000010,
    0b00100011,
)