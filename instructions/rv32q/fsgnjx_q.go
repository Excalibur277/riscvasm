package rv32q

import "riscvasm.com/m/v2/instruction"

var fsgnjx_q instruction.InstructionDefinition = instruction.NewRTypeDefinition(
	`fsgnjx.q`,
	`fsgnjx.q rd,rs1,rs2`,
	`Produce a result that takes all bits except the sign bit from rs1. The result’s sign bit is XOR of sign bit of rs1 and rs2.`,
	`f[rd] = {f[rs1][31] ^ f[rs2][31], f[rs1][30:0]}`,
	0b01010011,
    0b00000010,
    0b00010011,
)