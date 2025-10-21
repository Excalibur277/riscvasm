package rv32i

import "riscvasm.com/m/v2/instruction"

var lhu instruction.InstructionDefinition = instruction.NewITypeDefinition(
	`lhu`,
	`lhu rd,offset(rs1)`,
	`Loads a 16-bit value from memory and zero-extends this to XLEN bits before storing it in register rd.`,
	`x[rd] = M[x[rs1] + sext(offset)][15:0]`,
	0b00000011,
	0b00000101,
)
