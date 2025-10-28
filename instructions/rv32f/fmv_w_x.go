package rv32f

import "riscvasm.com/m/v2/instruction"

var fmv_w_x instruction.InstructionDefinition = instruction.NewR2TypeDefinition(
	`fmv.w.x`,
	`fmv.w.x rd,rs1`,
	`Move the single-precision value encoded in IEEE 754-2008 standard encoding from the lower 32 bits of integer register rs1 to the floating-point register rd.`,
	`aZf[rd] = x[rs1][31:0]`,
	0b01010011,
    0b00000000,
    0b000000,
    0b01111000,
)