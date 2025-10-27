package zicsr

import "riscvasm.com/m/v2/instruction"

var csrrw instruction.InstructionDefinition = instruction.NewCSRTypeDefinition(
	`csrrw`,
	`csrrw rd,offset,rs1`,
	`Atomically swaps values in the CSRs and integer registers. CSRRW reads the old value of the CSR, zero-extends the value to XLEN bits, then writes it to integer register rd. The initial value in rs1 is written to the CSR. If rd=x0, then the instruction shall not read the CSR and shall not cause any of the side effects that might occur on a CSR read.`,
	`t = CSRs[csr]; CSRs[csr] = x[rs1]; x[rd] = t`,
	0b01110011,
    0b00000001,
)