package instruction

type CSRTypeDefinition struct {
	typeDefinition
	opcode uint8 // 7-bit
	funct3 uint8 // 3-bit
}

func (def *CSRTypeDefinition) Construct(rd, rs1 Register, csr CSR) EncodedInstruction {
	var instruction EncodedInstruction = 0
	instruction = encode7(instruction, def.opcode, 0)
	instruction = encode5(instruction, uint8(rd), 7)
	instruction = encode3(instruction, uint8(def.funct3), 12)
	instruction = encode5(instruction, uint8(rs1), 15)
	instruction = encode12(instruction, uint16(csr), 20) // 0:11
	return instruction
}

func (def *CSRTypeDefinition) Define(operands []Operand) (Instruction, error) {
	rd, rs2, csr, err := Cast3[Register, Register, CSR](operands)
	return CSRTypeInstruction{def, rd, rs2, csr}, err
}

func NewCSRTypeDefinition(name, format, description, implementation string, opcode, funct3 uint8) *CSRTypeDefinition {
	return &CSRTypeDefinition{
		newTypeDefinition(name, format, description, implementation),
		opcode,
		funct3,
	}
}

type CSRTypeInstruction struct {
	definition *CSRTypeDefinition
	rd         Register
	rs1        Register
	csr        CSR // 12-bit
}

func (i CSRTypeInstruction) IsInstruction() {}
func (i CSRTypeInstruction) Construct() EncodedInstruction {
	return i.definition.Construct(i.rd, i.rs1, i.csr)
}
