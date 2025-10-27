package instruction

type ATypeDefinition struct {
	typeDefinition
	opcode uint8 // 7-bit
	funct3 uint8 // 3-bit
	funct5 uint8 // 7-bit
}

func (def *ATypeDefinition) Construct(rd, rs1, rs2 Register, aq AquireMemOrderFlag, rl ReleaseMemOrderFlag) EncodedInstruction {
	var instruction EncodedInstruction = 0
	instruction = encode7(instruction, def.opcode, 0)
	instruction = encode5(instruction, uint8(rd), 7)
	instruction = encode3(instruction, uint8(def.funct3), 12)
	instruction = encode5(instruction, uint8(rs1), 15)
	instruction = encode5(instruction, uint8(rs2), 20)
	instruction = encode1(instruction, uint8(aq), 25)
	instruction = encode1(instruction, uint8(rl), 26)
	instruction = encode7(instruction, uint8(def.funct5), 27)
	return instruction
}

func (def *ATypeDefinition) Define(operands []Operand) (Instruction, error) {
	rd, rs1, rs2, aq, rl, err := Cast5[Register, Register, Register, AquireMemOrderFlag, ReleaseMemOrderFlag](operands)
	return ATypeInstruction{def, rd, rs1, rs2, aq, rl}, err
}

func NewATypeDefinition(name, format, description, implementation string, opcode, funct3, funct5 uint8) *ATypeDefinition {
	return &ATypeDefinition{
		newTypeDefinition(name, format, description, implementation),
		opcode,
		funct3,
		funct5,
	}
}

type ATypeInstruction struct {
	definition *ATypeDefinition
	rd         Register
	rs1        Register
	rs2        Register
	aq         AquireMemOrderFlag
	rl         ReleaseMemOrderFlag
}

func (i ATypeInstruction) IsInstruction() {}
func (i ATypeInstruction) Construct() EncodedInstruction {
	return i.definition.Construct(i.rd, i.rs1, i.rs2, i.aq, i.rl)
}
