package rv32q

import "riscvasm.com/m/v2/instruction"

var fmadd_q instruction.InstructionDefinition = instruction.NewR4FTypeDefinition(
	`fmadd.q`,
	`fmadd.q rd,rs1,rs2,rs3`,
	`Perform quad-precision fused multiply addition.`,
	`f[rd] = f[rs1]×f[rs2]+f[rs3]`,
	0b01000011,
    0b00000011,
)