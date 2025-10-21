package rv32i

import "riscvasm.com/m/v2/instruction"

var ori instruction.InstructionDefinition = instruction.NewITypeDefinition(
	`ori`,
	`ori rd,rs1,imm`,
	`Performs bitwise OR on register rs1 and the sign-extended 12-bit immediate and place the result in rd`,
	`x[rd] = x[rs1] | sext(immediate)`,
	0b00010011,
	0b00000110,
)
