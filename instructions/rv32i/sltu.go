package rv32i

import "riscvasm.com/m/v2/instruction"

var sltu instruction.InstructionDefinition = instruction.NewRTypeDefinition(
	`sltu`,
	`sltu rd,rs1,rs2`,
	`Place the value 1 in register rd if register rs1 is less than register rs2 when both are treated as unsigned numbers, else 0 is written to rd.`,
	`x[rd] = x[rs1] <u x[rs2]`,
	0b00110011,
	0b00000011,
	0b00000000,
)
