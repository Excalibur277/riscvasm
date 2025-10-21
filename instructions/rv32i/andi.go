package rv32i

import "riscvasm.com/m/v2/instruction"

var andi instruction.InstructionDefinition = instruction.NewITypeDefinition(
	`andi`,
	`andi rd,rs1,imm`,
	`Performs bitwise AND on register rs1 and the sign-extended 12-bit immediate and place the result in rd`,
	`x[rd] = x[rs1] & sext(immediate)`,
	0b00010011,
	0b00000111,
)
