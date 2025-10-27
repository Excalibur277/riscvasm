package rv64i

import "riscvasm.com/m/v2/instruction"

var srai instruction.InstructionDefinition = instruction.NewShamtTypeDefinition(
	`srai`,
	`srai rd,rs1,shamt`,
	`Performs arithmetic right shift on the 32-bit of value in register rs1 by the shift amount held in the lower 5 bits of the immediate. Encodings with $imm[5] neq 0$ are reserved.`,
	`x[rd] = sext(x[rs1][31:0] >>s shamt)`,
	0b00010011,
    0b00000101,
    0b00010000,
)