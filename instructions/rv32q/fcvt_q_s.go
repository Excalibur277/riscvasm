package rv32q

import "riscvasm.com/m/v2/instruction"

var fcvt_q_s instruction.InstructionDefinition = instruction.NewR2FTypeDefinition(
	`fcvt.q.s`,
	`fcvt.q.s rd,rs1`,
	`Converts single floating-point register in rs1 into a quad floating-point number in floating-point register rd.`,
	`f[rd] = f128->f32(f[rs1])`,
	0b01010011,
    0b00000000,
    0b00100011,
)