package rv64i

import "riscvasm.com/m/v2/instruction"

var slli instruction.InstructionDefinition = instruction.NewShamtTypeDefinition(
	`slli`,
	`slli rd,rs1,shamt`,
	`Performs logical left shift on the 32-bit of value in register rs1 by the shift amount held in the lower 5 bits of the immediate. Encodings with $imm[5] neq 0$ are reserved.`,
	`x[rd] = sext((x[rs1] << shamt)[31:0])`,
	0b00010011,
    0b00000001,
    0b00000000,
)