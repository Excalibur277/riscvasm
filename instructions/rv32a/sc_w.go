package rv32a

import "riscvasm.com/m/v2/instruction"

var sc_w instruction.InstructionDefinition = instruction.NewATypeDefinition(
	`sc.w`,
	`sc.w rd, rs1`,
	`write a word in rs2 to the address in rs1, provided a valid reservation still exists on that address. SC writes zero to rd on success or a nonzero code on failure.`,
	`x[rd] = StoreConditional32(M[x[rs1]], x[rs2])`,
	0b00101111,
    0b00000010,
    0b00000011,
)