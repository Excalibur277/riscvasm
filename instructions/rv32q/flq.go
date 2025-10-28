package rv32q

import "riscvasm.com/m/v2/instruction"

var flq instruction.InstructionDefinition = instruction.NewITypeDefinition(
	`flq`,
	`flq rd,offset(rs1)`,
	`Load a quad-precision floating-point value from memory into floating-point register rd.`,
	`f[rd] = M[x[rs1] + sext(offset)][31:0]`,
	0b00000111,
    0b00000100,
)