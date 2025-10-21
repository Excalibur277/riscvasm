package rv32i

import "riscvasm.com/m/v2/instruction"

var addi instruction.InstructionDefinition = instruction.NewITypeDefinition(
	`addi`,
	`addi rd,rs1,imm`,
	`Adds the sign-extended 12-bit immediate to register rs1. Arithmetic overflow is ignored and the result is simply the low XLEN bits of the result. ADDI rd, rs1, 0 is used to implement the MV rd, rs1 assembler pseudo-instruction.`,
	`x[rd] = x[rs1] + sext(immediate)`,
	0b00010011,
	0b00000000,
)
