package rv32zfh

import "riscvasm.com/m/v2/instruction"

var fmul_h instruction.InstructionDefinition = instruction.NewRFTypeDefinition(
	`fmul.h`,
	`fmul.h rd,rs1,rs2`,
	`Perform half-precision floating-point addition.`,
	`f[rd] = f[rs1] × f[rs2]`,
	0b01010011,
    0b00001010,
)