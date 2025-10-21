package rv32i

import "riscvasm.com/m/v2/instruction"

var lb instruction.InstructionDefinition = instruction.NewITypeDefinition(
	`lb`,
	`lb rd,offset(rs1)`,
	`Loads a 8-bit value from memory and sign-extends this to XLEN bits before storing it in register rd.`,
	`x[rd] = sext(M[x[rs1] + sext(offset)][7:0])`,
	0b00000011,
	0b00000000,
)
