package rv64i

import "riscvasm.com/m/v2/instruction"

var addiw instruction.InstructionDefinition = instruction.NewITypeDefinition(
	`addiw`,
	`addiw rd,rs1,imm`,
	`Adds the sign-extended 12-bit immediate to register rs1 and produces the proper sign-extension of a 32-bit result in rd. Overflows are ignored and the result is the low 32 bits of the result sign-extended to 64 bits. Note, ADDIW rd, rs1, 0 writes the sign-extension of the lower 32 bits of register rs1 into register rd (assembler pseudoinstruction SEXT.W).`,
	`x[rd] = sext((x[rs1] + sext(immediate))[31:0])`,
	0b00011011,
    0b00000000,
)