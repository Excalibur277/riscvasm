package rv32d

import "riscvasm.com/m/v2/instruction"

var fnmsub_d instruction.InstructionDefinition = instruction.NewR4FTypeDefinition(
	`fnmsub.d`,
	`fnmsub.d rd,rs1,rs2,rs3`,
	`Perform negated double-precision fused multiply subtraction.`,
	`f[rd] = -f[rs1]×f[rs2]+f[rs3]`,
	0b01001011,
	0b00000001,
)
