package instruction

type ShamtTypeDefinition struct {
	typeDefinition
	opcode uint8 // 7-bit
	funct3 uint8 // 3-bit
	funct7 uint8 // 7-bit
}

func (def *ShamtTypeDefinition) Construct(rd, rs1 IntReg32, shamt Immediate) EncodedInstruction {
	var instruction EncodedInstruction = 0
	instruction = encode7(instruction, def.opcode, 0)
	instruction = encode5(instruction, uint8(rd), 7)
	instruction = encode3(instruction, uint8(def.funct3), 12)
	instruction = encode5(instruction, uint8(rs1), 15)
	instruction = encode5(instruction, uint8(shamt), 20)
	instruction = encode7(instruction, uint8(def.funct7), 25)
	return instruction
}

func (def *ShamtTypeDefinition) Define(operands []Operand) (Instruction, error) {
	rd, rs1, shamt, err := Cast3[IntReg32, IntReg32, Immediate](operands)
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
	rd         IntReg32
	rs1        IntReg32
	shamt      Immediate // 5-bit
}

func (i ShamtTypeInstruction) IsInstruction() {}
func (i ShamtTypeInstruction) Construct() EncodedInstruction {
	return i.definition.Construct(i.rd, i.rs1, i.shamt)
}
