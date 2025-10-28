package zawrs

import "riscvasm.com/m/v2/instruction"

var Instructions = map[string]instruction.InstructionDefinition{
    "wrs.nto": wrs_nto,
    "wrs.sto": wrs_sto,
}