package rv32i

import "riscvasm.com/m/v2/instruction"

var sw instruction.InstructionDefinition = instruction.NewSTypeDefinition(
	`sw`,
	`sw rs2,offset(rs1)`,
	`Store 32-bit, values from the low bits of register rs2 to memory.`,
	`M[x[rs1] + sext(offset)] = x[rs2][31:0]`,
	0b00100011,
	0b00000010,
)
