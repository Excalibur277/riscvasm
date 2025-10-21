package rv32i

import "riscvasm.com/m/v2/instruction"

var srai instruction.InstructionDefinition = instruction.NewShamtTypeDefinition(
	`srai`,
	`srai rd,rs1,shamt`,
	`Performs arithmetic right shift on the value in register rs1 by the shift amount held in the lower 5 bits of the immediate In RV64, bit-25 is used to shamt[5].`,
	`x[rd] = x[rs1] >>s shamt`,
	0b00010011,
	0b00000101,
	0b00100000,
)
