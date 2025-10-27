package instruction

type R2FTypeDefinition struct {
	typeDefinition
	opcode uint8 // 7-bit
	funct3 uint8 // 3-bit
	funct7 uint8 // 7-bit
}

func (def *R2FTypeDefinition) Construct(rd, rs1, rs2 Register) EncodedInstruction {
	var instruction EncodedInstruction = 0
	instruction = encode7(instruction, def.opcode, 0)
	instruction = encode5(instruction, uint8(rd), 7)
	instruction = encode3(instruction, uint8(def.funct3), 12)
	instruction = encode5(instruction, uint8(rs1), 15)
	instruction = encode5(instruction, uint8(rs2), 20)
	instruction = encode7(instruction, uint8(def.funct7), 25)
	return instruction
}

func (def *R2FTypeDefinition) Define(operands []Operand) (Instruction, error) {
	rd, rs1, rs2, err := Cast3[Register, Register, Register](operands)
	return R2FTypeInstruction{def, rd, rs1, rs2}, err
}

func NewR2FTypeDefinition(name, format, description, implementation string, opcode, funct3, funct7 uint8) *R2FTypeDefinition {
	return &R2FTypeDefinition{
		newTypeDefinition(name, format, description, implementation),
		opcode,
		funct3,
		funct7,
	}
}

type R2FTypeInstruction struct {
	definition *R2FTypeDefinition
	rd         Register
	rs1        Register
	rs2        Register
}

func (i R2FTypeInstruction) IsInstruction() {}
func (i R2FTypeInstruction) Construct() EncodedInstruction {
	return i.definition.Construct(i.rd, i.rs1, i.rs2)
}
