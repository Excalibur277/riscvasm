package rv64a

import "riscvasm.com/m/v2/instruction"

var amomax_d instruction.InstructionDefinition = instruction.NewATypeDefinition(
	`amomax.d`,
	`amomax.d rd,rs2,(rs1)`,
	`Atomically load a 64-bit signed data value from the address in rs1, place the value into register rd, apply max operator the loaded value and the original 64-bit signed value in rs2, then store the result back to the address in rs1.`,
	`x[rd] = AMO64(M[x[rs1]] MAX x[rs2])`,
	0b00101111,
    0b00000011,
    0b00010100,
)