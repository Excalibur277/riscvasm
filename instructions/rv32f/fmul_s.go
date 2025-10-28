package rv32f

import "riscvasm.com/m/v2/instruction"

var fmul_s instruction.InstructionDefinition = instruction.NewRFTypeDefinition(
	`fmul.s`,
	`fmul.s rd,rs1,rs2`,
	`Perform single-precision floating-point multiplication.`,
	`f[rd] = f[rs1] × f[rs2]`,
	0b01010011,
	0b00001000,
)
