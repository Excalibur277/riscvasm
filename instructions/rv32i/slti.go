package rv32i

import "riscvasm.com/m/v2/instruction"

var slti instruction.InstructionDefinition = instruction.NewITypeDefinition(
	`slti`,
	`slti rd,rs1,imm`,
	`Place the value 1 in register rd if register rs1 is less than the signextended immediate when both are treated as signed numbers, else 0 is written to rd.`,
	`x[rd] = x[rs1] <s sext(immediate)`,
	0b00010011,
	0b00000010,
)
