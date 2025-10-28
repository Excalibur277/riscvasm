package rv64f

import "riscvasm.com/m/v2/instruction"

var fcvt_s_l instruction.InstructionDefinition = instruction.NewR2FTypeDefinition(
	`fcvt.s.l`,
	`fcvt.s.l rd,rs1`,
	``,
	`f[rd] = s64->f32(x[rs1])`,
	0b01010011,
    0b00000010,
    0b01101000,
)