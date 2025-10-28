package rv32f

import "riscvasm.com/m/v2/instruction"

var fcvt_w_s instruction.InstructionDefinition = instruction.NewR2FTypeDefinition(
	`fcvt.w.s`,
	`fcvt.w.s rd,rs1`,
	`Convert a floating-point number in floating-point register rs1 to a signed 32-bit in integer register rd.`,
	`aZx[rd] = sext(f32->s32(f[rs1]))`,
	0b01010011,
    0b000000,
    0b01100000,
)