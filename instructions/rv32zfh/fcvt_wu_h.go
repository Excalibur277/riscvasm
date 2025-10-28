package rv32zfh

import "riscvasm.com/m/v2/instruction"

var fcvt_wu_h instruction.InstructionDefinition = instruction.NewR2FTypeDefinition(
	`fcvt.wu.h`,
	`fcvt.wu.h rd,rs1`,
	`Converts half-precision floating point number in floating point register in rs1 into a unsigned integer in integer register rd.`,
	`f[rd] = f16->u32(x[rs1])`,
	0b01010011,
    0b00000001,
    0b01100010,
)