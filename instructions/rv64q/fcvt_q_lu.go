package rv64q

import "riscvasm.com/m/v2/instruction"

var fcvt_q_lu instruction.InstructionDefinition = instruction.NewR2FTypeDefinition(
	`fcvt.q.lu`,
	`fcvt.q.lu rd,rs1`,
	``,
	`f[rd] = u64->f32(x[rs1])`,
	0b01010011,
    0b00000011,
    0b01101011,
)