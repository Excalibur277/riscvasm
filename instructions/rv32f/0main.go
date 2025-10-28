package rv32f

import "riscvasm.com/m/v2/instruction"

var Instructions = map[string]instruction.InstructionDefinition{
    "flw": flw,
    "fsw": fsw,
    "fmadd.s": fmadd_s,
    "fmsub.s": fmsub_s,
    "fnmsub.s": fnmsub_s,
    "fnmadd.s": fnmadd_s,
    "fadd.s": fadd_s,
    "fsub.s": fsub_s,
    "fmul.s": fmul_s,
    "fdiv.s": fdiv_s,
    "fsqrt.s": fsqrt_s,
    "fsgnj.s": fsgnj_s,
    "fsgnjn.s": fsgnjn_s,
    "fsgnjx.s": fsgnjx_s,
    "fmin.s": fmin_s,
    "fmax.s": fmax_s,
    "fcvt.w.s": fcvt_w_s,
    "fcvt.wu.s": fcvt_wu_s,
    "fmv.x.w": fmv_x_w,
    "feq.s": feq_s,
    "flt.s": flt_s,
    "fle.s": fle_s,
    "fclass.s": fclass_s,
    "fcvt.s.w": fcvt_s_w,
    "fcvt.s.wu": fcvt_s_wu,
    "fmv.w.x": fmv_w_x,
}