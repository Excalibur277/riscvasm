package instruction

import (
	"encoding/binary"
	"fmt"
)

type ConstantTypeDefinition struct {
	typeDefinition
	instruction EncodedInstruction
}

func (def *ConstantTypeDefinition) Construct() EncodedInstruction {
	return def.instruction
}

func (def *ConstantTypeDefinition) Define(operands []Operand) (Instruction, error) {
	if len(operands) > 0 {
		return nil, fmt.Errorf("must be 0 operands")
	}
	return ConstantTypeInstruction{def}, nil
}

func NewConstantTypeDefinition(name, format, description, implementation string, instruction uint32) *ConstantTypeDefinition {
	return &ConstantTypeDefinition{
		newTypeDefinition(name, format, description, implementation),
		binary.LittleEndian.AppendUint32([]byte{}, uint32(instruction)),
	}
}

type ConstantTypeInstruction struct {
	definition *ConstantTypeDefinition
}

func (i ConstantTypeInstruction) IsInstruction() {}
func (i ConstantTypeInstruction) Construct() EncodedInstruction {
	return i.definition.Construct()
}
