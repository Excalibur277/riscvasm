package rv32d

import "riscvasm.com/m/v2/instruction"

var fsd instruction.InstructionDefinition = instruction.NewSTypeDefinition(
	`fsd`,
	`fsd rs2,offset(rs1)`,
	`Store a double-precision value from the floating-point registers to memory.`,
	`aZM[x[rs1] + sext(offset)] = f[rs2][63:0]`,
	0b00100111,
    0b00000011,
)