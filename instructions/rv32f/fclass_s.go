package rv32f

import "riscvasm.com/m/v2/instruction"

var fclass_s instruction.InstructionDefinition = instruction.NewR2TypeDefinition(
	`fclass.s`,
	`fclass.s rd,rs1`,
	`Examines the value in single-precision floating-point register rs1 and writes to integer register rd a 10-bit mask that indicates the class of the floating-point number. The format of the mask is described in [classify table]_. The corresponding bit in rd will be set if the property is true and clear otherwise. All other bits in rd are cleared. Note that exactly one bit in rd will be set.`,
	`aZx[rd] = classify_s(f[rs1])`,
	0b01010011,
    0b00000001,
    0b000000,
    0b01110000,
)