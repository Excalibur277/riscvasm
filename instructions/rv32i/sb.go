package rv32i

import "riscvasm.com/m/v2/instruction"

var sb instruction.InstructionDefinition = instruction.NewSTypeDefinition(
	`sb`,
	`sb rs2,offset(rs1)`,
	`Store 8-bit, values from the low bits of register rs2 to memory.`,
	`M[x[rs1] + sext(offset)] = x[rs2][7:0]`,
	0b00100011,
	0b00000000,
)
