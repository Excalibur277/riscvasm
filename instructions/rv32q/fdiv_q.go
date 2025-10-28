package rv32q

import "riscvasm.com/m/v2/instruction"

var fdiv_q instruction.InstructionDefinition = instruction.NewRFTypeDefinition(
	`fdiv.q`,
	`fdiv.q rd,rs1,rs2`,
	`Perform quad-precision floating-point division.`,
	`f[rd] = f[rs1] / f[rs2]`,
	0b01010011,
    0b00001111,
)