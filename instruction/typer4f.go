package instruction

type R4FTypeDefinition struct {
	typeDefinition
	opcode uint8 // 7-bit
	funct2 uint8 // 2-bit
}

func (def *R4FTypeDefinition) Construct(rd Register, rm RoundingMode, rs1, rs2, rs3 Register) EncodedInstruction {
	var instruction EncodedInstruction = 0
	instruction = encode7(instruction, def.opcode, 0)
	instruction = encode5(instruction, uint8(rd), 7)
	instruction = encode3(instruction, uint8(rm), 12)
	instruction = encode5(instruction, uint8(rs1), 15)
	instruction = encode5(instruction, uint8(rs2), 20)
	instruction = encode2(instruction, uint8(def.funct2), 25)
	instruction = encode5(instruction, uint8(rs3), 27)
	return instruction
}

func (def *R4FTypeDefinition) Define(operands []Operand) (Instruction, error) {
	rd, rm, rs1, rs2, rs3, err := Cast5[Register, RoundingMode, Register, Register, Register](operands)
	return R4FTypeInstruction{def, rd, rm, rs1, rs2, rs3}, err
}

func NewR4FTypeDefinition(name, format, description, implementation string, opcode, funct2 uint8) *R4FTypeDefinition {
	return &R4FTypeDefinition{
		newTypeDefinition(name, format, description, implementation),
		opcode,
		funct2,
	}
}

type R4FTypeInstruction struct {
	definition *R4FTypeDefinition
	rd         Register
	rm         RoundingMode
	rs1        Register
	rs2        Register
	rs3        Register
}

func (i R4FTypeInstruction) IsInstruction() {}
func (i R4FTypeInstruction) Construct() EncodedInstruction {
	return i.definition.Construct(i.rd, i.rm, i.rs1, i.rs2, i.rs3)
}
