package rv64zfh

import "riscvasm.com/m/v2/instruction"

var fcvt_lu_h instruction.InstructionDefinition = instruction.NewR2FTypeDefinition(
	`fcvt.lu.h`,
	`fcvt.lu.h rd, rs1`,
	``,
	``,
	0b01010011,
    0b00000011,
    0b01100010,
)