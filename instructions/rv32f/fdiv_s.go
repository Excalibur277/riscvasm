package rv32f

import "riscvasm.com/m/v2/instruction"

var fdiv_s instruction.InstructionDefinition = instruction.NewRFTypeDefinition(
	`fdiv.s`,
	`fdiv.s rd,rs1,rs2`,
	`Perform single-precision floating-point division.`,
	`aZf[rd] = f[rs1] / f[rs2]`,
	0b01010011,
    0b00001100,
)