// Code generated from RISCVASMParser.g4 by ANTLR 4.13.2. DO NOT EDIT.

package parsing // RISCVASMParser
import "github.com/antlr4-go/antlr/v4"

// RISCVASMParserListener is a complete listener for a parse tree produced by RISCVASMParser.
type RISCVASMParserListener interface {
	antlr.ParseTreeListener

	// EnterModule is called when entering the module production.
	EnterModule(c *ModuleContext)

	// EnterLinesAppend is called when entering the LinesAppend production.
	EnterLinesAppend(c *LinesAppendContext)

	// EnterLinesInitial is called when entering the LinesInitial production.
	EnterLinesInitial(c *LinesInitialContext)

	// EnterInstructionLine is called when entering the InstructionLine production.
	EnterInstructionLine(c *InstructionLineContext)

	// EnterLabelInstructionLine is called when entering the LabelInstructionLine production.
	EnterLabelInstructionLine(c *LabelInstructionLineContext)

	// EnterNoOperandInstruction is called when entering the NoOperandInstruction production.
	EnterNoOperandInstruction(c *NoOperandInstructionContext)

	// EnterOperandInstruction is called when entering the OperandInstruction production.
	EnterOperandInstruction(c *OperandInstructionContext)

	// EnterOperandsInitial is called when entering the OperandsInitial production.
	EnterOperandsInitial(c *OperandsInitialContext)

	// EnterOperandsAppend is called when entering the OperandsAppend production.
	EnterOperandsAppend(c *OperandsAppendContext)

	// EnterOperandIdentifier is called when entering the OperandIdentifier production.
	EnterOperandIdentifier(c *OperandIdentifierContext)

	// EnterOperandNumeric is called when entering the OperandNumeric production.
	EnterOperandNumeric(c *OperandNumericContext)

	// EnterNumericDec is called when entering the NumericDec production.
	EnterNumericDec(c *NumericDecContext)

	// EnterNumericHex is called when entering the NumericHex production.
	EnterNumericHex(c *NumericHexContext)

	// EnterNumericBin is called when entering the NumericBin production.
	EnterNumericBin(c *NumericBinContext)

	// ExitModule is called when exiting the module production.
	ExitModule(c *ModuleContext)

	// ExitLinesAppend is called when exiting the LinesAppend production.
	ExitLinesAppend(c *LinesAppendContext)

	// ExitLinesInitial is called when exiting the LinesInitial production.
	ExitLinesInitial(c *LinesInitialContext)

	// ExitInstructionLine is called when exiting the InstructionLine production.
	ExitInstructionLine(c *InstructionLineContext)

	// ExitLabelInstructionLine is called when exiting the LabelInstructionLine production.
	ExitLabelInstructionLine(c *LabelInstructionLineContext)

	// ExitNoOperandInstruction is called when exiting the NoOperandInstruction production.
	ExitNoOperandInstruction(c *NoOperandInstructionContext)

	// ExitOperandInstruction is called when exiting the OperandInstruction production.
	ExitOperandInstruction(c *OperandInstructionContext)

	// ExitOperandsInitial is called when exiting the OperandsInitial production.
	ExitOperandsInitial(c *OperandsInitialContext)

	// ExitOperandsAppend is called when exiting the OperandsAppend production.
	ExitOperandsAppend(c *OperandsAppendContext)

	// ExitOperandIdentifier is called when exiting the OperandIdentifier production.
	ExitOperandIdentifier(c *OperandIdentifierContext)

	// ExitOperandNumeric is called when exiting the OperandNumeric production.
	ExitOperandNumeric(c *OperandNumericContext)

	// ExitNumericDec is called when exiting the NumericDec production.
	ExitNumericDec(c *NumericDecContext)

	// ExitNumericHex is called when exiting the NumericHex production.
	ExitNumericHex(c *NumericHexContext)

	// ExitNumericBin is called when exiting the NumericBin production.
	ExitNumericBin(c *NumericBinContext)
}
