package rv32d

import "riscvasm.com/m/v2/instruction"

var fnmadd_d instruction.InstructionDefinition = instruction.NewR4FTypeDefinition(
	`fnmadd.d`,
	`fnmadd.d rd,rs1,rs2,rs3`,
	`Perform negated double-precision fused multiply addition.`,
	`f[rd] = -f[rs1]×f[rs2]-f[rs3]`,
	0b01001111,
	0b00000001,
)
