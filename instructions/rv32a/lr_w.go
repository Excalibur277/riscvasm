package rv32a

import "riscvasm.com/m/v2/instruction"

var lr_w instruction.InstructionDefinition = instruction.NewAZTypeDefinition(
	`lr.w`,
	`lr.w rd, rs1`,
	`load a word from the address in rs1, places the sign-extended value in rd, and registers a reservation on the memory address.`,
	`x[rd] = LoadReserved32(M[x[rs1]])`,
	0b00101111,
    0b00000010,
    0b00000010,
)