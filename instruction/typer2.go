package instruction

import "encoding/binary"

type R2TypeDefinition struct {
	typeDefinition
	opcode uint8 // 7-bit
	funct3 uint8 // 3-bit
	funct5 uint8 // 5-bit
	funct7 uint8 // 7-bit
}

func (def *R2TypeDefinition) Construct(rd Register, rs1 Register) EncodedInstruction {
	var instruction uint32 = 0
	instruction = encode7(instruction, def.opcode, 0)
	instruction = encode5(instruction, uint8(rd), 7)
	instruction = encode3(instruction, uint8(def.funct3), 12)
	instruction = encode5(instruction, uint8(rs1), 15)
	instruction = encode7(instruction, uint8(def.funct7), 25)
	return binary.LittleEndian.AppendUint32([]byte{}, uint32(instruction))
}

func (def *R2TypeDefinition) Define(operands []Operand) (Instruction, error) {
	rd, rs1, err := Cast2[Register, Register](operands)
	return R2TypeInstruction{def, rd, rs1}, err
}

func NewR2TypeDefinition(name, format, description, implementation string, opcode, funct3, funct5, funct7 uint8) *R2TypeDefinition {
	return &R2TypeDefinition{
		newTypeDefinition(name, format, description, implementation),
		opcode,
		funct3,
		funct5,
		funct7,
	}
}

type R2TypeInstruction struct {
	definition *R2TypeDefinition
	rd         Register
	rs1        Register
}

func (i R2TypeInstruction) IsInstruction() {}
func (i R2TypeInstruction) Construct() EncodedInstruction {
	return i.definition.Construct(i.rd, i.rs1)
}
