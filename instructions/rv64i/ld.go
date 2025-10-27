package rv64i

import "riscvasm.com/m/v2/instruction"

var ld instruction.InstructionDefinition = instruction.NewITypeDefinition(
	`ld`,
	`ld rd,offset(rs1)`,
	`Loads a 64-bit value from memory into register rd for RV64I.`,
	`x[rd] = M[x[rs1] + sext(offset)][63:0]`,
	0b00000011,
    0b00000011,
)