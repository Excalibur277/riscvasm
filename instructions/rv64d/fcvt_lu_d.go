package rv64d

import "riscvasm.com/m/v2/instruction"

var fcvt_lu_d instruction.InstructionDefinition = instruction.NewR2FTypeDefinition(
	`fcvt.lu.d`,
	`fcvt.lu.d rd,rs1`,
	``,
	`x[rd] = f64→u64(f[rs1])`,
	0b01010011,
    0b00000011,
    0b01100001,
)