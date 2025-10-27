package rv64a

import "riscvasm.com/m/v2/instruction"

var amomaxu_d instruction.InstructionDefinition = instruction.NewATypeDefinition(
	`amomaxu.d`,
	`amomaxu.d rd,rs2,(rs1)`,
	`Atomically load a 64-bit unsigned data value from the address in rs1, place the value into register rd, apply unsigned max the loaded value and the original 64-bit unsigned value in rs2, then store the result back to the address in rs1.`,
	`x[rd] = AMO64(M[x[rs1]] MAXU x[rs2])`,
	0b00101111,
    0b00000011,
    0b00011100,
)