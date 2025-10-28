package rv32d

import "riscvasm.com/m/v2/instruction"

var fcvt_wu_d instruction.InstructionDefinition = instruction.NewR2FTypeDefinition(
	`fcvt.wu.d`,
	`fcvt.wu.d rd,rs1`,
	`Converts a double-precision floating-point number in floating-point register rs1 to a unsigned 32-bit integer, in integer register rd.`,
	`x[rd] = sext(u32f64(f[rs1]))`,
	0b01010011,
	0b00000001,
	0b01100001,
)
