package instruction

type AZTypeDefinition struct {
	typeDefinition
	opcode uint8 // 7-bit
	funct3 uint8 // 3-bit
	funct5 uint8 // 7-bit
}

func (def *AZTypeDefinition) Construct(rd, rs1 Register, aq AquireMemOrderFlag, rl ReleaseMemOrderFlag) EncodedInstruction {
	var instruction EncodedInstruction = 0
	instruction = encode7(instruction, def.opcode, 0)
	instruction = encode5(instruction, uint8(rd), 7)
	instruction = encode3(instruction, uint8(def.funct3), 12)
	instruction = encode5(instruction, uint8(rs1), 15)
	instruction = encode1(instruction, uint8(aq), 25)
	instruction = encode1(instruction, uint8(rl), 26)
	instruction = encode7(instruction, uint8(def.funct5), 27)
	return instruction
}

func (def *AZTypeDefinition) Define(operands []Operand) (Instruction, error) {
	rd, rs1, aq, rl, err := Cast4[Register, Register, AquireMemOrderFlag, ReleaseMemOrderFlag](operands)
	return AZTypeInstruction{def, rd, rs1, aq, rl}, err
}

func NewAZTypeDefinition(name, format, description, implementation string, opcode, funct3, funct5 uint8) *AZTypeDefinition {
	return &AZTypeDefinition{
		newTypeDefinition(name, format, description, implementation),
		opcode,
		funct3,
		funct5,
	}
}

type AZTypeInstruction struct {
	definition *AZTypeDefinition
	rd         Register
	rs1        Register
	aq         AquireMemOrderFlag
	rl         ReleaseMemOrderFlag
}

func (i AZTypeInstruction) IsInstruction() {}
func (i AZTypeInstruction) Construct() EncodedInstruction {
	return i.definition.Construct(i.rd, i.rs1, i.aq, i.rl)
}
