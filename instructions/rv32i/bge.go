package rv32i

import "riscvasm.com/m/v2/instruction"

var bge instruction.InstructionDefinition = instruction.NewBTypeDefinition(
	`bge`,
	`bge rs1,rs2,offset`,
	`Take the branch if registers rs1 is greater than rs2, using signed comparison.`,
	`if (rs1 >=s rs2) pc += sext(offset)`,
	0b01100011,
	0b00000101,
)
