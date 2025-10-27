package instruction

type BTypeDefinition struct {
	typeDefinition
	opcode uint8 // 7-bit
	funct3 uint8 // 3-bit
}

func (def *BTypeDefinition) Construct(rs1, rs2 Register, immediate Immediate) EncodedInstruction {
	var instruction EncodedInstruction = 0
	instruction = encode7(instruction, def.opcode, 0)
	instruction = encode1(instruction, uint8(immediate>>11), 7) // 11
	instruction = encode4(instruction, uint8(immediate>>1), 8)  // 1:4
	instruction = encode3(instruction, uint8(def.funct3), 12)
	instruction = encode5(instruction, uint8(rs1), 15)
	instruction = encode5(instruction, uint8(rs2), 20)
	instruction = encode6(instruction, uint8(immediate>>5), 25)  // 5:10
	instruction = encode1(instruction, uint8(immediate>>12), 31) // 12
	return instruction
}

func (def *BTypeDefinition) Define(operands []Operand) (Instruction, error) {
	rs1, rs2, immediate, err := Cast3[Register, Register, Immediate](operands)
	return BTypeInstruction{def, rs1, rs2, immediate}, err
}

func NewBTypeDefinition(name, format, description, implementation string, opcode, funct3 uint8) *BTypeDefinition {
	return &BTypeDefinition{
		newTypeDefinition(name, format, description, implementation),
		opcode,
		funct3,
	}
}

type BTypeInstruction struct {
	definition *BTypeDefinition
	rs1        Register
	rs2        Register
	immediate  Immediate // 12-bit
}

func (i BTypeInstruction) IsInstruction() {}
func (i BTypeInstruction) Construct() EncodedInstruction {
	return i.definition.Construct(i.rs1, i.rs2, i.immediate)
}
