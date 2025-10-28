package rv32zfh

import "riscvasm.com/m/v2/instruction"

var fsh instruction.InstructionDefinition = instruction.NewSTypeDefinition(
	`fsh`,
	`fsh rs2,offset(rs1)`,
	`Store a half-precision value from the floating-point registers to memory.`,
	`aZM[x[rs1] + sext(offset)] = f[rs2][63:0]`,
	0b00100111,
    0b00000001,
)