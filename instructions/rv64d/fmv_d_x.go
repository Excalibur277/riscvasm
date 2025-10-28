package rv64d

import "riscvasm.com/m/v2/instruction"

var fmv_d_x instruction.InstructionDefinition = instruction.NewR2TypeDefinition(
	`fmv.d.x`,
	`fmv.d.x rd,rs1`,
	``,
	`f[rd] = x[rs1][63:0]`,
	0b01010011,
    0b00000000,
    0b000000,
    0b01111001,
)