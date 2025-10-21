package rv32i

import "riscvasm.com/m/v2/instruction"

var bne instruction.InstructionDefinition = instruction.NewBTypeDefinition(
	`bne`,
	`bne rs1,rs2,offset`,
	`Take the branch if registers rs1 and rs2 are not equal.`,
	`if (rs1 != rs2) pc += sext(offset)`,
	0b01100011,
	0b00000001,
)
