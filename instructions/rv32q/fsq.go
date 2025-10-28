package rv32q

import "riscvasm.com/m/v2/instruction"

var fsq instruction.InstructionDefinition = instruction.NewSTypeDefinition(
	`fsq`,
	`fsq rs2,offset(rs1)`,
	`Store a quad-precision value from floating-point register rs2 to memory.`,
	`aZM[x[rs1] + sext(offset)] = f[rs2][31:0]`,
	0b00100111,
    0b00000100,
)