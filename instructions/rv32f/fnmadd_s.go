package rv32f

import "riscvasm.com/m/v2/instruction"

var fnmadd_s instruction.InstructionDefinition = instruction.NewR4FTypeDefinition(
	`fnmadd.s`,
	`fnmadd.s rd,rs1,rs2,rs3`,
	`Perform negated single-precision fused multiply addition.`,
	`f[rd] = -f[rs1]×f[rs2]-f[rs3]`,
	0b01001111,
	0b00000000,
)
