package zicond

import "riscvasm.com/m/v2/instruction"

var Instructions = map[string]instruction.InstructionDefinition{
    "czero.eqz": czero_eqz,
    "czero.nez": czero_nez,
}