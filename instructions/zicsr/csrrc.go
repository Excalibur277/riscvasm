package zicsr

import "riscvasm.com/m/v2/instruction"

var csrrc instruction.InstructionDefinition = instruction.NewCSRTypeDefinition(
	`csrrc`,
	`csrrc rd,offset,rs1`,
	`Reads the value of the CSR, zero-extends the value to XLEN bits, and writes it to integer register rd. The initial value in integer register rs1 is treated as a bit mask that specifies bit positions to be cleared in the CSR. Any bit that is high in rs1 will cause the corresponding bit to be cleared in the CSR, if that CSR bit is writable. Other bits in the CSR are unaffected.`,
	`t = CSRs[csr]; CSRs[csr] = t &∼x[rs1]; x[rd] = t`,
	0b01110011,
    0b00000011,
)