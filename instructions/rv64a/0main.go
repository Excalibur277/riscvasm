package rv64a

import "riscvasm.com/m/v2/instruction"

var Instructions = map[string]instruction.InstructionDefinition{
    "lr.d": lr_d,
    "sc.d": sc_d,
    "amoswap.d": amoswap_d,
    "amoadd.d": amoadd_d,
    "amoxor.d": amoxor_d,
    "amoand.d": amoand_d,
    "amoor.d": amoor_d,
    "amomin.d": amomin_d,
    "amomax.d": amomax_d,
    "amominu.d": amominu_d,
    "amomaxu.d": amomaxu_d,
}