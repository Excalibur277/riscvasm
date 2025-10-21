// Code generated from RISCVASMParser.g4 by ANTLR 4.13.2. DO NOT EDIT.

package parsing // RISCVASMParser
import (
	"fmt"
	"strconv"
	"sync"

	"github.com/antlr4-go/antlr/v4"
)

// Suppress unused import errors
var _ = fmt.Printf
var _ = strconv.Itoa
var _ = sync.Once{}

type RISCVASMParser struct {
	*antlr.BaseParser
}

var RISCVASMParserParserStaticData struct {
	once                   sync.Once
	serializedATN          []int32
	LiteralNames           []string
	SymbolicNames          []string
	RuleNames              []string
	PredictionContextCache *antlr.PredictionContextCache
	atn                    *antlr.ATN
	decisionToDFA          []*antlr.DFA
}

func riscvasmparserParserInit() {
	staticData := &RISCVASMParserParserStaticData
	staticData.LiteralNames = []string{
		"", "':'", "','", "'+'", "'-'", "'*'", "", "'\\n'",
	}
	staticData.SymbolicNames = []string{
		"", "COLON", "COMMA", "ADD", "SUB", "MUL", "WHITESPACE", "NEWLINE",
		"IDENTIFIER", "DEC", "HEX", "BIN", "COMMENT",
	}
	staticData.RuleNames = []string{
		"module", "lines", "line", "instruction", "operands", "operand", "numeric",
	}
	staticData.PredictionContextCache = antlr.NewPredictionContextCache()
	staticData.serializedATN = []int32{
		4, 1, 12, 100, 2, 0, 7, 0, 2, 1, 7, 1, 2, 2, 7, 2, 2, 3, 7, 3, 2, 4, 7,
		4, 2, 5, 7, 5, 2, 6, 7, 6, 1, 0, 5, 0, 16, 8, 0, 10, 0, 12, 0, 19, 9, 0,
		1, 0, 1, 0, 5, 0, 23, 8, 0, 10, 0, 12, 0, 26, 9, 0, 1, 0, 1, 0, 1, 1, 1,
		1, 3, 1, 32, 8, 1, 1, 1, 1, 1, 3, 1, 36, 8, 1, 1, 1, 1, 1, 4, 1, 40, 8,
		1, 11, 1, 12, 1, 41, 1, 1, 3, 1, 45, 8, 1, 1, 1, 1, 1, 3, 1, 49, 8, 1,
		5, 1, 51, 8, 1, 10, 1, 12, 1, 54, 9, 1, 1, 2, 1, 2, 1, 2, 1, 2, 5, 2, 60,
		8, 2, 10, 2, 12, 2, 63, 9, 2, 1, 2, 3, 2, 66, 8, 2, 1, 3, 1, 3, 1, 3, 1,
		3, 3, 3, 72, 8, 3, 1, 4, 1, 4, 1, 4, 1, 4, 1, 4, 3, 4, 79, 8, 4, 1, 4,
		1, 4, 3, 4, 83, 8, 4, 1, 4, 5, 4, 86, 8, 4, 10, 4, 12, 4, 89, 9, 4, 1,
		5, 1, 5, 3, 5, 93, 8, 5, 1, 6, 1, 6, 1, 6, 3, 6, 98, 8, 6, 1, 6, 0, 2,
		2, 8, 7, 0, 2, 4, 6, 8, 10, 12, 0, 1, 1, 0, 6, 7, 109, 0, 17, 1, 0, 0,
		0, 2, 29, 1, 0, 0, 0, 4, 65, 1, 0, 0, 0, 6, 71, 1, 0, 0, 0, 8, 73, 1, 0,
		0, 0, 10, 92, 1, 0, 0, 0, 12, 97, 1, 0, 0, 0, 14, 16, 5, 7, 0, 0, 15, 14,
		1, 0, 0, 0, 16, 19, 1, 0, 0, 0, 17, 15, 1, 0, 0, 0, 17, 18, 1, 0, 0, 0,
		18, 20, 1, 0, 0, 0, 19, 17, 1, 0, 0, 0, 20, 24, 3, 2, 1, 0, 21, 23, 5,
		7, 0, 0, 22, 21, 1, 0, 0, 0, 23, 26, 1, 0, 0, 0, 24, 22, 1, 0, 0, 0, 24,
		25, 1, 0, 0, 0, 25, 27, 1, 0, 0, 0, 26, 24, 1, 0, 0, 0, 27, 28, 5, 0, 0,
		1, 28, 1, 1, 0, 0, 0, 29, 31, 6, 1, -1, 0, 30, 32, 5, 6, 0, 0, 31, 30,
		1, 0, 0, 0, 31, 32, 1, 0, 0, 0, 32, 33, 1, 0, 0, 0, 33, 35, 3, 4, 2, 0,
		34, 36, 5, 6, 0, 0, 35, 34, 1, 0, 0, 0, 35, 36, 1, 0, 0, 0, 36, 52, 1,
		0, 0, 0, 37, 39, 10, 1, 0, 0, 38, 40, 5, 7, 0, 0, 39, 38, 1, 0, 0, 0, 40,
		41, 1, 0, 0, 0, 41, 39, 1, 0, 0, 0, 41, 42, 1, 0, 0, 0, 42, 44, 1, 0, 0,
		0, 43, 45, 5, 6, 0, 0, 44, 43, 1, 0, 0, 0, 44, 45, 1, 0, 0, 0, 45, 46,
		1, 0, 0, 0, 46, 48, 3, 4, 2, 0, 47, 49, 5, 6, 0, 0, 48, 47, 1, 0, 0, 0,
		48, 49, 1, 0, 0, 0, 49, 51, 1, 0, 0, 0, 50, 37, 1, 0, 0, 0, 51, 54, 1,
		0, 0, 0, 52, 50, 1, 0, 0, 0, 52, 53, 1, 0, 0, 0, 53, 3, 1, 0, 0, 0, 54,
		52, 1, 0, 0, 0, 55, 66, 3, 6, 3, 0, 56, 57, 5, 8, 0, 0, 57, 61, 5, 1, 0,
		0, 58, 60, 7, 0, 0, 0, 59, 58, 1, 0, 0, 0, 60, 63, 1, 0, 0, 0, 61, 59,
		1, 0, 0, 0, 61, 62, 1, 0, 0, 0, 62, 64, 1, 0, 0, 0, 63, 61, 1, 0, 0, 0,
		64, 66, 3, 4, 2, 0, 65, 55, 1, 0, 0, 0, 65, 56, 1, 0, 0, 0, 66, 5, 1, 0,
		0, 0, 67, 72, 5, 8, 0, 0, 68, 69, 5, 8, 0, 0, 69, 70, 5, 6, 0, 0, 70, 72,
		3, 8, 4, 0, 71, 67, 1, 0, 0, 0, 71, 68, 1, 0, 0, 0, 72, 7, 1, 0, 0, 0,
		73, 74, 6, 4, -1, 0, 74, 75, 3, 10, 5, 0, 75, 87, 1, 0, 0, 0, 76, 78, 10,
		1, 0, 0, 77, 79, 5, 6, 0, 0, 78, 77, 1, 0, 0, 0, 78, 79, 1, 0, 0, 0, 79,
		80, 1, 0, 0, 0, 80, 82, 5, 2, 0, 0, 81, 83, 5, 6, 0, 0, 82, 81, 1, 0, 0,
		0, 82, 83, 1, 0, 0, 0, 83, 84, 1, 0, 0, 0, 84, 86, 3, 10, 5, 0, 85, 76,
		1, 0, 0, 0, 86, 89, 1, 0, 0, 0, 87, 85, 1, 0, 0, 0, 87, 88, 1, 0, 0, 0,
		88, 9, 1, 0, 0, 0, 89, 87, 1, 0, 0, 0, 90, 93, 5, 8, 0, 0, 91, 93, 3, 12,
		6, 0, 92, 90, 1, 0, 0, 0, 92, 91, 1, 0, 0, 0, 93, 11, 1, 0, 0, 0, 94, 98,
		5, 9, 0, 0, 95, 98, 5, 10, 0, 0, 96, 98, 5, 11, 0, 0, 97, 94, 1, 0, 0,
		0, 97, 95, 1, 0, 0, 0, 97, 96, 1, 0, 0, 0, 98, 13, 1, 0, 0, 0, 16, 17,
		24, 31, 35, 41, 44, 48, 52, 61, 65, 71, 78, 82, 87, 92, 97,
	}
	deserializer := antlr.NewATNDeserializer(nil)
	staticData.atn = deserializer.Deserialize(staticData.serializedATN)
	atn := staticData.atn
	staticData.decisionToDFA = make([]*antlr.DFA, len(atn.DecisionToState))
	decisionToDFA := staticData.decisionToDFA
	for index, state := range atn.DecisionToState {
		decisionToDFA[index] = antlr.NewDFA(state, index)
	}
}

// RISCVASMParserInit initializes any static state used to implement RISCVASMParser. By default the
// static state used to implement the parser is lazily initialized during the first call to
// NewRISCVASMParser(). You can call this function if you wish to initialize the static state ahead
// of time.
func RISCVASMParserInit() {
	staticData := &RISCVASMParserParserStaticData
	staticData.once.Do(riscvasmparserParserInit)
}

// NewRISCVASMParser produces a new parser instance for the optional input antlr.TokenStream.
func NewRISCVASMParser(input antlr.TokenStream) *RISCVASMParser {
	RISCVASMParserInit()
	this := new(RISCVASMParser)
	this.BaseParser = antlr.NewBaseParser(input)
	staticData := &RISCVASMParserParserStaticData
	this.Interpreter = antlr.NewParserATNSimulator(this, staticData.atn, staticData.decisionToDFA, staticData.PredictionContextCache)
	this.RuleNames = staticData.RuleNames
	this.LiteralNames = staticData.LiteralNames
	this.SymbolicNames = staticData.SymbolicNames
	this.GrammarFileName = "RISCVASMParser.g4"

	return this
}

// RISCVASMParser tokens.
const (
	RISCVASMParserEOF        = antlr.TokenEOF
	RISCVASMParserCOLON      = 1
	RISCVASMParserCOMMA      = 2
	RISCVASMParserADD        = 3
	RISCVASMParserSUB        = 4
	RISCVASMParserMUL        = 5
	RISCVASMParserWHITESPACE = 6
	RISCVASMParserNEWLINE    = 7
	RISCVASMParserIDENTIFIER = 8
	RISCVASMParserDEC        = 9
	RISCVASMParserHEX        = 10
	RISCVASMParserBIN        = 11
	RISCVASMParserCOMMENT    = 12
)

// RISCVASMParser rules.
const (
	RISCVASMParserRULE_module      = 0
	RISCVASMParserRULE_lines       = 1
	RISCVASMParserRULE_line        = 2
	RISCVASMParserRULE_instruction = 3
	RISCVASMParserRULE_operands    = 4
	RISCVASMParserRULE_operand     = 5
	RISCVASMParserRULE_numeric     = 6
)

// IModuleContext is an interface to support dynamic dispatch.
type IModuleContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser

	// Getter signatures
	Lines() ILinesContext
	EOF() antlr.TerminalNode
	AllNEWLINE() []antlr.TerminalNode
	NEWLINE(i int) antlr.TerminalNode

	// IsModuleContext differentiates from other interfaces.
	IsModuleContext()
}

type ModuleContext struct {
	antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyModuleContext() *ModuleContext {
	var p = new(ModuleContext)
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = RISCVASMParserRULE_module
	return p
}

func InitEmptyModuleContext(p *ModuleContext) {
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = RISCVASMParserRULE_module
}

func (*ModuleContext) IsModuleContext() {}

func NewModuleContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *ModuleContext {
	var p = new(ModuleContext)

	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, parent, invokingState)

	p.parser = parser
	p.RuleIndex = RISCVASMParserRULE_module

	return p
}

func (s *ModuleContext) GetParser() antlr.Parser { return s.parser }

func (s *ModuleContext) Lines() ILinesContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(ILinesContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(ILinesContext)
}

func (s *ModuleContext) EOF() antlr.TerminalNode {
	return s.GetToken(RISCVASMParserEOF, 0)
}

func (s *ModuleContext) AllNEWLINE() []antlr.TerminalNode {
	return s.GetTokens(RISCVASMParserNEWLINE)
}

func (s *ModuleContext) NEWLINE(i int) antlr.TerminalNode {
	return s.GetToken(RISCVASMParserNEWLINE, i)
}

func (s *ModuleContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *ModuleContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

func (s *ModuleContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RISCVASMParserListener); ok {
		listenerT.EnterModule(s)
	}
}

func (s *ModuleContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RISCVASMParserListener); ok {
		listenerT.ExitModule(s)
	}
}

func (s *ModuleContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case RISCVASMParserVisitor:
		return t.VisitModule(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *RISCVASMParser) Module() (localctx IModuleContext) {
	localctx = NewModuleContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 0, RISCVASMParserRULE_module)
	var _la int

	p.EnterOuterAlt(localctx, 1)
	p.SetState(17)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}
	_la = p.GetTokenStream().LA(1)

	for _la == RISCVASMParserNEWLINE {
		{
			p.SetState(14)
			p.Match(RISCVASMParserNEWLINE)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}

		p.SetState(19)
		p.GetErrorHandler().Sync(p)
		if p.HasError() {
			goto errorExit
		}
		_la = p.GetTokenStream().LA(1)
	}
	{
		p.SetState(20)
		p.lines(0)
	}
	p.SetState(24)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}
	_la = p.GetTokenStream().LA(1)

	for _la == RISCVASMParserNEWLINE {
		{
			p.SetState(21)
			p.Match(RISCVASMParserNEWLINE)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}

		p.SetState(26)
		p.GetErrorHandler().Sync(p)
		if p.HasError() {
			goto errorExit
		}
		_la = p.GetTokenStream().LA(1)
	}
	{
		p.SetState(27)
		p.Match(RISCVASMParserEOF)
		if p.HasError() {
			// Recognition error - abort rule
			goto errorExit
		}
	}

errorExit:
	if p.HasError() {
		v := p.GetError()
		localctx.SetException(v)
		p.GetErrorHandler().ReportError(p, v)
		p.GetErrorHandler().Recover(p, v)
		p.SetError(nil)
	}
	p.ExitRule()
	return localctx
	goto errorExit // Trick to prevent compiler error if the label is not used
}

// ILinesContext is an interface to support dynamic dispatch.
type ILinesContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser
	// IsLinesContext differentiates from other interfaces.
	IsLinesContext()
}

type LinesContext struct {
	antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyLinesContext() *LinesContext {
	var p = new(LinesContext)
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = RISCVASMParserRULE_lines
	return p
}

func InitEmptyLinesContext(p *LinesContext) {
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = RISCVASMParserRULE_lines
}

func (*LinesContext) IsLinesContext() {}

func NewLinesContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *LinesContext {
	var p = new(LinesContext)

	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, parent, invokingState)

	p.parser = parser
	p.RuleIndex = RISCVASMParserRULE_lines

	return p
}

func (s *LinesContext) GetParser() antlr.Parser { return s.parser }

func (s *LinesContext) CopyAll(ctx *LinesContext) {
	s.CopyFrom(&ctx.BaseParserRuleContext)
}

func (s *LinesContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *LinesContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

type LinesAppendContext struct {
	LinesContext
}

func NewLinesAppendContext(parser antlr.Parser, ctx antlr.ParserRuleContext) *LinesAppendContext {
	var p = new(LinesAppendContext)

	InitEmptyLinesContext(&p.LinesContext)
	p.parser = parser
	p.CopyAll(ctx.(*LinesContext))

	return p
}

func (s *LinesAppendContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *LinesAppendContext) Lines() ILinesContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(ILinesContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(ILinesContext)
}

func (s *LinesAppendContext) Line() ILineContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(ILineContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(ILineContext)
}

func (s *LinesAppendContext) AllNEWLINE() []antlr.TerminalNode {
	return s.GetTokens(RISCVASMParserNEWLINE)
}

func (s *LinesAppendContext) NEWLINE(i int) antlr.TerminalNode {
	return s.GetToken(RISCVASMParserNEWLINE, i)
}

func (s *LinesAppendContext) AllWHITESPACE() []antlr.TerminalNode {
	return s.GetTokens(RISCVASMParserWHITESPACE)
}

func (s *LinesAppendContext) WHITESPACE(i int) antlr.TerminalNode {
	return s.GetToken(RISCVASMParserWHITESPACE, i)
}

func (s *LinesAppendContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RISCVASMParserListener); ok {
		listenerT.EnterLinesAppend(s)
	}
}

func (s *LinesAppendContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RISCVASMParserListener); ok {
		listenerT.ExitLinesAppend(s)
	}
}

func (s *LinesAppendContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case RISCVASMParserVisitor:
		return t.VisitLinesAppend(s)

	default:
		return t.VisitChildren(s)
	}
}

type LinesInitialContext struct {
	LinesContext
}

func NewLinesInitialContext(parser antlr.Parser, ctx antlr.ParserRuleContext) *LinesInitialContext {
	var p = new(LinesInitialContext)

	InitEmptyLinesContext(&p.LinesContext)
	p.parser = parser
	p.CopyAll(ctx.(*LinesContext))

	return p
}

func (s *LinesInitialContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *LinesInitialContext) Line() ILineContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(ILineContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(ILineContext)
}

func (s *LinesInitialContext) AllWHITESPACE() []antlr.TerminalNode {
	return s.GetTokens(RISCVASMParserWHITESPACE)
}

func (s *LinesInitialContext) WHITESPACE(i int) antlr.TerminalNode {
	return s.GetToken(RISCVASMParserWHITESPACE, i)
}

func (s *LinesInitialContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RISCVASMParserListener); ok {
		listenerT.EnterLinesInitial(s)
	}
}

func (s *LinesInitialContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RISCVASMParserListener); ok {
		listenerT.ExitLinesInitial(s)
	}
}

func (s *LinesInitialContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case RISCVASMParserVisitor:
		return t.VisitLinesInitial(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *RISCVASMParser) Lines() (localctx ILinesContext) {
	return p.lines(0)
}

func (p *RISCVASMParser) lines(_p int) (localctx ILinesContext) {
	var _parentctx antlr.ParserRuleContext = p.GetParserRuleContext()

	_parentState := p.GetState()
	localctx = NewLinesContext(p, p.GetParserRuleContext(), _parentState)
	var _prevctx ILinesContext = localctx
	var _ antlr.ParserRuleContext = _prevctx // TODO: To prevent unused variable warning.
	_startState := 2
	p.EnterRecursionRule(localctx, 2, RISCVASMParserRULE_lines, _p)
	var _la int

	var _alt int

	p.EnterOuterAlt(localctx, 1)
	localctx = NewLinesInitialContext(p, localctx)
	p.SetParserRuleContext(localctx)
	_prevctx = localctx

	p.SetState(31)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}
	_la = p.GetTokenStream().LA(1)

	if _la == RISCVASMParserWHITESPACE {
		{
			p.SetState(30)
			p.Match(RISCVASMParserWHITESPACE)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}

	}
	{
		p.SetState(33)
		p.Line()
	}
	p.SetState(35)
	p.GetErrorHandler().Sync(p)

	if p.GetInterpreter().AdaptivePredict(p.BaseParser, p.GetTokenStream(), 3, p.GetParserRuleContext()) == 1 {
		{
			p.SetState(34)
			p.Match(RISCVASMParserWHITESPACE)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}

	} else if p.HasError() { // JIM
		goto errorExit
	}

	p.GetParserRuleContext().SetStop(p.GetTokenStream().LT(-1))
	p.SetState(52)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}
	_alt = p.GetInterpreter().AdaptivePredict(p.BaseParser, p.GetTokenStream(), 7, p.GetParserRuleContext())
	if p.HasError() {
		goto errorExit
	}
	for _alt != 2 && _alt != antlr.ATNInvalidAltNumber {
		if _alt == 1 {
			if p.GetParseListeners() != nil {
				p.TriggerExitRuleEvent()
			}
			_prevctx = localctx
			localctx = NewLinesAppendContext(p, NewLinesContext(p, _parentctx, _parentState))
			p.PushNewRecursionContext(localctx, _startState, RISCVASMParserRULE_lines)
			p.SetState(37)

			if !(p.Precpred(p.GetParserRuleContext(), 1)) {
				p.SetError(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 1)", ""))
				goto errorExit
			}
			p.SetState(39)
			p.GetErrorHandler().Sync(p)
			if p.HasError() {
				goto errorExit
			}
			_la = p.GetTokenStream().LA(1)

			for ok := true; ok; ok = _la == RISCVASMParserNEWLINE {
				{
					p.SetState(38)
					p.Match(RISCVASMParserNEWLINE)
					if p.HasError() {
						// Recognition error - abort rule
						goto errorExit
					}
				}

				p.SetState(41)
				p.GetErrorHandler().Sync(p)
				if p.HasError() {
					goto errorExit
				}
				_la = p.GetTokenStream().LA(1)
			}
			p.SetState(44)
			p.GetErrorHandler().Sync(p)
			if p.HasError() {
				goto errorExit
			}
			_la = p.GetTokenStream().LA(1)

			if _la == RISCVASMParserWHITESPACE {
				{
					p.SetState(43)
					p.Match(RISCVASMParserWHITESPACE)
					if p.HasError() {
						// Recognition error - abort rule
						goto errorExit
					}
				}

			}
			{
				p.SetState(46)
				p.Line()
			}
			p.SetState(48)
			p.GetErrorHandler().Sync(p)

			if p.GetInterpreter().AdaptivePredict(p.BaseParser, p.GetTokenStream(), 6, p.GetParserRuleContext()) == 1 {
				{
					p.SetState(47)
					p.Match(RISCVASMParserWHITESPACE)
					if p.HasError() {
						// Recognition error - abort rule
						goto errorExit
					}
				}

			} else if p.HasError() { // JIM
				goto errorExit
			}

		}
		p.SetState(54)
		p.GetErrorHandler().Sync(p)
		if p.HasError() {
			goto errorExit
		}
		_alt = p.GetInterpreter().AdaptivePredict(p.BaseParser, p.GetTokenStream(), 7, p.GetParserRuleContext())
		if p.HasError() {
			goto errorExit
		}
	}

errorExit:
	if p.HasError() {
		v := p.GetError()
		localctx.SetException(v)
		p.GetErrorHandler().ReportError(p, v)
		p.GetErrorHandler().Recover(p, v)
		p.SetError(nil)
	}
	p.UnrollRecursionContexts(_parentctx)
	return localctx
	goto errorExit // Trick to prevent compiler error if the label is not used
}

// ILineContext is an interface to support dynamic dispatch.
type ILineContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser
	// IsLineContext differentiates from other interfaces.
	IsLineContext()
}

type LineContext struct {
	antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyLineContext() *LineContext {
	var p = new(LineContext)
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = RISCVASMParserRULE_line
	return p
}

func InitEmptyLineContext(p *LineContext) {
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = RISCVASMParserRULE_line
}

func (*LineContext) IsLineContext() {}

func NewLineContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *LineContext {
	var p = new(LineContext)

	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, parent, invokingState)

	p.parser = parser
	p.RuleIndex = RISCVASMParserRULE_line

	return p
}

func (s *LineContext) GetParser() antlr.Parser { return s.parser }

func (s *LineContext) CopyAll(ctx *LineContext) {
	s.CopyFrom(&ctx.BaseParserRuleContext)
}

func (s *LineContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *LineContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

type LabelInstructionLineContext struct {
	LineContext
	label antlr.Token
}

func NewLabelInstructionLineContext(parser antlr.Parser, ctx antlr.ParserRuleContext) *LabelInstructionLineContext {
	var p = new(LabelInstructionLineContext)

	InitEmptyLineContext(&p.LineContext)
	p.parser = parser
	p.CopyAll(ctx.(*LineContext))

	return p
}

func (s *LabelInstructionLineContext) GetLabel() antlr.Token { return s.label }

func (s *LabelInstructionLineContext) SetLabel(v antlr.Token) { s.label = v }

func (s *LabelInstructionLineContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *LabelInstructionLineContext) COLON() antlr.TerminalNode {
	return s.GetToken(RISCVASMParserCOLON, 0)
}

func (s *LabelInstructionLineContext) Line() ILineContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(ILineContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(ILineContext)
}

func (s *LabelInstructionLineContext) IDENTIFIER() antlr.TerminalNode {
	return s.GetToken(RISCVASMParserIDENTIFIER, 0)
}

func (s *LabelInstructionLineContext) AllWHITESPACE() []antlr.TerminalNode {
	return s.GetTokens(RISCVASMParserWHITESPACE)
}

func (s *LabelInstructionLineContext) WHITESPACE(i int) antlr.TerminalNode {
	return s.GetToken(RISCVASMParserWHITESPACE, i)
}

func (s *LabelInstructionLineContext) AllNEWLINE() []antlr.TerminalNode {
	return s.GetTokens(RISCVASMParserNEWLINE)
}

func (s *LabelInstructionLineContext) NEWLINE(i int) antlr.TerminalNode {
	return s.GetToken(RISCVASMParserNEWLINE, i)
}

func (s *LabelInstructionLineContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RISCVASMParserListener); ok {
		listenerT.EnterLabelInstructionLine(s)
	}
}

func (s *LabelInstructionLineContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RISCVASMParserListener); ok {
		listenerT.ExitLabelInstructionLine(s)
	}
}

func (s *LabelInstructionLineContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case RISCVASMParserVisitor:
		return t.VisitLabelInstructionLine(s)

	default:
		return t.VisitChildren(s)
	}
}

type InstructionLineContext struct {
	LineContext
}

func NewInstructionLineContext(parser antlr.Parser, ctx antlr.ParserRuleContext) *InstructionLineContext {
	var p = new(InstructionLineContext)

	InitEmptyLineContext(&p.LineContext)
	p.parser = parser
	p.CopyAll(ctx.(*LineContext))

	return p
}

func (s *InstructionLineContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *InstructionLineContext) Instruction() IInstructionContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(IInstructionContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(IInstructionContext)
}

func (s *InstructionLineContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RISCVASMParserListener); ok {
		listenerT.EnterInstructionLine(s)
	}
}

func (s *InstructionLineContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RISCVASMParserListener); ok {
		listenerT.ExitInstructionLine(s)
	}
}

func (s *InstructionLineContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case RISCVASMParserVisitor:
		return t.VisitInstructionLine(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *RISCVASMParser) Line() (localctx ILineContext) {
	localctx = NewLineContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 4, RISCVASMParserRULE_line)
	var _la int

	p.SetState(65)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}

	switch p.GetInterpreter().AdaptivePredict(p.BaseParser, p.GetTokenStream(), 9, p.GetParserRuleContext()) {
	case 1:
		localctx = NewInstructionLineContext(p, localctx)
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(55)
			p.Instruction()
		}

	case 2:
		localctx = NewLabelInstructionLineContext(p, localctx)
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(56)

			var _m = p.Match(RISCVASMParserIDENTIFIER)

			localctx.(*LabelInstructionLineContext).label = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(57)
			p.Match(RISCVASMParserCOLON)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		p.SetState(61)
		p.GetErrorHandler().Sync(p)
		if p.HasError() {
			goto errorExit
		}
		_la = p.GetTokenStream().LA(1)

		for _la == RISCVASMParserWHITESPACE || _la == RISCVASMParserNEWLINE {
			{
				p.SetState(58)
				_la = p.GetTokenStream().LA(1)

				if !(_la == RISCVASMParserWHITESPACE || _la == RISCVASMParserNEWLINE) {
					p.GetErrorHandler().RecoverInline(p)
				} else {
					p.GetErrorHandler().ReportMatch(p)
					p.Consume()
				}
			}

			p.SetState(63)
			p.GetErrorHandler().Sync(p)
			if p.HasError() {
				goto errorExit
			}
			_la = p.GetTokenStream().LA(1)
		}
		{
			p.SetState(64)
			p.Line()
		}

	case antlr.ATNInvalidAltNumber:
		goto errorExit
	}

errorExit:
	if p.HasError() {
		v := p.GetError()
		localctx.SetException(v)
		p.GetErrorHandler().ReportError(p, v)
		p.GetErrorHandler().Recover(p, v)
		p.SetError(nil)
	}
	p.ExitRule()
	return localctx
	goto errorExit // Trick to prevent compiler error if the label is not used
}

// IInstructionContext is an interface to support dynamic dispatch.
type IInstructionContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser
	// IsInstructionContext differentiates from other interfaces.
	IsInstructionContext()
}

type InstructionContext struct {
	antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyInstructionContext() *InstructionContext {
	var p = new(InstructionContext)
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = RISCVASMParserRULE_instruction
	return p
}

func InitEmptyInstructionContext(p *InstructionContext) {
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = RISCVASMParserRULE_instruction
}

func (*InstructionContext) IsInstructionContext() {}

func NewInstructionContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *InstructionContext {
	var p = new(InstructionContext)

	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, parent, invokingState)

	p.parser = parser
	p.RuleIndex = RISCVASMParserRULE_instruction

	return p
}

func (s *InstructionContext) GetParser() antlr.Parser { return s.parser }

func (s *InstructionContext) CopyAll(ctx *InstructionContext) {
	s.CopyFrom(&ctx.BaseParserRuleContext)
}

func (s *InstructionContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *InstructionContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

type OperandInstructionContext struct {
	InstructionContext
	inst antlr.Token
}

func NewOperandInstructionContext(parser antlr.Parser, ctx antlr.ParserRuleContext) *OperandInstructionContext {
	var p = new(OperandInstructionContext)

	InitEmptyInstructionContext(&p.InstructionContext)
	p.parser = parser
	p.CopyAll(ctx.(*InstructionContext))

	return p
}

func (s *OperandInstructionContext) GetInst() antlr.Token { return s.inst }

func (s *OperandInstructionContext) SetInst(v antlr.Token) { s.inst = v }

func (s *OperandInstructionContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *OperandInstructionContext) WHITESPACE() antlr.TerminalNode {
	return s.GetToken(RISCVASMParserWHITESPACE, 0)
}

func (s *OperandInstructionContext) Operands() IOperandsContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(IOperandsContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(IOperandsContext)
}

func (s *OperandInstructionContext) IDENTIFIER() antlr.TerminalNode {
	return s.GetToken(RISCVASMParserIDENTIFIER, 0)
}

func (s *OperandInstructionContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RISCVASMParserListener); ok {
		listenerT.EnterOperandInstruction(s)
	}
}

func (s *OperandInstructionContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RISCVASMParserListener); ok {
		listenerT.ExitOperandInstruction(s)
	}
}

func (s *OperandInstructionContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case RISCVASMParserVisitor:
		return t.VisitOperandInstruction(s)

	default:
		return t.VisitChildren(s)
	}
}

type NoOperandInstructionContext struct {
	InstructionContext
	inst antlr.Token
}

func NewNoOperandInstructionContext(parser antlr.Parser, ctx antlr.ParserRuleContext) *NoOperandInstructionContext {
	var p = new(NoOperandInstructionContext)

	InitEmptyInstructionContext(&p.InstructionContext)
	p.parser = parser
	p.CopyAll(ctx.(*InstructionContext))

	return p
}

func (s *NoOperandInstructionContext) GetInst() antlr.Token { return s.inst }

func (s *NoOperandInstructionContext) SetInst(v antlr.Token) { s.inst = v }

func (s *NoOperandInstructionContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *NoOperandInstructionContext) IDENTIFIER() antlr.TerminalNode {
	return s.GetToken(RISCVASMParserIDENTIFIER, 0)
}

func (s *NoOperandInstructionContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RISCVASMParserListener); ok {
		listenerT.EnterNoOperandInstruction(s)
	}
}

func (s *NoOperandInstructionContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RISCVASMParserListener); ok {
		listenerT.ExitNoOperandInstruction(s)
	}
}

func (s *NoOperandInstructionContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case RISCVASMParserVisitor:
		return t.VisitNoOperandInstruction(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *RISCVASMParser) Instruction() (localctx IInstructionContext) {
	localctx = NewInstructionContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 6, RISCVASMParserRULE_instruction)
	p.SetState(71)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}

	switch p.GetInterpreter().AdaptivePredict(p.BaseParser, p.GetTokenStream(), 10, p.GetParserRuleContext()) {
	case 1:
		localctx = NewNoOperandInstructionContext(p, localctx)
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(67)

			var _m = p.Match(RISCVASMParserIDENTIFIER)

			localctx.(*NoOperandInstructionContext).inst = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}

	case 2:
		localctx = NewOperandInstructionContext(p, localctx)
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(68)

			var _m = p.Match(RISCVASMParserIDENTIFIER)

			localctx.(*OperandInstructionContext).inst = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(69)
			p.Match(RISCVASMParserWHITESPACE)
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}
		{
			p.SetState(70)
			p.operands(0)
		}

	case antlr.ATNInvalidAltNumber:
		goto errorExit
	}

errorExit:
	if p.HasError() {
		v := p.GetError()
		localctx.SetException(v)
		p.GetErrorHandler().ReportError(p, v)
		p.GetErrorHandler().Recover(p, v)
		p.SetError(nil)
	}
	p.ExitRule()
	return localctx
	goto errorExit // Trick to prevent compiler error if the label is not used
}

// IOperandsContext is an interface to support dynamic dispatch.
type IOperandsContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser
	// IsOperandsContext differentiates from other interfaces.
	IsOperandsContext()
}

type OperandsContext struct {
	antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyOperandsContext() *OperandsContext {
	var p = new(OperandsContext)
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = RISCVASMParserRULE_operands
	return p
}

func InitEmptyOperandsContext(p *OperandsContext) {
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = RISCVASMParserRULE_operands
}

func (*OperandsContext) IsOperandsContext() {}

func NewOperandsContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *OperandsContext {
	var p = new(OperandsContext)

	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, parent, invokingState)

	p.parser = parser
	p.RuleIndex = RISCVASMParserRULE_operands

	return p
}

func (s *OperandsContext) GetParser() antlr.Parser { return s.parser }

func (s *OperandsContext) CopyAll(ctx *OperandsContext) {
	s.CopyFrom(&ctx.BaseParserRuleContext)
}

func (s *OperandsContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *OperandsContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

type OperandsInitialContext struct {
	OperandsContext
}

func NewOperandsInitialContext(parser antlr.Parser, ctx antlr.ParserRuleContext) *OperandsInitialContext {
	var p = new(OperandsInitialContext)

	InitEmptyOperandsContext(&p.OperandsContext)
	p.parser = parser
	p.CopyAll(ctx.(*OperandsContext))

	return p
}

func (s *OperandsInitialContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *OperandsInitialContext) Operand() IOperandContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(IOperandContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(IOperandContext)
}

func (s *OperandsInitialContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RISCVASMParserListener); ok {
		listenerT.EnterOperandsInitial(s)
	}
}

func (s *OperandsInitialContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RISCVASMParserListener); ok {
		listenerT.ExitOperandsInitial(s)
	}
}

func (s *OperandsInitialContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case RISCVASMParserVisitor:
		return t.VisitOperandsInitial(s)

	default:
		return t.VisitChildren(s)
	}
}

type OperandsAppendContext struct {
	OperandsContext
}

func NewOperandsAppendContext(parser antlr.Parser, ctx antlr.ParserRuleContext) *OperandsAppendContext {
	var p = new(OperandsAppendContext)

	InitEmptyOperandsContext(&p.OperandsContext)
	p.parser = parser
	p.CopyAll(ctx.(*OperandsContext))

	return p
}

func (s *OperandsAppendContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *OperandsAppendContext) Operands() IOperandsContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(IOperandsContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(IOperandsContext)
}

func (s *OperandsAppendContext) COMMA() antlr.TerminalNode {
	return s.GetToken(RISCVASMParserCOMMA, 0)
}

func (s *OperandsAppendContext) Operand() IOperandContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(IOperandContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(IOperandContext)
}

func (s *OperandsAppendContext) AllWHITESPACE() []antlr.TerminalNode {
	return s.GetTokens(RISCVASMParserWHITESPACE)
}

func (s *OperandsAppendContext) WHITESPACE(i int) antlr.TerminalNode {
	return s.GetToken(RISCVASMParserWHITESPACE, i)
}

func (s *OperandsAppendContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RISCVASMParserListener); ok {
		listenerT.EnterOperandsAppend(s)
	}
}

func (s *OperandsAppendContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RISCVASMParserListener); ok {
		listenerT.ExitOperandsAppend(s)
	}
}

func (s *OperandsAppendContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case RISCVASMParserVisitor:
		return t.VisitOperandsAppend(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *RISCVASMParser) Operands() (localctx IOperandsContext) {
	return p.operands(0)
}

func (p *RISCVASMParser) operands(_p int) (localctx IOperandsContext) {
	var _parentctx antlr.ParserRuleContext = p.GetParserRuleContext()

	_parentState := p.GetState()
	localctx = NewOperandsContext(p, p.GetParserRuleContext(), _parentState)
	var _prevctx IOperandsContext = localctx
	var _ antlr.ParserRuleContext = _prevctx // TODO: To prevent unused variable warning.
	_startState := 8
	p.EnterRecursionRule(localctx, 8, RISCVASMParserRULE_operands, _p)
	var _la int

	var _alt int

	p.EnterOuterAlt(localctx, 1)
	localctx = NewOperandsInitialContext(p, localctx)
	p.SetParserRuleContext(localctx)
	_prevctx = localctx

	{
		p.SetState(74)
		p.Operand()
	}

	p.GetParserRuleContext().SetStop(p.GetTokenStream().LT(-1))
	p.SetState(87)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}
	_alt = p.GetInterpreter().AdaptivePredict(p.BaseParser, p.GetTokenStream(), 13, p.GetParserRuleContext())
	if p.HasError() {
		goto errorExit
	}
	for _alt != 2 && _alt != antlr.ATNInvalidAltNumber {
		if _alt == 1 {
			if p.GetParseListeners() != nil {
				p.TriggerExitRuleEvent()
			}
			_prevctx = localctx
			localctx = NewOperandsAppendContext(p, NewOperandsContext(p, _parentctx, _parentState))
			p.PushNewRecursionContext(localctx, _startState, RISCVASMParserRULE_operands)
			p.SetState(76)

			if !(p.Precpred(p.GetParserRuleContext(), 1)) {
				p.SetError(antlr.NewFailedPredicateException(p, "p.Precpred(p.GetParserRuleContext(), 1)", ""))
				goto errorExit
			}
			p.SetState(78)
			p.GetErrorHandler().Sync(p)
			if p.HasError() {
				goto errorExit
			}
			_la = p.GetTokenStream().LA(1)

			if _la == RISCVASMParserWHITESPACE {
				{
					p.SetState(77)
					p.Match(RISCVASMParserWHITESPACE)
					if p.HasError() {
						// Recognition error - abort rule
						goto errorExit
					}
				}

			}
			{
				p.SetState(80)
				p.Match(RISCVASMParserCOMMA)
				if p.HasError() {
					// Recognition error - abort rule
					goto errorExit
				}
			}
			p.SetState(82)
			p.GetErrorHandler().Sync(p)
			if p.HasError() {
				goto errorExit
			}
			_la = p.GetTokenStream().LA(1)

			if _la == RISCVASMParserWHITESPACE {
				{
					p.SetState(81)
					p.Match(RISCVASMParserWHITESPACE)
					if p.HasError() {
						// Recognition error - abort rule
						goto errorExit
					}
				}

			}
			{
				p.SetState(84)
				p.Operand()
			}

		}
		p.SetState(89)
		p.GetErrorHandler().Sync(p)
		if p.HasError() {
			goto errorExit
		}
		_alt = p.GetInterpreter().AdaptivePredict(p.BaseParser, p.GetTokenStream(), 13, p.GetParserRuleContext())
		if p.HasError() {
			goto errorExit
		}
	}

errorExit:
	if p.HasError() {
		v := p.GetError()
		localctx.SetException(v)
		p.GetErrorHandler().ReportError(p, v)
		p.GetErrorHandler().Recover(p, v)
		p.SetError(nil)
	}
	p.UnrollRecursionContexts(_parentctx)
	return localctx
	goto errorExit // Trick to prevent compiler error if the label is not used
}

// IOperandContext is an interface to support dynamic dispatch.
type IOperandContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser
	// IsOperandContext differentiates from other interfaces.
	IsOperandContext()
}

type OperandContext struct {
	antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyOperandContext() *OperandContext {
	var p = new(OperandContext)
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = RISCVASMParserRULE_operand
	return p
}

func InitEmptyOperandContext(p *OperandContext) {
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = RISCVASMParserRULE_operand
}

func (*OperandContext) IsOperandContext() {}

func NewOperandContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *OperandContext {
	var p = new(OperandContext)

	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, parent, invokingState)

	p.parser = parser
	p.RuleIndex = RISCVASMParserRULE_operand

	return p
}

func (s *OperandContext) GetParser() antlr.Parser { return s.parser }

func (s *OperandContext) CopyAll(ctx *OperandContext) {
	s.CopyFrom(&ctx.BaseParserRuleContext)
}

func (s *OperandContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *OperandContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

type OperandNumericContext struct {
	OperandContext
}

func NewOperandNumericContext(parser antlr.Parser, ctx antlr.ParserRuleContext) *OperandNumericContext {
	var p = new(OperandNumericContext)

	InitEmptyOperandContext(&p.OperandContext)
	p.parser = parser
	p.CopyAll(ctx.(*OperandContext))

	return p
}

func (s *OperandNumericContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *OperandNumericContext) Numeric() INumericContext {
	var t antlr.RuleContext
	for _, ctx := range s.GetChildren() {
		if _, ok := ctx.(INumericContext); ok {
			t = ctx.(antlr.RuleContext)
			break
		}
	}

	if t == nil {
		return nil
	}

	return t.(INumericContext)
}

func (s *OperandNumericContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RISCVASMParserListener); ok {
		listenerT.EnterOperandNumeric(s)
	}
}

func (s *OperandNumericContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RISCVASMParserListener); ok {
		listenerT.ExitOperandNumeric(s)
	}
}

func (s *OperandNumericContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case RISCVASMParserVisitor:
		return t.VisitOperandNumeric(s)

	default:
		return t.VisitChildren(s)
	}
}

type OperandIdentifierContext struct {
	OperandContext
	identifier antlr.Token
}

func NewOperandIdentifierContext(parser antlr.Parser, ctx antlr.ParserRuleContext) *OperandIdentifierContext {
	var p = new(OperandIdentifierContext)

	InitEmptyOperandContext(&p.OperandContext)
	p.parser = parser
	p.CopyAll(ctx.(*OperandContext))

	return p
}

func (s *OperandIdentifierContext) GetIdentifier() antlr.Token { return s.identifier }

func (s *OperandIdentifierContext) SetIdentifier(v antlr.Token) { s.identifier = v }

func (s *OperandIdentifierContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *OperandIdentifierContext) IDENTIFIER() antlr.TerminalNode {
	return s.GetToken(RISCVASMParserIDENTIFIER, 0)
}

func (s *OperandIdentifierContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RISCVASMParserListener); ok {
		listenerT.EnterOperandIdentifier(s)
	}
}

func (s *OperandIdentifierContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RISCVASMParserListener); ok {
		listenerT.ExitOperandIdentifier(s)
	}
}

func (s *OperandIdentifierContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case RISCVASMParserVisitor:
		return t.VisitOperandIdentifier(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *RISCVASMParser) Operand() (localctx IOperandContext) {
	localctx = NewOperandContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 10, RISCVASMParserRULE_operand)
	p.SetState(92)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}

	switch p.GetTokenStream().LA(1) {
	case RISCVASMParserIDENTIFIER:
		localctx = NewOperandIdentifierContext(p, localctx)
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(90)

			var _m = p.Match(RISCVASMParserIDENTIFIER)

			localctx.(*OperandIdentifierContext).identifier = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}

	case RISCVASMParserDEC, RISCVASMParserHEX, RISCVASMParserBIN:
		localctx = NewOperandNumericContext(p, localctx)
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(91)
			p.Numeric()
		}

	default:
		p.SetError(antlr.NewNoViableAltException(p, nil, nil, nil, nil, nil))
		goto errorExit
	}

errorExit:
	if p.HasError() {
		v := p.GetError()
		localctx.SetException(v)
		p.GetErrorHandler().ReportError(p, v)
		p.GetErrorHandler().Recover(p, v)
		p.SetError(nil)
	}
	p.ExitRule()
	return localctx
	goto errorExit // Trick to prevent compiler error if the label is not used
}

// INumericContext is an interface to support dynamic dispatch.
type INumericContext interface {
	antlr.ParserRuleContext

	// GetParser returns the parser.
	GetParser() antlr.Parser
	// IsNumericContext differentiates from other interfaces.
	IsNumericContext()
}

type NumericContext struct {
	antlr.BaseParserRuleContext
	parser antlr.Parser
}

func NewEmptyNumericContext() *NumericContext {
	var p = new(NumericContext)
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = RISCVASMParserRULE_numeric
	return p
}

func InitEmptyNumericContext(p *NumericContext) {
	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, nil, -1)
	p.RuleIndex = RISCVASMParserRULE_numeric
}

func (*NumericContext) IsNumericContext() {}

func NewNumericContext(parser antlr.Parser, parent antlr.ParserRuleContext, invokingState int) *NumericContext {
	var p = new(NumericContext)

	antlr.InitBaseParserRuleContext(&p.BaseParserRuleContext, parent, invokingState)

	p.parser = parser
	p.RuleIndex = RISCVASMParserRULE_numeric

	return p
}

func (s *NumericContext) GetParser() antlr.Parser { return s.parser }

func (s *NumericContext) CopyAll(ctx *NumericContext) {
	s.CopyFrom(&ctx.BaseParserRuleContext)
}

func (s *NumericContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *NumericContext) ToStringTree(ruleNames []string, recog antlr.Recognizer) string {
	return antlr.TreesStringTree(s, ruleNames, recog)
}

type NumericBinContext struct {
	NumericContext
	val antlr.Token
}

func NewNumericBinContext(parser antlr.Parser, ctx antlr.ParserRuleContext) *NumericBinContext {
	var p = new(NumericBinContext)

	InitEmptyNumericContext(&p.NumericContext)
	p.parser = parser
	p.CopyAll(ctx.(*NumericContext))

	return p
}

func (s *NumericBinContext) GetVal() antlr.Token { return s.val }

func (s *NumericBinContext) SetVal(v antlr.Token) { s.val = v }

func (s *NumericBinContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *NumericBinContext) BIN() antlr.TerminalNode {
	return s.GetToken(RISCVASMParserBIN, 0)
}

func (s *NumericBinContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RISCVASMParserListener); ok {
		listenerT.EnterNumericBin(s)
	}
}

func (s *NumericBinContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RISCVASMParserListener); ok {
		listenerT.ExitNumericBin(s)
	}
}

func (s *NumericBinContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case RISCVASMParserVisitor:
		return t.VisitNumericBin(s)

	default:
		return t.VisitChildren(s)
	}
}

type NumericHexContext struct {
	NumericContext
	val antlr.Token
}

func NewNumericHexContext(parser antlr.Parser, ctx antlr.ParserRuleContext) *NumericHexContext {
	var p = new(NumericHexContext)

	InitEmptyNumericContext(&p.NumericContext)
	p.parser = parser
	p.CopyAll(ctx.(*NumericContext))

	return p
}

func (s *NumericHexContext) GetVal() antlr.Token { return s.val }

func (s *NumericHexContext) SetVal(v antlr.Token) { s.val = v }

func (s *NumericHexContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *NumericHexContext) HEX() antlr.TerminalNode {
	return s.GetToken(RISCVASMParserHEX, 0)
}

func (s *NumericHexContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RISCVASMParserListener); ok {
		listenerT.EnterNumericHex(s)
	}
}

func (s *NumericHexContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RISCVASMParserListener); ok {
		listenerT.ExitNumericHex(s)
	}
}

func (s *NumericHexContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case RISCVASMParserVisitor:
		return t.VisitNumericHex(s)

	default:
		return t.VisitChildren(s)
	}
}

type NumericDecContext struct {
	NumericContext
	val antlr.Token
}

func NewNumericDecContext(parser antlr.Parser, ctx antlr.ParserRuleContext) *NumericDecContext {
	var p = new(NumericDecContext)

	InitEmptyNumericContext(&p.NumericContext)
	p.parser = parser
	p.CopyAll(ctx.(*NumericContext))

	return p
}

func (s *NumericDecContext) GetVal() antlr.Token { return s.val }

func (s *NumericDecContext) SetVal(v antlr.Token) { s.val = v }

func (s *NumericDecContext) GetRuleContext() antlr.RuleContext {
	return s
}

func (s *NumericDecContext) DEC() antlr.TerminalNode {
	return s.GetToken(RISCVASMParserDEC, 0)
}

func (s *NumericDecContext) EnterRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RISCVASMParserListener); ok {
		listenerT.EnterNumericDec(s)
	}
}

func (s *NumericDecContext) ExitRule(listener antlr.ParseTreeListener) {
	if listenerT, ok := listener.(RISCVASMParserListener); ok {
		listenerT.ExitNumericDec(s)
	}
}

func (s *NumericDecContext) Accept(visitor antlr.ParseTreeVisitor) interface{} {
	switch t := visitor.(type) {
	case RISCVASMParserVisitor:
		return t.VisitNumericDec(s)

	default:
		return t.VisitChildren(s)
	}
}

func (p *RISCVASMParser) Numeric() (localctx INumericContext) {
	localctx = NewNumericContext(p, p.GetParserRuleContext(), p.GetState())
	p.EnterRule(localctx, 12, RISCVASMParserRULE_numeric)
	p.SetState(97)
	p.GetErrorHandler().Sync(p)
	if p.HasError() {
		goto errorExit
	}

	switch p.GetTokenStream().LA(1) {
	case RISCVASMParserDEC:
		localctx = NewNumericDecContext(p, localctx)
		p.EnterOuterAlt(localctx, 1)
		{
			p.SetState(94)

			var _m = p.Match(RISCVASMParserDEC)

			localctx.(*NumericDecContext).val = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}

	case RISCVASMParserHEX:
		localctx = NewNumericHexContext(p, localctx)
		p.EnterOuterAlt(localctx, 2)
		{
			p.SetState(95)

			var _m = p.Match(RISCVASMParserHEX)

			localctx.(*NumericHexContext).val = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}

	case RISCVASMParserBIN:
		localctx = NewNumericBinContext(p, localctx)
		p.EnterOuterAlt(localctx, 3)
		{
			p.SetState(96)

			var _m = p.Match(RISCVASMParserBIN)

			localctx.(*NumericBinContext).val = _m
			if p.HasError() {
				// Recognition error - abort rule
				goto errorExit
			}
		}

	default:
		p.SetError(antlr.NewNoViableAltException(p, nil, nil, nil, nil, nil))
		goto errorExit
	}

errorExit:
	if p.HasError() {
		v := p.GetError()
		localctx.SetException(v)
		p.GetErrorHandler().ReportError(p, v)
		p.GetErrorHandler().Recover(p, v)
		p.SetError(nil)
	}
	p.ExitRule()
	return localctx
	goto errorExit // Trick to prevent compiler error if the label is not used
}

func (p *RISCVASMParser) Sempred(localctx antlr.RuleContext, ruleIndex, predIndex int) bool {
	switch ruleIndex {
	case 1:
		var t *LinesContext = nil
		if localctx != nil {
			t = localctx.(*LinesContext)
		}
		return p.Lines_Sempred(t, predIndex)

	case 4:
		var t *OperandsContext = nil
		if localctx != nil {
			t = localctx.(*OperandsContext)
		}
		return p.Operands_Sempred(t, predIndex)

	default:
		panic("No predicate with index: " + fmt.Sprint(ruleIndex))
	}
}

func (p *RISCVASMParser) Lines_Sempred(localctx antlr.RuleContext, predIndex int) bool {
	switch predIndex {
	case 0:
		return p.Precpred(p.GetParserRuleContext(), 1)

	default:
		panic("No predicate with index: " + fmt.Sprint(predIndex))
	}
}

func (p *RISCVASMParser) Operands_Sempred(localctx antlr.RuleContext, predIndex int) bool {
	switch predIndex {
	case 1:
		return p.Precpred(p.GetParserRuleContext(), 1)

	default:
		panic("No predicate with index: " + fmt.Sprint(predIndex))
	}
}
