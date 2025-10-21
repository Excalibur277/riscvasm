package rv32i

import "riscvasm.com/m/v2/instruction"

var jal instruction.InstructionDefinition = instruction.NewJTypeDefinition(
	`jal`,
	`jal rd,offset`,
	`Jump to address and place return address in rd.`,
	`x[rd] = pc+4; pc += sext(offset)`,
	0b01101111,
)
