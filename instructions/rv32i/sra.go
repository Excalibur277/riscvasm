package rv32i

import "riscvasm.com/m/v2/instruction"

var sra instruction.InstructionDefinition = instruction.NewRTypeDefinition(
	`sra`,
	`sra rd,rs1,rs2`,
	`Performs arithmetic right shift on the value in register rs1 by the shift amount held in the lower 5 bits of register rs2`,
	`x[rd] = x[rs1] >>s x[rs2]`,
	0b00110011,
	0b00000101,
	0b00100000,
)
