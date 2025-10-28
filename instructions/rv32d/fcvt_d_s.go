package rv32d

import "riscvasm.com/m/v2/instruction"

var fcvt_d_s instruction.InstructionDefinition = instruction.NewR2FTypeDefinition(
	`fcvt.d.s`,
	`fcvt.d.s rd,rs1`,
	`Converts single floating-point register in rs1 into a double floating-point number in floating-point register rd.`,
	`f[rd] = f32->f64(f[rs1])`,
	0b01010011,
	0b00000000,
	0b00100001,
)
