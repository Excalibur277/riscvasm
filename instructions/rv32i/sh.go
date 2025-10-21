package rv32i

import "riscvasm.com/m/v2/instruction"

var sh instruction.InstructionDefinition = instruction.NewSTypeDefinition(
	`sh`,
	`sh rs2,offset(rs1)`,
	`Store 16-bit, values from the low bits of register rs2 to memory.`,
	`M[x[rs1] + sext(offset)] = x[rs2][15:0]`,
	0b00100011,
	0b00000001,
)
