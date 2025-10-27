package rv32m

import "riscvasm.com/m/v2/instruction"

var Instructions = map[string]instruction.InstructionDefinition{
    "mul": mul,
    "mulh": mulh,
    "mulhsu": mulhsu,
    "mulhu": mulhu,
    "div": div,
    "divu": divu,
    "rem": rem,
    "remu": remu,
}