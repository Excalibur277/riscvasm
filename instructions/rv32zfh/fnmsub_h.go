package rv32zfh

import "riscvasm.com/m/v2/instruction"

var fnmsub_h instruction.InstructionDefinition = instruction.NewR4FTypeDefinition(
	`fnmsub.h`,
	`fnmsub.h rd,rs1,rs2,rs3`,
	`Perform negated half-precision fused multiply subtraction.`,
	`f[rd] = -f[rs1]×f[rs2]+f[rs3]`,
	0b01001011,
    0b00000010,
)