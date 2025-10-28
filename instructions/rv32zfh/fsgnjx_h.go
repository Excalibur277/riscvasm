package rv32zfh

import "riscvasm.com/m/v2/instruction"

var fsgnjx_h instruction.InstructionDefinition = instruction.NewRTypeDefinition(
	`fsgnjx.h`,
	`fsgnjx.h rd,rs1,rs2`,
	`Produce a result that takes all bits except the sign bit from rs1. The result’s sign bit is XOR of sign bit of rs1 and rs2.`,
	`f[rd] = {f[rs1][63] ^ f[rs2][63], f[rs1][62:0]}`,
	0b01010011,
    0b00000010,
    0b00010001,
)