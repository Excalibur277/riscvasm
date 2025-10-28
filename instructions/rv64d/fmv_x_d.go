package rv64d

import "riscvasm.com/m/v2/instruction"

var fmv_x_d instruction.InstructionDefinition = instruction.NewR2TypeDefinition(
	`fmv.x.d`,
	`fmv.x.d rd,rs1`,
	``,
	`x[rd] = f[rs1][63:0]`,
	0b01010011,
    0b00000000,
    0b000000,
    0b01110001,
)