// Generated from /home/excalibur/PersonalProjects/riscvasm/parser/RISCVASMParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class RISCVASMParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COLON=1, COMMA=2, ADD=3, SUB=4, MUL=5, WHITESPACE=6, NEWLINE=7, IDENTIFIER=8, 
		DEC=9, HEX=10, BIN=11, COMMENT=12;
	public static final int
		RULE_module = 0, RULE_lines = 1, RULE_line = 2, RULE_instruction = 3, 
		RULE_operands = 4, RULE_operand = 5, RULE_numeric = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"module", "lines", "line", "instruction", "operands", "operand", "numeric"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "','", "'+'", "'-'", "'*'", null, "'\\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COLON", "COMMA", "ADD", "SUB", "MUL", "WHITESPACE", "NEWLINE", 
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
	public String getGrammarFileName() { return "RISCVASMParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RISCVASMParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ModuleContext extends ParserRuleContext {
		public LinesContext lines() {
			return getRuleContext(LinesContext.class,0);
		}
		public TerminalNode EOF() { return getToken(RISCVASMParser.EOF, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(RISCVASMParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(RISCVASMParser.NEWLINE, i);
		}
		public ModuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module; }
	}

	public final ModuleContext module() throws RecognitionException {
		ModuleContext _localctx = new ModuleContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_module);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(14);
				match(NEWLINE);
				}
				}
				setState(19);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(20);
			lines(0);
			setState(24);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(21);
				match(NEWLINE);
				}
				}
				setState(26);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(27);
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
	public static class LinesContext extends ParserRuleContext {
		public LinesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lines; }
	 
		public LinesContext() { }
		public void copyFrom(LinesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LinesAppendContext extends LinesContext {
		public LinesContext lines() {
			return getRuleContext(LinesContext.class,0);
		}
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(RISCVASMParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(RISCVASMParser.NEWLINE, i);
		}
		public List<TerminalNode> WHITESPACE() { return getTokens(RISCVASMParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(RISCVASMParser.WHITESPACE, i);
		}
		public LinesAppendContext(LinesContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LinesInitialContext extends LinesContext {
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public List<TerminalNode> WHITESPACE() { return getTokens(RISCVASMParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(RISCVASMParser.WHITESPACE, i);
		}
		public LinesInitialContext(LinesContext ctx) { copyFrom(ctx); }
	}

	public final LinesContext lines() throws RecognitionException {
		return lines(0);
	}

	private LinesContext lines(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LinesContext _localctx = new LinesContext(_ctx, _parentState);
		LinesContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_lines, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new LinesInitialContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHITESPACE) {
				{
				setState(30);
				match(WHITESPACE);
				}
			}

			setState(33);
			line();
			setState(35);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(34);
				match(WHITESPACE);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(52);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LinesAppendContext(new LinesContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_lines);
					setState(37);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(39); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(38);
						match(NEWLINE);
						}
						}
						setState(41); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NEWLINE );
					setState(44);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHITESPACE) {
						{
						setState(43);
						match(WHITESPACE);
						}
					}

					setState(46);
					line();
					setState(48);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						setState(47);
						match(WHITESPACE);
						}
						break;
					}
					}
					} 
				}
				setState(54);
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
	public static class LineContext extends ParserRuleContext {
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
	 
		public LineContext() { }
		public void copyFrom(LineContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LabelInstructionLineContext extends LineContext {
		public Token label;
		public TerminalNode COLON() { return getToken(RISCVASMParser.COLON, 0); }
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(RISCVASMParser.IDENTIFIER, 0); }
		public List<TerminalNode> WHITESPACE() { return getTokens(RISCVASMParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(RISCVASMParser.WHITESPACE, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(RISCVASMParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(RISCVASMParser.NEWLINE, i);
		}
		public LabelInstructionLineContext(LineContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InstructionLineContext extends LineContext {
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public InstructionLineContext(LineContext ctx) { copyFrom(ctx); }
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_line);
		int _la;
		try {
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new InstructionLineContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				instruction();
				}
				break;
			case 2:
				_localctx = new LabelInstructionLineContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				((LabelInstructionLineContext)_localctx).label = match(IDENTIFIER);
				setState(57);
				match(COLON);
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITESPACE || _la==NEWLINE) {
					{
					{
					setState(58);
					_la = _input.LA(1);
					if ( !(_la==WHITESPACE || _la==NEWLINE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(63);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(64);
				line();
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
	public static class OperandInstructionContext extends InstructionContext {
		public Token inst;
		public TerminalNode WHITESPACE() { return getToken(RISCVASMParser.WHITESPACE, 0); }
		public OperandsContext operands() {
			return getRuleContext(OperandsContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(RISCVASMParser.IDENTIFIER, 0); }
		public OperandInstructionContext(InstructionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NoOperandInstructionContext extends InstructionContext {
		public Token inst;
		public TerminalNode IDENTIFIER() { return getToken(RISCVASMParser.IDENTIFIER, 0); }
		public NoOperandInstructionContext(InstructionContext ctx) { copyFrom(ctx); }
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_instruction);
		try {
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new NoOperandInstructionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				((NoOperandInstructionContext)_localctx).inst = match(IDENTIFIER);
				}
				break;
			case 2:
				_localctx = new OperandInstructionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				((OperandInstructionContext)_localctx).inst = match(IDENTIFIER);
				setState(69);
				match(WHITESPACE);
				setState(70);
				operands(0);
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
	public static class OperandsContext extends ParserRuleContext {
		public OperandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operands; }
	 
		public OperandsContext() { }
		public void copyFrom(OperandsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OperandsInitialContext extends OperandsContext {
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public OperandsInitialContext(OperandsContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OperandsAppendContext extends OperandsContext {
		public OperandsContext operands() {
			return getRuleContext(OperandsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(RISCVASMParser.COMMA, 0); }
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public List<TerminalNode> WHITESPACE() { return getTokens(RISCVASMParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(RISCVASMParser.WHITESPACE, i);
		}
		public OperandsAppendContext(OperandsContext ctx) { copyFrom(ctx); }
	}

	public final OperandsContext operands() throws RecognitionException {
		return operands(0);
	}

	private OperandsContext operands(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		OperandsContext _localctx = new OperandsContext(_ctx, _parentState);
		OperandsContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_operands, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new OperandsInitialContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(74);
			operand();
			}
			_ctx.stop = _input.LT(-1);
			setState(87);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OperandsAppendContext(new OperandsContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_operands);
					setState(76);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(78);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHITESPACE) {
						{
						setState(77);
						match(WHITESPACE);
						}
					}

					setState(80);
					match(COMMA);
					setState(82);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WHITESPACE) {
						{
						setState(81);
						match(WHITESPACE);
						}
					}

					setState(84);
					operand();
					}
					} 
				}
				setState(89);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
	public static class OperandContext extends ParserRuleContext {
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
	 
		public OperandContext() { }
		public void copyFrom(OperandContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OperandNumericContext extends OperandContext {
		public NumericContext numeric() {
			return getRuleContext(NumericContext.class,0);
		}
		public OperandNumericContext(OperandContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OperandIdentifierContext extends OperandContext {
		public Token identifier;
		public TerminalNode IDENTIFIER() { return getToken(RISCVASMParser.IDENTIFIER, 0); }
		public OperandIdentifierContext(OperandContext ctx) { copyFrom(ctx); }
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_operand);
		try {
			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new OperandIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				((OperandIdentifierContext)_localctx).identifier = match(IDENTIFIER);
				}
				break;
			case DEC:
			case HEX:
			case BIN:
				_localctx = new OperandNumericContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				numeric();
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
	public static class NumericContext extends ParserRuleContext {
		public NumericContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric; }
	 
		public NumericContext() { }
		public void copyFrom(NumericContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumericBinContext extends NumericContext {
		public Token val;
		public TerminalNode BIN() { return getToken(RISCVASMParser.BIN, 0); }
		public NumericBinContext(NumericContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumericHexContext extends NumericContext {
		public Token val;
		public TerminalNode HEX() { return getToken(RISCVASMParser.HEX, 0); }
		public NumericHexContext(NumericContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumericDecContext extends NumericContext {
		public Token val;
		public TerminalNode DEC() { return getToken(RISCVASMParser.DEC, 0); }
		public NumericDecContext(NumericContext ctx) { copyFrom(ctx); }
	}

	public final NumericContext numeric() throws RecognitionException {
		NumericContext _localctx = new NumericContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_numeric);
		try {
			setState(97);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEC:
				_localctx = new NumericDecContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				((NumericDecContext)_localctx).val = match(DEC);
				}
				break;
			case HEX:
				_localctx = new NumericHexContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				((NumericHexContext)_localctx).val = match(HEX);
				}
				break;
			case BIN:
				_localctx = new NumericBinContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
				((NumericBinContext)_localctx).val = match(BIN);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return lines_sempred((LinesContext)_localctx, predIndex);
		case 4:
			return operands_sempred((OperandsContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean lines_sempred(LinesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean operands_sempred(OperandsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\fd\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000\u0005\u0000\u0010"+
		"\b\u0000\n\u0000\f\u0000\u0013\t\u0000\u0001\u0000\u0001\u0000\u0005\u0000"+
		"\u0017\b\u0000\n\u0000\f\u0000\u001a\t\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0003\u0001 \b\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001$\b\u0001\u0001\u0001\u0001\u0001\u0004\u0001(\b\u0001\u000b\u0001"+
		"\f\u0001)\u0001\u0001\u0003\u0001-\b\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u00011\b\u0001\u0005\u00013\b\u0001\n\u0001\f\u00016\t\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002<\b\u0002\n\u0002\f\u0002"+
		"?\t\u0002\u0001\u0002\u0003\u0002B\b\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003H\b\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004O\b\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004S\b\u0004\u0001\u0004\u0005\u0004V\b\u0004\n\u0004\f"+
		"\u0004Y\t\u0004\u0001\u0005\u0001\u0005\u0003\u0005]\b\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006b\b\u0006\u0001\u0006\u0000\u0002"+
		"\u0002\b\u0007\u0000\u0002\u0004\u0006\b\n\f\u0000\u0001\u0001\u0000\u0006"+
		"\u0007m\u0000\u0011\u0001\u0000\u0000\u0000\u0002\u001d\u0001\u0000\u0000"+
		"\u0000\u0004A\u0001\u0000\u0000\u0000\u0006G\u0001\u0000\u0000\u0000\b"+
		"I\u0001\u0000\u0000\u0000\n\\\u0001\u0000\u0000\u0000\fa\u0001\u0000\u0000"+
		"\u0000\u000e\u0010\u0005\u0007\u0000\u0000\u000f\u000e\u0001\u0000\u0000"+
		"\u0000\u0010\u0013\u0001\u0000\u0000\u0000\u0011\u000f\u0001\u0000\u0000"+
		"\u0000\u0011\u0012\u0001\u0000\u0000\u0000\u0012\u0014\u0001\u0000\u0000"+
		"\u0000\u0013\u0011\u0001\u0000\u0000\u0000\u0014\u0018\u0003\u0002\u0001"+
		"\u0000\u0015\u0017\u0005\u0007\u0000\u0000\u0016\u0015\u0001\u0000\u0000"+
		"\u0000\u0017\u001a\u0001\u0000\u0000\u0000\u0018\u0016\u0001\u0000\u0000"+
		"\u0000\u0018\u0019\u0001\u0000\u0000\u0000\u0019\u001b\u0001\u0000\u0000"+
		"\u0000\u001a\u0018\u0001\u0000\u0000\u0000\u001b\u001c\u0005\u0000\u0000"+
		"\u0001\u001c\u0001\u0001\u0000\u0000\u0000\u001d\u001f\u0006\u0001\uffff"+
		"\uffff\u0000\u001e \u0005\u0006\u0000\u0000\u001f\u001e\u0001\u0000\u0000"+
		"\u0000\u001f \u0001\u0000\u0000\u0000 !\u0001\u0000\u0000\u0000!#\u0003"+
		"\u0004\u0002\u0000\"$\u0005\u0006\u0000\u0000#\"\u0001\u0000\u0000\u0000"+
		"#$\u0001\u0000\u0000\u0000$4\u0001\u0000\u0000\u0000%\'\n\u0001\u0000"+
		"\u0000&(\u0005\u0007\u0000\u0000\'&\u0001\u0000\u0000\u0000()\u0001\u0000"+
		"\u0000\u0000)\'\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000*,\u0001"+
		"\u0000\u0000\u0000+-\u0005\u0006\u0000\u0000,+\u0001\u0000\u0000\u0000"+
		",-\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000.0\u0003\u0004\u0002"+
		"\u0000/1\u0005\u0006\u0000\u00000/\u0001\u0000\u0000\u000001\u0001\u0000"+
		"\u0000\u000013\u0001\u0000\u0000\u00002%\u0001\u0000\u0000\u000036\u0001"+
		"\u0000\u0000\u000042\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u0000"+
		"5\u0003\u0001\u0000\u0000\u000064\u0001\u0000\u0000\u00007B\u0003\u0006"+
		"\u0003\u000089\u0005\b\u0000\u00009=\u0005\u0001\u0000\u0000:<\u0007\u0000"+
		"\u0000\u0000;:\u0001\u0000\u0000\u0000<?\u0001\u0000\u0000\u0000=;\u0001"+
		"\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>@\u0001\u0000\u0000\u0000"+
		"?=\u0001\u0000\u0000\u0000@B\u0003\u0004\u0002\u0000A7\u0001\u0000\u0000"+
		"\u0000A8\u0001\u0000\u0000\u0000B\u0005\u0001\u0000\u0000\u0000CH\u0005"+
		"\b\u0000\u0000DE\u0005\b\u0000\u0000EF\u0005\u0006\u0000\u0000FH\u0003"+
		"\b\u0004\u0000GC\u0001\u0000\u0000\u0000GD\u0001\u0000\u0000\u0000H\u0007"+
		"\u0001\u0000\u0000\u0000IJ\u0006\u0004\uffff\uffff\u0000JK\u0003\n\u0005"+
		"\u0000KW\u0001\u0000\u0000\u0000LN\n\u0001\u0000\u0000MO\u0005\u0006\u0000"+
		"\u0000NM\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000OP\u0001\u0000"+
		"\u0000\u0000PR\u0005\u0002\u0000\u0000QS\u0005\u0006\u0000\u0000RQ\u0001"+
		"\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000"+
		"TV\u0003\n\u0005\u0000UL\u0001\u0000\u0000\u0000VY\u0001\u0000\u0000\u0000"+
		"WU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000X\t\u0001\u0000\u0000"+
		"\u0000YW\u0001\u0000\u0000\u0000Z]\u0005\b\u0000\u0000[]\u0003\f\u0006"+
		"\u0000\\Z\u0001\u0000\u0000\u0000\\[\u0001\u0000\u0000\u0000]\u000b\u0001"+
		"\u0000\u0000\u0000^b\u0005\t\u0000\u0000_b\u0005\n\u0000\u0000`b\u0005"+
		"\u000b\u0000\u0000a^\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000"+
		"a`\u0001\u0000\u0000\u0000b\r\u0001\u0000\u0000\u0000\u0010\u0011\u0018"+
		"\u001f#),04=AGNRW\\a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}