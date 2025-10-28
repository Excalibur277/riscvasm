package rv32d

import "riscvasm.com/m/v2/instruction"

var fcvt_w_d instruction.InstructionDefinition = instruction.NewR2FTypeDefinition(
	`fcvt.w.d`,
	`fcvt.w.d rd,rs1`,
	`Converts a double-precision floating-point number in floating-point register rs1 to a signed 32-bit integer, in integer register rd.`,
	`x[rd] = sext(f64->s32(f[rs1]))`,
	0b01010011,
	0b00000000,
	0b01100001,
)
