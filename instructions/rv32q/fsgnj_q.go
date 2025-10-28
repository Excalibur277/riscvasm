package rv32q

import "riscvasm.com/m/v2/instruction"

var fsgnj_q instruction.InstructionDefinition = instruction.NewRTypeDefinition(
	`fsgnj.q`,
	`fsgnj.q rd,rs1,rs2`,
	`Produce a result that takes all bits except the sign bit from rs1. The result’s sign bit is rs2’s sign bit.`,
	`f[rd] = {f[rs2][31], f[rs1][30:0]}`,
	0b01010011,
    0b00000000,
    0b00010011,
)