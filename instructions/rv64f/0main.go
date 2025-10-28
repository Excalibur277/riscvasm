package rv64f

import "riscvasm.com/m/v2/instruction"

var Instructions = map[string]instruction.InstructionDefinition{
    "fcvt.l.s": fcvt_l_s,
    "fcvt.lu.s": fcvt_lu_s,
    "fcvt.s.l": fcvt_s_l,
    "fcvt.s.lu": fcvt_s_lu,
}