package rv32q

import "riscvasm.com/m/v2/instruction"

var dcvt_q_d instruction.InstructionDefinition = instruction.NewR2FTypeDefinition(
	`dcvt.q.d`,
	`dcvt.q.d rd,rs1`,
	`Converts double floating-point register in rs1 into a quad floating-point number in floating-point register rd.`,
	`f[rd] = f64->f128(f[rs1])`,
	0b01010011,
    0b00000001,
    0b00100011,
)