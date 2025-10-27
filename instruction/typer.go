package instruction

type RTypeDefinition struct {
	typeDefinition
	opcode uint8 // 7-bit
	funct3 uint8 // 3-bit
	funct7 uint8 // 7-bit
}

func (def *RTypeDefinition) Construct(rd, rs1, rs2 Register) EncodedInstruction {
	var instruction EncodedInstruction = 0
	instruction = encode7(instruction, def.opcode, 0)
	instruction = encode5(instruction, uint8(rd), 7)
	instruction = encode3(instruction, uint8(def.funct3), 12)
	instruction = encode5(instruction, uint8(rs1), 15)
	instruction = encode5(instruction, uint8(rs2), 20)
	instruction = encode7(instruction, uint8(def.funct7), 25)
	return instruction
}

func (def *RTypeDefinition) Define(operands []Operand) (Instruction, error) {
	rd, rs1, rs2, err := Cast3[Register, Register, Register](operands)
	return RTypeInstruction{def, rd, rs1, rs2}, err
}

func NewRTypeDefinition(name, format, description, implementation string, opcode, funct3, funct7 uint8) *RTypeDefinition {
	return &RTypeDefinition{
		newTypeDefinition(name, format, description, implementation),
		opcode,
		funct3,
		funct7,
	}
}

type RTypeInstruction struct {
	definition *RTypeDefinition
	rd         Register
	rs1        Register
	rs2        Register
}

func (i RTypeInstruction) IsInstruction() {}
func (i RTypeInstruction) Construct() EncodedInstruction {
	return i.definition.Construct(i.rd, i.rs1, i.rs2)
}
