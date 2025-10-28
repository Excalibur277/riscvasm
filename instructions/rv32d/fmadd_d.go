package rv32d

import "riscvasm.com/m/v2/instruction"

var fmadd_d instruction.InstructionDefinition = instruction.NewR4FTypeDefinition(
	`fmadd.d`,
	`fmadd.d rd,rs1,rs2,rs3`,
	`Perform double-precision fused multiply addition.`,
	`f[rd] = f[rs1]×f[rs2]+f[rs3]`,
	0b01000011,
	0b00000001,
)
