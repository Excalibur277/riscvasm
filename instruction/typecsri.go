package instruction

import "encoding/binary"

type CSRITypeDefinition struct {
	typeDefinition
	opcode uint8 // 7-bit
	funct3 uint8 // 3-bit
}

func (def *CSRITypeDefinition) Construct(rd Register, uimm Immediate, csr CSR) EncodedInstruction {
	var instruction uint32 = 0
	instruction = encode7(instruction, def.opcode, 0)
	instruction = encode5(instruction, uint8(rd), 7)
	instruction = encode3(instruction, uint8(def.funct3), 12)
	instruction = encode5(instruction, uint8(uimm), 15)
	instruction = encode12(instruction, uint16(csr), 20) // 0:11
	return binary.LittleEndian.AppendUint32([]byte{}, uint32(instruction))
}

func (def *CSRITypeDefinition) Define(operands []Operand) (Instruction, error) {
	rd, uimm, csr, err := Cast3[Register, Immediate, CSR](operands)
	return CSRITypeInstruction{def, rd, uimm, csr}, err
}

func NewCSRITypeDefinition(name, format, description, implementation string, opcode, funct3 uint8) *CSRITypeDefinition {
	return &CSRITypeDefinition{
		newTypeDefinition(name, format, description, implementation),
		opcode,
		funct3,
	}
}

type CSRITypeInstruction struct {
	definition *CSRITypeDefinition
	rd         Register
	uimm       Immediate
	csr        CSR // 12-bit
}

func (i CSRITypeInstruction) IsInstruction() {}
func (i CSRITypeInstruction) Construct() EncodedInstruction {
	return i.definition.Construct(i.rd, i.uimm, i.csr)
}
