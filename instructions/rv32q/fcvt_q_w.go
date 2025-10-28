package rv32q

import "riscvasm.com/m/v2/instruction"

var fcvt_q_w instruction.InstructionDefinition = instruction.NewR2FTypeDefinition(
	`fcvt.q.w`,
	`fcvt.q.w rd,rs1`,
	`Converts a 32-bit signed integer, in integer register rs1 into a quad-precision floating-point number in floating-point register rd.`,
	`x[rd] = sext(f128->s32(f[rs1]))`,
	0b01010011,
    0b00000000,
    0b01101011,
)