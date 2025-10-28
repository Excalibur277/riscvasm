package rv32d

import "riscvasm.com/m/v2/instruction"

var fmsub_d instruction.InstructionDefinition = instruction.NewR4FTypeDefinition(
	`fmsub.d`,
	`fmsub.d rd,rs1,rs2,rs3`,
	`Perform double-precision fused multiply subtraction.`,
	`f[rd] = f[rs1]×f[rs2]-f[rs3]`,
	0b01000111,
	0b00000001,
)
