package rv32q

import "riscvasm.com/m/v2/instruction"

var fsgnjn_q instruction.InstructionDefinition = instruction.NewRTypeDefinition(
	`fsgnjn.q`,
	`fsgnjn.q rd,rs1,rs2`,
	`Produce a result that takes all bits except the sign bit from rs1. The result’s sign bit is opposite of rs2’s sign bit.`,
	`f[rd] = {~f[rs2][31], f[rs1][30:0]}`,
	0b01010011,
    0b00000001,
    0b00010011,
)