package rv64zfh

import "riscvasm.com/m/v2/instruction"

var Instructions = map[string]instruction.InstructionDefinition{
    "fcvt.l.h": fcvt_l_h,
    "fcvt.lu.h": fcvt_lu_h,
    "fcvt.h.l": fcvt_h_l,
    "fcvt.h.lu": fcvt_h_lu,
}