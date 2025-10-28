package rv64d

import "riscvasm.com/m/v2/instruction"

var fcvt_l_d instruction.InstructionDefinition = instruction.NewR2FTypeDefinition(
	`fcvt.l.d`,
	`fcvt.l.d rd,rs1`,
	``,
	`x[rd] = f64->s64(f[rs1])`,
	0b01010011,
    0b00000010,
    0b01100001,
)