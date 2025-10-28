package instruction

import "encoding/binary"

type ITypeDefinition struct {
	typeDefinition
	opcode uint8 // 7-bit
	funct3 uint8 // 3-bit
}

func (def *ITypeDefinition) Construct(rd, rs1 Register, immediate Immediate) EncodedInstruction {
	var instruction uint32 = 0
	instruction = encode7(instruction, def.opcode, 0)
	instruction = encode5(instruction, uint8(rd), 7)
	instruction = encode3(instruction, uint8(def.funct3), 12)
	instruction = encode5(instruction, uint8(rs1), 15)
	instruction = encode12(instruction, uint16(immediate), 20)   // 0:10
	instruction = encode1(instruction, uint8(immediate>>31), 31) // 12
	return binary.LittleEndian.AppendUint32([]byte{}, uint32(instruction))
}

func (def *ITypeDefinition) Define(operands []Operand) (Instruction, error) {
	rd, rs1, immediate, err := Cast3[Register, Register, Immediate](operands)
	return ITypeInstruction{def, rd, rs1, immediate}, err
}

func NewITypeDefinition(name, format, description, implementation string, opcode, funct3 uint8) *ITypeDefinition {
	return &ITypeDefinition{
		newTypeDefinition(name, format, description, implementation),
		opcode,
		funct3,
	}
}

type ITypeInstruction struct {
	definition *ITypeDefinition
	rd         Register
	rs1        Register
	immediate  Immediate // 12-bit
}

func (i ITypeInstruction) IsInstruction() {}
func (i ITypeInstruction) Construct() EncodedInstruction {
	return i.definition.Construct(i.rd, i.rs1, i.immediate)
}
