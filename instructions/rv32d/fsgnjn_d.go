package rv32d

import "riscvasm.com/m/v2/instruction"

var fsgnjn_d instruction.InstructionDefinition = instruction.NewRTypeDefinition(
	`fsgnjn.d`,
	`fsgnjn.d rd,rs1,rs2`,
	`Produce a result that takes all bits except the sign bit from rs1. The result’s sign bit is opposite of rs2’s sign bit.`,
	`f[rd] = {~f[rs2][63], f[rs1][62:0]}`,
	0b01010011,
	0b00000001,
	0b00010001,
)
