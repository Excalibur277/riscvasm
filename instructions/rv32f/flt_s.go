package rv32f

import "riscvasm.com/m/v2/instruction"

var flt_s instruction.InstructionDefinition = instruction.NewRTypeDefinition(
	`flt.s`,
	`flt.s rd,rs1,rs2`,
	`Performs a quiet less comparison between single-precision floating-point registers rs1 and rs2 and record the Boolean result in integer register rd. Only signaling NaN inputs cause an Invalid Operation exception. The result is 0 if either operand is NaN.`,
	`aZx[rd] = f[rs1] < f[rs2]`,
	0b01010011,
    0b00000001,
    0b01010000,
)