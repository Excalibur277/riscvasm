package rv32zfh

import "riscvasm.com/m/v2/instruction"

var fcvt_w_h instruction.InstructionDefinition = instruction.NewR2FTypeDefinition(
	`fcvt.w.h`,
	`fcvt.w.h rd,rs1`,
	`Converts half-precision floating point number in floating point register in rs1 into a sigend integer in integer register rd.`,
	`f[rd] = f16->s32(x[rs1])`,
	0b01010011,
    0b00000000,
    0b01100010,
)