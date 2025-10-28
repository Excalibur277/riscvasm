package rv32f

import "riscvasm.com/m/v2/instruction"

var fnmsub_s instruction.InstructionDefinition = instruction.NewR4FTypeDefinition(
	`fnmsub.s`,
	`fnmsub.s rd,rs1,rs2,rs3`,
	`Perform negated single-precision fused multiply subtraction.`,
	`aZf[rd] = -f[rs1]×f[rs2]+f[rs3]`,
	0b01001011,
    0b00000000,
)