package instruction

type FenceTypeDefinition struct {
	typeDefinition
	opcode uint8 // 7-bit
	funct3 uint8 // 3-bit
}

func (def *FenceTypeDefinition) Construct(rd, rs1 IntReg32, pred, succ, fm Immediate) EncodedInstruction {
	var instruction EncodedInstruction = 0
	instruction = encode7(instruction, def.opcode, 0)
	instruction = encode5(instruction, uint8(rd), 7)
	instruction = encode3(instruction, uint8(def.funct3), 12)
	instruction = encode5(instruction, uint8(rs1), 15)
	instruction = encode4(instruction, uint8(pred), 20)
	instruction = encode4(instruction, uint8(succ), 24)
	instruction = encode4(instruction, uint8(fm), 28)
	return instruction
}

func (def *FenceTypeDefinition) Define(operands []Operand) (Instruction, error) {
	rd, rs1, pred, succ, fm, err := Cast5[IntReg32, IntReg32, Immediate, Immediate, Immediate](operands)
	return FenceTypeInstruction{def, rd, rs1, pred, succ, fm}, err
}

func NewFenceTypeDefinition(name, format, description, implementation string, opcode, funct3 uint8) *FenceTypeDefinition {
	return &FenceTypeDefinition{
		newTypeDefinition(name, format, description, implementation),
		opcode,
		funct3,
	}
}

type FenceTypeInstruction struct {
	definition *FenceTypeDefinition
	rd         IntReg32
	rs1        IntReg32
	pred       Immediate // 4-bit
	succ       Immediate // 4-bit
	fm         Immediate // 4-bit
}

func (i FenceTypeInstruction) IsInstruction() {}
func (i FenceTypeInstruction) Construct() EncodedInstruction {
	return i.definition.Construct(i.rd, i.rs1, i.pred, i.succ, i.fm)
}
