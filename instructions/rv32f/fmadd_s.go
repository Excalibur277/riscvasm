package rv32f

import "riscvasm.com/m/v2/instruction"

var fmadd_s instruction.InstructionDefinition = instruction.NewR4FTypeDefinition(
	`fmadd.s`,
	`fmadd.s rd,rs1,rs2,rs3`,
	`Perform single-precision fused multiply addition.`,
	`f[rd] = f[rs1]×f[rs2]+f[rs3]`,
	0b01000011,
	0b00000000,
)
