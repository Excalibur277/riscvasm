package rv64zfh

import "riscvasm.com/m/v2/instruction"

var fcvt_h_l instruction.InstructionDefinition = instruction.NewR2FTypeDefinition(
	`fcvt.h.l`,
	`fcvt.h.l rd, rs1`,
	``,
	``,
	0b01010011,
    0b00000010,
    0b01101010,
)