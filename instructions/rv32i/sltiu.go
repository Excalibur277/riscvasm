package rv32i

import "riscvasm.com/m/v2/instruction"

var sltiu instruction.InstructionDefinition = instruction.NewITypeDefinition(
	`sltiu`,
	`sltiu rd,rs1,imm`,
	`Place the value 1 in register rd if register rs1 is less than the immediate when both are treated as unsigned numbers, else 0 is written to rd.`,
	`x[rd] = x[rs1] <u sext(immediate)`,
	0b00010011,
	0b00000011,
)
