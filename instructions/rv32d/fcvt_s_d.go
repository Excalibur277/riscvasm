package rv32d

import "riscvasm.com/m/v2/instruction"

var fcvt_s_d instruction.InstructionDefinition = instruction.NewR2FTypeDefinition(
	`fcvt.s.d`,
	`fcvt.s.d rd,rs1`,
	`Converts double floating-point register in rs1 into a floating-point number in floating-point register rd.`,
	`f[rd] = f64->f32(f[rs1])`,
	0b01010011,
	0b00000001,
	0b00100000,
)
