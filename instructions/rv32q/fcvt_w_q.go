package rv32q

import "riscvasm.com/m/v2/instruction"

var fcvt_w_q instruction.InstructionDefinition = instruction.NewR2FTypeDefinition(
	`fcvt.w.q`,
	`fcvt.w.q rd,rs1`,
	`Converts a quad-precision floating-point number in floating-point register rs1 to a signed 32-bit integer, in integer register rd.`,
	`x[rd] = sext(f128->s32(f[rs1]))`,
	0b01010011,
    0b00000000,
    0b01100011,
)