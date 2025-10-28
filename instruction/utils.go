package instruction

func encode(instruction uint32, value uint32, position uint8) uint32 {
	return instruction | uint32(value)<<position
}

func encode1(instruction uint32, value uint8, position uint8) uint32 {
	return instruction | uint32((value&0b00000001))<<position
}

func encode2(instruction uint32, value uint8, position uint8) uint32 {
	return instruction | uint32((value&0b00000011))<<position
}

func encode3(instruction uint32, value uint8, position uint8) uint32 {
	return instruction | uint32((value&0b00000111))<<position
}

func encode4(instruction uint32, value uint8, position uint8) uint32 {
	return instruction | uint32((value&0b00001111))<<position
}

func encode5(instruction uint32, value uint8, position uint8) uint32 {
	return instruction | uint32((value&0b00011111))<<position
}

func encode6(instruction uint32, value uint8, position uint8) uint32 {
	return instruction | uint32((value&0b00111111))<<position
}

func encode7(instruction uint32, value uint8, position uint8) uint32 {
	return instruction | uint32((value&0b01111111))<<position
}

func encode8(instruction uint32, value uint8, position uint8) uint32 {
	return instruction | uint32((value))<<position
}

func encode9(instruction uint32, value uint16, position uint8) uint32 {
	return instruction | uint32((value&0b0000000111111111))<<position
}

func encode10(instruction uint32, value uint16, position uint8) uint32 {
	return instruction | uint32((value&0b0000001111111111))<<position
}

func encode12(instruction uint32, value uint16, position uint8) uint32 {
	return instruction | uint32((value&0b0000111111111111))<<position
}

func encode20(instruction uint32, value uint32, position uint8) uint32 {
	return instruction | uint32((value&0b00000000000011111111111111111111))<<position
}
