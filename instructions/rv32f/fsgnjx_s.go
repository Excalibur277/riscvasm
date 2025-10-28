package rv32f

import "riscvasm.com/m/v2/instruction"

var fsgnjx_s instruction.InstructionDefinition = instruction.NewRTypeDefinition(
	`fsgnjx.s`,
	`fsgnjx.s rd,rs1,rs2`,
	`Produce a result that takes all bits except the sign bit from rs1. The result’s sign bit is XOR of sign bit of rs1 and rs2.`,
	`aZf[rd] = {f[rs1][31] ^ f[rs2][31], f[rs1][30:0]}`,
	0b01010011,
    0b00000010,
    0b00010000,
)