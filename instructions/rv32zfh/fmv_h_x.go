package rv32zfh

import "riscvasm.com/m/v2/instruction"

var fmv_h_x instruction.InstructionDefinition = instruction.NewR2TypeDefinition(
	`fmv.h.x`,
	`fmv.h.x rd,rs1`,
	`Move the half-precision value in floating-point register rs1 represented in IEEE 754-2008 encoding to the lower 32 bits of integer register rd.`,
	`x[rd] = sext(f[rs1][15:0])`,
	0b01010011,
    0b00000000,
    0b000000,
    0b01110010,
)