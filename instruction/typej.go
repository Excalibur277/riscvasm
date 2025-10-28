package instruction

import "encoding/binary"

type JTypeDefinition struct {
	typeDefinition
	opcode uint8 // 7-bit
}

func (def *JTypeDefinition) Construct(rd Register, immediate Immediate) EncodedInstruction {
	var instruction uint32 = 0
	instruction = encode7(instruction, def.opcode, 0)
	instruction = encode5(instruction, uint8(rd), 7)
	instruction = encode9(instruction, uint16(immediate>>12), 12) // 12:19
	instruction = encode1(instruction, uint8(immediate>>11), 21)  // 11
	instruction = encode9(instruction, uint16(immediate>>1), 22)  // 1:10
	instruction = encode1(instruction, uint8(immediate>>31), 31)  // 20
	return binary.LittleEndian.AppendUint32([]byte{}, uint32(instruction))
}

func (def *JTypeDefinition) Define(operands []Operand) (Instruction, error) {
	rd, immediate, err := Cast2[Register, Immediate](operands)
	return JTypeInstruction{def, rd, immediate}, err
}

func NewJTypeDefinition(name, format, description, implementation string, opcode uint8) *JTypeDefinition {
	return &JTypeDefinition{
		newTypeDefinition(name, format, description, implementation),
		opcode,
	}
}

type JTypeInstruction struct {
	definition *JTypeDefinition
	rd         Register
	immediate  Immediate // 20-bit
}

func (i JTypeInstruction) IsInstruction() {}
func (i JTypeInstruction) Construct() EncodedInstruction {
	return i.definition.Construct(i.rd, i.immediate)
}
