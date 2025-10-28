package rv32zfh

import "riscvasm.com/m/v2/instruction"

var fnmadd_h instruction.InstructionDefinition = instruction.NewR4FTypeDefinition(
	`fnmadd.h`,
	`fnmadd.h rd,rs1,rs2,rs3`,
	`Perform negated half-precision fused multiply addition.`,
	`f[rd] = -f[rs1]×f[rs2]-f[rs3]`,
	0b01001111,
    0b00000010,
)