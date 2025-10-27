package rv64i

import "riscvasm.com/m/v2/instruction"

var srli instruction.InstructionDefinition = instruction.NewShamtTypeDefinition(
	`srli`,
	`srli rd,rs1,shamt`,
	`Performs logical right shift on the 32-bit of value in register rs1 by the shift amount held in the lower 5 bits of the immediate. Encodings with $imm[5] neq 0$ are reserved.`,
	`x[rd] = sext(x[rs1][31:0] >>u shamt)`,
	0b00010011,
    0b00000101,
    0b00000000,
)