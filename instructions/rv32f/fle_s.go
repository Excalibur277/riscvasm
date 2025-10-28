package rv32f

import "riscvasm.com/m/v2/instruction"

var fle_s instruction.InstructionDefinition = instruction.NewRTypeDefinition(
	`fle.s`,
	`fle.s rd,rs1,rs2`,
	`Performs a quiet less or equal comparison between single-precision floating-point registers rs1 and rs2 and record the Boolean result in integer register rd. Only signaling NaN inputs cause an Invalid Operation exception. The result is 0 if either operand is NaN.`,
	`aZx[rd] = f[rs1] <= f[rs2]`,
	0b01010011,
    0b00000000,
    0b01010000,
)