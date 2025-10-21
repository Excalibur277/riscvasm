package instructions

import (
	"fmt"

	"riscvasm.com/m/v2/instruction"
	"riscvasm.com/m/v2/instructions/rv32i"
)

var sets = map[string]map[string]instruction.InstructionDefinition{
	"rv32i": rv32i.Instructions,
}

func Construct(command string, operands []instruction.Operand) (instruction.Instruction, error) {
	for _, instructions := range sets {
		if i, ok := instructions[command]; ok {
			return i.Define(operands)
		}
	}
	return nil, fmt.Errorf("could not find command %s", command)
}
