package rv32a

import "riscvasm.com/m/v2/instruction"

var amominu_w instruction.InstructionDefinition = instruction.NewATypeDefinition(
	`amominu.w`,
	`amominu.w rd,rs2,(rs1)`,
	`Atomically load a 32-bit unsigned data value from the address in rs1, place the value into register rd, apply unsigned min the loaded value and the original 32-bit unsigned value in rs2, then store the result back to the address in rs1.`,
	`x[rd] = AMO32(M[x[rs1]] MINU x[rs2])`,
	0b00101111,
    0b00000010,
    0b00011000,
)