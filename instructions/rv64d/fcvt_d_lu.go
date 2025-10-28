package rv64d

import "riscvasm.com/m/v2/instruction"

var fcvt_d_lu instruction.InstructionDefinition = instruction.NewR2FTypeDefinition(
	`fcvt.d.lu`,
	`fcvt.d.lu rd,rs1`,
	``,
	`f[rd] = u64->f64(x[rs1])`,
	0b01010011,
    0b00000011,
    0b01101001,
)