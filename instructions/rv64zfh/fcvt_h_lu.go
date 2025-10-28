package rv64zfh

import "riscvasm.com/m/v2/instruction"

var fcvt_h_lu instruction.InstructionDefinition = instruction.NewR2FTypeDefinition(
	`fcvt.h.lu`,
	`fcvt.h.lu rd, rs1`,
	``,
	``,
	0b01010011,
    0b00000011,
    0b01101010,
)