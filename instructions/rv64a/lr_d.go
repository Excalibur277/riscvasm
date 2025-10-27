package rv64a

import "riscvasm.com/m/v2/instruction"

var lr_d instruction.InstructionDefinition = instruction.NewAZTypeDefinition(
	`lr.d`,
	`lr.d rd, rs1`,
	`load a 64-bit data from the address in rs1, places the sign-extended value in rd, and registers a reservation on the memory address.`,
	`x[rd] = LoadReserved64(M[x[rs1]])`,
	0b00101111,
    0b00000011,
    0b00000010,
)