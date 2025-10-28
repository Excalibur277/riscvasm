package rv32zfh

import "riscvasm.com/m/v2/instruction"

var fmadd_h instruction.InstructionDefinition = instruction.NewR4FTypeDefinition(
	`fmadd.h`,
	`fmadd.h rd,rs1,rs2,rs3`,
	`Perform half-precision fused multiply addition.`,
	`f[rd] = f[rs1]×f[rs2]+f[rs3]`,
	0b01000011,
    0b00000010,
)