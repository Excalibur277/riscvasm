package rv32zfh

import "riscvasm.com/m/v2/instruction"

var fclass_h instruction.InstructionDefinition = instruction.NewR2TypeDefinition(
	`fclass.h`,
	`fclass.h rd,rs1`,
	`Examines the value in half-precision floating-point register rs1 and writes to integer register rd a 10-bit mask that indicates the class of the floating-point number. The format of the mask is described in table [classify table]_. The corresponding bit in rd will be set if the property is true and clear otherwise. All other bits in rd are cleared. Note that exactly one bit in rd will be set.`,
	`x[rd] = classifys(f[rs1])`,
	0b01010011,
    0b00000001,
    0b000000,
    0b01110010,
)