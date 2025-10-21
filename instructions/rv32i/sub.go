package rv32i

import "riscvasm.com/m/v2/instruction"

var sub instruction.InstructionDefinition = instruction.NewRTypeDefinition(
	`sub`,
	`sub rd,rs1,rs2`,
	`Subs the register rs2 from rs1 and stores the result in rd. Arithmetic overflow is ignored and the result is simply the low XLEN bits of the result.`,
	`x[rd] = x[rs1] - x[rs2]`,
	0b00110011,
	0b00000000,
	0b00100000,
)
