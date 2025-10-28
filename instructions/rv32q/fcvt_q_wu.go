package rv32q

import "riscvasm.com/m/v2/instruction"

var fcvt_q_wu instruction.InstructionDefinition = instruction.NewR2FTypeDefinition(
	`fcvt.q.wu`,
	`fcvt.q.wu rd,rs1`,
	`Converts a 32-bit unsigned integer, in integer register rs1 into a quad-precision floating-point number in floating-point register rd.`,
	`f[rd] = u32->f128(x[rs1])`,
	0b01010011,
    0b00000001,
    0b01101011,
)