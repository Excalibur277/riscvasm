package rv32q

import "riscvasm.com/m/v2/instruction"

var fsub_q instruction.InstructionDefinition = instruction.NewRFTypeDefinition(
	`fsub.q`,
	`fsub.q rd,rs1,rs2`,
	`Perform quad-precision floating-point substraction.`,
	`f[rd] = f[rs1] - f[rs2]`,
	0b01010011,
    0b00000111,
)