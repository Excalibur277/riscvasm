package rv32i

import "riscvasm.com/m/v2/instruction"

var beq instruction.InstructionDefinition = instruction.NewBTypeDefinition(
	`beq`,
	`beq rs1,rs2,offset`,
	`Take the branch if registers rs1 and rs2 are equal.`,
	`if (rs1 == rs2) pc += sext(offset)`,
	0b01100011,
	0b00000000,
)
