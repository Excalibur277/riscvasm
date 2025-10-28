package rv32q

import "riscvasm.com/m/v2/instruction"

var fmul_q instruction.InstructionDefinition = instruction.NewRFTypeDefinition(
	`fmul.q`,
	`fmul.q rd,rs1,rs2`,
	`Perform quad-precision floating-point multiplication.`,
	`f[rd] = f[rs1] × f[rs2]`,
	0b01010011,
    0b00001011,
)