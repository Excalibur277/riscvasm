package rv32i

import "riscvasm.com/m/v2/instruction"

var lh instruction.InstructionDefinition = instruction.NewITypeDefinition(
	`lh`,
	`lh rd,offset(rs1)`,
	`Loads a 16-bit value from memory and sign-extends this to XLEN bits before storing it in register rd.`,
	`x[rd] = sext(M[x[rs1] + sext(offset)][15:0])`,
	0b00000011,
	0b00000001,
)
