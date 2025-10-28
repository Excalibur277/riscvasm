package rv64d

import "riscvasm.com/m/v2/instruction"

var Instructions = map[string]instruction.InstructionDefinition{
    "fcvt.l.d": fcvt_l_d,
    "fcvt.lu.d": fcvt_lu_d,
    "fmv.x.d": fmv_x_d,
    "fcvt.d.l": fcvt_d_l,
    "fcvt.d.lu": fcvt_d_lu,
    "fmv.d.x": fmv_d_x,
}