package rv32q

import "riscvasm.com/m/v2/instruction"

var fcvt_s_q instruction.InstructionDefinition = instruction.NewR2FTypeDefinition(
	`fcvt.s.q`,
	`fcvt.s.q rd,rs1`,
	`Converts quad floating-point register in rs1 into a single floating-point number in floating-point register rd.`,
	`f[rd] = f32->f128(f[rs1])`,
	0b01010011,
    0b00000011,
    0b00100000,
)