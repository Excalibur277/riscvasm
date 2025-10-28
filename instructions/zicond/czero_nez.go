package zicond

import "riscvasm.com/m/v2/instruction"

var czero_nez instruction.InstructionDefinition = instruction.NewRTypeDefinition(
	`czero.nez`,
	`czero.nez rd,rs1,rs2`,
	`If rs2 contains a nonzero value, this instruction writes the value zero to rd. Otherwise, this instruction copies the contents of rs1 to rd. This instruction carries a syntactic dependency from both rs1 and rs2 to rd. Furthermore, if the Zkt extension is implemented, this instruction’s timing is independent of the data values in rs1 and rs2.`,
	``,
	0b00110011,
    0b00000101,
    0b00000111,
)