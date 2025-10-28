package zicond

import "riscvasm.com/m/v2/instruction"

var czero_eqz instruction.InstructionDefinition = instruction.NewRTypeDefinition(
	`czero.eqz`,
	`czero.eqz rd,rs1,rs2`,
	`If rs2 contains the value zero, this instruction writes the value zero to rd. Otherwise, this instruction copies the contents of rs1 to rd. This instruction carries a syntactic dependency from both rs1 and rs2 to rd. Furthermore, if the Zkt extension is implemented, this instruction’s timing is independent of the data values in rs1 and rs2.`,
	``,
	0b00110011,
    0b00000111,
    0b00000111,
)