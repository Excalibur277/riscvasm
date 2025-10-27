package rv64i

import "riscvasm.com/m/v2/instruction"

var sllw instruction.InstructionDefinition = instruction.NewRTypeDefinition(
	`sllw`,
	`slliw rd,rs1,rs2`,
	`Performs logical left shift on the low 32-bits value in register rs1 by the shift amount held in the lower 5 bits of register rs2 and produce 32-bit results and written to the destination register rd.`,
	`x[rd] = sext((x[rs1] << x[rs2][4:0])[31:0])`,
	0b00111011,
    0b00000001,
    0b00000000,
)