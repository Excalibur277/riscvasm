package instruction

type RFTypeDefinition struct {
	typeDefinition
	opcode uint8 // 7-bit
	funct7 uint8 // 7-bit
}

func (def *RFTypeDefinition) Construct(rd Register, rm RoundingMode, rs1, rs2 Register) EncodedInstruction {
	var instruction EncodedInstruction = 0
	instruction = encode7(instruction, def.opcode, 0)
	instruction = encode5(instruction, uint8(rd), 7)
	instruction = encode3(instruction, uint8(rm), 12)
	instruction = encode5(instruction, uint8(rs1), 15)
	instruction = encode5(instruction, uint8(rs2), 20)
	instruction = encode7(instruction, uint8(def.funct7), 25)
	return instruction
}

func (def *RFTypeDefinition) Define(operands []Operand) (Instruction, error) {
	rd, rm, rs1, rs2, err := Cast4[Register, RoundingMode, Register, Register](operands)
	return RFTypeInstruction{def, rd, rm, rs1, rs2}, err
}

func NewRFTypeDefinition(name, format, description, implementation string, opcode, funct3, funct7 uint8) *RFTypeDefinition {
	return &RFTypeDefinition{
		newTypeDefinition(name, format, description, implementation),
		opcode,
		funct7,
	}
}

type RFTypeInstruction struct {
	definition *RFTypeDefinition
	rd         Register
	rm         RoundingMode
	rs1        Register
	rs2        Register
}

func (i RFTypeInstruction) IsInstruction() {}
func (i RFTypeInstruction) Construct() EncodedInstruction {
	return i.definition.Construct(i.rd, i.rm, i.rs1, i.rs2)
}
