package rv32i

import "riscvasm.com/m/v2/instruction"

var lw instruction.InstructionDefinition = instruction.NewITypeDefinition(
	`lw`,
	`lw rd,offset(rs1)`,
	`Loads a 32-bit value from memory and sign-extends this to XLEN bits before storing it in register rd.`,
	`x[rd] = sext(M[x[rs1] + sext(offset)][31:0])`,
	0b00000011,
	0b00000010,
)
