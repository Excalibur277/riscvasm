package rv32f

import "riscvasm.com/m/v2/instruction"

var fsw instruction.InstructionDefinition = instruction.NewSTypeDefinition(
	`fsw`,
	`fsw rs2,offset(rs1)`,
	`Store a single-precision value from floating-point register rs2 to memory.`,
	`aZM[x[rs1] + sext(offset)] = f[rs2][31:0]`,
	0b00100111,
    0b00000010,
)