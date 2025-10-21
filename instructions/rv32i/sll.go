package rv32i

import "riscvasm.com/m/v2/instruction"

var sll instruction.InstructionDefinition = instruction.NewRTypeDefinition(
	`sll`,
	`sll rd,rs1,rs2`,
	`Performs logical left shift on the value in register rs1 by the shift amount held in the lower 5 bits of register rs2.`,
	`x[rd] = x[rs1] << x[rs2]`,
	0b00110011,
	0b00000001,
	0b00000000,
)
