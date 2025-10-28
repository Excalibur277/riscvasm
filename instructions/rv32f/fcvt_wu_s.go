package rv32f

import "riscvasm.com/m/v2/instruction"

var fcvt_wu_s instruction.InstructionDefinition = instruction.NewR2FTypeDefinition(
	`fcvt.wu.s`,
	`fcvt.wu.s rd,rs1`,
	`Convert a floating-point number in floating-point register rs1 to a signed 32-bit in unsigned integer register rd.`,
	`x[rd] = sext(f32->u32(f[rs1]))`,
	0b01010011,
	0b000001,
	0b01100000,
)
