package rv64q

import "riscvasm.com/m/v2/instruction"

var Instructions = map[string]instruction.InstructionDefinition{
    "fcvt.l.q": fcvt_l_q,
    "fcvt.lu.q": fcvt_lu_q,
    "fcvt.q.l": fcvt_q_l,
    "fcvt.q.lu": fcvt_q_lu,
}