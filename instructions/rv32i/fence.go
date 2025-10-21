package rv32i

import "riscvasm.com/m/v2/instruction"

var fence instruction.InstructionDefinition = instruction.NewFenceTypeDefinition(
	`fence`,
	`fence pred, succ`,
	`Used to order device I/O and memory accesses as viewed by other RISC-V harts and external devices or coprocessors. Any combination of device input (I), device output (O), memory reads ®, and memory writes (W) may be ordered with respect to any combination of the same. Informally, no other RISC-V hart or external device can observe any operation in the successor set following a FENCE before any operation in the predecessor set preceding the FENCE.`,
	`Fence(pred, succ)`,
	0b00001111,
	0b00000000,
)
