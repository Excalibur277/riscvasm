package instructions

import (
	"fmt"

	"riscvasm.com/m/v2/instruction"
	"riscvasm.com/m/v2/instructions/rv32a"
	"riscvasm.com/m/v2/instructions/rv32d"
	"riscvasm.com/m/v2/instructions/rv32f"
	"riscvasm.com/m/v2/instructions/rv32i"
	"riscvasm.com/m/v2/instructions/rv32m"
	"riscvasm.com/m/v2/instructions/rv32q"
	"riscvasm.com/m/v2/instructions/rv32zfh"
	"riscvasm.com/m/v2/instructions/rv64a"
	"riscvasm.com/m/v2/instructions/rv64d"
	"riscvasm.com/m/v2/instructions/rv64f"
	"riscvasm.com/m/v2/instructions/rv64i"
	"riscvasm.com/m/v2/instructions/rv64m"
	"riscvasm.com/m/v2/instructions/rv64q"
	"riscvasm.com/m/v2/instructions/rv64zfh"
	"riscvasm.com/m/v2/instructions/zicond"
	"riscvasm.com/m/v2/instructions/zicsr"
	"riscvasm.com/m/v2/instructions/zifencei"
)

var sets = map[string]map[string]instruction.InstructionDefinition{
	"rv32a":    rv32a.Instructions,
	"rv32d":    rv32d.Instructions,
	"rv32f":    rv32f.Instructions,
	"rv32i":    rv32i.Instructions,
	"rv32m":    rv32m.Instructions,
	"rv32q":    rv32q.Instructions,
	"rv32zfh":  rv32zfh.Instructions,
	"rv64a":    rv64a.Instructions,
	"rv64i":    rv64i.Instructions,
	"rv64d":    rv64d.Instructions,
	"rv64f":    rv64f.Instructions,
	"rv64m":    rv64m.Instructions,
	"rv64q":    rv64q.Instructions,
	"rv64zfh":  rv64zfh.Instructions,
	"zicond":   zicond.Instructions,
	"zicsr":    zicsr.Instructions,
	"zifencei": zifencei.Instructions,
}

func Construct(command string, operands []instruction.Operand) (instruction.Instruction, error) {
	for _, instructions := range sets {
		if i, ok := instructions[command]; ok {
			return i.Define(operands)
		}
	}
	return nil, fmt.Errorf("could not find command %s", command)
}
