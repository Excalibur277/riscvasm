package rv32q

import "riscvasm.com/m/v2/instruction"

var fnmadd_q instruction.InstructionDefinition = instruction.NewR4FTypeDefinition(
	`fnmadd.q`,
	`fnmadd.q rd,rs1,rs2,rs3`,
	`Perform negated quad-precision fused multiply addition.`,
	`f[rd] = -f[rs1]×f[rs2]-f[rs3]`,
	0b01001111,
    0b00000011,
)