package rv64a

import "riscvasm.com/m/v2/instruction"

var sc_d instruction.InstructionDefinition = instruction.NewATypeDefinition(
	`sc.d`,
	`sc.d rd, rs1`,
	`write a 64-bit data in rs2 to the address in rs1, provided a valid reservation still exists on that address. SC writes zero to rd on success or a nonzero code on failure.`,
	`x[rd] = StoreConditional64(M[x[rs1]], x[rs2])`,
	0b00101111,
    0b00000011,
    0b00000011,
)