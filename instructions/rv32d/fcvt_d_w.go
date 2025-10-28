package rv32d

import "riscvasm.com/m/v2/instruction"

var fcvt_d_w instruction.InstructionDefinition = instruction.NewR2FTypeDefinition(
	`fcvt.d.w`,
	`fcvt.d.w rd,rs1`,
	`Converts a 32-bit signed integer, in integer register rs1 into a double-precision floating-point number in floating-point register rd.`,
	`x[rd] = sext(f64->s32(f[rs1]))`,
	0b01010011,
	0b00000000,
	0b01101001,
)
