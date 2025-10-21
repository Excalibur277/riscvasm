package rv32i

import "riscvasm.com/m/v2/instruction"

var slli instruction.InstructionDefinition = instruction.NewShamtTypeDefinition(
	`slli`,
	`slli rd,rs1,shamt`,
	`Performs logical left shift on the value in register rs1 by the shift amount held in the lower 5 bits of the immediate In RV64, bit-25 is used to shamt[5].`,
	`x[rd] = x[rs1] << shamt`,
	0b00010011,
	0b00000001,
	0b00000000,
)
