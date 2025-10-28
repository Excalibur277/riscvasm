package rv32zfh

import "riscvasm.com/m/v2/instruction"

var fmv_x_h instruction.InstructionDefinition = instruction.NewR2TypeDefinition(
	`fmv.x.h`,
	`fmv.x.h rd,rs1`,
	`Move the half-precision value encoded in IEEE 754-2008 standard encoding from the lower 15 bits of integer register rs1 to the floating-point register rd.`,
	`f[rd] = x[rs1][15:0]`,
	0b01010011,
    0b00000000,
    0b000000,
    0b01110010,
)