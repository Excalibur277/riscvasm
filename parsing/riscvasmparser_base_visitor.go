// Code generated from RISCVASMParser.g4 by ANTLR 4.13.2. DO NOT EDIT.

package parsing // RISCVASMParser
import "github.com/antlr4-go/antlr/v4"

type BaseRISCVASMParserVisitor struct {
	*antlr.BaseParseTreeVisitor
}

func (v *BaseRISCVASMParserVisitor) VisitModule(ctx *ModuleContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseRISCVASMParserVisitor) VisitLinesAppend(ctx *LinesAppendContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseRISCVASMParserVisitor) VisitLinesInitial(ctx *LinesInitialContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseRISCVASMParserVisitor) VisitInstructionLine(ctx *InstructionLineContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseRISCVASMParserVisitor) VisitLabelInstructionLine(ctx *LabelInstructionLineContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseRISCVASMParserVisitor) VisitNoOperandInstruction(ctx *NoOperandInstructionContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseRISCVASMParserVisitor) VisitOperandInstruction(ctx *OperandInstructionContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseRISCVASMParserVisitor) VisitOperandsInitial(ctx *OperandsInitialContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseRISCVASMParserVisitor) VisitOperandsAppend(ctx *OperandsAppendContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseRISCVASMParserVisitor) VisitOperandIdentifier(ctx *OperandIdentifierContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseRISCVASMParserVisitor) VisitOperandNumeric(ctx *OperandNumericContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseRISCVASMParserVisitor) VisitNumericDec(ctx *NumericDecContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseRISCVASMParserVisitor) VisitNumericHex(ctx *NumericHexContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseRISCVASMParserVisitor) VisitNumericBin(ctx *NumericBinContext) interface{} {
	return v.VisitChildren(ctx)
}
