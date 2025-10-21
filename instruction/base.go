package instruction

import "encoding/binary"

type EncodedInstruction uint32

type InstructionDefinition interface {
	IsInstructionDefinition()
	Define(operands []Operand) (Instruction, error)
}

type Instruction interface {
	IsInstruction()
	Construct() EncodedInstruction
}

type LabelInstruction struct {
	Instruction
	label string
}

func NewLabelInstruction(i Instruction, label string) LabelInstruction {
	return LabelInstruction{i, label}
}

type Module struct {
	instructions []Instruction
}

func (m *Module) Construct() []byte {
	bytecode := make([]byte, 0, len(m.instructions)*4)
	for _, instruction := range m.instructions {
		bytecode = binary.LittleEndian.AppendUint32(bytecode, uint32(instruction.Construct()))
	}
	return bytecode
}

func (m *Module) Push(i ...Instruction) {
	m.instructions = append(m.instructions, i...)
}
