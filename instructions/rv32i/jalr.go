package rv32i

import "riscvasm.com/m/v2/instruction"

var jalr instruction.InstructionDefinition = instruction.NewITypeDefinition(
	`jalr`,
	`jalr rd,rs1,offset`,
	`Jump to address and place return address in rd.`,
	`t =pc+4; pc=(x[rs1]+sext(offset))&∼1; x[rd]=t`,
	0b01100111,
	0b00000000,
)
