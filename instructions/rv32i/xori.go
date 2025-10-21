package rv32i

import "riscvasm.com/m/v2/instruction"

var xori instruction.InstructionDefinition = instruction.NewITypeDefinition(
	`xori`,
	`xori rd,rs1,imm`,
	`Performs bitwise XOR on register rs1 and the sign-extended 12-bit immediate and place the result in rd Note, "XORI rd, rs1, -1" performs a bitwise logical inversion of register rs1(assembler pseudo-instruction NOT rd, rs)`,
	`x[rd] = x[rs1] ^ sext(immediate)`,
	0b00010011,
	0b00000100,
)
