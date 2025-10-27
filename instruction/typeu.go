package instruction

import "fmt"

type UTypeDefinition struct {
	typeDefinition
	opcode uint8 // 7-bit
}

func (def *UTypeDefinition) Construct(rd Register, immediate Immediate) EncodedInstruction {
	if immediate == 0x21646c72 {
		fmt.Println("Here")
	}
	var instruction EncodedInstruction = 0
	instruction = encode7(instruction, def.opcode, 0)
	instruction = encode5(instruction, uint8(rd), 7)
	instruction = encode20(instruction, uint32(immediate)>>12, 12) // 12:31
	return instruction
}

func (def *UTypeDefinition) Define(operands []Operand) (Instruction, error) {
	rd, immediate, err := Cast2[Register, Immediate](operands)
	return UTypeInstruction{def, rd, immediate}, err
}

func NewUTypeDefinition(name, format, description, implementation string, opcode uint8) *UTypeDefinition {
	return &UTypeDefinition{
		newTypeDefinition(name, format, description, implementation),
		opcode,
	}
}

type UTypeInstruction struct {
	definition *UTypeDefinition
	rd         Register
	immediate  Immediate // 20-bit
}

func (i UTypeInstruction) IsInstruction() {}
func (i UTypeInstruction) Construct() EncodedInstruction {
	return i.definition.Construct(i.rd, i.immediate)
}
