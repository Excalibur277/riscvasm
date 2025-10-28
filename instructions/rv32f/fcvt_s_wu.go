package rv32f

import "riscvasm.com/m/v2/instruction"

var fcvt_s_wu instruction.InstructionDefinition = instruction.NewR2FTypeDefinition(
	`fcvt.s.wu`,
	`fcvt.s.wu rd,rs1`,
	`Converts a 32-bit unsigned integer, in integer register rs1 into a floating-point number in floating-point register rd.`,
	`aZf[rd] = u32->f32(x[rs1])`,
	0b01010011,
    0b000001,
    0b01101000,
)