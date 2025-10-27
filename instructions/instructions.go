package instructions

import (
	"fmt"

	"riscvasm.com/m/v2/instruction"
	"riscvasm.com/m/v2/instructions/rv32a"
	"riscvasm.com/m/v2/instructions/rv32i"
	"riscvasm.com/m/v2/instructions/rv32m"
	"riscvasm.com/m/v2/instructions/rv64a"
	"riscvasm.com/m/v2/instructions/rv64i"
	"riscvasm.com/m/v2/instructions/rv64m"
	"riscvasm.com/m/v2/instructions/zicsr"
	"riscvasm.com/m/v2/instructions/zifencei"
)

var sets = map[string]map[string]instruction.InstructionDefinition{
	"rv32a":    rv32a.Instructions,
	"rv32i":    rv32i.Instructions,
	"rv32m":    rv32m.Instructions,
	"rv64a":    rv64a.Instructions,
	"rv64i":    rv64i.Instructions,
	"rv64m":    rv64m.Instructions,
	"zifencei": zifencei.Instructions,
	"zicsr":    zicsr.Instructions,
}

func Construct(command string, operands []instruction.Operand) (instruction.Instruction, error) {
	for _, instructions := range sets {
		if i, ok := instructions[command]; ok {
			return i.Define(operands)
		}
	}
	return nil, fmt.Errorf("could not find command %s", command)
}
