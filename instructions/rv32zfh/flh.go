package rv32zfh

import "riscvasm.com/m/v2/instruction"

var flh instruction.InstructionDefinition = instruction.NewITypeDefinition(
	`flh`,
	`flh rd,rs1,offset`,
	`Load a half-precision floating-point value from memory into floating-point register rd.`,
	`f[rd] = M[x[rs1] + sext(offset)][63:0]`,
	0b00000111,
    0b00000001,
)