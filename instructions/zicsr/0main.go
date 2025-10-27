package zicsr

import "riscvasm.com/m/v2/instruction"

var Instructions = map[string]instruction.InstructionDefinition{
    "csrrw": csrrw,
    "csrrs": csrrs,
    "csrrc": csrrc,
    "csrrwi": csrrwi,
    "csrrsi": csrrsi,
    "csrrci": csrrci,
}