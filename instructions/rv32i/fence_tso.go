package rv32i

import "riscvasm.com/m/v2/instruction"

var fence_tso instruction.InstructionDefinition = instruction.NewConstantTypeDefinition(
	`fence.tso`,
	`fence.tso`,
	`fence.tso`,
	`fence.tso`,
	0b010000011001100000000000000001111,
)
