package rv64d

import "riscvasm.com/m/v2/instruction"

var fcvt_d_l instruction.InstructionDefinition = instruction.NewR2FTypeDefinition(
	`fcvt.d.l`,
	`fcvt.d.l rd,rs1`,
	``,
	`f[rd] = s64->f64(x[rs1])`,
	0b01010011,
    0b00000010,
    0b01101001,
)