package rv32q

import "riscvasm.com/m/v2/instruction"

var fadd_q instruction.InstructionDefinition = instruction.NewRFTypeDefinition(
	`fadd.q`,
	`fadd.q rd,rs1,rs2`,
	`Perform quad-precision floating-point addition.`,
	`f[rd] = f[rs1] + f[rs2]`,
	0b01010011,
    0b00000011,
)