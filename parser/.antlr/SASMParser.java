// Generated from /home/excalibur/PersonalProjects/riscvasm/parser/SASMParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SASMParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COLON=1, COMMA=2, LS_BRACKET=3, RS_BRACKET=4, ADD=5, SUB=6, MUL=7, IDENTIFIER=8, 
		DEC=9, HEX=10, BIN=11, COMMENT=12;
	public static final int
		RULE_module = 0, RULE_label = 1, RULE_instruction = 2, RULE_operand = 3, 
		RULE_memory = 4, RULE_base = 5, RULE_index = 6, RULE_scale = 7, RULE_disp = 8, 
		RULE_segreg = 9, RULE_immediate = 10, RULE_register = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"module", "label", "instruction", "operand", "memory", "base", "index", 
			"scale", "disp", "segreg", "immediate", "register"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "','", "'['", "']'", "'+'", "'-'", "'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COLON", "COMMA", "LS_BRACKET", "RS_BRACKET", "ADD", "SUB", "MUL", 
			"IDENTIFIER", "DEC", "HEX", "BIN", "COMMENT"
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
	public String getGrammarFileName() { return "SASMParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SASMParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ModuleContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SASMParser.EOF, 0); }
		public ModuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module; }
	}

	public final ModuleContext module() throws RecognitionException {
		ModuleContext _localctx = new ModuleContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_module);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
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
	public static class LabelContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SASMParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(SASMParser.COLON, 0); }
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(IDENTIFIER);
			setState(27);
			match(COLON);
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
	public static class InstructionContext extends ParserRuleContext {
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
	 
		public InstructionContext() { }
		public void copyFrom(InstructionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Instruction2OperandContext extends InstructionContext {
		public Token inst;
		public List<OperandContext> operand() {
			return getRuleContexts(OperandContext.class);
		}
		public OperandContext operand(int i) {
			return getRuleContext(OperandContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(SASMParser.COMMA, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SASMParser.IDENTIFIER, 0); }
		public Instruction2OperandContext(InstructionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Instruction3OperandContext extends InstructionContext {
		public Token inst;
		public List<OperandContext> operand() {
			return getRuleContexts(OperandContext.class);
		}
		public OperandContext operand(int i) {
			return getRuleContext(OperandContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SASMParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SASMParser.COMMA, i);
		}
		public TerminalNode IDENTIFIER() { return getToken(SASMParser.IDENTIFIER, 0); }
		public Instruction3OperandContext(InstructionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Instruction0OperandContext extends InstructionContext {
		public Token inst;
		public TerminalNode IDENTIFIER() { return getToken(SASMParser.IDENTIFIER, 0); }
		public Instruction0OperandContext(InstructionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Instruction1OperandContext extends InstructionContext {
		public Token inst;
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(SASMParser.IDENTIFIER, 0); }
		public Instruction1OperandContext(InstructionContext ctx) { copyFrom(ctx); }
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instruction);
		try {
			setState(44);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new Instruction0OperandContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				((Instruction0OperandContext)_localctx).inst = match(IDENTIFIER);
				}
				break;
			case 2:
				_localctx = new Instruction1OperandContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
				((Instruction1OperandContext)_localctx).inst = match(IDENTIFIER);
				setState(31);
				operand();
				}
				break;
			case 3:
				_localctx = new Instruction2OperandContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(32);
				((Instruction2OperandContext)_localctx).inst = match(IDENTIFIER);
				setState(33);
				operand();
				setState(34);
				match(COMMA);
				setState(35);
				operand();
				}
				break;
			case 4:
				_localctx = new Instruction3OperandContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(37);
				((Instruction3OperandContext)_localctx).inst = match(IDENTIFIER);
				setState(38);
				operand();
				setState(39);
				match(COMMA);
				setState(40);
				operand();
				setState(41);
				match(COMMA);
				setState(42);
				operand();
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
	public static class OperandContext extends ParserRuleContext {
		public RegisterContext register() {
			return getRuleContext(RegisterContext.class,0);
		}
		public MemoryContext memory() {
			return getRuleContext(MemoryContext.class,0);
		}
		public ImmediateContext immediate() {
			return getRuleContext(ImmediateContext.class,0);
		}
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_operand);
		try {
			setState(49);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				register();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				memory();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
				immediate();
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
	public static class MemoryContext extends ParserRuleContext {
		public TerminalNode LS_BRACKET() { return getToken(SASMParser.LS_BRACKET, 0); }
		public BaseContext base() {
			return getRuleContext(BaseContext.class,0);
		}
		public TerminalNode RS_BRACKET() { return getToken(SASMParser.RS_BRACKET, 0); }
		public SegregContext segreg() {
			return getRuleContext(SegregContext.class,0);
		}
		public TerminalNode COLON() { return getToken(SASMParser.COLON, 0); }
		public List<TerminalNode> ADD() { return getTokens(SASMParser.ADD); }
		public TerminalNode ADD(int i) {
			return getToken(SASMParser.ADD, i);
		}
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public DispContext disp() {
			return getRuleContext(DispContext.class,0);
		}
		public TerminalNode MUL() { return getToken(SASMParser.MUL, 0); }
		public ScaleContext scale() {
			return getRuleContext(ScaleContext.class,0);
		}
		public MemoryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memory; }
	}

	public final MemoryContext memory() throws RecognitionException {
		MemoryContext _localctx = new MemoryContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_memory);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(51);
				segreg();
				setState(52);
				match(COLON);
				}
			}

			setState(56);
			match(LS_BRACKET);
			setState(57);
			base();
			setState(64);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(58);
				match(ADD);
				setState(59);
				index();
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MUL) {
					{
					setState(60);
					match(MUL);
					setState(61);
					scale();
					}
				}

				}
				break;
			}
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ADD) {
				{
				setState(66);
				match(ADD);
				setState(67);
				disp();
				}
			}

			setState(70);
			match(RS_BRACKET);
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
	public static class BaseContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SASMParser.IDENTIFIER, 0); }
		public BaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base; }
	}

	public final BaseContext base() throws RecognitionException {
		BaseContext _localctx = new BaseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_base);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(IDENTIFIER);
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
	public static class IndexContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SASMParser.IDENTIFIER, 0); }
		public IndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index; }
	}

	public final IndexContext index() throws RecognitionException {
		IndexContext _localctx = new IndexContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_index);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(IDENTIFIER);
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
	public static class ScaleContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SASMParser.IDENTIFIER, 0); }
		public ScaleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scale; }
	}

	public final ScaleContext scale() throws RecognitionException {
		ScaleContext _localctx = new ScaleContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_scale);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(IDENTIFIER);
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
	public static class DispContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SASMParser.IDENTIFIER, 0); }
		public DispContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_disp; }
	}

	public final DispContext disp() throws RecognitionException {
		DispContext _localctx = new DispContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_disp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(IDENTIFIER);
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
	public static class SegregContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SASMParser.IDENTIFIER, 0); }
		public SegregContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segreg; }
	}

	public final SegregContext segreg() throws RecognitionException {
		SegregContext _localctx = new SegregContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_segreg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(IDENTIFIER);
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
	public static class ImmediateContext extends ParserRuleContext {
		public ImmediateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_immediate; }
	 
		public ImmediateContext() { }
		public void copyFrom(ImmediateContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImmediateHexContext extends ImmediateContext {
		public TerminalNode HEX() { return getToken(SASMParser.HEX, 0); }
		public ImmediateHexContext(ImmediateContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImmediateDecContext extends ImmediateContext {
		public TerminalNode DEC() { return getToken(SASMParser.DEC, 0); }
		public ImmediateDecContext(ImmediateContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImmediateBinContext extends ImmediateContext {
		public TerminalNode BIN() { return getToken(SASMParser.BIN, 0); }
		public ImmediateBinContext(ImmediateContext ctx) { copyFrom(ctx); }
	}

	public final ImmediateContext immediate() throws RecognitionException {
		ImmediateContext _localctx = new ImmediateContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_immediate);
		try {
			setState(85);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEC:
				_localctx = new ImmediateDecContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				match(DEC);
				}
				break;
			case HEX:
				_localctx = new ImmediateHexContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				match(HEX);
				}
				break;
			case BIN:
				_localctx = new ImmediateBinContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(84);
				match(BIN);
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
	public static class RegisterContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SASMParser.IDENTIFIER, 0); }
		public RegisterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_register; }
	}

	public final RegisterContext register() throws RecognitionException {
		RegisterContext _localctx = new RegisterContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_register);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(IDENTIFIER);
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

	public static final String _serializedATN =
		"\u0004\u0001\fZ\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002-\b\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u00032\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u00047\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004?\b\u0004\u0003\u0004A\b\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004E\b\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0003\nV\b\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0000\u0000\f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0000\u0000X\u0000\u0018\u0001\u0000\u0000\u0000\u0002"+
		"\u001a\u0001\u0000\u0000\u0000\u0004,\u0001\u0000\u0000\u0000\u00061\u0001"+
		"\u0000\u0000\u0000\b6\u0001\u0000\u0000\u0000\nH\u0001\u0000\u0000\u0000"+
		"\fJ\u0001\u0000\u0000\u0000\u000eL\u0001\u0000\u0000\u0000\u0010N\u0001"+
		"\u0000\u0000\u0000\u0012P\u0001\u0000\u0000\u0000\u0014U\u0001\u0000\u0000"+
		"\u0000\u0016W\u0001\u0000\u0000\u0000\u0018\u0019\u0005\u0000\u0000\u0001"+
		"\u0019\u0001\u0001\u0000\u0000\u0000\u001a\u001b\u0005\b\u0000\u0000\u001b"+
		"\u001c\u0005\u0001\u0000\u0000\u001c\u0003\u0001\u0000\u0000\u0000\u001d"+
		"-\u0005\b\u0000\u0000\u001e\u001f\u0005\b\u0000\u0000\u001f-\u0003\u0006"+
		"\u0003\u0000 !\u0005\b\u0000\u0000!\"\u0003\u0006\u0003\u0000\"#\u0005"+
		"\u0002\u0000\u0000#$\u0003\u0006\u0003\u0000$-\u0001\u0000\u0000\u0000"+
		"%&\u0005\b\u0000\u0000&\'\u0003\u0006\u0003\u0000\'(\u0005\u0002\u0000"+
		"\u0000()\u0003\u0006\u0003\u0000)*\u0005\u0002\u0000\u0000*+\u0003\u0006"+
		"\u0003\u0000+-\u0001\u0000\u0000\u0000,\u001d\u0001\u0000\u0000\u0000"+
		",\u001e\u0001\u0000\u0000\u0000, \u0001\u0000\u0000\u0000,%\u0001\u0000"+
		"\u0000\u0000-\u0005\u0001\u0000\u0000\u0000.2\u0003\u0016\u000b\u0000"+
		"/2\u0003\b\u0004\u000002\u0003\u0014\n\u00001.\u0001\u0000\u0000\u0000"+
		"1/\u0001\u0000\u0000\u000010\u0001\u0000\u0000\u00002\u0007\u0001\u0000"+
		"\u0000\u000034\u0003\u0012\t\u000045\u0005\u0001\u0000\u000057\u0001\u0000"+
		"\u0000\u000063\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u000078\u0001"+
		"\u0000\u0000\u000089\u0005\u0003\u0000\u00009@\u0003\n\u0005\u0000:;\u0005"+
		"\u0005\u0000\u0000;>\u0003\f\u0006\u0000<=\u0005\u0007\u0000\u0000=?\u0003"+
		"\u000e\u0007\u0000><\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000"+
		"?A\u0001\u0000\u0000\u0000@:\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000"+
		"\u0000AD\u0001\u0000\u0000\u0000BC\u0005\u0005\u0000\u0000CE\u0003\u0010"+
		"\b\u0000DB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000EF\u0001\u0000"+
		"\u0000\u0000FG\u0005\u0004\u0000\u0000G\t\u0001\u0000\u0000\u0000HI\u0005"+
		"\b\u0000\u0000I\u000b\u0001\u0000\u0000\u0000JK\u0005\b\u0000\u0000K\r"+
		"\u0001\u0000\u0000\u0000LM\u0005\b\u0000\u0000M\u000f\u0001\u0000\u0000"+
		"\u0000NO\u0005\b\u0000\u0000O\u0011\u0001\u0000\u0000\u0000PQ\u0005\b"+
		"\u0000\u0000Q\u0013\u0001\u0000\u0000\u0000RV\u0005\t\u0000\u0000SV\u0005"+
		"\n\u0000\u0000TV\u0005\u000b\u0000\u0000UR\u0001\u0000\u0000\u0000US\u0001"+
		"\u0000\u0000\u0000UT\u0001\u0000\u0000\u0000V\u0015\u0001\u0000\u0000"+
		"\u0000WX\u0005\b\u0000\u0000X\u0017\u0001\u0000\u0000\u0000\u0007,16>"+
		"@DU";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}