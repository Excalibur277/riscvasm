package instruction

type STypeDefinition struct {
	typeDefinition
	opcode uint8 // 7-bit
	funct3 uint8 // 3-bit
}

func (def *STypeDefinition) Construct(rs1, rs2 IntReg32, immediate Immediate) EncodedInstruction {
	var instruction EncodedInstruction = 0
	instruction = encode7(instruction, def.opcode, 0)
	instruction = encode5(instruction, uint8(immediate), 7) // 0:4
	instruction = encode3(instruction, uint8(def.funct3), 12)
	instruction = encode5(instruction, uint8(rs1), 15)
	instruction = encode5(instruction, uint8(rs2), 20)
	instruction = encode7(instruction, uint8(immediate>>5), 25) // 5:11
	return instruction
}

func (def *STypeDefinition) Define(operands []Operand) (Instruction, error) {
	rs1, rs2, immediate, err := Cast3[IntReg32, IntReg32, Immediate](operands)
	return STypeInstruction{def, rs1, rs2, immediate}, err
}

func NewSTypeDefinition(name, format, description, implementation string, opcode, funct3 uint8) *STypeDefinition {
	return &STypeDefinition{
		newTypeDefinition(name, format, description, implementation),
		opcode,
		funct3,
	}
}

type STypeInstruction struct {
	definition *STypeDefinition
	rs1        IntReg32
	rs2        IntReg32
	immediate  Immediate // 12-bit
}

func (i STypeInstruction) IsInstruction() {}
func (i STypeInstruction) Construct() EncodedInstruction {
	return i.definition.Construct(i.rs1, i.rs2, i.immediate)
}
