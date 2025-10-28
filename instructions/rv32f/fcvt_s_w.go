package rv32f

import "riscvasm.com/m/v2/instruction"

var fcvt_s_w instruction.InstructionDefinition = instruction.NewR2FTypeDefinition(
	`fcvt.s.w`,
	`fcvt.s.w rd,rs1`,
	`Converts a 32-bit signed integer, in integer register rs1 into a floating-point number in floating-point register rd.`,
	`f[rd] = s32->f32(x[rs1])`,
	0b01010011,
	0b000000,
	0b01101000,
)
