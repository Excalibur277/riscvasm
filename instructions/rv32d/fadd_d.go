package rv32d

import "riscvasm.com/m/v2/instruction"

var fadd_d instruction.InstructionDefinition = instruction.NewRFTypeDefinition(
	`fadd.d`,
	`fadd.d rd,rs1,rs2`,
	`Perform double-precision floating-point addition.`,
	`f[rd] = f[rs1] + f[rs2]`,
	0b01010011,
	0b00000001,
)
