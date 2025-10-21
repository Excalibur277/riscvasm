package instruction

func encode(instruction EncodedInstruction, value uint32, position uint8) EncodedInstruction {
	return instruction | EncodedInstruction(value)<<position
}

func encode1(instruction EncodedInstruction, value uint8, position uint8) EncodedInstruction {
	return instruction | EncodedInstruction((value&0b00000001))<<position
}

func encode2(instruction EncodedInstruction, value uint8, position uint8) EncodedInstruction {
	return instruction | EncodedInstruction((value&0b00000011))<<position
}

func encode3(instruction EncodedInstruction, value uint8, position uint8) EncodedInstruction {
	return instruction | EncodedInstruction((value&0b00000111))<<position
}

func encode4(instruction EncodedInstruction, value uint8, position uint8) EncodedInstruction {
	return instruction | EncodedInstruction((value&0b00001111))<<position
}

func encode5(instruction EncodedInstruction, value uint8, position uint8) EncodedInstruction {
	return instruction | EncodedInstruction((value&0b00011111))<<position
}

func encode6(instruction EncodedInstruction, value uint8, position uint8) EncodedInstruction {
	return instruction | EncodedInstruction((value&0b00111111))<<position
}

func encode7(instruction EncodedInstruction, value uint8, position uint8) EncodedInstruction {
	return instruction | EncodedInstruction((value&0b01111111))<<position
}

func encode8(instruction EncodedInstruction, value uint8, position uint8) EncodedInstruction {
	return instruction | EncodedInstruction((value))<<position
}

func encode9(instruction EncodedInstruction, value uint16, position uint8) EncodedInstruction {
	return instruction | EncodedInstruction((value&0b0000000111111111))<<position
}

func encode10(instruction EncodedInstruction, value uint16, position uint8) EncodedInstruction {
	return instruction | EncodedInstruction((value&0b0000001111111111))<<position
}

func encode12(instruction EncodedInstruction, value uint16, position uint8) EncodedInstruction {
	return instruction | EncodedInstruction((value&0b0000111111111111))<<position
}

func encode20(instruction EncodedInstruction, value uint32, position uint8) EncodedInstruction {
	return instruction | EncodedInstruction((value&0b00000000000011111111111111111111))<<position
}
