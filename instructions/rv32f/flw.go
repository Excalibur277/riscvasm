package rv32f

import "riscvasm.com/m/v2/instruction"

var flw instruction.InstructionDefinition = instruction.NewITypeDefinition(
	`flw`,
	`flw rd,offset(rs1)`,
	`Load a single-precision floating-point value from memory into floating-point register rd.`,
	`aZf[rd] = M[x[rs1] + sext(offset)][31:0]`,
	0b00000111,
    0b00000010,
)