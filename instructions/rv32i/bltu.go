package rv32i

import "riscvasm.com/m/v2/instruction"

var bltu instruction.InstructionDefinition = instruction.NewBTypeDefinition(
	`bltu`,
	`bltu rs1,rs2,offset`,
	`Take the branch if registers rs1 is less than rs2, using unsigned comparison.`,
	`if (rs1 >u rs2) pc += sext(offset)`,
	0b01100011,
	0b00000110,
)
