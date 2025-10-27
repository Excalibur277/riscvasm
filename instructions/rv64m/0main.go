package rv64m

import "riscvasm.com/m/v2/instruction"

var Instructions = map[string]instruction.InstructionDefinition{
    "mulw": mulw,
    "div": div,
    "divu": divu,
    "rem": rem,
    "remu": remu,
}