package rv32i

import "riscvasm.com/m/v2/instruction"

var srl instruction.InstructionDefinition = instruction.NewRTypeDefinition(
	`srl`,
	`srl rd,rs1,rs2`,
	`Logical right shift on the value in register rs1 by the shift amount held in the lower 5 bits of register rs2`,
	`x[rd] = x[rs1] >>u x[rs2]`,
	0b00110011,
	0b00000101,
	0b00000000,
)
