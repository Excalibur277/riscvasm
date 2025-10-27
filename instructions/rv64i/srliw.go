package rv64i

import "riscvasm.com/m/v2/instruction"

var srliw instruction.InstructionDefinition = instruction.NewRTypeDefinition(
	`srliw`,
	`srliw rd,rs1,shamt`,
	`Performs logical right shift on the low 32-bits value in register rs1 by the shift amount held in the lower 5 bits of the immediate and produce 32-bit results and written to the destination register rd.`,
	`x[rd] = sext(x[rs1][31:0] >>u shamt)`,
	0b00011011,
    0b00000101,
    0b00000000,
)