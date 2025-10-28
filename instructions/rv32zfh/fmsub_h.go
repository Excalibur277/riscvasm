package rv32zfh

import "riscvasm.com/m/v2/instruction"

var fmsub_h instruction.InstructionDefinition = instruction.NewR4FTypeDefinition(
	`fmsub.h`,
	`fmsub.h rd,rs1,rs2,rs3`,
	`Perform half-precision fused multiply subtraction.`,
	`f[rd] = f[rs1]×f[rs2]-f[rs3]`,
	0b01000111,
    0b00000010,
)