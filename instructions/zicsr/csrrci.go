package zicsr

import "riscvasm.com/m/v2/instruction"

var csrrci instruction.InstructionDefinition = instruction.NewCSRITypeDefinition(
	`csrrci`,
	`csrrci rd,offset,uimm`,
	`Clear CSR bit using an XLEN-bit value obtained by zero-extending a 5-bit unsigned immediate (uimm[4:0]) field encoded in the rs1 field.`,
	`t = CSRs[csr]; CSRs[csr] = t &∼zimm; x[rd] = t`,
	0b01110011,
    0b00000111,
)