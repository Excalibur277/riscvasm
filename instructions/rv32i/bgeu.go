package rv32i

import "riscvasm.com/m/v2/instruction"

var bgeu instruction.InstructionDefinition = instruction.NewBTypeDefinition(
	`bgeu`,
	`bgeu rs1,rs2,offset`,
	`Take the branch if registers rs1 is greater than rs2, using unsigned comparison.`,
	`if (rs1 >=u rs2) pc += sext(offset)`,
	0b01100011,
	0b00000111,
)
