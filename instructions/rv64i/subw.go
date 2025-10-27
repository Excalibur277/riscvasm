package rv64i

import "riscvasm.com/m/v2/instruction"

var subw instruction.InstructionDefinition = instruction.NewRTypeDefinition(
	`subw`,
	`subw rd,rs1,rs2`,
	`Subtract the 32-bit of registers rs1 and 32-bit of register rs2 and stores the result in rd. Arithmetic overflow is ignored and the low 32-bits of the result is sign-extended to 64-bits and written to the destination register.`,
	`x[rd] = sext((x[rs1] - x[rs2])[31:0])`,
	0b00111011,
    0b00000000,
    0b00100000,
)