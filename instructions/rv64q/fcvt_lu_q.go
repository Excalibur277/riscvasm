package rv64q

import "riscvasm.com/m/v2/instruction"

var fcvt_lu_q instruction.InstructionDefinition = instruction.NewR2FTypeDefinition(
	`fcvt.lu.q`,
	`fcvt.lu.q rd,rs1`,
	``,
	`x[rd] = f32->u64(f[rs1])`,
	0b01010011,
    0b00000011,
    0b01100011,
)