package rv32q

import "riscvasm.com/m/v2/instruction"

var Instructions = map[string]instruction.InstructionDefinition{
    "flq": flq,
    "fsq": fsq,
    "fmadd.q": fmadd_q,
    "fmsub.q": fmsub_q,
    "fnmsub.q": fnmsub_q,
    "fnmadd.q": fnmadd_q,
    "fadd.q": fadd_q,
    "fsub.q": fsub_q,
    "fmul.q": fmul_q,
    "fdiv.q": fdiv_q,
    "fsqrt.q": fsqrt_q,
    "fsgnj.q": fsgnj_q,
    "fsgnjn.q": fsgnjn_q,
    "fsgnjx.q": fsgnjx_q,
    "fmin.q": fmin_q,
    "fmax.q": fmax_q,
    "fcvt.s.q": fcvt_s_q,
    "fcvt.q.s": fcvt_q_s,
    "fcvt.d.q": fcvt_d_q,
    "dcvt.q.d": dcvt_q_d,
    "feq.q": feq_q,
    "flt.q": flt_q,
    "fle.q": fle_q,
    "fclass.q": fclass_q,
    "fcvt.w.q": fcvt_w_q,
    "fcvt.wu.q": fcvt_wu_q,
    "fcvt.q.w": fcvt_q_w,
    "fcvt.q.wu": fcvt_q_wu,
}