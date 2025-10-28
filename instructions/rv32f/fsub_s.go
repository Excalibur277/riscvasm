package rv32f

import "riscvasm.com/m/v2/instruction"

var fsub_s instruction.InstructionDefinition = instruction.NewRFTypeDefinition(
	`fsub.s`,
	`fsub.s rd,rs1,rs2`,
	`Perform single-precision floating-point substraction.`,
	`aZf[rd] = f[rs1] - f[rs2]`,
	0b01010011,
    0b00000100,
)