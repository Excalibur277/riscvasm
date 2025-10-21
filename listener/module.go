package listener

import (
	"riscvasm.com/m/v2/instruction"
	"riscvasm.com/m/v2/instructions"
	"riscvasm.com/m/v2/parsing"
)

func (l *RISCVASMListener) ExitModule(c *parsing.ModuleContext) {
	l.Pop(1)
	module := &instruction.Module{}
	module.Push(Dequeue[[]instruction.Instruction](l)...)
	Push(l, module)
}

func (l *RISCVASMListener) ExitLinesInitial(c *parsing.LinesInitialContext) {
	l.Pop(1)
	Push(l, []instruction.Instruction{Dequeue[instruction.Instruction](l)})
}

func (l *RISCVASMListener) ExitLinesAppend(c *parsing.LinesAppendContext) {
	l.Pop(2)
	Push(l, append(Dequeue[[]instruction.Instruction](l), Dequeue[instruction.Instruction](l)))
}

func (l *RISCVASMListener) ExitInstructionLine(c *parsing.InstructionLineContext) {
}

func (l *RISCVASMListener) ExitLabelInstructionLine(c *parsing.LabelInstructionLineContext) {
	l.Pop(1)
	Push(l, instruction.NewLabelInstruction(Dequeue[instruction.Instruction](l), c.GetLabel().GetText()))
}

func (l *RISCVASMListener) ExitNoOperandInstruction(c *parsing.NoOperandInstructionContext) {
	inst, err := instructions.Construct(c.GetInst().GetText(), []instruction.Operand{})
	if err != nil {
		panic(err)
	}
	Push(l, inst)
}

func (l *RISCVASMListener) ExitOperandInstruction(c *parsing.OperandInstructionContext) {
	l.Pop(1)
	inst, err := instructions.Construct(c.GetInst().GetText(), Dequeue[[]instruction.Operand](l))
	if err != nil {
		panic(err)
	}
	Push(l, inst)
}

func (l *RISCVASMListener) ExitOperandsInitial(c *parsing.OperandsInitialContext) {
	l.Pop(1)
	Push(l, []instruction.Operand{Dequeue[instruction.Operand](l)})
}

func (l *RISCVASMListener) ExitOperandsAppend(c *parsing.OperandsAppendContext) {
	l.Pop(2)
	Push(l, append(Dequeue[[]instruction.Operand](l), Dequeue[instruction.Operand](l)))
}

func (l *RISCVASMListener) ExitOperandIdentifier(c *parsing.OperandIdentifierContext) {
	Push(l, instruction.GetOperand(c.GetIdentifier().GetText()))
}

func (l *RISCVASMListener) ExitOperandNumeric(c *parsing.OperandNumericContext) {
}

func (l *RISCVASMListener) ExitNumericDec(c *parsing.NumericDecContext) {
	Push(l, instruction.ImmediateDec(c.GetVal().GetText()))
}

func (l *RISCVASMListener) ExitNumericHex(c *parsing.NumericHexContext) {
	Push(l, instruction.ImmediateHex(c.GetVal().GetText()))
}

func (l *RISCVASMListener) ExitNumericBin(c *parsing.NumericBinContext) {
	Push(l, instruction.ImmediateBin(c.GetVal().GetText()))
}
