package rv64i

import "riscvasm.com/m/v2/instruction"

var sd instruction.InstructionDefinition = instruction.NewSTypeDefinition(
	`sd`,
	`sd rs2,offset(rs1)`,
	`Store 64-bit, values from register rs2 to memory.`,
	`M[x[rs1] + sext(offset)] = x[rs2][63:0]`,
	0b00100011,
    0b00000011,
)