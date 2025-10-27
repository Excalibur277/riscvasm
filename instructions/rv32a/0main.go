package rv32a

import "riscvasm.com/m/v2/instruction"

var Instructions = map[string]instruction.InstructionDefinition{
    "lr.w": lr_w,
    "sc.w": sc_w,
    "amoswap.w": amoswap_w,
    "amoadd.w": amoadd_w,
    "amoxor.w": amoxor_w,
    "amoand.w": amoand_w,
    "amoor.w": amoor_w,
    "amomin.w": amomin_w,
    "amomax.w": amomax_w,
    "amominu.w": amominu_w,
    "amomaxu.w": amomaxu_w,
}