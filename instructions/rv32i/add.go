package rv32i

import "riscvasm.com/m/v2/instruction"

var add instruction.InstructionDefinition = instruction.NewRTypeDefinition(
	`add`,
	`add rd,rs1,rs2`,
	`Adds the registers rs1 and rs2 and stores the result in rd. Arithmetic overflow is ignored and the result is simply the low XLEN bits of the result.`,
	`x[rd] = x[rs1] + x[rs2]`,
	0b00110011,
	0b00000000,
	0b00000000,
)
