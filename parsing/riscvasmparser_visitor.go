// Code generated from RISCVASMParser.g4 by ANTLR 4.13.2. DO NOT EDIT.

package parsing // RISCVASMParser
import "github.com/antlr4-go/antlr/v4"

// A complete Visitor for a parse tree produced by RISCVASMParser.
type RISCVASMParserVisitor interface {
	antlr.ParseTreeVisitor

	// Visit a parse tree produced by RISCVASMParser#module.
	VisitModule(ctx *ModuleContext) interface{}

	// Visit a parse tree produced by RISCVASMParser#LinesAppend.
	VisitLinesAppend(ctx *LinesAppendContext) interface{}

	// Visit a parse tree produced by RISCVASMParser#LinesInitial.
	VisitLinesInitial(ctx *LinesInitialContext) interface{}

	// Visit a parse tree produced by RISCVASMParser#InstructionLine.
	VisitInstructionLine(ctx *InstructionLineContext) interface{}

	// Visit a parse tree produced by RISCVASMParser#LabelInstructionLine.
	VisitLabelInstructionLine(ctx *LabelInstructionLineContext) interface{}

	// Visit a parse tree produced by RISCVASMParser#NoOperandInstruction.
	VisitNoOperandInstruction(ctx *NoOperandInstructionContext) interface{}

	// Visit a parse tree produced by RISCVASMParser#OperandInstruction.
	VisitOperandInstruction(ctx *OperandInstructionContext) interface{}

	// Visit a parse tree produced by RISCVASMParser#OperandsInitial.
	VisitOperandsInitial(ctx *OperandsInitialContext) interface{}

	// Visit a parse tree produced by RISCVASMParser#OperandsAppend.
	VisitOperandsAppend(ctx *OperandsAppendContext) interface{}

	// Visit a parse tree produced by RISCVASMParser#OperandIdentifier.
	VisitOperandIdentifier(ctx *OperandIdentifierContext) interface{}

	// Visit a parse tree produced by RISCVASMParser#OperandNumeric.
	VisitOperandNumeric(ctx *OperandNumericContext) interface{}

	// Visit a parse tree produced by RISCVASMParser#NumericDec.
	VisitNumericDec(ctx *NumericDecContext) interface{}

	// Visit a parse tree produced by RISCVASMParser#NumericHex.
	VisitNumericHex(ctx *NumericHexContext) interface{}

	// Visit a parse tree produced by RISCVASMParser#NumericBin.
	VisitNumericBin(ctx *NumericBinContext) interface{}
}
