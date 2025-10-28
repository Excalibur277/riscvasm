package rv32d

import "riscvasm.com/m/v2/instruction"

var Instructions = map[string]instruction.InstructionDefinition{
    "fld": fld,
    "fsd": fsd,
    "fmadd.d": fmadd_d,
    "fmsub.d": fmsub_d,
    "fnmsub.d": fnmsub_d,
    "fnmadd.d": fnmadd_d,
    "fadd.d": fadd_d,
    "fsub.d": fsub_d,
    "fmul.d": fmul_d,
    "fdiv.d": fdiv_d,
    "fsqrt.d": fsqrt_d,
    "fsgnj.d": fsgnj_d,
    "fsgnjn.d": fsgnjn_d,
    "fsgnjx.d": fsgnjx_d,
    "fmin.d": fmin_d,
    "fmax.d": fmax_d,
    "fcvt.s.d": fcvt_s_d,
    "fcvt.d.s": fcvt_d_s,
    "feq.d": feq_d,
    "flt.d": flt_d,
    "fle.d": fle_d,
    "fclass.d": fclass_d,
    "fcvt.w.d": fcvt_w_d,
    "fcvt.wu.d": fcvt_wu_d,
    "fcvt.d.w": fcvt_d_w,
    "fcvt.d.wu": fcvt_d_wu,
}