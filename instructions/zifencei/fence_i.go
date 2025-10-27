package zifencei

import "riscvasm.com/m/v2/instruction"

var fence_i instruction.InstructionDefinition = instruction.NewITypeDefinition(
	`fence.i`,
	`fence.i`,
	`Provides explicit synchronization between writes to instruction memory and instruction fetches on the same hart.`,
	`Fence(Store, Fetch)`,
	0b00001111,
    0b00000001,
)