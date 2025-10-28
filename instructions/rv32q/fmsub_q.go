package rv32q

import "riscvasm.com/m/v2/instruction"

var fmsub_q instruction.InstructionDefinition = instruction.NewR4FTypeDefinition(
	`fmsub.q`,
	`fmsub.q rd,rs1,rs2,rs3`,
	`Perform quad-precision fused multiply addition.`,
	`f[rd] = f[rs1]×f[rs2]-f[rs3]`,
	0b01000111,
    0b00000011,
)