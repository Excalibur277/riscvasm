package rv32d

import "riscvasm.com/m/v2/instruction"

var fld instruction.InstructionDefinition = instruction.NewITypeDefinition(
	`fld`,
	`fld rd,rs1,offset`,
	`Load a double-precision floating-point value from memory into floating-point register rd.`,
	`f[rd] = M[x[rs1] + sext(offset)][63:0]`,
	0b00000111,
	0b00000011,
)
