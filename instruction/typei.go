package instruction

type ITypeDefinition struct {
	typeDefinition
	opcode uint8 // 7-bit
	funct3 uint8 // 3-bit
}

func (def *ITypeDefinition) Construct(rd, rs1 IntReg32, immediate Immediate) EncodedInstruction {
	var instruction EncodedInstruction = 0
	instruction = encode7(instruction, def.opcode, 0)
	instruction = encode5(instruction, uint8(rd), 7)
	instruction = encode3(instruction, uint8(def.funct3), 12)
	instruction = encode5(instruction, uint8(rs1), 15)
	instruction = encode12(instruction, uint16(immediate), 20) // 0:11
	return instruction
}

func (def *ITypeDefinition) Define(operands []Operand) (Instruction, error) {
	rd, rs2, immediate, err := Cast3[IntReg32, IntReg32, Immediate](operands)
	return ITypeInstruction{def, rd, rs2, immediate}, err
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
	rd         IntReg32
	rs1        IntReg32
	immediate  Immediate // 12-bit
}

func (i ITypeInstruction) IsInstruction() {}
func (i ITypeInstruction) Construct() EncodedInstruction {
	return i.definition.Construct(i.rd, i.rs1, i.immediate)
}
