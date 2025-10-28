package rv64f

import "riscvasm.com/m/v2/instruction"

var fcvt_l_s instruction.InstructionDefinition = instruction.NewR2FTypeDefinition(
	`fcvt.l.s`,
	`fcvt.l.s rd,rs1`,
	``,
	`x[rd] = f32->s64(f[rs1])`,
	0b01010011,
	0b00000010,
	0b01100000,
)
