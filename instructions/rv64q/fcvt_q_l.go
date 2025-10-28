package rv64q

import "riscvasm.com/m/v2/instruction"

var fcvt_q_l instruction.InstructionDefinition = instruction.NewR2FTypeDefinition(
	`fcvt.q.l`,
	`fcvt.q.l rd,rs1`,
	``,
	`f[rd] = s64->f32(x[rs1])`,
	0b01010011,
    0b00000010,
    0b01101011,
)