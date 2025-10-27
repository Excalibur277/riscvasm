package rv64i

import "riscvasm.com/m/v2/instruction"

var lwu instruction.InstructionDefinition = instruction.NewITypeDefinition(
	`lwu`,
	`lwu rd,offset(rs1)`,
	`Loads a 32-bit value from memory and zero-extends this to 64 bits before storing it in register rd.`,
	`x[rd] = M[x[rs1] + sext(offset)][31:0]`,
	0b00000011,
    0b00000110,
)