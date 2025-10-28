package rv32q

import "riscvasm.com/m/v2/instruction"

var fcvt_d_q instruction.InstructionDefinition = instruction.NewR2FTypeDefinition(
	`fcvt.d.q`,
	`fcvt.d.q rd,rs1`,
	`Converts quad floating-point register in rs1 into a double floating-point number in floating-point register rd.`,
	`f[rd] = f128->f64(f[rs1])`,
	0b01010011,
    0b00000011,
    0b00100001,
)