package zifencei

import "riscvasm.com/m/v2/instruction"

var Instructions = map[string]instruction.InstructionDefinition{
    "fence.i": fence_i,
}