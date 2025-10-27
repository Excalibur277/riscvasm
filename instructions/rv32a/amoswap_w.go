package rv32a

import "riscvasm.com/m/v2/instruction"

var amoswap_w instruction.InstructionDefinition = instruction.NewATypeDefinition(
	`amoswap.w`,
	`amoswap.w rd,rs2,(rs1)`,
	`atomically load a 32-bit signed data value from the address in rs1, place the value into register rd, swap the loaded value and the original 32-bit signed value in rs2, then store the result back to the address in rs1.`,
	`x[rd] = AMO32(M[x[rs1]] SWAP x[rs2])`,
	0b00101111,
    0b00000010,
    0b00000001,
)