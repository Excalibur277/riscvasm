package rv32m

import "riscvasm.com/m/v2/instruction"

var mulhsu instruction.InstructionDefinition = instruction.NewRTypeDefinition(
	`mulhsu`,
	`mulhsu rd,rs1,rs2`,
	`performs an XLEN-bit \(\times\) XLEN-bit multiplication of signed rs1 by unsigned rs2 and places the upper XLEN bits in the destination register.`,
	`x[rd] = (x[rs1] s latexmath:[$\times$] x[rs2]) >>s XLEN`,
	0b00110011,
    0b00000010,
    0b00000001,
)