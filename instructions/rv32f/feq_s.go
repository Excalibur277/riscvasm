package rv32f

import "riscvasm.com/m/v2/instruction"

var feq_s instruction.InstructionDefinition = instruction.NewR2FTypeDefinition(
	`feq.s`,
	`feq.s rd,rs1,rs2`,
	`Performs a quiet equal comparison between single-precision floating-point registers rs1 and rs2 and record the Boolean result in integer register rd. Only signaling NaN inputs cause an Invalid Operation exception. The result is 0 if either operand is NaN.`,
	`x[rd] = f[rs1] == f[rs2]`,
	0b01010011,
	0b000000,
	0b01110000,
)
