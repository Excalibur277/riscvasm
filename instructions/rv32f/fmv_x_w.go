package rv32f

import "riscvasm.com/m/v2/instruction"

var fmv_x_w instruction.InstructionDefinition = instruction.NewR2FTypeDefinition(
	`fmv.x.w`,
	`fmv.x.w rd,rs1`,
	`Move the single-precision value in floating-point register rs1 represented in IEEE 754-2008 encoding to the lower 32 bits of integer register rd.`,
	`x[rd] = sext(f[rs1][31:0])`,
	0b01010011,
	0b000001,
	0b01100000,
)
