// Generated from /home/excalibur/PersonalProjects/caliburncode/parser/CaliburnParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CaliburnParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PERIOD=1, COMMA=2, COLON=3, QUESTION=4, Terminator=5, ASSIGN=6, ARROW=7, 
		IF=8, ELSE=9, FOR=10, SWITCH=11, CASE=12, DEFAULT=13, FALLTHROUGH=14, 
		BREAK=15, CONTINUE=16, RETURN=17, USING=18, AS=19, IN=20, NULL=21, VAR=22, 
		CONST=23, TYPE=24, FUNC=25, STRUCT=26, TUPLE=27, CLASS=28, INTERFACE=29, 
		L_PAREN=30, R_PAREN=31, L_S_BRACK=32, R_S_BRACK=33, L_C_BRACK=34, R_C_BRACK=35, 
		OP_ADD=36, OP_SUB=37, OP_NOT=38, OP_MUL=39, OP_DIV=40, OP_MOD=41, OP_POW=42, 
		OP_ROOT=43, OP_OR=44, OP_XOR=45, OP_AND=46, OP_LSHIFT=47, OP_RSHIFT=48, 
		OP_EQU=49, OP_NEQ=50, OP_GTE=51, OP_GRT=52, OP_LTE=53, OP_LST=54, WhiteSpace=55, 
		CommentMultiLine=56, CommentSingleLine=57, IdentifierToken=58, LiteralToken=59;
	public static final int
		RULE_module = 0, RULE_definitions = 1, RULE_definition = 2, RULE_function_definition = 3, 
		RULE_parameters = 4, RULE_parameters_list = 5, RULE_parameter = 6, RULE_block = 7, 
		RULE_statements = 8, RULE_statement = 9, RULE_inline_statements = 10, 
		RULE_inline_statement = 11, RULE_jump_statement = 12, RULE_return_statement = 13, 
		RULE_break_statement = 14, RULE_continue_statement = 15, RULE_control_statement = 16, 
		RULE_if_statement = 17, RULE_else_statement = 18, RULE_for_statement = 19, 
		RULE_switch_statement = 20, RULE_case_blocks = 21, RULE_option_case_blocks = 22, 
		RULE_option_case_block = 23, RULE_default_case_block = 24, RULE_assign_statement = 25, 
		RULE_assign_expressions = 26, RULE_aliasable_assign_expressions = 27, 
		RULE_aliasable_assign_expression = 28, RULE_assign_expression = 29, RULE_assign_declarations = 30, 
		RULE_aliasable_assign_declarations = 31, RULE_aliasable_assign_declaration = 32, 
		RULE_assign_declaration = 33, RULE_typed_assign_declaration = 34, RULE_aliasable_untyped_assign_declarations = 35, 
		RULE_aliasable_untyped_assign_declaration = 36, RULE_untyped_assign_declaration = 37, 
		RULE_expression_statement = 38, RULE_expressions = 39, RULE_expressions_optional = 40, 
		RULE_expression = 41, RULE_struct_values = 42, RULE_named_struct_values = 43, 
		RULE_named_struct_value = 44, RULE_collection_values = 45, RULE_collection_value = 46, 
		RULE_function_type = 47, RULE_struct_type = 48, RULE_type_expression = 49, 
		RULE_literal_atom = 50, RULE_literal = 51, RULE_identifier = 52;
	private static String[] makeRuleNames() {
		return new String[] {
			"module", "definitions", "definition", "function_definition", "parameters", 
			"parameters_list", "parameter", "block", "statements", "statement", "inline_statements", 
			"inline_statement", "jump_statement", "return_statement", "break_statement", 
			"continue_statement", "control_statement", "if_statement", "else_statement", 
			"for_statement", "switch_statement", "case_blocks", "option_case_blocks", 
			"option_case_block", "default_case_block", "assign_statement", "assign_expressions", 
			"aliasable_assign_expressions", "aliasable_assign_expression", "assign_expression", 
			"assign_declarations", "aliasable_assign_declarations", "aliasable_assign_declaration", 
			"assign_declaration", "typed_assign_declaration", "aliasable_untyped_assign_declarations", 
			"aliasable_untyped_assign_declaration", "untyped_assign_declaration", 
			"expression_statement", "expressions", "expressions_optional", "expression", 
			"struct_values", "named_struct_values", "named_struct_value", "collection_values", 
			"collection_value", "function_type", "struct_type", "type_expression", 
			"literal_atom", "literal", "identifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "','", "':'", "'?'", "';'", "'='", "'->'", "'if'", "'else'", 
			"'for'", "'switch'", "'case'", "'default'", "'fallthrough'", "'break'", 
			"'continue'", "'return'", "'using'", "'as'", "'in'", "'null'", "'var'", 
			"'const'", "'type'", "'func'", "'struct'", "'tuple'", "'class'", "'interface'", 
			"'('", "')'", "'['", "']'", "'{'", "'}'", "'+'", "'-'", "'!'", "'*'", 
			"'/'", "'%'", "'^'", "'~'", "'|'", "'|!&'", "'&'", "'<<'", "'>>'", "'=='", 
			"'!='", "'>='", "'>'", "'<='", "'<'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PERIOD", "COMMA", "COLON", "QUESTION", "Terminator", "ASSIGN", 
			"ARROW", "IF", "ELSE", "FOR", "SWITCH", "CASE", "DEFAULT", "FALLTHROUGH", 
			"BREAK", "CONTINUE", "RETURN", "USING", "AS", "IN", "NULL", "VAR", "CONST", 
			"TYPE", "FUNC", "STRUCT", "TUPLE", "CLASS", "INTERFACE", "L_PAREN", "R_PAREN", 
			"L_S_BRACK", "R_S_BRACK", "L_C_BRACK", "R_C_BRACK", "OP_ADD", "OP_SUB", 
			"OP_NOT", "OP_MUL", "OP_DIV", "OP_MOD", "OP_POW", "OP_ROOT", "OP_OR", 
			"OP_XOR", "OP_AND", "OP_LSHIFT", "OP_RSHIFT", "OP_EQU", "OP_NEQ", "OP_GTE", 
			"OP_GRT", "OP_LTE", "OP_LST", "WhiteSpace", "CommentMultiLine", "CommentSingleLine", 
			"IdentifierToken", "LiteralToken"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "CaliburnParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CaliburnParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ModuleContext extends ParserRuleContext {
		public ModuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module; }
	 
		public ModuleContext() { }
		public void copyFrom(ModuleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ModuleRuleContext extends ModuleContext {
		public DefinitionsContext definitions() {
			return getRuleContext(DefinitionsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CaliburnParser.EOF, 0); }
		public ModuleRuleContext(ModuleContext ctx) { copyFrom(ctx); }
	}

	public final ModuleContext module() throws RecognitionException {
		ModuleContext _localctx = new ModuleContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_module);
		try {
			_localctx = new ModuleRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			definitions(0);
			setState(107);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DefinitionsContext extends ParserRuleContext {
		public DefinitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definitions; }
	 
		public DefinitionsContext() { }
		public void copyFrom(DefinitionsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DefinitionsAppendContext extends DefinitionsContext {
		public DefinitionsContext definitions() {
			return getRuleContext(DefinitionsContext.class,0);
		}
		public DefinitionContext definition() {
			return getRuleContext(DefinitionContext.class,0);
		}
		public DefinitionsAppendContext(DefinitionsContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DefinitionsInitialContext extends DefinitionsContext {
		public DefinitionsInitialContext(DefinitionsContext ctx) { copyFrom(ctx); }
	}

	public final DefinitionsContext definitions() throws RecognitionException {
		return definitions(0);
	}

	private DefinitionsContext definitions(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DefinitionsContext _localctx = new DefinitionsContext(_ctx, _parentState);
		DefinitionsContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_definitions, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new DefinitionsInitialContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			}
			_ctx.stop = _input.LT(-1);
			setState(114);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DefinitionsAppendContext(new DefinitionsContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_definitions);
					setState(110);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(111);
					definition();
					}
					} 
				}
				setState(116);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DefinitionContext extends ParserRuleContext {
		public Function_definitionContext function_definition() {
			return getRuleContext(Function_definitionContext.class,0);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			function_definition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_definitionContext extends ParserRuleContext {
		public Function_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition; }
	 
		public Function_definitionContext() { }
		public void copyFrom(Function_definitionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDefinitionNoReturnTypeContext extends Function_definitionContext {
		public Function_typeContext function_type() {
			return getRuleContext(Function_typeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode L_PAREN() { return getToken(CaliburnParser.L_PAREN, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(CaliburnParser.R_PAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FunctionDefinitionNoReturnTypeContext(Function_definitionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDefinitionContext extends Function_definitionContext {
		public Function_typeContext function_type() {
			return getRuleContext(Function_typeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode L_PAREN() { return getToken(CaliburnParser.L_PAREN, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(CaliburnParser.R_PAREN, 0); }
		public Type_expressionContext type_expression() {
			return getRuleContext(Type_expressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FunctionDefinitionContext(Function_definitionContext ctx) { copyFrom(ctx); }
	}

	public final Function_definitionContext function_definition() throws RecognitionException {
		Function_definitionContext _localctx = new Function_definitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_function_definition);
		try {
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new FunctionDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				function_type();
				setState(120);
				identifier();
				setState(121);
				match(L_PAREN);
				setState(122);
				parameters();
				setState(123);
				match(R_PAREN);
				setState(124);
				type_expression(0);
				setState(125);
				block();
				}
				break;
			case 2:
				_localctx = new FunctionDefinitionNoReturnTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				function_type();
				setState(128);
				identifier();
				setState(129);
				match(L_PAREN);
				setState(130);
				parameters();
				setState(131);
				match(R_PAREN);
				setState(132);
				block();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametersContext extends ParserRuleContext {
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
	 
		public ParametersContext() { }
		public void copyFrom(ParametersContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParametersEmptyContext extends ParametersContext {
		public ParametersEmptyContext(ParametersContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParametersFilledContext extends ParametersContext {
		public Parameters_listContext parameters_list() {
			return getRuleContext(Parameters_listContext.class,0);
		}
		public ParametersFilledContext(ParametersContext ctx) { copyFrom(ctx); }
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_parameters);
		try {
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case R_PAREN:
			case R_C_BRACK:
				_localctx = new ParametersEmptyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case L_C_BRACK:
			case IdentifierToken:
				_localctx = new ParametersFilledContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				parameters_list(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Parameters_listContext extends ParserRuleContext {
		public Parameters_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters_list; }
	 
		public Parameters_listContext() { }
		public void copyFrom(Parameters_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParametersListInitialContext extends Parameters_listContext {
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public ParametersListInitialContext(Parameters_listContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParametersListAppendContext extends Parameters_listContext {
		public Parameters_listContext parameters_list() {
			return getRuleContext(Parameters_listContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(CaliburnParser.COMMA, 0); }
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public ParametersListAppendContext(Parameters_listContext ctx) { copyFrom(ctx); }
	}

	public final Parameters_listContext parameters_list() throws RecognitionException {
		return parameters_list(0);
	}

	private Parameters_listContext parameters_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Parameters_listContext _localctx = new Parameters_listContext(_ctx, _parentState);
		Parameters_listContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_parameters_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ParametersListInitialContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(141);
			parameter();
			}
			_ctx.stop = _input.LT(-1);
			setState(148);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ParametersListAppendContext(new Parameters_listContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_parameters_list);
					setState(143);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(144);
					match(COMMA);
					setState(145);
					parameter();
					}
					} 
				}
				setState(150);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterContext extends ParserRuleContext {
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
	 
		public ParameterContext() { }
		public void copyFrom(ParameterContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StructDestrutureParameterContext extends ParameterContext {
		public TerminalNode L_C_BRACK() { return getToken(CaliburnParser.L_C_BRACK, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode R_C_BRACK() { return getToken(CaliburnParser.R_C_BRACK, 0); }
		public StructDestrutureParameterContext(ParameterContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypedParameterContext extends ParameterContext {
		public Typed_assign_declarationContext typed_assign_declaration() {
			return getRuleContext(Typed_assign_declarationContext.class,0);
		}
		public TypedParameterContext(ParameterContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UntypedParameterContext extends ParameterContext {
		public Untyped_assign_declarationContext untyped_assign_declaration() {
			return getRuleContext(Untyped_assign_declarationContext.class,0);
		}
		public UntypedParameterContext(ParameterContext ctx) { copyFrom(ctx); }
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parameter);
		try {
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new TypedParameterContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				typed_assign_declaration();
				}
				break;
			case 2:
				_localctx = new UntypedParameterContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				untyped_assign_declaration();
				}
				break;
			case 3:
				_localctx = new StructDestrutureParameterContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(153);
				match(L_C_BRACK);
				setState(154);
				parameters();
				setState(155);
				match(R_C_BRACK);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode L_C_BRACK() { return getToken(CaliburnParser.L_C_BRACK, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode R_C_BRACK() { return getToken(CaliburnParser.R_C_BRACK, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(L_C_BRACK);
			setState(160);
			statements(0);
			setState(161);
			match(R_C_BRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementsContext extends ParserRuleContext {
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
	 
		public StatementsContext() { }
		public void copyFrom(StatementsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementsAppendContext extends StatementsContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementsAppendContext(StatementsContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementsInitialContext extends StatementsContext {
		public StatementsInitialContext(StatementsContext ctx) { copyFrom(ctx); }
	}

	public final StatementsContext statements() throws RecognitionException {
		return statements(0);
	}

	private StatementsContext statements(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StatementsContext _localctx = new StatementsContext(_ctx, _parentState);
		StatementsContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_statements, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new StatementsInitialContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			}
			_ctx.stop = _input.LT(-1);
			setState(168);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StatementsAppendContext(new StatementsContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_statements);
					setState(164);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(165);
					statement();
					}
					} 
				}
				setState(170);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public Assign_statementContext assign_statement() {
			return getRuleContext(Assign_statementContext.class,0);
		}
		public Expression_statementContext expression_statement() {
			return getRuleContext(Expression_statementContext.class,0);
		}
		public Control_statementContext control_statement() {
			return getRuleContext(Control_statementContext.class,0);
		}
		public Jump_statementContext jump_statement() {
			return getRuleContext(Jump_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_statement);
		try {
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				assign_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				expression_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(173);
				control_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(174);
				jump_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Inline_statementsContext extends ParserRuleContext {
		public Inline_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inline_statements; }
	 
		public Inline_statementsContext() { }
		public void copyFrom(Inline_statementsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InlineStatementsInitialContext extends Inline_statementsContext {
		public InlineStatementsInitialContext(Inline_statementsContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InlineStatementsAppendContext extends Inline_statementsContext {
		public Inline_statementsContext inline_statements() {
			return getRuleContext(Inline_statementsContext.class,0);
		}
		public Inline_statementContext inline_statement() {
			return getRuleContext(Inline_statementContext.class,0);
		}
		public InlineStatementsAppendContext(Inline_statementsContext ctx) { copyFrom(ctx); }
	}

	public final Inline_statementsContext inline_statements() throws RecognitionException {
		return inline_statements(0);
	}

	private Inline_statementsContext inline_statements(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Inline_statementsContext _localctx = new Inline_statementsContext(_ctx, _parentState);
		Inline_statementsContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_inline_statements, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new InlineStatementsInitialContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			}
			_ctx.stop = _input.LT(-1);
			setState(182);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InlineStatementsAppendContext(new Inline_statementsContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_inline_statements);
					setState(178);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(179);
					inline_statement();
					}
					} 
				}
				setState(184);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Inline_statementContext extends ParserRuleContext {
		public Assign_statementContext assign_statement() {
			return getRuleContext(Assign_statementContext.class,0);
		}
		public Expression_statementContext expression_statement() {
			return getRuleContext(Expression_statementContext.class,0);
		}
		public Inline_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inline_statement; }
	}

	public final Inline_statementContext inline_statement() throws RecognitionException {
		Inline_statementContext _localctx = new Inline_statementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_inline_statement);
		try {
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				assign_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				expression_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Jump_statementContext extends ParserRuleContext {
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public Break_statementContext break_statement() {
			return getRuleContext(Break_statementContext.class,0);
		}
		public Continue_statementContext continue_statement() {
			return getRuleContext(Continue_statementContext.class,0);
		}
		public Jump_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jump_statement; }
	}

	public final Jump_statementContext jump_statement() throws RecognitionException {
		Jump_statementContext _localctx = new Jump_statementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_jump_statement);
		try {
			setState(192);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				return_statement();
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				break_statement();
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(191);
				continue_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Return_statementContext extends ParserRuleContext {
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
	 
		public Return_statementContext() { }
		public void copyFrom(Return_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementContext extends Return_statementContext {
		public TerminalNode RETURN() { return getToken(CaliburnParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Terminator() { return getToken(CaliburnParser.Terminator, 0); }
		public ReturnStatementContext(Return_statementContext ctx) { copyFrom(ctx); }
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_return_statement);
		try {
			_localctx = new ReturnStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(RETURN);
			setState(195);
			expression(0);
			setState(196);
			match(Terminator);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Break_statementContext extends ParserRuleContext {
		public Break_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_statement; }
	 
		public Break_statementContext() { }
		public void copyFrom(Break_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BreakStatementContext extends Break_statementContext {
		public TerminalNode BREAK() { return getToken(CaliburnParser.BREAK, 0); }
		public TerminalNode Terminator() { return getToken(CaliburnParser.Terminator, 0); }
		public BreakStatementContext(Break_statementContext ctx) { copyFrom(ctx); }
	}

	public final Break_statementContext break_statement() throws RecognitionException {
		Break_statementContext _localctx = new Break_statementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_break_statement);
		try {
			_localctx = new BreakStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(BREAK);
			setState(199);
			match(Terminator);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Continue_statementContext extends ParserRuleContext {
		public Continue_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continue_statement; }
	 
		public Continue_statementContext() { }
		public void copyFrom(Continue_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ContinueStatementContext extends Continue_statementContext {
		public TerminalNode CONTINUE() { return getToken(CaliburnParser.CONTINUE, 0); }
		public TerminalNode Terminator() { return getToken(CaliburnParser.Terminator, 0); }
		public ContinueStatementContext(Continue_statementContext ctx) { copyFrom(ctx); }
	}

	public final Continue_statementContext continue_statement() throws RecognitionException {
		Continue_statementContext _localctx = new Continue_statementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_continue_statement);
		try {
			_localctx = new ContinueStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(CONTINUE);
			setState(202);
			match(Terminator);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Control_statementContext extends ParserRuleContext {
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public Switch_statementContext switch_statement() {
			return getRuleContext(Switch_statementContext.class,0);
		}
		public Control_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_control_statement; }
	}

	public final Control_statementContext control_statement() throws RecognitionException {
		Control_statementContext _localctx = new Control_statementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_control_statement);
		try {
			setState(207);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				if_statement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				for_statement();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 3);
				{
				setState(206);
				switch_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class If_statementContext extends ParserRuleContext {
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
	 
		public If_statementContext() { }
		public void copyFrom(If_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends If_statementContext {
		public TerminalNode IF() { return getToken(CaliburnParser.IF, 0); }
		public Inline_statementsContext inline_statements() {
			return getRuleContext(Inline_statementsContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfStatementContext(If_statementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfElseStatementContext extends If_statementContext {
		public TerminalNode IF() { return getToken(CaliburnParser.IF, 0); }
		public Inline_statementsContext inline_statements() {
			return getRuleContext(Inline_statementsContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Else_statementContext else_statement() {
			return getRuleContext(Else_statementContext.class,0);
		}
		public IfElseStatementContext(If_statementContext ctx) { copyFrom(ctx); }
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_if_statement);
		try {
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				match(IF);
				setState(210);
				inline_statements(0);
				setState(211);
				expression(0);
				setState(212);
				block();
				}
				break;
			case 2:
				_localctx = new IfElseStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
				match(IF);
				setState(215);
				inline_statements(0);
				setState(216);
				expression(0);
				setState(217);
				block();
				setState(218);
				else_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Else_statementContext extends ParserRuleContext {
		public Else_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_statement; }
	 
		public Else_statementContext() { }
		public void copyFrom(Else_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ElseIfStatementContext extends Else_statementContext {
		public TerminalNode ELSE() { return getToken(CaliburnParser.ELSE, 0); }
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public ElseIfStatementContext(Else_statementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ElseStatementContext extends Else_statementContext {
		public TerminalNode ELSE() { return getToken(CaliburnParser.ELSE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseStatementContext(Else_statementContext ctx) { copyFrom(ctx); }
	}

	public final Else_statementContext else_statement() throws RecognitionException {
		Else_statementContext _localctx = new Else_statementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_else_statement);
		try {
			setState(226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new ElseStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				match(ELSE);
				setState(223);
				block();
				}
				break;
			case 2:
				_localctx = new ElseIfStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(224);
				match(ELSE);
				setState(225);
				if_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class For_statementContext extends ParserRuleContext {
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
	 
		public For_statementContext() { }
		public void copyFrom(For_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementContext extends For_statementContext {
		public TerminalNode FOR() { return getToken(CaliburnParser.FOR, 0); }
		public Inline_statementsContext inline_statements() {
			return getRuleContext(Inline_statementsContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForStatementContext(For_statementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementWithAfterContext extends For_statementContext {
		public TerminalNode FOR() { return getToken(CaliburnParser.FOR, 0); }
		public List<Inline_statementsContext> inline_statements() {
			return getRuleContexts(Inline_statementsContext.class);
		}
		public Inline_statementsContext inline_statements(int i) {
			return getRuleContext(Inline_statementsContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(CaliburnParser.ARROW, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForStatementWithAfterContext(For_statementContext ctx) { copyFrom(ctx); }
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_for_statement);
		try {
			setState(240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new ForStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				match(FOR);
				setState(229);
				inline_statements(0);
				setState(230);
				expression(0);
				setState(231);
				block();
				}
				break;
			case 2:
				_localctx = new ForStatementWithAfterContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				match(FOR);
				setState(234);
				inline_statements(0);
				setState(235);
				expression(0);
				setState(236);
				match(ARROW);
				setState(237);
				inline_statements(0);
				setState(238);
				block();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Switch_statementContext extends ParserRuleContext {
		public Switch_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_statement; }
	 
		public Switch_statementContext() { }
		public void copyFrom(Switch_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SwitchStatementContext extends Switch_statementContext {
		public TerminalNode SWITCH() { return getToken(CaliburnParser.SWITCH, 0); }
		public Inline_statementsContext inline_statements() {
			return getRuleContext(Inline_statementsContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode L_C_BRACK() { return getToken(CaliburnParser.L_C_BRACK, 0); }
		public Case_blocksContext case_blocks() {
			return getRuleContext(Case_blocksContext.class,0);
		}
		public TerminalNode R_C_BRACK() { return getToken(CaliburnParser.R_C_BRACK, 0); }
		public SwitchStatementContext(Switch_statementContext ctx) { copyFrom(ctx); }
	}

	public final Switch_statementContext switch_statement() throws RecognitionException {
		Switch_statementContext _localctx = new Switch_statementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_switch_statement);
		try {
			_localctx = new SwitchStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(SWITCH);
			setState(243);
			inline_statements(0);
			setState(244);
			expression(0);
			setState(245);
			match(L_C_BRACK);
			setState(246);
			case_blocks();
			setState(247);
			match(R_C_BRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Case_blocksContext extends ParserRuleContext {
		public Case_blocksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_blocks; }
	 
		public Case_blocksContext() { }
		public void copyFrom(Case_blocksContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CaseBlocksDefaultContext extends Case_blocksContext {
		public Option_case_blocksContext option_case_blocks() {
			return getRuleContext(Option_case_blocksContext.class,0);
		}
		public Default_case_blockContext default_case_block() {
			return getRuleContext(Default_case_blockContext.class,0);
		}
		public CaseBlocksDefaultContext(Case_blocksContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CaseBlocksContext extends Case_blocksContext {
		public Option_case_blocksContext option_case_blocks() {
			return getRuleContext(Option_case_blocksContext.class,0);
		}
		public CaseBlocksContext(Case_blocksContext ctx) { copyFrom(ctx); }
	}

	public final Case_blocksContext case_blocks() throws RecognitionException {
		Case_blocksContext _localctx = new Case_blocksContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_case_blocks);
		try {
			setState(253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new CaseBlocksContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				option_case_blocks(0);
				}
				break;
			case 2:
				_localctx = new CaseBlocksDefaultContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				option_case_blocks(0);
				setState(251);
				default_case_block();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Option_case_blocksContext extends ParserRuleContext {
		public Option_case_blocksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_option_case_blocks; }
	 
		public Option_case_blocksContext() { }
		public void copyFrom(Option_case_blocksContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OptionCaseBlocksAppendContext extends Option_case_blocksContext {
		public Option_case_blocksContext option_case_blocks() {
			return getRuleContext(Option_case_blocksContext.class,0);
		}
		public Option_case_blockContext option_case_block() {
			return getRuleContext(Option_case_blockContext.class,0);
		}
		public OptionCaseBlocksAppendContext(Option_case_blocksContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OptionCaseBlocksInitialContext extends Option_case_blocksContext {
		public OptionCaseBlocksInitialContext(Option_case_blocksContext ctx) { copyFrom(ctx); }
	}

	public final Option_case_blocksContext option_case_blocks() throws RecognitionException {
		return option_case_blocks(0);
	}

	private Option_case_blocksContext option_case_blocks(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Option_case_blocksContext _localctx = new Option_case_blocksContext(_ctx, _parentState);
		Option_case_blocksContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_option_case_blocks, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new OptionCaseBlocksInitialContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			}
			_ctx.stop = _input.LT(-1);
			setState(260);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OptionCaseBlocksAppendContext(new Option_case_blocksContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_option_case_blocks);
					setState(256);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(257);
					option_case_block();
					}
					} 
				}
				setState(262);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Option_case_blockContext extends ParserRuleContext {
		public Option_case_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_option_case_block; }
	 
		public Option_case_blockContext() { }
		public void copyFrom(Option_case_blockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OptionCaseBlockContext extends Option_case_blockContext {
		public TerminalNode CASE() { return getToken(CaliburnParser.CASE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public OptionCaseBlockContext(Option_case_blockContext ctx) { copyFrom(ctx); }
	}

	public final Option_case_blockContext option_case_block() throws RecognitionException {
		Option_case_blockContext _localctx = new Option_case_blockContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_option_case_block);
		try {
			_localctx = new OptionCaseBlockContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(CASE);
			setState(264);
			expression(0);
			setState(265);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Default_case_blockContext extends ParserRuleContext {
		public Default_case_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_case_block; }
	 
		public Default_case_blockContext() { }
		public void copyFrom(Default_case_blockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DefaultCaseBlockContext extends Default_case_blockContext {
		public TerminalNode DEFAULT() { return getToken(CaliburnParser.DEFAULT, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public DefaultCaseBlockContext(Default_case_blockContext ctx) { copyFrom(ctx); }
	}

	public final Default_case_blockContext default_case_block() throws RecognitionException {
		Default_case_blockContext _localctx = new Default_case_blockContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_default_case_block);
		try {
			_localctx = new DefaultCaseBlockContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(DEFAULT);
			setState(268);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Assign_statementContext extends ParserRuleContext {
		public Assign_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_statement; }
	 
		public Assign_statementContext() { }
		public void copyFrom(Assign_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignOperationStatementContext extends Assign_statementContext {
		public Token op;
		public Assign_expressionsContext assign_expressions() {
			return getRuleContext(Assign_expressionsContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(CaliburnParser.ASSIGN, 0); }
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public TerminalNode Terminator() { return getToken(CaliburnParser.Terminator, 0); }
		public TerminalNode OP_ADD() { return getToken(CaliburnParser.OP_ADD, 0); }
		public TerminalNode OP_SUB() { return getToken(CaliburnParser.OP_SUB, 0); }
		public TerminalNode OP_MUL() { return getToken(CaliburnParser.OP_MUL, 0); }
		public TerminalNode OP_DIV() { return getToken(CaliburnParser.OP_DIV, 0); }
		public TerminalNode OP_MOD() { return getToken(CaliburnParser.OP_MOD, 0); }
		public TerminalNode OP_POW() { return getToken(CaliburnParser.OP_POW, 0); }
		public TerminalNode OP_ROOT() { return getToken(CaliburnParser.OP_ROOT, 0); }
		public TerminalNode OP_OR() { return getToken(CaliburnParser.OP_OR, 0); }
		public TerminalNode OP_XOR() { return getToken(CaliburnParser.OP_XOR, 0); }
		public TerminalNode OP_AND() { return getToken(CaliburnParser.OP_AND, 0); }
		public TerminalNode OP_LSHIFT() { return getToken(CaliburnParser.OP_LSHIFT, 0); }
		public TerminalNode OP_RSHIFT() { return getToken(CaliburnParser.OP_RSHIFT, 0); }
		public AssignOperationStatementContext(Assign_statementContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignStatementContext extends Assign_statementContext {
		public Assign_declarationsContext assign_declarations() {
			return getRuleContext(Assign_declarationsContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(CaliburnParser.ASSIGN, 0); }
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public TerminalNode Terminator() { return getToken(CaliburnParser.Terminator, 0); }
		public AssignStatementContext(Assign_statementContext ctx) { copyFrom(ctx); }
	}

	public final Assign_statementContext assign_statement() throws RecognitionException {
		Assign_statementContext _localctx = new Assign_statementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_assign_statement);
		int _la;
		try {
			setState(281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new AssignStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				assign_declarations(0);
				setState(271);
				match(ASSIGN);
				setState(272);
				expressions(0);
				setState(273);
				match(Terminator);
				}
				break;
			case 2:
				_localctx = new AssignOperationStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(275);
				assign_expressions(0);
				setState(276);
				((AssignOperationStatementContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 562606356037632L) != 0)) ) {
					((AssignOperationStatementContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(277);
				match(ASSIGN);
				setState(278);
				expressions(0);
				setState(279);
				match(Terminator);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Assign_expressionsContext extends ParserRuleContext {
		public Assign_expressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_expressions; }
	 
		public Assign_expressionsContext() { }
		public void copyFrom(Assign_expressionsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignExpressionsAppendContext extends Assign_expressionsContext {
		public Assign_expressionsContext assign_expressions() {
			return getRuleContext(Assign_expressionsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(CaliburnParser.COMMA, 0); }
		public Assign_expressionContext assign_expression() {
			return getRuleContext(Assign_expressionContext.class,0);
		}
		public AssignExpressionsAppendContext(Assign_expressionsContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignExpressionsInitialContext extends Assign_expressionsContext {
		public Assign_expressionContext assign_expression() {
			return getRuleContext(Assign_expressionContext.class,0);
		}
		public AssignExpressionsInitialContext(Assign_expressionsContext ctx) { copyFrom(ctx); }
	}

	public final Assign_expressionsContext assign_expressions() throws RecognitionException {
		return assign_expressions(0);
	}

	private Assign_expressionsContext assign_expressions(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Assign_expressionsContext _localctx = new Assign_expressionsContext(_ctx, _parentState);
		Assign_expressionsContext _prevctx = _localctx;
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_assign_expressions, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new AssignExpressionsInitialContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(284);
			assign_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(291);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AssignExpressionsAppendContext(new Assign_expressionsContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_assign_expressions);
					setState(286);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(287);
					match(COMMA);
					setState(288);
					assign_expression();
					}
					} 
				}
				setState(293);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Aliasable_assign_expressionsContext extends ParserRuleContext {
		public Aliasable_assign_expressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aliasable_assign_expressions; }
	 
		public Aliasable_assign_expressionsContext() { }
		public void copyFrom(Aliasable_assign_expressionsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AliasableAssignExpressionsInitialContext extends Aliasable_assign_expressionsContext {
		public Aliasable_assign_expressionContext aliasable_assign_expression() {
			return getRuleContext(Aliasable_assign_expressionContext.class,0);
		}
		public AliasableAssignExpressionsInitialContext(Aliasable_assign_expressionsContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AliasableAssignExpressionsAppendContext extends Aliasable_assign_expressionsContext {
		public Aliasable_assign_expressionsContext aliasable_assign_expressions() {
			return getRuleContext(Aliasable_assign_expressionsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(CaliburnParser.COMMA, 0); }
		public Aliasable_assign_expressionContext aliasable_assign_expression() {
			return getRuleContext(Aliasable_assign_expressionContext.class,0);
		}
		public AliasableAssignExpressionsAppendContext(Aliasable_assign_expressionsContext ctx) { copyFrom(ctx); }
	}

	public final Aliasable_assign_expressionsContext aliasable_assign_expressions() throws RecognitionException {
		return aliasable_assign_expressions(0);
	}

	private Aliasable_assign_expressionsContext aliasable_assign_expressions(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Aliasable_assign_expressionsContext _localctx = new Aliasable_assign_expressionsContext(_ctx, _parentState);
		Aliasable_assign_expressionsContext _prevctx = _localctx;
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_aliasable_assign_expressions, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new AliasableAssignExpressionsInitialContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(295);
			aliasable_assign_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(302);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AliasableAssignExpressionsAppendContext(new Aliasable_assign_expressionsContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_aliasable_assign_expressions);
					setState(297);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(298);
					match(COMMA);
					setState(299);
					aliasable_assign_expression();
					}
					} 
				}
				setState(304);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Aliasable_assign_expressionContext extends ParserRuleContext {
		public Aliasable_assign_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aliasable_assign_expression; }
	 
		public Aliasable_assign_expressionContext() { }
		public void copyFrom(Aliasable_assign_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaliasedAssignExpressionContext extends Aliasable_assign_expressionContext {
		public Assign_expressionContext assign_expression() {
			return getRuleContext(Assign_expressionContext.class,0);
		}
		public UnaliasedAssignExpressionContext(Aliasable_assign_expressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AliasedAssignExpressionContext extends Aliasable_assign_expressionContext {
		public Assign_expressionContext assign_expression() {
			return getRuleContext(Assign_expressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(CaliburnParser.COLON, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AliasedAssignExpressionContext(Aliasable_assign_expressionContext ctx) { copyFrom(ctx); }
	}

	public final Aliasable_assign_expressionContext aliasable_assign_expression() throws RecognitionException {
		Aliasable_assign_expressionContext _localctx = new Aliasable_assign_expressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_aliasable_assign_expression);
		try {
			setState(310);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new AliasedAssignExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(305);
				assign_expression();
				setState(306);
				match(COLON);
				setState(307);
				identifier();
				}
				break;
			case 2:
				_localctx = new UnaliasedAssignExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
				assign_expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Assign_expressionContext extends ParserRuleContext {
		public Assign_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_expression; }
	 
		public Assign_expressionContext() { }
		public void copyFrom(Assign_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionAssignExpressionContext extends Assign_expressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionAssignExpressionContext(Assign_expressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StructDestrutureAssignExpressionContext extends Assign_expressionContext {
		public TerminalNode L_C_BRACK() { return getToken(CaliburnParser.L_C_BRACK, 0); }
		public Aliasable_assign_expressionsContext aliasable_assign_expressions() {
			return getRuleContext(Aliasable_assign_expressionsContext.class,0);
		}
		public TerminalNode R_C_BRACK() { return getToken(CaliburnParser.R_C_BRACK, 0); }
		public StructDestrutureAssignExpressionContext(Assign_expressionContext ctx) { copyFrom(ctx); }
	}

	public final Assign_expressionContext assign_expression() throws RecognitionException {
		Assign_expressionContext _localctx = new Assign_expressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_assign_expression);
		try {
			setState(317);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNC:
			case STRUCT:
			case TUPLE:
			case L_PAREN:
			case OP_ADD:
			case OP_SUB:
			case OP_NOT:
			case IdentifierToken:
			case LiteralToken:
				_localctx = new ExpressionAssignExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(312);
				expression(0);
				}
				break;
			case L_C_BRACK:
				_localctx = new StructDestrutureAssignExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(313);
				match(L_C_BRACK);
				setState(314);
				aliasable_assign_expressions(0);
				setState(315);
				match(R_C_BRACK);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Assign_declarationsContext extends ParserRuleContext {
		public Assign_declarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_declarations; }
	 
		public Assign_declarationsContext() { }
		public void copyFrom(Assign_declarationsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignDeclarationsAppendContext extends Assign_declarationsContext {
		public Assign_declarationsContext assign_declarations() {
			return getRuleContext(Assign_declarationsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(CaliburnParser.COMMA, 0); }
		public Assign_statementContext assign_statement() {
			return getRuleContext(Assign_statementContext.class,0);
		}
		public AssignDeclarationsAppendContext(Assign_declarationsContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignDeclarationsInitialContext extends Assign_declarationsContext {
		public Assign_declarationContext assign_declaration() {
			return getRuleContext(Assign_declarationContext.class,0);
		}
		public AssignDeclarationsInitialContext(Assign_declarationsContext ctx) { copyFrom(ctx); }
	}

	public final Assign_declarationsContext assign_declarations() throws RecognitionException {
		return assign_declarations(0);
	}

	private Assign_declarationsContext assign_declarations(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Assign_declarationsContext _localctx = new Assign_declarationsContext(_ctx, _parentState);
		Assign_declarationsContext _prevctx = _localctx;
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_assign_declarations, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new AssignDeclarationsInitialContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(320);
			assign_declaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(327);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AssignDeclarationsAppendContext(new Assign_declarationsContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_assign_declarations);
					setState(322);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(323);
					match(COMMA);
					setState(324);
					assign_statement();
					}
					} 
				}
				setState(329);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Aliasable_assign_declarationsContext extends ParserRuleContext {
		public Aliasable_assign_declarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aliasable_assign_declarations; }
	 
		public Aliasable_assign_declarationsContext() { }
		public void copyFrom(Aliasable_assign_declarationsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AliasableAssignDeclarationsAppendContext extends Aliasable_assign_declarationsContext {
		public Aliasable_assign_declarationsContext aliasable_assign_declarations() {
			return getRuleContext(Aliasable_assign_declarationsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(CaliburnParser.COMMA, 0); }
		public Aliasable_assign_declarationContext aliasable_assign_declaration() {
			return getRuleContext(Aliasable_assign_declarationContext.class,0);
		}
		public AliasableAssignDeclarationsAppendContext(Aliasable_assign_declarationsContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AliasableAssignDeclarationsInitialContext extends Aliasable_assign_declarationsContext {
		public Aliasable_assign_declarationContext aliasable_assign_declaration() {
			return getRuleContext(Aliasable_assign_declarationContext.class,0);
		}
		public AliasableAssignDeclarationsInitialContext(Aliasable_assign_declarationsContext ctx) { copyFrom(ctx); }
	}

	public final Aliasable_assign_declarationsContext aliasable_assign_declarations() throws RecognitionException {
		return aliasable_assign_declarations(0);
	}

	private Aliasable_assign_declarationsContext aliasable_assign_declarations(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Aliasable_assign_declarationsContext _localctx = new Aliasable_assign_declarationsContext(_ctx, _parentState);
		Aliasable_assign_declarationsContext _prevctx = _localctx;
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_aliasable_assign_declarations, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new AliasableAssignDeclarationsInitialContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(331);
			aliasable_assign_declaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(338);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AliasableAssignDeclarationsAppendContext(new Aliasable_assign_declarationsContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_aliasable_assign_declarations);
					setState(333);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(334);
					match(COMMA);
					setState(335);
					aliasable_assign_declaration();
					}
					} 
				}
				setState(340);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Aliasable_assign_declarationContext extends ParserRuleContext {
		public Aliasable_assign_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aliasable_assign_declaration; }
	 
		public Aliasable_assign_declarationContext() { }
		public void copyFrom(Aliasable_assign_declarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaliasedAssignDeclarationContext extends Aliasable_assign_declarationContext {
		public Assign_declarationContext assign_declaration() {
			return getRuleContext(Assign_declarationContext.class,0);
		}
		public UnaliasedAssignDeclarationContext(Aliasable_assign_declarationContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AliasedAssignDeclarationContext extends Aliasable_assign_declarationContext {
		public Assign_declarationContext assign_declaration() {
			return getRuleContext(Assign_declarationContext.class,0);
		}
		public TerminalNode COLON() { return getToken(CaliburnParser.COLON, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AliasedAssignDeclarationContext(Aliasable_assign_declarationContext ctx) { copyFrom(ctx); }
	}

	public final Aliasable_assign_declarationContext aliasable_assign_declaration() throws RecognitionException {
		Aliasable_assign_declarationContext _localctx = new Aliasable_assign_declarationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_aliasable_assign_declaration);
		try {
			setState(346);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				_localctx = new AliasedAssignDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(341);
				assign_declaration();
				setState(342);
				match(COLON);
				setState(343);
				identifier();
				}
				break;
			case 2:
				_localctx = new UnaliasedAssignDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(345);
				assign_declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Assign_declarationContext extends ParserRuleContext {
		public Assign_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_declaration; }
	 
		public Assign_declarationContext() { }
		public void copyFrom(Assign_declarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionAssignDeclarationContext extends Assign_declarationContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionAssignDeclarationContext(Assign_declarationContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UntypedAssignDeclarationDeclarationContext extends Assign_declarationContext {
		public TerminalNode VAR() { return getToken(CaliburnParser.VAR, 0); }
		public Untyped_assign_declarationContext untyped_assign_declaration() {
			return getRuleContext(Untyped_assign_declarationContext.class,0);
		}
		public UntypedAssignDeclarationDeclarationContext(Assign_declarationContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypedAssignDeclarationDeclarationContext extends Assign_declarationContext {
		public Typed_assign_declarationContext typed_assign_declaration() {
			return getRuleContext(Typed_assign_declarationContext.class,0);
		}
		public TypedAssignDeclarationDeclarationContext(Assign_declarationContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StructDestrutureAssignDeclarationContext extends Assign_declarationContext {
		public TerminalNode L_C_BRACK() { return getToken(CaliburnParser.L_C_BRACK, 0); }
		public Aliasable_assign_declarationsContext aliasable_assign_declarations() {
			return getRuleContext(Aliasable_assign_declarationsContext.class,0);
		}
		public TerminalNode R_C_BRACK() { return getToken(CaliburnParser.R_C_BRACK, 0); }
		public StructDestrutureAssignDeclarationContext(Assign_declarationContext ctx) { copyFrom(ctx); }
	}

	public final Assign_declarationContext assign_declaration() throws RecognitionException {
		Assign_declarationContext _localctx = new Assign_declarationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_assign_declaration);
		try {
			setState(356);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				_localctx = new ExpressionAssignDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(348);
				expression(0);
				}
				break;
			case 2:
				_localctx = new TypedAssignDeclarationDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(349);
				typed_assign_declaration();
				}
				break;
			case 3:
				_localctx = new UntypedAssignDeclarationDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(350);
				match(VAR);
				setState(351);
				untyped_assign_declaration();
				}
				break;
			case 4:
				_localctx = new StructDestrutureAssignDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(352);
				match(L_C_BRACK);
				setState(353);
				aliasable_assign_declarations(0);
				setState(354);
				match(R_C_BRACK);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Typed_assign_declarationContext extends ParserRuleContext {
		public Typed_assign_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typed_assign_declaration; }
	 
		public Typed_assign_declarationContext() { }
		public void copyFrom(Typed_assign_declarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypedAssignDeclarationContext extends Typed_assign_declarationContext {
		public Type_expressionContext type_expression() {
			return getRuleContext(Type_expressionContext.class,0);
		}
		public Untyped_assign_declarationContext untyped_assign_declaration() {
			return getRuleContext(Untyped_assign_declarationContext.class,0);
		}
		public TypedAssignDeclarationContext(Typed_assign_declarationContext ctx) { copyFrom(ctx); }
	}

	public final Typed_assign_declarationContext typed_assign_declaration() throws RecognitionException {
		Typed_assign_declarationContext _localctx = new Typed_assign_declarationContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_typed_assign_declaration);
		try {
			_localctx = new TypedAssignDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			type_expression(0);
			setState(359);
			untyped_assign_declaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Aliasable_untyped_assign_declarationsContext extends ParserRuleContext {
		public Aliasable_untyped_assign_declarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aliasable_untyped_assign_declarations; }
	 
		public Aliasable_untyped_assign_declarationsContext() { }
		public void copyFrom(Aliasable_untyped_assign_declarationsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AliasableUntypedAssignDeclarationsInitialContext extends Aliasable_untyped_assign_declarationsContext {
		public Aliasable_untyped_assign_declarationContext aliasable_untyped_assign_declaration() {
			return getRuleContext(Aliasable_untyped_assign_declarationContext.class,0);
		}
		public AliasableUntypedAssignDeclarationsInitialContext(Aliasable_untyped_assign_declarationsContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AliasableUntypedAssignDeclarationsAppendContext extends Aliasable_untyped_assign_declarationsContext {
		public Aliasable_untyped_assign_declarationsContext aliasable_untyped_assign_declarations() {
			return getRuleContext(Aliasable_untyped_assign_declarationsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(CaliburnParser.COMMA, 0); }
		public Aliasable_untyped_assign_declarationContext aliasable_untyped_assign_declaration() {
			return getRuleContext(Aliasable_untyped_assign_declarationContext.class,0);
		}
		public AliasableUntypedAssignDeclarationsAppendContext(Aliasable_untyped_assign_declarationsContext ctx) { copyFrom(ctx); }
	}

	public final Aliasable_untyped_assign_declarationsContext aliasable_untyped_assign_declarations() throws RecognitionException {
		return aliasable_untyped_assign_declarations(0);
	}

	private Aliasable_untyped_assign_declarationsContext aliasable_untyped_assign_declarations(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Aliasable_untyped_assign_declarationsContext _localctx = new Aliasable_untyped_assign_declarationsContext(_ctx, _parentState);
		Aliasable_untyped_assign_declarationsContext _prevctx = _localctx;
		int _startState = 70;
		enterRecursionRule(_localctx, 70, RULE_aliasable_untyped_assign_declarations, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new AliasableUntypedAssignDeclarationsInitialContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(362);
			aliasable_untyped_assign_declaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(369);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AliasableUntypedAssignDeclarationsAppendContext(new Aliasable_untyped_assign_declarationsContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_aliasable_untyped_assign_declarations);
					setState(364);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(365);
					match(COMMA);
					setState(366);
					aliasable_untyped_assign_declaration();
					}
					} 
				}
				setState(371);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Aliasable_untyped_assign_declarationContext extends ParserRuleContext {
		public Aliasable_untyped_assign_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aliasable_untyped_assign_declaration; }
	 
		public Aliasable_untyped_assign_declarationContext() { }
		public void copyFrom(Aliasable_untyped_assign_declarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaliasedUntypedAssignDeclarationContext extends Aliasable_untyped_assign_declarationContext {
		public Untyped_assign_declarationContext untyped_assign_declaration() {
			return getRuleContext(Untyped_assign_declarationContext.class,0);
		}
		public UnaliasedUntypedAssignDeclarationContext(Aliasable_untyped_assign_declarationContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AliasedUntypedAssignDeclarationContext extends Aliasable_untyped_assign_declarationContext {
		public Untyped_assign_declarationContext untyped_assign_declaration() {
			return getRuleContext(Untyped_assign_declarationContext.class,0);
		}
		public TerminalNode COLON() { return getToken(CaliburnParser.COLON, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AliasedUntypedAssignDeclarationContext(Aliasable_untyped_assign_declarationContext ctx) { copyFrom(ctx); }
	}

	public final Aliasable_untyped_assign_declarationContext aliasable_untyped_assign_declaration() throws RecognitionException {
		Aliasable_untyped_assign_declarationContext _localctx = new Aliasable_untyped_assign_declarationContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_aliasable_untyped_assign_declaration);
		try {
			setState(377);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				_localctx = new AliasedUntypedAssignDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(372);
				untyped_assign_declaration();
				setState(373);
				match(COLON);
				setState(374);
				identifier();
				}
				break;
			case 2:
				_localctx = new UnaliasedUntypedAssignDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(376);
				untyped_assign_declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Untyped_assign_declarationContext extends ParserRuleContext {
		public Untyped_assign_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_untyped_assign_declaration; }
	 
		public Untyped_assign_declarationContext() { }
		public void copyFrom(Untyped_assign_declarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UntypedIdentifierAssignDeclarationContext extends Untyped_assign_declarationContext {
		public IdentifierContext var;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public UntypedIdentifierAssignDeclarationContext(Untyped_assign_declarationContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UntypedStructDestrutureAssignDeclarationContext extends Untyped_assign_declarationContext {
		public TerminalNode L_C_BRACK() { return getToken(CaliburnParser.L_C_BRACK, 0); }
		public Aliasable_untyped_assign_declarationsContext aliasable_untyped_assign_declarations() {
			return getRuleContext(Aliasable_untyped_assign_declarationsContext.class,0);
		}
		public TerminalNode R_C_BRACK() { return getToken(CaliburnParser.R_C_BRACK, 0); }
		public UntypedStructDestrutureAssignDeclarationContext(Untyped_assign_declarationContext ctx) { copyFrom(ctx); }
	}

	public final Untyped_assign_declarationContext untyped_assign_declaration() throws RecognitionException {
		Untyped_assign_declarationContext _localctx = new Untyped_assign_declarationContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_untyped_assign_declaration);
		try {
			setState(384);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IdentifierToken:
				_localctx = new UntypedIdentifierAssignDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(379);
				((UntypedIdentifierAssignDeclarationContext)_localctx).var = identifier();
				}
				break;
			case L_C_BRACK:
				_localctx = new UntypedStructDestrutureAssignDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(380);
				match(L_C_BRACK);
				setState(381);
				aliasable_untyped_assign_declarations(0);
				setState(382);
				match(R_C_BRACK);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expression_statementContext extends ParserRuleContext {
		public Expression_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_statement; }
	 
		public Expression_statementContext() { }
		public void copyFrom(Expression_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStatementContext extends Expression_statementContext {
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public TerminalNode Terminator() { return getToken(CaliburnParser.Terminator, 0); }
		public ExpressionStatementContext(Expression_statementContext ctx) { copyFrom(ctx); }
	}

	public final Expression_statementContext expression_statement() throws RecognitionException {
		Expression_statementContext _localctx = new Expression_statementContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_expression_statement);
		try {
			_localctx = new ExpressionStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			expressions(0);
			setState(387);
			match(Terminator);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionsContext extends ParserRuleContext {
		public ExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressions; }
	 
		public ExpressionsContext() { }
		public void copyFrom(ExpressionsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionsInitialContext extends ExpressionsContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionsInitialContext(ExpressionsContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionsAppendContext extends ExpressionsContext {
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(CaliburnParser.COMMA, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionsAppendContext(ExpressionsContext ctx) { copyFrom(ctx); }
	}

	public final ExpressionsContext expressions() throws RecognitionException {
		return expressions(0);
	}

	private ExpressionsContext expressions(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionsContext _localctx = new ExpressionsContext(_ctx, _parentState);
		ExpressionsContext _prevctx = _localctx;
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_expressions, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ExpressionsInitialContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(390);
			expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(397);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionsAppendContext(new ExpressionsContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expressions);
					setState(392);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(393);
					match(COMMA);
					setState(394);
					expression(0);
					}
					} 
				}
				setState(399);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expressions_optionalContext extends ParserRuleContext {
		public Expressions_optionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressions_optional; }
	 
		public Expressions_optionalContext() { }
		public void copyFrom(Expressions_optionalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionsOptionalContext extends Expressions_optionalContext {
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public ExpressionsOptionalContext(Expressions_optionalContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionsOptionalNoneContext extends Expressions_optionalContext {
		public ExpressionsOptionalNoneContext(Expressions_optionalContext ctx) { copyFrom(ctx); }
	}

	public final Expressions_optionalContext expressions_optional() throws RecognitionException {
		Expressions_optionalContext _localctx = new Expressions_optionalContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_expressions_optional);
		try {
			setState(402);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNC:
			case STRUCT:
			case TUPLE:
			case L_PAREN:
			case OP_ADD:
			case OP_SUB:
			case OP_NOT:
			case IdentifierToken:
			case LiteralToken:
				_localctx = new ExpressionsOptionalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(400);
				expressions(0);
				}
				break;
			case R_PAREN:
			case R_C_BRACK:
				_localctx = new ExpressionsOptionalNoneContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BracketedExpressionContext extends ExpressionContext {
		public TerminalNode L_PAREN() { return getToken(CaliburnParser.L_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(CaliburnParser.R_PAREN, 0); }
		public BracketedExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LiteralExpressionContext extends ExpressionContext {
		public Literal_atomContext literal_atom() {
			return getRuleContext(Literal_atomContext.class,0);
		}
		public LiteralExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SliceExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode L_S_BRACK() { return getToken(CaliburnParser.L_S_BRACK, 0); }
		public TerminalNode COLON() { return getToken(CaliburnParser.COLON, 0); }
		public TerminalNode R_S_BRACK() { return getToken(CaliburnParser.R_S_BRACK, 0); }
		public SliceExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IndexExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode L_S_BRACK() { return getToken(CaliburnParser.L_S_BRACK, 0); }
		public TerminalNode R_S_BRACK() { return getToken(CaliburnParser.R_S_BRACK, 0); }
		public IndexExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryExpressionContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode OP_NOT() { return getToken(CaliburnParser.OP_NOT, 0); }
		public TerminalNode OP_ADD() { return getToken(CaliburnParser.OP_ADD, 0); }
		public TerminalNode OP_SUB() { return getToken(CaliburnParser.OP_SUB, 0); }
		public UnaryExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AccessExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PERIOD() { return getToken(CaliburnParser.PERIOD, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AccessExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SliceEndExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode L_S_BRACK() { return getToken(CaliburnParser.L_S_BRACK, 0); }
		public TerminalNode COLON() { return getToken(CaliburnParser.COLON, 0); }
		public TerminalNode R_S_BRACK() { return getToken(CaliburnParser.R_S_BRACK, 0); }
		public SliceEndExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierExpressionContext extends ExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IdentifierExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionExpressionContext extends ExpressionContext {
		public Function_typeContext function_type() {
			return getRuleContext(Function_typeContext.class,0);
		}
		public TerminalNode L_PAREN() { return getToken(CaliburnParser.L_PAREN, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(CaliburnParser.R_PAREN, 0); }
		public Type_expressionContext type_expression() {
			return getRuleContext(Type_expressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FunctionExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StructExpressionContext extends ExpressionContext {
		public Struct_typeContext struct_type() {
			return getRuleContext(Struct_typeContext.class,0);
		}
		public TerminalNode L_C_BRACK() { return getToken(CaliburnParser.L_C_BRACK, 0); }
		public Struct_valuesContext struct_values() {
			return getRuleContext(Struct_valuesContext.class,0);
		}
		public TerminalNode R_C_BRACK() { return getToken(CaliburnParser.R_C_BRACK, 0); }
		public StructExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinaryExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OP_POW() { return getToken(CaliburnParser.OP_POW, 0); }
		public TerminalNode OP_ROOT() { return getToken(CaliburnParser.OP_ROOT, 0); }
		public TerminalNode OP_MUL() { return getToken(CaliburnParser.OP_MUL, 0); }
		public TerminalNode OP_DIV() { return getToken(CaliburnParser.OP_DIV, 0); }
		public TerminalNode OP_MOD() { return getToken(CaliburnParser.OP_MOD, 0); }
		public TerminalNode OP_ADD() { return getToken(CaliburnParser.OP_ADD, 0); }
		public TerminalNode OP_SUB() { return getToken(CaliburnParser.OP_SUB, 0); }
		public TerminalNode OP_LSHIFT() { return getToken(CaliburnParser.OP_LSHIFT, 0); }
		public TerminalNode OP_RSHIFT() { return getToken(CaliburnParser.OP_RSHIFT, 0); }
		public TerminalNode OP_EQU() { return getToken(CaliburnParser.OP_EQU, 0); }
		public TerminalNode OP_NEQ() { return getToken(CaliburnParser.OP_NEQ, 0); }
		public TerminalNode OP_LTE() { return getToken(CaliburnParser.OP_LTE, 0); }
		public TerminalNode OP_GTE() { return getToken(CaliburnParser.OP_GTE, 0); }
		public TerminalNode OP_LST() { return getToken(CaliburnParser.OP_LST, 0); }
		public TerminalNode OP_GRT() { return getToken(CaliburnParser.OP_GRT, 0); }
		public TerminalNode OP_AND() { return getToken(CaliburnParser.OP_AND, 0); }
		public TerminalNode OP_XOR() { return getToken(CaliburnParser.OP_XOR, 0); }
		public TerminalNode OP_OR() { return getToken(CaliburnParser.OP_OR, 0); }
		public BinaryExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SliceStartExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode L_S_BRACK() { return getToken(CaliburnParser.L_S_BRACK, 0); }
		public TerminalNode COLON() { return getToken(CaliburnParser.COLON, 0); }
		public TerminalNode R_S_BRACK() { return getToken(CaliburnParser.R_S_BRACK, 0); }
		public SliceStartExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionExpressionNoReturnTypeContext extends ExpressionContext {
		public Function_typeContext function_type() {
			return getRuleContext(Function_typeContext.class,0);
		}
		public TerminalNode L_PAREN() { return getToken(CaliburnParser.L_PAREN, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(CaliburnParser.R_PAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FunctionExpressionNoReturnTypeContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CollectionExpressionContext extends ExpressionContext {
		public Type_expressionContext type_expression() {
			return getRuleContext(Type_expressionContext.class,0);
		}
		public TerminalNode L_S_BRACK() { return getToken(CaliburnParser.L_S_BRACK, 0); }
		public Collection_valuesContext collection_values() {
			return getRuleContext(Collection_valuesContext.class,0);
		}
		public TerminalNode R_S_BRACK() { return getToken(CaliburnParser.R_S_BRACK, 0); }
		public CollectionExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CallExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode L_PAREN() { return getToken(CaliburnParser.L_PAREN, 0); }
		public Expressions_optionalContext expressions_optional() {
			return getRuleContext(Expressions_optionalContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(CaliburnParser.R_PAREN, 0); }
		public CallExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 82;
		enterRecursionRule(_localctx, 82, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				_localctx = new BracketedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(405);
				match(L_PAREN);
				setState(406);
				expression(0);
				setState(407);
				match(R_PAREN);
				}
				break;
			case 2:
				{
				_localctx = new UnaryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(409);
				((UnaryExpressionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 481036337152L) != 0)) ) {
					((UnaryExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(410);
				expression(20);
				}
				break;
			case 3:
				{
				_localctx = new IdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(411);
				identifier();
				}
				break;
			case 4:
				{
				_localctx = new LiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(412);
				literal_atom();
				}
				break;
			case 5:
				{
				_localctx = new FunctionExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(413);
				function_type();
				setState(414);
				match(L_PAREN);
				setState(415);
				parameters();
				setState(416);
				match(R_PAREN);
				setState(417);
				type_expression(0);
				setState(418);
				block();
				}
				break;
			case 6:
				{
				_localctx = new FunctionExpressionNoReturnTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(420);
				function_type();
				setState(421);
				match(L_PAREN);
				setState(422);
				parameters();
				setState(423);
				match(R_PAREN);
				setState(424);
				block();
				}
				break;
			case 7:
				{
				_localctx = new StructExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(426);
				struct_type();
				setState(427);
				match(L_C_BRACK);
				setState(428);
				struct_values();
				setState(429);
				match(R_C_BRACK);
				}
				break;
			case 8:
				{
				_localctx = new CollectionExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(431);
				type_expression(0);
				setState(432);
				match(L_S_BRACK);
				setState(433);
				collection_values(0);
				setState(434);
				match(R_S_BRACK);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(496);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(494);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(438);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(439);
						((BinaryExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==OP_POW || _la==OP_ROOT) ) {
							((BinaryExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(440);
						expression(22);
						}
						break;
					case 2:
						{
						_localctx = new BinaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(441);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(442);
						((BinaryExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3848290697216L) != 0)) ) {
							((BinaryExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(443);
						expression(20);
						}
						break;
					case 3:
						{
						_localctx = new BinaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(444);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(445);
						((BinaryExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==OP_ADD || _la==OP_SUB) ) {
							((BinaryExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(446);
						expression(19);
						}
						break;
					case 4:
						{
						_localctx = new BinaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(447);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(448);
						((BinaryExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==OP_LSHIFT || _la==OP_RSHIFT) ) {
							((BinaryExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(449);
						expression(18);
						}
						break;
					case 5:
						{
						_localctx = new BinaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(450);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(451);
						((BinaryExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 35465847065542656L) != 0)) ) {
							((BinaryExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(452);
						expression(17);
						}
						break;
					case 6:
						{
						_localctx = new BinaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(453);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(454);
						((BinaryExpressionContext)_localctx).op = match(OP_AND);
						setState(455);
						expression(16);
						}
						break;
					case 7:
						{
						_localctx = new BinaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(456);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(457);
						((BinaryExpressionContext)_localctx).op = match(OP_XOR);
						setState(458);
						expression(15);
						}
						break;
					case 8:
						{
						_localctx = new BinaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(459);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(460);
						((BinaryExpressionContext)_localctx).op = match(OP_OR);
						setState(461);
						expression(14);
						}
						break;
					case 9:
						{
						_localctx = new CallExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(462);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(463);
						match(L_PAREN);
						setState(464);
						expressions_optional();
						setState(465);
						match(R_PAREN);
						}
						break;
					case 10:
						{
						_localctx = new AccessExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(467);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(468);
						match(PERIOD);
						setState(469);
						identifier();
						}
						break;
					case 11:
						{
						_localctx = new IndexExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(470);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(471);
						match(L_S_BRACK);
						setState(472);
						expression(0);
						setState(473);
						match(R_S_BRACK);
						}
						break;
					case 12:
						{
						_localctx = new SliceStartExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(475);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(476);
						match(L_S_BRACK);
						setState(477);
						expression(0);
						setState(478);
						match(COLON);
						setState(479);
						match(R_S_BRACK);
						}
						break;
					case 13:
						{
						_localctx = new SliceEndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(481);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(482);
						match(L_S_BRACK);
						setState(483);
						match(COLON);
						setState(484);
						expression(0);
						setState(485);
						match(R_S_BRACK);
						}
						break;
					case 14:
						{
						_localctx = new SliceExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(487);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(488);
						match(L_S_BRACK);
						setState(489);
						expression(0);
						setState(490);
						match(COLON);
						setState(491);
						expression(0);
						setState(492);
						match(R_S_BRACK);
						}
						break;
					}
					} 
				}
				setState(498);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Struct_valuesContext extends ParserRuleContext {
		public Struct_valuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_values; }
	 
		public Struct_valuesContext() { }
		public void copyFrom(Struct_valuesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StructValuesUnamedContext extends Struct_valuesContext {
		public Expressions_optionalContext expressions_optional() {
			return getRuleContext(Expressions_optionalContext.class,0);
		}
		public StructValuesUnamedContext(Struct_valuesContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StructValuesNamedContext extends Struct_valuesContext {
		public Named_struct_valuesContext named_struct_values() {
			return getRuleContext(Named_struct_valuesContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(CaliburnParser.COMMA, 0); }
		public StructValuesNamedContext(Struct_valuesContext ctx) { copyFrom(ctx); }
	}

	public final Struct_valuesContext struct_values() throws RecognitionException {
		Struct_valuesContext _localctx = new Struct_valuesContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_struct_values);
		try {
			setState(504);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				_localctx = new StructValuesNamedContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(499);
				named_struct_values(0);
				}
				break;
			case 2:
				_localctx = new StructValuesNamedContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(500);
				named_struct_values(0);
				setState(501);
				match(COMMA);
				}
				break;
			case 3:
				_localctx = new StructValuesUnamedContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(503);
				expressions_optional();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Named_struct_valuesContext extends ParserRuleContext {
		public Named_struct_valuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_named_struct_values; }
	 
		public Named_struct_valuesContext() { }
		public void copyFrom(Named_struct_valuesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NamedStructValuesAppendContext extends Named_struct_valuesContext {
		public Named_struct_valuesContext named_struct_values() {
			return getRuleContext(Named_struct_valuesContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(CaliburnParser.COMMA, 0); }
		public Named_struct_valueContext named_struct_value() {
			return getRuleContext(Named_struct_valueContext.class,0);
		}
		public NamedStructValuesAppendContext(Named_struct_valuesContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NamedStructValuesInitialContext extends Named_struct_valuesContext {
		public Named_struct_valueContext named_struct_value() {
			return getRuleContext(Named_struct_valueContext.class,0);
		}
		public NamedStructValuesInitialContext(Named_struct_valuesContext ctx) { copyFrom(ctx); }
	}

	public final Named_struct_valuesContext named_struct_values() throws RecognitionException {
		return named_struct_values(0);
	}

	private Named_struct_valuesContext named_struct_values(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Named_struct_valuesContext _localctx = new Named_struct_valuesContext(_ctx, _parentState);
		Named_struct_valuesContext _prevctx = _localctx;
		int _startState = 86;
		enterRecursionRule(_localctx, 86, RULE_named_struct_values, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new NamedStructValuesInitialContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(507);
			named_struct_value();
			}
			_ctx.stop = _input.LT(-1);
			setState(514);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NamedStructValuesAppendContext(new Named_struct_valuesContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_named_struct_values);
					setState(509);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(510);
					match(COMMA);
					setState(511);
					named_struct_value();
					}
					} 
				}
				setState(516);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Named_struct_valueContext extends ParserRuleContext {
		public Named_struct_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_named_struct_value; }
	 
		public Named_struct_valueContext() { }
		public void copyFrom(Named_struct_valueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NamedStructValueContext extends Named_struct_valueContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(CaliburnParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NamedStructValueContext(Named_struct_valueContext ctx) { copyFrom(ctx); }
	}

	public final Named_struct_valueContext named_struct_value() throws RecognitionException {
		Named_struct_valueContext _localctx = new Named_struct_valueContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_named_struct_value);
		try {
			_localctx = new NamedStructValueContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			identifier();
			setState(518);
			match(COLON);
			setState(519);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Collection_valuesContext extends ParserRuleContext {
		public Collection_valuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collection_values; }
	 
		public Collection_valuesContext() { }
		public void copyFrom(Collection_valuesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CollectionValuesInitialContext extends Collection_valuesContext {
		public CollectionValuesInitialContext(Collection_valuesContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CollectionValuesAppendContext extends Collection_valuesContext {
		public Collection_valuesContext collection_values() {
			return getRuleContext(Collection_valuesContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(CaliburnParser.COMMA, 0); }
		public Collection_valueContext collection_value() {
			return getRuleContext(Collection_valueContext.class,0);
		}
		public CollectionValuesAppendContext(Collection_valuesContext ctx) { copyFrom(ctx); }
	}

	public final Collection_valuesContext collection_values() throws RecognitionException {
		return collection_values(0);
	}

	private Collection_valuesContext collection_values(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Collection_valuesContext _localctx = new Collection_valuesContext(_ctx, _parentState);
		Collection_valuesContext _prevctx = _localctx;
		int _startState = 90;
		enterRecursionRule(_localctx, 90, RULE_collection_values, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new CollectionValuesInitialContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			}
			_ctx.stop = _input.LT(-1);
			setState(527);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CollectionValuesAppendContext(new Collection_valuesContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_collection_values);
					setState(522);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(523);
					match(COMMA);
					setState(524);
					collection_value();
					}
					} 
				}
				setState(529);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Collection_valueContext extends ParserRuleContext {
		public Collection_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collection_value; }
	 
		public Collection_valueContext() { }
		public void copyFrom(Collection_valueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CollectionValueContext extends Collection_valueContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COLON() { return getToken(CaliburnParser.COLON, 0); }
		public CollectionValueContext(Collection_valueContext ctx) { copyFrom(ctx); }
	}

	public final Collection_valueContext collection_value() throws RecognitionException {
		Collection_valueContext _localctx = new Collection_valueContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_collection_value);
		try {
			_localctx = new CollectionValueContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			expression(0);
			setState(531);
			match(COLON);
			setState(532);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_typeContext extends ParserRuleContext {
		public Function_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_type; }
	 
		public Function_typeContext() { }
		public void copyFrom(Function_typeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionTypeExpressionContext extends Function_typeContext {
		public Type_expressionContext type_expression() {
			return getRuleContext(Type_expressionContext.class,0);
		}
		public FunctionTypeExpressionContext(Function_typeContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionTypeFuncContext extends Function_typeContext {
		public TerminalNode FUNC() { return getToken(CaliburnParser.FUNC, 0); }
		public FunctionTypeFuncContext(Function_typeContext ctx) { copyFrom(ctx); }
	}

	public final Function_typeContext function_type() throws RecognitionException {
		Function_typeContext _localctx = new Function_typeContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_function_type);
		try {
			setState(536);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNC:
				_localctx = new FunctionTypeFuncContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(534);
				match(FUNC);
				}
				break;
			case IdentifierToken:
				_localctx = new FunctionTypeExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(535);
				type_expression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Struct_typeContext extends ParserRuleContext {
		public Struct_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_type; }
	 
		public Struct_typeContext() { }
		public void copyFrom(Struct_typeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StructTypeStructContext extends Struct_typeContext {
		public TerminalNode STRUCT() { return getToken(CaliburnParser.STRUCT, 0); }
		public StructTypeStructContext(Struct_typeContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StructTypeTupleContext extends Struct_typeContext {
		public TerminalNode TUPLE() { return getToken(CaliburnParser.TUPLE, 0); }
		public StructTypeTupleContext(Struct_typeContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StructTypeExpressionContext extends Struct_typeContext {
		public Type_expressionContext type_expression() {
			return getRuleContext(Type_expressionContext.class,0);
		}
		public StructTypeExpressionContext(Struct_typeContext ctx) { copyFrom(ctx); }
	}

	public final Struct_typeContext struct_type() throws RecognitionException {
		Struct_typeContext _localctx = new Struct_typeContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_struct_type);
		try {
			setState(541);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRUCT:
				_localctx = new StructTypeStructContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(538);
				match(STRUCT);
				}
				break;
			case TUPLE:
				_localctx = new StructTypeTupleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(539);
				match(TUPLE);
				}
				break;
			case IdentifierToken:
				_localctx = new StructTypeExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(540);
				type_expression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Type_expressionContext extends ParserRuleContext {
		public Type_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_expression; }
	 
		public Type_expressionContext() { }
		public void copyFrom(Type_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AccessTypeExpressionContext extends Type_expressionContext {
		public Type_expressionContext type_expression() {
			return getRuleContext(Type_expressionContext.class,0);
		}
		public TerminalNode PERIOD() { return getToken(CaliburnParser.PERIOD, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AccessTypeExpressionContext(Type_expressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierTypeExpressionContext extends Type_expressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IdentifierTypeExpressionContext(Type_expressionContext ctx) { copyFrom(ctx); }
	}

	public final Type_expressionContext type_expression() throws RecognitionException {
		return type_expression(0);
	}

	private Type_expressionContext type_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Type_expressionContext _localctx = new Type_expressionContext(_ctx, _parentState);
		Type_expressionContext _prevctx = _localctx;
		int _startState = 98;
		enterRecursionRule(_localctx, 98, RULE_type_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new IdentifierTypeExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(544);
			identifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(551);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AccessTypeExpressionContext(new Type_expressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_type_expression);
					setState(546);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(547);
					match(PERIOD);
					setState(548);
					identifier();
					}
					} 
				}
				setState(553);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Literal_atomContext extends ParserRuleContext {
		public Literal_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_atom; }
	 
		public Literal_atomContext() { }
		public void copyFrom(Literal_atomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypedLiteralContext extends Literal_atomContext {
		public Type_expressionContext type_expression() {
			return getRuleContext(Type_expressionContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TypedLiteralContext(Literal_atomContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UntypedLiteralContext extends Literal_atomContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public UntypedLiteralContext(Literal_atomContext ctx) { copyFrom(ctx); }
	}

	public final Literal_atomContext literal_atom() throws RecognitionException {
		Literal_atomContext _localctx = new Literal_atomContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_literal_atom);
		try {
			setState(558);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LiteralToken:
				_localctx = new UntypedLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(554);
				literal();
				}
				break;
			case IdentifierToken:
				_localctx = new TypedLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(555);
				type_expression(0);
				setState(556);
				literal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public Token val;
		public TerminalNode LiteralToken() { return getToken(CaliburnParser.LiteralToken, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
			((LiteralContext)_localctx).val = match(LiteralToken);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends ParserRuleContext {
		public Token val;
		public TerminalNode IdentifierToken() { return getToken(CaliburnParser.IdentifierToken, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
			((IdentifierContext)_localctx).val = match(IdentifierToken);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return definitions_sempred((DefinitionsContext)_localctx, predIndex);
		case 5:
			return parameters_list_sempred((Parameters_listContext)_localctx, predIndex);
		case 8:
			return statements_sempred((StatementsContext)_localctx, predIndex);
		case 10:
			return inline_statements_sempred((Inline_statementsContext)_localctx, predIndex);
		case 22:
			return option_case_blocks_sempred((Option_case_blocksContext)_localctx, predIndex);
		case 26:
			return assign_expressions_sempred((Assign_expressionsContext)_localctx, predIndex);
		case 27:
			return aliasable_assign_expressions_sempred((Aliasable_assign_expressionsContext)_localctx, predIndex);
		case 30:
			return assign_declarations_sempred((Assign_declarationsContext)_localctx, predIndex);
		case 31:
			return aliasable_assign_declarations_sempred((Aliasable_assign_declarationsContext)_localctx, predIndex);
		case 35:
			return aliasable_untyped_assign_declarations_sempred((Aliasable_untyped_assign_declarationsContext)_localctx, predIndex);
		case 39:
			return expressions_sempred((ExpressionsContext)_localctx, predIndex);
		case 41:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 43:
			return named_struct_values_sempred((Named_struct_valuesContext)_localctx, predIndex);
		case 45:
			return collection_values_sempred((Collection_valuesContext)_localctx, predIndex);
		case 49:
			return type_expression_sempred((Type_expressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean definitions_sempred(DefinitionsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean parameters_list_sempred(Parameters_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean statements_sempred(StatementsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean inline_statements_sempred(Inline_statementsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean option_case_blocks_sempred(Option_case_blocksContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean assign_expressions_sempred(Assign_expressionsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean aliasable_assign_expressions_sempred(Aliasable_assign_expressionsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean assign_declarations_sempred(Assign_declarationsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean aliasable_assign_declarations_sempred(Aliasable_assign_declarationsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean aliasable_untyped_assign_declarations_sempred(Aliasable_untyped_assign_declarationsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expressions_sempred(ExpressionsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 21);
		case 12:
			return precpred(_ctx, 19);
		case 13:
			return precpred(_ctx, 18);
		case 14:
			return precpred(_ctx, 17);
		case 15:
			return precpred(_ctx, 16);
		case 16:
			return precpred(_ctx, 15);
		case 17:
			return precpred(_ctx, 14);
		case 18:
			return precpred(_ctx, 13);
		case 19:
			return precpred(_ctx, 12);
		case 20:
			return precpred(_ctx, 11);
		case 21:
			return precpred(_ctx, 10);
		case 22:
			return precpred(_ctx, 9);
		case 23:
			return precpred(_ctx, 8);
		case 24:
			return precpred(_ctx, 7);
		}
		return true;
	}
	private boolean named_struct_values_sempred(Named_struct_valuesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 25:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean collection_values_sempred(Collection_valuesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 26:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean type_expression_sempred(Type_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 27:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001;\u0235\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001q\b\u0001\n\u0001\f\u0001"+
		"t\t\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003\u0087\b\u0003\u0001\u0004\u0001\u0004\u0003\u0004\u008b\b"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0005\u0005\u0093\b\u0005\n\u0005\f\u0005\u0096\t\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u009e\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b"+
		"\u0001\b\u0001\b\u0005\b\u00a7\b\b\n\b\f\b\u00aa\t\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\t\u00b0\b\t\u0001\n\u0001\n\u0001\n\u0005\n\u00b5\b\n"+
		"\n\n\f\n\u00b8\t\n\u0001\u000b\u0001\u000b\u0003\u000b\u00bc\b\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0003\f\u00c1\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00d0\b\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00dd\b\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00e3\b\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003"+
		"\u0013\u00f1\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0003\u0015\u00fe\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0005"+
		"\u0016\u0103\b\u0016\n\u0016\f\u0016\u0106\t\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u011a\b\u0019"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0005\u001a\u0122\b\u001a\n\u001a\f\u001a\u0125\t\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u012d"+
		"\b\u001b\n\u001b\f\u001b\u0130\t\u001b\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0003\u001c\u0137\b\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u013e\b\u001d\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e"+
		"\u0146\b\u001e\n\u001e\f\u001e\u0149\t\u001e\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u0151\b\u001f\n"+
		"\u001f\f\u001f\u0154\t\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0003"+
		" \u015b\b \u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0003"+
		"!\u0165\b!\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001#"+
		"\u0001#\u0005#\u0170\b#\n#\f#\u0173\t#\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0003$\u017a\b$\u0001%\u0001%\u0001%\u0001%\u0001%\u0003%\u0181\b%\u0001"+
		"&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0005"+
		"\'\u018c\b\'\n\'\f\'\u018f\t\'\u0001(\u0001(\u0003(\u0193\b(\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0003)\u01b5\b)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0005)\u01ef"+
		"\b)\n)\f)\u01f2\t)\u0001*\u0001*\u0001*\u0001*\u0001*\u0003*\u01f9\b*"+
		"\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0005+\u0201\b+\n+\f+\u0204"+
		"\t+\u0001,\u0001,\u0001,\u0001,\u0001-\u0001-\u0001-\u0001-\u0005-\u020e"+
		"\b-\n-\f-\u0211\t-\u0001.\u0001.\u0001.\u0001.\u0001/\u0001/\u0003/\u0219"+
		"\b/\u00010\u00010\u00010\u00030\u021e\b0\u00011\u00011\u00011\u00011\u0001"+
		"1\u00011\u00051\u0226\b1\n1\f1\u0229\t1\u00012\u00012\u00012\u00012\u0003"+
		"2\u022f\b2\u00013\u00013\u00014\u00014\u00014\u0000\u000f\u0002\n\u0010"+
		"\u0014,46<>FNRVZb5\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfh"+
		"\u0000\u0007\u0002\u0000$%\'0\u0001\u0000$&\u0001\u0000*+\u0001\u0000"+
		"\')\u0001\u0000$%\u0001\u0000/0\u0001\u000016\u0242\u0000j\u0001\u0000"+
		"\u0000\u0000\u0002m\u0001\u0000\u0000\u0000\u0004u\u0001\u0000\u0000\u0000"+
		"\u0006\u0086\u0001\u0000\u0000\u0000\b\u008a\u0001\u0000\u0000\u0000\n"+
		"\u008c\u0001\u0000\u0000\u0000\f\u009d\u0001\u0000\u0000\u0000\u000e\u009f"+
		"\u0001\u0000\u0000\u0000\u0010\u00a3\u0001\u0000\u0000\u0000\u0012\u00af"+
		"\u0001\u0000\u0000\u0000\u0014\u00b1\u0001\u0000\u0000\u0000\u0016\u00bb"+
		"\u0001\u0000\u0000\u0000\u0018\u00c0\u0001\u0000\u0000\u0000\u001a\u00c2"+
		"\u0001\u0000\u0000\u0000\u001c\u00c6\u0001\u0000\u0000\u0000\u001e\u00c9"+
		"\u0001\u0000\u0000\u0000 \u00cf\u0001\u0000\u0000\u0000\"\u00dc\u0001"+
		"\u0000\u0000\u0000$\u00e2\u0001\u0000\u0000\u0000&\u00f0\u0001\u0000\u0000"+
		"\u0000(\u00f2\u0001\u0000\u0000\u0000*\u00fd\u0001\u0000\u0000\u0000,"+
		"\u00ff\u0001\u0000\u0000\u0000.\u0107\u0001\u0000\u0000\u00000\u010b\u0001"+
		"\u0000\u0000\u00002\u0119\u0001\u0000\u0000\u00004\u011b\u0001\u0000\u0000"+
		"\u00006\u0126\u0001\u0000\u0000\u00008\u0136\u0001\u0000\u0000\u0000:"+
		"\u013d\u0001\u0000\u0000\u0000<\u013f\u0001\u0000\u0000\u0000>\u014a\u0001"+
		"\u0000\u0000\u0000@\u015a\u0001\u0000\u0000\u0000B\u0164\u0001\u0000\u0000"+
		"\u0000D\u0166\u0001\u0000\u0000\u0000F\u0169\u0001\u0000\u0000\u0000H"+
		"\u0179\u0001\u0000\u0000\u0000J\u0180\u0001\u0000\u0000\u0000L\u0182\u0001"+
		"\u0000\u0000\u0000N\u0185\u0001\u0000\u0000\u0000P\u0192\u0001\u0000\u0000"+
		"\u0000R\u01b4\u0001\u0000\u0000\u0000T\u01f8\u0001\u0000\u0000\u0000V"+
		"\u01fa\u0001\u0000\u0000\u0000X\u0205\u0001\u0000\u0000\u0000Z\u0209\u0001"+
		"\u0000\u0000\u0000\\\u0212\u0001\u0000\u0000\u0000^\u0218\u0001\u0000"+
		"\u0000\u0000`\u021d\u0001\u0000\u0000\u0000b\u021f\u0001\u0000\u0000\u0000"+
		"d\u022e\u0001\u0000\u0000\u0000f\u0230\u0001\u0000\u0000\u0000h\u0232"+
		"\u0001\u0000\u0000\u0000jk\u0003\u0002\u0001\u0000kl\u0005\u0000\u0000"+
		"\u0001l\u0001\u0001\u0000\u0000\u0000mr\u0006\u0001\uffff\uffff\u0000"+
		"no\n\u0001\u0000\u0000oq\u0003\u0004\u0002\u0000pn\u0001\u0000\u0000\u0000"+
		"qt\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000"+
		"\u0000s\u0003\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000uv\u0003"+
		"\u0006\u0003\u0000v\u0005\u0001\u0000\u0000\u0000wx\u0003^/\u0000xy\u0003"+
		"h4\u0000yz\u0005\u001e\u0000\u0000z{\u0003\b\u0004\u0000{|\u0005\u001f"+
		"\u0000\u0000|}\u0003b1\u0000}~\u0003\u000e\u0007\u0000~\u0087\u0001\u0000"+
		"\u0000\u0000\u007f\u0080\u0003^/\u0000\u0080\u0081\u0003h4\u0000\u0081"+
		"\u0082\u0005\u001e\u0000\u0000\u0082\u0083\u0003\b\u0004\u0000\u0083\u0084"+
		"\u0005\u001f\u0000\u0000\u0084\u0085\u0003\u000e\u0007\u0000\u0085\u0087"+
		"\u0001\u0000\u0000\u0000\u0086w\u0001\u0000\u0000\u0000\u0086\u007f\u0001"+
		"\u0000\u0000\u0000\u0087\u0007\u0001\u0000\u0000\u0000\u0088\u008b\u0001"+
		"\u0000\u0000\u0000\u0089\u008b\u0003\n\u0005\u0000\u008a\u0088\u0001\u0000"+
		"\u0000\u0000\u008a\u0089\u0001\u0000\u0000\u0000\u008b\t\u0001\u0000\u0000"+
		"\u0000\u008c\u008d\u0006\u0005\uffff\uffff\u0000\u008d\u008e\u0003\f\u0006"+
		"\u0000\u008e\u0094\u0001\u0000\u0000\u0000\u008f\u0090\n\u0001\u0000\u0000"+
		"\u0090\u0091\u0005\u0002\u0000\u0000\u0091\u0093\u0003\f\u0006\u0000\u0092"+
		"\u008f\u0001\u0000\u0000\u0000\u0093\u0096\u0001\u0000\u0000\u0000\u0094"+
		"\u0092\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095"+
		"\u000b\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0097"+
		"\u009e\u0003D\"\u0000\u0098\u009e\u0003J%\u0000\u0099\u009a\u0005\"\u0000"+
		"\u0000\u009a\u009b\u0003\b\u0004\u0000\u009b\u009c\u0005#\u0000\u0000"+
		"\u009c\u009e\u0001\u0000\u0000\u0000\u009d\u0097\u0001\u0000\u0000\u0000"+
		"\u009d\u0098\u0001\u0000\u0000\u0000\u009d\u0099\u0001\u0000\u0000\u0000"+
		"\u009e\r\u0001\u0000\u0000\u0000\u009f\u00a0\u0005\"\u0000\u0000\u00a0"+
		"\u00a1\u0003\u0010\b\u0000\u00a1\u00a2\u0005#\u0000\u0000\u00a2\u000f"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a8\u0006\b\uffff\uffff\u0000\u00a4\u00a5"+
		"\n\u0001\u0000\u0000\u00a5\u00a7\u0003\u0012\t\u0000\u00a6\u00a4\u0001"+
		"\u0000\u0000\u0000\u00a7\u00aa\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001"+
		"\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u0011\u0001"+
		"\u0000\u0000\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000\u00ab\u00b0\u0003"+
		"2\u0019\u0000\u00ac\u00b0\u0003L&\u0000\u00ad\u00b0\u0003 \u0010\u0000"+
		"\u00ae\u00b0\u0003\u0018\f\u0000\u00af\u00ab\u0001\u0000\u0000\u0000\u00af"+
		"\u00ac\u0001\u0000\u0000\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00af"+
		"\u00ae\u0001\u0000\u0000\u0000\u00b0\u0013\u0001\u0000\u0000\u0000\u00b1"+
		"\u00b6\u0006\n\uffff\uffff\u0000\u00b2\u00b3\n\u0001\u0000\u0000\u00b3"+
		"\u00b5\u0003\u0016\u000b\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b8\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b6"+
		"\u00b7\u0001\u0000\u0000\u0000\u00b7\u0015\u0001\u0000\u0000\u0000\u00b8"+
		"\u00b6\u0001\u0000\u0000\u0000\u00b9\u00bc\u00032\u0019\u0000\u00ba\u00bc"+
		"\u0003L&\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bb\u00ba\u0001\u0000"+
		"\u0000\u0000\u00bc\u0017\u0001\u0000\u0000\u0000\u00bd\u00c1\u0003\u001a"+
		"\r\u0000\u00be\u00c1\u0003\u001c\u000e\u0000\u00bf\u00c1\u0003\u001e\u000f"+
		"\u0000\u00c0\u00bd\u0001\u0000\u0000\u0000\u00c0\u00be\u0001\u0000\u0000"+
		"\u0000\u00c0\u00bf\u0001\u0000\u0000\u0000\u00c1\u0019\u0001\u0000\u0000"+
		"\u0000\u00c2\u00c3\u0005\u0011\u0000\u0000\u00c3\u00c4\u0003R)\u0000\u00c4"+
		"\u00c5\u0005\u0005\u0000\u0000\u00c5\u001b\u0001\u0000\u0000\u0000\u00c6"+
		"\u00c7\u0005\u000f\u0000\u0000\u00c7\u00c8\u0005\u0005\u0000\u0000\u00c8"+
		"\u001d\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005\u0010\u0000\u0000\u00ca"+
		"\u00cb\u0005\u0005\u0000\u0000\u00cb\u001f\u0001\u0000\u0000\u0000\u00cc"+
		"\u00d0\u0003\"\u0011\u0000\u00cd\u00d0\u0003&\u0013\u0000\u00ce\u00d0"+
		"\u0003(\u0014\u0000\u00cf\u00cc\u0001\u0000\u0000\u0000\u00cf\u00cd\u0001"+
		"\u0000\u0000\u0000\u00cf\u00ce\u0001\u0000\u0000\u0000\u00d0!\u0001\u0000"+
		"\u0000\u0000\u00d1\u00d2\u0005\b\u0000\u0000\u00d2\u00d3\u0003\u0014\n"+
		"\u0000\u00d3\u00d4\u0003R)\u0000\u00d4\u00d5\u0003\u000e\u0007\u0000\u00d5"+
		"\u00dd\u0001\u0000\u0000\u0000\u00d6\u00d7\u0005\b\u0000\u0000\u00d7\u00d8"+
		"\u0003\u0014\n\u0000\u00d8\u00d9\u0003R)\u0000\u00d9\u00da\u0003\u000e"+
		"\u0007\u0000\u00da\u00db\u0003$\u0012\u0000\u00db\u00dd\u0001\u0000\u0000"+
		"\u0000\u00dc\u00d1\u0001\u0000\u0000\u0000\u00dc\u00d6\u0001\u0000\u0000"+
		"\u0000\u00dd#\u0001\u0000\u0000\u0000\u00de\u00df\u0005\t\u0000\u0000"+
		"\u00df\u00e3\u0003\u000e\u0007\u0000\u00e0\u00e1\u0005\t\u0000\u0000\u00e1"+
		"\u00e3\u0003\"\u0011\u0000\u00e2\u00de\u0001\u0000\u0000\u0000\u00e2\u00e0"+
		"\u0001\u0000\u0000\u0000\u00e3%\u0001\u0000\u0000\u0000\u00e4\u00e5\u0005"+
		"\n\u0000\u0000\u00e5\u00e6\u0003\u0014\n\u0000\u00e6\u00e7\u0003R)\u0000"+
		"\u00e7\u00e8\u0003\u000e\u0007\u0000\u00e8\u00f1\u0001\u0000\u0000\u0000"+
		"\u00e9\u00ea\u0005\n\u0000\u0000\u00ea\u00eb\u0003\u0014\n\u0000\u00eb"+
		"\u00ec\u0003R)\u0000\u00ec\u00ed\u0005\u0007\u0000\u0000\u00ed\u00ee\u0003"+
		"\u0014\n\u0000\u00ee\u00ef\u0003\u000e\u0007\u0000\u00ef\u00f1\u0001\u0000"+
		"\u0000\u0000\u00f0\u00e4\u0001\u0000\u0000\u0000\u00f0\u00e9\u0001\u0000"+
		"\u0000\u0000\u00f1\'\u0001\u0000\u0000\u0000\u00f2\u00f3\u0005\u000b\u0000"+
		"\u0000\u00f3\u00f4\u0003\u0014\n\u0000\u00f4\u00f5\u0003R)\u0000\u00f5"+
		"\u00f6\u0005\"\u0000\u0000\u00f6\u00f7\u0003*\u0015\u0000\u00f7\u00f8"+
		"\u0005#\u0000\u0000\u00f8)\u0001\u0000\u0000\u0000\u00f9\u00fe\u0003,"+
		"\u0016\u0000\u00fa\u00fb\u0003,\u0016\u0000\u00fb\u00fc\u00030\u0018\u0000"+
		"\u00fc\u00fe\u0001\u0000\u0000\u0000\u00fd\u00f9\u0001\u0000\u0000\u0000"+
		"\u00fd\u00fa\u0001\u0000\u0000\u0000\u00fe+\u0001\u0000\u0000\u0000\u00ff"+
		"\u0104\u0006\u0016\uffff\uffff\u0000\u0100\u0101\n\u0001\u0000\u0000\u0101"+
		"\u0103\u0003.\u0017\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0103\u0106"+
		"\u0001\u0000\u0000\u0000\u0104\u0102\u0001\u0000\u0000\u0000\u0104\u0105"+
		"\u0001\u0000\u0000\u0000\u0105-\u0001\u0000\u0000\u0000\u0106\u0104\u0001"+
		"\u0000\u0000\u0000\u0107\u0108\u0005\f\u0000\u0000\u0108\u0109\u0003R"+
		")\u0000\u0109\u010a\u0003\u000e\u0007\u0000\u010a/\u0001\u0000\u0000\u0000"+
		"\u010b\u010c\u0005\r\u0000\u0000\u010c\u010d\u0003\u000e\u0007\u0000\u010d"+
		"1\u0001\u0000\u0000\u0000\u010e\u010f\u0003<\u001e\u0000\u010f\u0110\u0005"+
		"\u0006\u0000\u0000\u0110\u0111\u0003N\'\u0000\u0111\u0112\u0005\u0005"+
		"\u0000\u0000\u0112\u011a\u0001\u0000\u0000\u0000\u0113\u0114\u00034\u001a"+
		"\u0000\u0114\u0115\u0007\u0000\u0000\u0000\u0115\u0116\u0005\u0006\u0000"+
		"\u0000\u0116\u0117\u0003N\'\u0000\u0117\u0118\u0005\u0005\u0000\u0000"+
		"\u0118\u011a\u0001\u0000\u0000\u0000\u0119\u010e\u0001\u0000\u0000\u0000"+
		"\u0119\u0113\u0001\u0000\u0000\u0000\u011a3\u0001\u0000\u0000\u0000\u011b"+
		"\u011c\u0006\u001a\uffff\uffff\u0000\u011c\u011d\u0003:\u001d\u0000\u011d"+
		"\u0123\u0001\u0000\u0000\u0000\u011e\u011f\n\u0001\u0000\u0000\u011f\u0120"+
		"\u0005\u0002\u0000\u0000\u0120\u0122\u0003:\u001d\u0000\u0121\u011e\u0001"+
		"\u0000\u0000\u0000\u0122\u0125\u0001\u0000\u0000\u0000\u0123\u0121\u0001"+
		"\u0000\u0000\u0000\u0123\u0124\u0001\u0000\u0000\u0000\u01245\u0001\u0000"+
		"\u0000\u0000\u0125\u0123\u0001\u0000\u0000\u0000\u0126\u0127\u0006\u001b"+
		"\uffff\uffff\u0000\u0127\u0128\u00038\u001c\u0000\u0128\u012e\u0001\u0000"+
		"\u0000\u0000\u0129\u012a\n\u0001\u0000\u0000\u012a\u012b\u0005\u0002\u0000"+
		"\u0000\u012b\u012d\u00038\u001c\u0000\u012c\u0129\u0001\u0000\u0000\u0000"+
		"\u012d\u0130\u0001\u0000\u0000\u0000\u012e\u012c\u0001\u0000\u0000\u0000"+
		"\u012e\u012f\u0001\u0000\u0000\u0000\u012f7\u0001\u0000\u0000\u0000\u0130"+
		"\u012e\u0001\u0000\u0000\u0000\u0131\u0132\u0003:\u001d\u0000\u0132\u0133"+
		"\u0005\u0003\u0000\u0000\u0133\u0134\u0003h4\u0000\u0134\u0137\u0001\u0000"+
		"\u0000\u0000\u0135\u0137\u0003:\u001d\u0000\u0136\u0131\u0001\u0000\u0000"+
		"\u0000\u0136\u0135\u0001\u0000\u0000\u0000\u01379\u0001\u0000\u0000\u0000"+
		"\u0138\u013e\u0003R)\u0000\u0139\u013a\u0005\"\u0000\u0000\u013a\u013b"+
		"\u00036\u001b\u0000\u013b\u013c\u0005#\u0000\u0000\u013c\u013e\u0001\u0000"+
		"\u0000\u0000\u013d\u0138\u0001\u0000\u0000\u0000\u013d\u0139\u0001\u0000"+
		"\u0000\u0000\u013e;\u0001\u0000\u0000\u0000\u013f\u0140\u0006\u001e\uffff"+
		"\uffff\u0000\u0140\u0141\u0003B!\u0000\u0141\u0147\u0001\u0000\u0000\u0000"+
		"\u0142\u0143\n\u0001\u0000\u0000\u0143\u0144\u0005\u0002\u0000\u0000\u0144"+
		"\u0146\u00032\u0019\u0000\u0145\u0142\u0001\u0000\u0000\u0000\u0146\u0149"+
		"\u0001\u0000\u0000\u0000\u0147\u0145\u0001\u0000\u0000\u0000\u0147\u0148"+
		"\u0001\u0000\u0000\u0000\u0148=\u0001\u0000\u0000\u0000\u0149\u0147\u0001"+
		"\u0000\u0000\u0000\u014a\u014b\u0006\u001f\uffff\uffff\u0000\u014b\u014c"+
		"\u0003@ \u0000\u014c\u0152\u0001\u0000\u0000\u0000\u014d\u014e\n\u0001"+
		"\u0000\u0000\u014e\u014f\u0005\u0002\u0000\u0000\u014f\u0151\u0003@ \u0000"+
		"\u0150\u014d\u0001\u0000\u0000\u0000\u0151\u0154\u0001\u0000\u0000\u0000"+
		"\u0152\u0150\u0001\u0000\u0000\u0000\u0152\u0153\u0001\u0000\u0000\u0000"+
		"\u0153?\u0001\u0000\u0000\u0000\u0154\u0152\u0001\u0000\u0000\u0000\u0155"+
		"\u0156\u0003B!\u0000\u0156\u0157\u0005\u0003\u0000\u0000\u0157\u0158\u0003"+
		"h4\u0000\u0158\u015b\u0001\u0000\u0000\u0000\u0159\u015b\u0003B!\u0000"+
		"\u015a\u0155\u0001\u0000\u0000\u0000\u015a\u0159\u0001\u0000\u0000\u0000"+
		"\u015bA\u0001\u0000\u0000\u0000\u015c\u0165\u0003R)\u0000\u015d\u0165"+
		"\u0003D\"\u0000\u015e\u015f\u0005\u0016\u0000\u0000\u015f\u0165\u0003"+
		"J%\u0000\u0160\u0161\u0005\"\u0000\u0000\u0161\u0162\u0003>\u001f\u0000"+
		"\u0162\u0163\u0005#\u0000\u0000\u0163\u0165\u0001\u0000\u0000\u0000\u0164"+
		"\u015c\u0001\u0000\u0000\u0000\u0164\u015d\u0001\u0000\u0000\u0000\u0164"+
		"\u015e\u0001\u0000\u0000\u0000\u0164\u0160\u0001\u0000\u0000\u0000\u0165"+
		"C\u0001\u0000\u0000\u0000\u0166\u0167\u0003b1\u0000\u0167\u0168\u0003"+
		"J%\u0000\u0168E\u0001\u0000\u0000\u0000\u0169\u016a\u0006#\uffff\uffff"+
		"\u0000\u016a\u016b\u0003H$\u0000\u016b\u0171\u0001\u0000\u0000\u0000\u016c"+
		"\u016d\n\u0001\u0000\u0000\u016d\u016e\u0005\u0002\u0000\u0000\u016e\u0170"+
		"\u0003H$\u0000\u016f\u016c\u0001\u0000\u0000\u0000\u0170\u0173\u0001\u0000"+
		"\u0000\u0000\u0171\u016f\u0001\u0000\u0000\u0000\u0171\u0172\u0001\u0000"+
		"\u0000\u0000\u0172G\u0001\u0000\u0000\u0000\u0173\u0171\u0001\u0000\u0000"+
		"\u0000\u0174\u0175\u0003J%\u0000\u0175\u0176\u0005\u0003\u0000\u0000\u0176"+
		"\u0177\u0003h4\u0000\u0177\u017a\u0001\u0000\u0000\u0000\u0178\u017a\u0003"+
		"J%\u0000\u0179\u0174\u0001\u0000\u0000\u0000\u0179\u0178\u0001\u0000\u0000"+
		"\u0000\u017aI\u0001\u0000\u0000\u0000\u017b\u0181\u0003h4\u0000\u017c"+
		"\u017d\u0005\"\u0000\u0000\u017d\u017e\u0003F#\u0000\u017e\u017f\u0005"+
		"#\u0000\u0000\u017f\u0181\u0001\u0000\u0000\u0000\u0180\u017b\u0001\u0000"+
		"\u0000\u0000\u0180\u017c\u0001\u0000\u0000\u0000\u0181K\u0001\u0000\u0000"+
		"\u0000\u0182\u0183\u0003N\'\u0000\u0183\u0184\u0005\u0005\u0000\u0000"+
		"\u0184M\u0001\u0000\u0000\u0000\u0185\u0186\u0006\'\uffff\uffff\u0000"+
		"\u0186\u0187\u0003R)\u0000\u0187\u018d\u0001\u0000\u0000\u0000\u0188\u0189"+
		"\n\u0001\u0000\u0000\u0189\u018a\u0005\u0002\u0000\u0000\u018a\u018c\u0003"+
		"R)\u0000\u018b\u0188\u0001\u0000\u0000\u0000\u018c\u018f\u0001\u0000\u0000"+
		"\u0000\u018d\u018b\u0001\u0000\u0000\u0000\u018d\u018e\u0001\u0000\u0000"+
		"\u0000\u018eO\u0001\u0000\u0000\u0000\u018f\u018d\u0001\u0000\u0000\u0000"+
		"\u0190\u0193\u0003N\'\u0000\u0191\u0193\u0001\u0000\u0000\u0000\u0192"+
		"\u0190\u0001\u0000\u0000\u0000\u0192\u0191\u0001\u0000\u0000\u0000\u0193"+
		"Q\u0001\u0000\u0000\u0000\u0194\u0195\u0006)\uffff\uffff\u0000\u0195\u0196"+
		"\u0005\u001e\u0000\u0000\u0196\u0197\u0003R)\u0000\u0197\u0198\u0005\u001f"+
		"\u0000\u0000\u0198\u01b5\u0001\u0000\u0000\u0000\u0199\u019a\u0007\u0001"+
		"\u0000\u0000\u019a\u01b5\u0003R)\u0014\u019b\u01b5\u0003h4\u0000\u019c"+
		"\u01b5\u0003d2\u0000\u019d\u019e\u0003^/\u0000\u019e\u019f\u0005\u001e"+
		"\u0000\u0000\u019f\u01a0\u0003\b\u0004\u0000\u01a0\u01a1\u0005\u001f\u0000"+
		"\u0000\u01a1\u01a2\u0003b1\u0000\u01a2\u01a3\u0003\u000e\u0007\u0000\u01a3"+
		"\u01b5\u0001\u0000\u0000\u0000\u01a4\u01a5\u0003^/\u0000\u01a5\u01a6\u0005"+
		"\u001e\u0000\u0000\u01a6\u01a7\u0003\b\u0004\u0000\u01a7\u01a8\u0005\u001f"+
		"\u0000\u0000\u01a8\u01a9\u0003\u000e\u0007\u0000\u01a9\u01b5\u0001\u0000"+
		"\u0000\u0000\u01aa\u01ab\u0003`0\u0000\u01ab\u01ac\u0005\"\u0000\u0000"+
		"\u01ac\u01ad\u0003T*\u0000\u01ad\u01ae\u0005#\u0000\u0000\u01ae\u01b5"+
		"\u0001\u0000\u0000\u0000\u01af\u01b0\u0003b1\u0000\u01b0\u01b1\u0005 "+
		"\u0000\u0000\u01b1\u01b2\u0003Z-\u0000\u01b2\u01b3\u0005!\u0000\u0000"+
		"\u01b3\u01b5\u0001\u0000\u0000\u0000\u01b4\u0194\u0001\u0000\u0000\u0000"+
		"\u01b4\u0199\u0001\u0000\u0000\u0000\u01b4\u019b\u0001\u0000\u0000\u0000"+
		"\u01b4\u019c\u0001\u0000\u0000\u0000\u01b4\u019d\u0001\u0000\u0000\u0000"+
		"\u01b4\u01a4\u0001\u0000\u0000\u0000\u01b4\u01aa\u0001\u0000\u0000\u0000"+
		"\u01b4\u01af\u0001\u0000\u0000\u0000\u01b5\u01f0\u0001\u0000\u0000\u0000"+
		"\u01b6\u01b7\n\u0015\u0000\u0000\u01b7\u01b8\u0007\u0002\u0000\u0000\u01b8"+
		"\u01ef\u0003R)\u0016\u01b9\u01ba\n\u0013\u0000\u0000\u01ba\u01bb\u0007"+
		"\u0003\u0000\u0000\u01bb\u01ef\u0003R)\u0014\u01bc\u01bd\n\u0012\u0000"+
		"\u0000\u01bd\u01be\u0007\u0004\u0000\u0000\u01be\u01ef\u0003R)\u0013\u01bf"+
		"\u01c0\n\u0011\u0000\u0000\u01c0\u01c1\u0007\u0005\u0000\u0000\u01c1\u01ef"+
		"\u0003R)\u0012\u01c2\u01c3\n\u0010\u0000\u0000\u01c3\u01c4\u0007\u0006"+
		"\u0000\u0000\u01c4\u01ef\u0003R)\u0011\u01c5\u01c6\n\u000f\u0000\u0000"+
		"\u01c6\u01c7\u0005.\u0000\u0000\u01c7\u01ef\u0003R)\u0010\u01c8\u01c9"+
		"\n\u000e\u0000\u0000\u01c9\u01ca\u0005-\u0000\u0000\u01ca\u01ef\u0003"+
		"R)\u000f\u01cb\u01cc\n\r\u0000\u0000\u01cc\u01cd\u0005,\u0000\u0000\u01cd"+
		"\u01ef\u0003R)\u000e\u01ce\u01cf\n\f\u0000\u0000\u01cf\u01d0\u0005\u001e"+
		"\u0000\u0000\u01d0\u01d1\u0003P(\u0000\u01d1\u01d2\u0005\u001f\u0000\u0000"+
		"\u01d2\u01ef\u0001\u0000\u0000\u0000\u01d3\u01d4\n\u000b\u0000\u0000\u01d4"+
		"\u01d5\u0005\u0001\u0000\u0000\u01d5\u01ef\u0003h4\u0000\u01d6\u01d7\n"+
		"\n\u0000\u0000\u01d7\u01d8\u0005 \u0000\u0000\u01d8\u01d9\u0003R)\u0000"+
		"\u01d9\u01da\u0005!\u0000\u0000\u01da\u01ef\u0001\u0000\u0000\u0000\u01db"+
		"\u01dc\n\t\u0000\u0000\u01dc\u01dd\u0005 \u0000\u0000\u01dd\u01de\u0003"+
		"R)\u0000\u01de\u01df\u0005\u0003\u0000\u0000\u01df\u01e0\u0005!\u0000"+
		"\u0000\u01e0\u01ef\u0001\u0000\u0000\u0000\u01e1\u01e2\n\b\u0000\u0000"+
		"\u01e2\u01e3\u0005 \u0000\u0000\u01e3\u01e4\u0005\u0003\u0000\u0000\u01e4"+
		"\u01e5\u0003R)\u0000\u01e5\u01e6\u0005!\u0000\u0000\u01e6\u01ef\u0001"+
		"\u0000\u0000\u0000\u01e7\u01e8\n\u0007\u0000\u0000\u01e8\u01e9\u0005 "+
		"\u0000\u0000\u01e9\u01ea\u0003R)\u0000\u01ea\u01eb\u0005\u0003\u0000\u0000"+
		"\u01eb\u01ec\u0003R)\u0000\u01ec\u01ed\u0005!\u0000\u0000\u01ed\u01ef"+
		"\u0001\u0000\u0000\u0000\u01ee\u01b6\u0001\u0000\u0000\u0000\u01ee\u01b9"+
		"\u0001\u0000\u0000\u0000\u01ee\u01bc\u0001\u0000\u0000\u0000\u01ee\u01bf"+
		"\u0001\u0000\u0000\u0000\u01ee\u01c2\u0001\u0000\u0000\u0000\u01ee\u01c5"+
		"\u0001\u0000\u0000\u0000\u01ee\u01c8\u0001\u0000\u0000\u0000\u01ee\u01cb"+
		"\u0001\u0000\u0000\u0000\u01ee\u01ce\u0001\u0000\u0000\u0000\u01ee\u01d3"+
		"\u0001\u0000\u0000\u0000\u01ee\u01d6\u0001\u0000\u0000\u0000\u01ee\u01db"+
		"\u0001\u0000\u0000\u0000\u01ee\u01e1\u0001\u0000\u0000\u0000\u01ee\u01e7"+
		"\u0001\u0000\u0000\u0000\u01ef\u01f2\u0001\u0000\u0000\u0000\u01f0\u01ee"+
		"\u0001\u0000\u0000\u0000\u01f0\u01f1\u0001\u0000\u0000\u0000\u01f1S\u0001"+
		"\u0000\u0000\u0000\u01f2\u01f0\u0001\u0000\u0000\u0000\u01f3\u01f9\u0003"+
		"V+\u0000\u01f4\u01f5\u0003V+\u0000\u01f5\u01f6\u0005\u0002\u0000\u0000"+
		"\u01f6\u01f9\u0001\u0000\u0000\u0000\u01f7\u01f9\u0003P(\u0000\u01f8\u01f3"+
		"\u0001\u0000\u0000\u0000\u01f8\u01f4\u0001\u0000\u0000\u0000\u01f8\u01f7"+
		"\u0001\u0000\u0000\u0000\u01f9U\u0001\u0000\u0000\u0000\u01fa\u01fb\u0006"+
		"+\uffff\uffff\u0000\u01fb\u01fc\u0003X,\u0000\u01fc\u0202\u0001\u0000"+
		"\u0000\u0000\u01fd\u01fe\n\u0001\u0000\u0000\u01fe\u01ff\u0005\u0002\u0000"+
		"\u0000\u01ff\u0201\u0003X,\u0000\u0200\u01fd\u0001\u0000\u0000\u0000\u0201"+
		"\u0204\u0001\u0000\u0000\u0000\u0202\u0200\u0001\u0000\u0000\u0000\u0202"+
		"\u0203\u0001\u0000\u0000\u0000\u0203W\u0001\u0000\u0000\u0000\u0204\u0202"+
		"\u0001\u0000\u0000\u0000\u0205\u0206\u0003h4\u0000\u0206\u0207\u0005\u0003"+
		"\u0000\u0000\u0207\u0208\u0003R)\u0000\u0208Y\u0001\u0000\u0000\u0000"+
		"\u0209\u020f\u0006-\uffff\uffff\u0000\u020a\u020b\n\u0001\u0000\u0000"+
		"\u020b\u020c\u0005\u0002\u0000\u0000\u020c\u020e\u0003\\.\u0000\u020d"+
		"\u020a\u0001\u0000\u0000\u0000\u020e\u0211\u0001\u0000\u0000\u0000\u020f"+
		"\u020d\u0001\u0000\u0000\u0000\u020f\u0210\u0001\u0000\u0000\u0000\u0210"+
		"[\u0001\u0000\u0000\u0000\u0211\u020f\u0001\u0000\u0000\u0000\u0212\u0213"+
		"\u0003R)\u0000\u0213\u0214\u0005\u0003\u0000\u0000\u0214\u0215\u0003R"+
		")\u0000\u0215]\u0001\u0000\u0000\u0000\u0216\u0219\u0005\u0019\u0000\u0000"+
		"\u0217\u0219\u0003b1\u0000\u0218\u0216\u0001\u0000\u0000\u0000\u0218\u0217"+
		"\u0001\u0000\u0000\u0000\u0219_\u0001\u0000\u0000\u0000\u021a\u021e\u0005"+
		"\u001a\u0000\u0000\u021b\u021e\u0005\u001b\u0000\u0000\u021c\u021e\u0003"+
		"b1\u0000\u021d\u021a\u0001\u0000\u0000\u0000\u021d\u021b\u0001\u0000\u0000"+
		"\u0000\u021d\u021c\u0001\u0000\u0000\u0000\u021ea\u0001\u0000\u0000\u0000"+
		"\u021f\u0220\u00061\uffff\uffff\u0000\u0220\u0221\u0003h4\u0000\u0221"+
		"\u0227\u0001\u0000\u0000\u0000\u0222\u0223\n\u0001\u0000\u0000\u0223\u0224"+
		"\u0005\u0001\u0000\u0000\u0224\u0226\u0003h4\u0000\u0225\u0222\u0001\u0000"+
		"\u0000\u0000\u0226\u0229\u0001\u0000\u0000\u0000\u0227\u0225\u0001\u0000"+
		"\u0000\u0000\u0227\u0228\u0001\u0000\u0000\u0000\u0228c\u0001\u0000\u0000"+
		"\u0000\u0229\u0227\u0001\u0000\u0000\u0000\u022a\u022f\u0003f3\u0000\u022b"+
		"\u022c\u0003b1\u0000\u022c\u022d\u0003f3\u0000\u022d\u022f\u0001\u0000"+
		"\u0000\u0000\u022e\u022a\u0001\u0000\u0000\u0000\u022e\u022b\u0001\u0000"+
		"\u0000\u0000\u022fe\u0001\u0000\u0000\u0000\u0230\u0231\u0005;\u0000\u0000"+
		"\u0231g\u0001\u0000\u0000\u0000\u0232\u0233\u0005:\u0000\u0000\u0233i"+
		"\u0001\u0000\u0000\u0000(r\u0086\u008a\u0094\u009d\u00a8\u00af\u00b6\u00bb"+
		"\u00c0\u00cf\u00dc\u00e2\u00f0\u00fd\u0104\u0119\u0123\u012e\u0136\u013d"+
		"\u0147\u0152\u015a\u0164\u0171\u0179\u0180\u018d\u0192\u01b4\u01ee\u01f0"+
		"\u01f8\u0202\u020f\u0218\u021d\u0227\u022e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}