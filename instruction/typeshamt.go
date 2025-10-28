package instruction

import "encoding/binary"

type ShamtTypeDefinition struct {
	typeDefinition
	opcode uint8 // 7-bit
	funct3 uint8 // 3-bit
	funct7 uint8 // 7-bit
}

func (def *ShamtTypeDefinition) Construct(rd, rs1 Register, shamt Immediate) EncodedInstruction {
	var instruction uint32 = 0
	instruction = encode7(instruction, def.opcode, 0)
	instruction = encode5(instruction, uint8(rd), 7)
	instruction = encode3(instruction, uint8(def.funct3), 12)
	instruction = encode5(instruction, uint8(rs1), 15)
	instruction = encode5(instruction, uint8(shamt), 20)
	instruction = encode7(instruction, uint8(def.funct7), 25)
	return binary.LittleEndian.AppendUint32([]byte{}, uint32(instruction))
}

func (def *ShamtTypeDefinition) Define(operands []Operand) (Instruction, error) {
	rd, rs1, shamt, err := Cast3[Register, Register, Immediate](operands)
	return ShamtTypeInstruction{def, rd, rs1, shamt}, err
}

func NewShamtTypeDefinition(name, format, description, implementation string, opcode, funct3, funct7 uint8) *ShamtTypeDefinition {
	return &ShamtTypeDefinition{
		newTypeDefinition(name, format, description, implementation),
		opcode,
		funct3,
		funct7,
	}
}

type ShamtTypeInstruction struct {
	definition *ShamtTypeDefinition
	rd         Register
	rs1        Register
	shamt      Immediate // 5-bit
}

func (i ShamtTypeInstruction) IsInstruction() {}
func (i ShamtTypeInstruction) Construct() EncodedInstruction {
	return i.definition.Construct(i.rd, i.rs1, i.shamt)
}
