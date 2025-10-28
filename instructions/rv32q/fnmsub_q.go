package rv32q

import "riscvasm.com/m/v2/instruction"

var fnmsub_q instruction.InstructionDefinition = instruction.NewR4FTypeDefinition(
	`fnmsub.q`,
	`fnmsub.q rd,rs1,rs2,rs3`,
	`Perform negated quad-precision fused multiply subtraction.`,
	`f[rd] = -f[rs1]×f[rs2]+f[rs3]`,
	0b01001011,
    0b00000011,
)