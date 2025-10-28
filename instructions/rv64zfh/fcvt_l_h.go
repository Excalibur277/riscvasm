package rv64zfh

import "riscvasm.com/m/v2/instruction"

var fcvt_l_h instruction.InstructionDefinition = instruction.NewR2FTypeDefinition(
	`fcvt.l.h`,
	`fcvt.l.h rd, rs1`,
	``,
	``,
	0b01010011,
    0b00000010,
    0b01100010,
)