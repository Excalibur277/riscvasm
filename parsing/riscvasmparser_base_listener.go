// Code generated from RISCVASMParser.g4 by ANTLR 4.13.2. DO NOT EDIT.

package parsing // RISCVASMParser
import "github.com/antlr4-go/antlr/v4"

// BaseRISCVASMParserListener is a complete listener for a parse tree produced by RISCVASMParser.
type BaseRISCVASMParserListener struct{}

var _ RISCVASMParserListener = &BaseRISCVASMParserListener{}

// VisitTerminal is called when a terminal node is visited.
func (s *BaseRISCVASMParserListener) VisitTerminal(node antlr.TerminalNode) {}

// VisitErrorNode is called when an error node is visited.
func (s *BaseRISCVASMParserListener) VisitErrorNode(node antlr.ErrorNode) {}

// EnterEveryRule is called when any rule is entered.
func (s *BaseRISCVASMParserListener) EnterEveryRule(ctx antlr.ParserRuleContext) {}

// ExitEveryRule is called when any rule is exited.
func (s *BaseRISCVASMParserListener) ExitEveryRule(ctx antlr.ParserRuleContext) {}

// EnterModule is called when production module is entered.
func (s *BaseRISCVASMParserListener) EnterModule(ctx *ModuleContext) {}

// ExitModule is called when production module is exited.
func (s *BaseRISCVASMParserListener) ExitModule(ctx *ModuleContext) {}

// EnterLinesAppend is called when production LinesAppend is entered.
func (s *BaseRISCVASMParserListener) EnterLinesAppend(ctx *LinesAppendContext) {}

// ExitLinesAppend is called when production LinesAppend is exited.
func (s *BaseRISCVASMParserListener) ExitLinesAppend(ctx *LinesAppendContext) {}

// EnterLinesInitial is called when production LinesInitial is entered.
func (s *BaseRISCVASMParserListener) EnterLinesInitial(ctx *LinesInitialContext) {}

// ExitLinesInitial is called when production LinesInitial is exited.
func (s *BaseRISCVASMParserListener) ExitLinesInitial(ctx *LinesInitialContext) {}

// EnterInstructionLine is called when production InstructionLine is entered.
func (s *BaseRISCVASMParserListener) EnterInstructionLine(ctx *InstructionLineContext) {}

// ExitInstructionLine is called when production InstructionLine is exited.
func (s *BaseRISCVASMParserListener) ExitInstructionLine(ctx *InstructionLineContext) {}

// EnterLabelInstructionLine is called when production LabelInstructionLine is entered.
func (s *BaseRISCVASMParserListener) EnterLabelInstructionLine(ctx *LabelInstructionLineContext) {}

// ExitLabelInstructionLine is called when production LabelInstructionLine is exited.
func (s *BaseRISCVASMParserListener) ExitLabelInstructionLine(ctx *LabelInstructionLineContext) {}

// EnterNoOperandInstruction is called when production NoOperandInstruction is entered.
func (s *BaseRISCVASMParserListener) EnterNoOperandInstruction(ctx *NoOperandInstructionContext) {}

// ExitNoOperandInstruction is called when production NoOperandInstruction is exited.
func (s *BaseRISCVASMParserListener) ExitNoOperandInstruction(ctx *NoOperandInstructionContext) {}

// EnterOperandInstruction is called when production OperandInstruction is entered.
func (s *BaseRISCVASMParserListener) EnterOperandInstruction(ctx *OperandInstructionContext) {}

// ExitOperandInstruction is called when production OperandInstruction is exited.
func (s *BaseRISCVASMParserListener) ExitOperandInstruction(ctx *OperandInstructionContext) {}

// EnterOperandsInitial is called when production OperandsInitial is entered.
func (s *BaseRISCVASMParserListener) EnterOperandsInitial(ctx *OperandsInitialContext) {}

// ExitOperandsInitial is called when production OperandsInitial is exited.
func (s *BaseRISCVASMParserListener) ExitOperandsInitial(ctx *OperandsInitialContext) {}

// EnterOperandsAppend is called when production OperandsAppend is entered.
func (s *BaseRISCVASMParserListener) EnterOperandsAppend(ctx *OperandsAppendContext) {}

// ExitOperandsAppend is called when production OperandsAppend is exited.
func (s *BaseRISCVASMParserListener) ExitOperandsAppend(ctx *OperandsAppendContext) {}

// EnterOperandIdentifier is called when production OperandIdentifier is entered.
func (s *BaseRISCVASMParserListener) EnterOperandIdentifier(ctx *OperandIdentifierContext) {}

// ExitOperandIdentifier is called when production OperandIdentifier is exited.
func (s *BaseRISCVASMParserListener) ExitOperandIdentifier(ctx *OperandIdentifierContext) {}

// EnterOperandNumeric is called when production OperandNumeric is entered.
func (s *BaseRISCVASMParserListener) EnterOperandNumeric(ctx *OperandNumericContext) {}

// ExitOperandNumeric is called when production OperandNumeric is exited.
func (s *BaseRISCVASMParserListener) ExitOperandNumeric(ctx *OperandNumericContext) {}

// EnterNumericDec is called when production NumericDec is entered.
func (s *BaseRISCVASMParserListener) EnterNumericDec(ctx *NumericDecContext) {}

// ExitNumericDec is called when production NumericDec is exited.
func (s *BaseRISCVASMParserListener) ExitNumericDec(ctx *NumericDecContext) {}

// EnterNumericHex is called when production NumericHex is entered.
func (s *BaseRISCVASMParserListener) EnterNumericHex(ctx *NumericHexContext) {}

// ExitNumericHex is called when production NumericHex is exited.
func (s *BaseRISCVASMParserListener) ExitNumericHex(ctx *NumericHexContext) {}

// EnterNumericBin is called when production NumericBin is entered.
func (s *BaseRISCVASMParserListener) EnterNumericBin(ctx *NumericBinContext) {}

// ExitNumericBin is called when production NumericBin is exited.
func (s *BaseRISCVASMParserListener) ExitNumericBin(ctx *NumericBinContext) {}
