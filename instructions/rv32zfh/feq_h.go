package rv32zfh

import "riscvasm.com/m/v2/instruction"

var feq_h instruction.InstructionDefinition = instruction.NewRTypeDefinition(
	`feq.h`,
	`feq.h rd,rs1,rs2`,
	`Performs a quiet equal comparison between half-precision floating-point registers rs1 and rs2 and record the Boolean result in integer register rd. Only signaling NaN inputs cause an Invalid Operation exception. The result is 0 if either operand is NaN.`,
	`x[rd] = f[rs1] == f[rs2]`,
	0b01010011,
    0b00000010,
    0b01010010,
)