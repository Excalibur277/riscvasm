package instruction

type R2FTypeDefinition struct {
	typeDefinition
	opcode uint8 // 7-bit
	funct5 uint8 // 5-bit
	funct7 uint8 // 7-bit
}

func (def *R2FTypeDefinition) Construct(rd Register, rm RoundingMode, rs1 Register) EncodedInstruction {
	var instruction EncodedInstruction = 0
	instruction = encode7(instruction, def.opcode, 0)
	instruction = encode5(instruction, uint8(rd), 7)
	instruction = encode3(instruction, uint8(rm), 12)
	instruction = encode5(instruction, uint8(rs1), 15)
	instruction = encode7(instruction, uint8(def.funct7), 25)
	return instruction
}

func (def *R2FTypeDefinition) Define(operands []Operand) (Instruction, error) {
	rd, rm, rs1, err := Cast3[Register, RoundingMode, Register](operands)
	return R2FTypeInstruction{def, rd, rm, rs1}, err
}

func NewR2FTypeDefinition(name, format, description, implementation string, opcode, funct5, funct7 uint8) *R2FTypeDefinition {
	return &R2FTypeDefinition{
		newTypeDefinition(name, format, description, implementation),
		opcode,
		funct5,
		funct7,
	}
}

type R2FTypeInstruction struct {
	definition *R2FTypeDefinition
	rd         Register
	rm         RoundingMode
	rs1        Register
}

func (i R2FTypeInstruction) IsInstruction() {}
func (i R2FTypeInstruction) Construct() EncodedInstruction {
	return i.definition.Construct(i.rd, i.rm, i.rs1)
}
