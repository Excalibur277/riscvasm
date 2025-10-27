package zicsr

import "riscvasm.com/m/v2/instruction"

var csrrwi instruction.InstructionDefinition = instruction.NewCSRITypeDefinition(
	`csrrwi`,
	`csrrwi rd,offset,uimm`,
	`Update the CSR using an XLEN-bit value obtained by zero-extending a 5-bit unsigned immediate (uimm[4:0]) field encoded in the rs1 field.`,
	`x[rd] = CSRs[csr]; CSRs[csr] = zimm`,
	0b01110011,
    0b00000101,
)