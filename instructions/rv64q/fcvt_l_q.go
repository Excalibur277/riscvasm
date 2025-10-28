package rv64q

import "riscvasm.com/m/v2/instruction"

var fcvt_l_q instruction.InstructionDefinition = instruction.NewR2FTypeDefinition(
	`fcvt.l.q`,
	`fcvt.l.q rd,rs1`,
	``,
	`x[rd] = f32->s64(f[rs1])`,
	0b01010011,
    0b00000010,
    0b01100011,
)