package rv32m

import "riscvasm.com/m/v2/instruction"

var mulhu instruction.InstructionDefinition = instruction.NewRTypeDefinition(
	`mulhu`,
	`mulhu rd,rs1,rs2`,
	`performs an XLEN-bit \(\times\) XLEN-bit multiplication of unsigned rs1 by unsigned rs2 and places the upper XLEN bits in the destination register.`,
	`x[rd] = (x[rs1] u latexmath:[$\times$] x[rs2]) >>u XLEN`,
	0b00110011,
    0b00000011,
    0b00000001,
)