package rv32f

import "riscvasm.com/m/v2/instruction"

var fadd_s instruction.InstructionDefinition = instruction.NewRFTypeDefinition(
	`fadd.s`,
	`fadd.s rd,rs1,rs2`,
	`Perform single-precision floating-point addition.`,
	`f[rd] = f[rs1] + f[rs2]`,
	0b01010011,
	0b00000000,
)
