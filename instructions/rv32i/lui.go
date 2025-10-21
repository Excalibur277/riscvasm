package rv32i

import "riscvasm.com/m/v2/instruction"

var lui instruction.InstructionDefinition = instruction.NewUTypeDefinition(
	`lui`,
	`lui rd,imm`,
	`Build 32-bit constants and uses the U-type format. LUI places the U-immediate value in the top 20 bits of the destination register rd, filling in the lowest 12 bits with zeros.`,
	`x[rd] = sext(immediate[31:12] << 12)`,
	0b00110111,
)
