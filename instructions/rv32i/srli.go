package rv32i

import "riscvasm.com/m/v2/instruction"

var srli instruction.InstructionDefinition = instruction.NewShamtTypeDefinition(
	`srli`,
	`srli rd,rs1,shamt`,
	`Performs logical right shift on the value in register rs1 by the shift amount held in the lower 5 bits of the immediate In RV64, bit-25 is used to shamt[5].`,
	`x[rd] = x[rs1] >>u shamt`,
	0b00010011,
	0b00000101,
	0b00000000,
)
