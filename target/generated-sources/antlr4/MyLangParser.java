// Generated from MyLang.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class MyLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, PRINT=7, READ=8, TOINT=9, 
		TODOUBLE=10, ID=11, DOUBLE=12, INT=13, ADD=14, MULTIPLY=15, NEWLINE=16, 
		SUBSTRACT=17, DIVIDE=18, STRING=19, AND=20, OR=21, XOR=22, NOT=23, WS=24;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_expr0 = 2, RULE_expr1 = 3, RULE_expr2 = 4, 
		RULE_array_element = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stat", "expr0", "expr1", "expr2", "array_element"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'['", "']'", "','", "'('", "')'", "'print'", "'read'", 
			"'(int)'", "'(double)'", null, null, null, "'+'", "'*'", null, "'-'", 
			"'/'", null, "'&&'", "'||'", "'^'", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "PRINT", "READ", "TOINT", "TODOUBLE", 
			"ID", "DOUBLE", "INT", "ADD", "MULTIPLY", "NEWLINE", "SUBSTRACT", "DIVIDE", 
			"STRING", "AND", "OR", "XOR", "NOT", "WS"
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
	public String getGrammarFileName() { return "MyLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MyLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(MyLangParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(MyLangParser.NEWLINE, i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 67968L) != 0)) {
				{
				{
				setState(13);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2432L) != 0)) {
					{
					setState(12);
					stat();
					}
				}

				setState(15);
				match(NEWLINE);
				}
				}
				setState(20);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
	public static class StatContext extends ParserRuleContext {
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintContext extends StatContext {
		public TerminalNode PRINT() { return getToken(MyLangParser.PRINT, 0); }
		public TerminalNode ID() { return getToken(MyLangParser.ID, 0); }
		public PrintContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitPrint(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReadContext extends StatContext {
		public TerminalNode READ() { return getToken(MyLangParser.READ, 0); }
		public TerminalNode ID() { return getToken(MyLangParser.ID, 0); }
		public ReadContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitRead(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignArrayContext extends StatContext {
		public TerminalNode ID() { return getToken(MyLangParser.ID, 0); }
		public List<Expr0Context> expr0() {
			return getRuleContexts(Expr0Context.class);
		}
		public Expr0Context expr0(int i) {
			return getRuleContext(Expr0Context.class,i);
		}
		public AssignArrayContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterAssignArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitAssignArray(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignContext extends StatContext {
		public TerminalNode ID() { return getToken(MyLangParser.ID, 0); }
		public Expr0Context expr0() {
			return getRuleContext(Expr0Context.class,0);
		}
		public AssignContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitAssign(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(35);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(21);
				match(ID);
				setState(22);
				match(T__0);
				setState(23);
				expr0();
				}
				break;
			case 2:
				_localctx = new AssignArrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(24);
				match(ID);
				setState(25);
				match(T__1);
				setState(26);
				expr0();
				setState(27);
				match(T__2);
				setState(28);
				match(T__0);
				setState(29);
				expr0();
				}
				break;
			case 3:
				_localctx = new PrintContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(31);
				match(PRINT);
				setState(32);
				match(ID);
				}
				break;
			case 4:
				_localctx = new ReadContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(33);
				match(READ);
				setState(34);
				match(ID);
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
	public static class Expr0Context extends ParserRuleContext {
		public Expr0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr0; }
	 
		public Expr0Context() { }
		public void copyFrom(Expr0Context ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Single0Context extends Expr0Context {
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public Single0Context(Expr0Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterSingle0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitSingle0(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddContext extends Expr0Context {
		public List<Expr1Context> expr1() {
			return getRuleContexts(Expr1Context.class);
		}
		public Expr1Context expr1(int i) {
			return getRuleContext(Expr1Context.class,i);
		}
		public TerminalNode ADD() { return getToken(MyLangParser.ADD, 0); }
		public AddContext(Expr0Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitAdd(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubContext extends Expr0Context {
		public List<Expr1Context> expr1() {
			return getRuleContexts(Expr1Context.class);
		}
		public Expr1Context expr1(int i) {
			return getRuleContext(Expr1Context.class,i);
		}
		public TerminalNode SUBSTRACT() { return getToken(MyLangParser.SUBSTRACT, 0); }
		public SubContext(Expr0Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitSub(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotContext extends Expr0Context {
		public TerminalNode NOT() { return getToken(MyLangParser.NOT, 0); }
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public NotContext(Expr0Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitNot(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrContext extends Expr0Context {
		public List<Expr1Context> expr1() {
			return getRuleContexts(Expr1Context.class);
		}
		public Expr1Context expr1(int i) {
			return getRuleContext(Expr1Context.class,i);
		}
		public TerminalNode OR() { return getToken(MyLangParser.OR, 0); }
		public OrContext(Expr0Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitOr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndContext extends Expr0Context {
		public List<Expr1Context> expr1() {
			return getRuleContexts(Expr1Context.class);
		}
		public Expr1Context expr1(int i) {
			return getRuleContext(Expr1Context.class,i);
		}
		public TerminalNode AND() { return getToken(MyLangParser.AND, 0); }
		public AndContext(Expr0Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitAnd(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class XorContext extends Expr0Context {
		public List<Expr1Context> expr1() {
			return getRuleContexts(Expr1Context.class);
		}
		public Expr1Context expr1(int i) {
			return getRuleContext(Expr1Context.class,i);
		}
		public TerminalNode XOR() { return getToken(MyLangParser.XOR, 0); }
		public XorContext(Expr0Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterXor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitXor(this);
		}
	}

	public final Expr0Context expr0() throws RecognitionException {
		Expr0Context _localctx = new Expr0Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_expr0);
		try {
			setState(60);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new Single0Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				expr1();
				}
				break;
			case 2:
				_localctx = new AddContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				expr1();
				setState(39);
				match(ADD);
				setState(40);
				expr1();
				}
				break;
			case 3:
				_localctx = new SubContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(42);
				expr1();
				setState(43);
				match(SUBSTRACT);
				setState(44);
				expr1();
				}
				break;
			case 4:
				_localctx = new AndContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(46);
				expr1();
				setState(47);
				match(AND);
				setState(48);
				expr1();
				}
				break;
			case 5:
				_localctx = new OrContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(50);
				expr1();
				setState(51);
				match(OR);
				setState(52);
				expr1();
				}
				break;
			case 6:
				_localctx = new XorContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(54);
				expr1();
				setState(55);
				match(XOR);
				setState(56);
				expr1();
				}
				break;
			case 7:
				_localctx = new NotContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(58);
				match(NOT);
				setState(59);
				expr1();
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
	public static class Expr1Context extends ParserRuleContext {
		public Expr1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr1; }
	 
		public Expr1Context() { }
		public void copyFrom(Expr1Context ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Single1Context extends Expr1Context {
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public Single1Context(Expr1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterSingle1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitSingle1(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivideContext extends Expr1Context {
		public List<Expr2Context> expr2() {
			return getRuleContexts(Expr2Context.class);
		}
		public Expr2Context expr2(int i) {
			return getRuleContext(Expr2Context.class,i);
		}
		public TerminalNode DIVIDE() { return getToken(MyLangParser.DIVIDE, 0); }
		public DivideContext(Expr1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterDivide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitDivide(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultiplyContext extends Expr1Context {
		public List<Expr2Context> expr2() {
			return getRuleContexts(Expr2Context.class);
		}
		public Expr2Context expr2(int i) {
			return getRuleContext(Expr2Context.class,i);
		}
		public TerminalNode MULTIPLY() { return getToken(MyLangParser.MULTIPLY, 0); }
		public MultiplyContext(Expr1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterMultiply(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitMultiply(this);
		}
	}

	public final Expr1Context expr1() throws RecognitionException {
		Expr1Context _localctx = new Expr1Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_expr1);
		try {
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new Single1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				expr2();
				}
				break;
			case 2:
				_localctx = new MultiplyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				expr2();
				setState(64);
				match(MULTIPLY);
				setState(65);
				expr2();
				}
				break;
			case 3:
				_localctx = new DivideContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(67);
				expr2();
				setState(68);
				match(DIVIDE);
				setState(69);
				expr2();
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
	public static class Expr2Context extends ParserRuleContext {
		public Expr2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr2; }
	 
		public Expr2Context() { }
		public void copyFrom(Expr2Context ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayItemContext extends Expr2Context {
		public TerminalNode ID() { return getToken(MyLangParser.ID, 0); }
		public Expr0Context expr0() {
			return getRuleContext(Expr0Context.class,0);
		}
		public ArrayItemContext(Expr2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterArrayItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitArrayItem(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParContext extends Expr2Context {
		public Expr0Context expr0() {
			return getRuleContext(Expr0Context.class,0);
		}
		public ParContext(Expr2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitPar(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TointContext extends Expr2Context {
		public TerminalNode TOINT() { return getToken(MyLangParser.TOINT, 0); }
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public TointContext(Expr2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterToint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitToint(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringContext extends Expr2Context {
		public TerminalNode STRING() { return getToken(MyLangParser.STRING, 0); }
		public StringContext(Expr2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitString(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayContext extends Expr2Context {
		public List<Array_elementContext> array_element() {
			return getRuleContexts(Array_elementContext.class);
		}
		public Array_elementContext array_element(int i) {
			return getRuleContext(Array_elementContext.class,i);
		}
		public ArrayContext(Expr2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitArray(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DoubleContext extends Expr2Context {
		public TerminalNode DOUBLE() { return getToken(MyLangParser.DOUBLE, 0); }
		public DoubleContext(Expr2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterDouble(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitDouble(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdContext extends Expr2Context {
		public TerminalNode ID() { return getToken(MyLangParser.ID, 0); }
		public IdContext(Expr2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitId(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntContext extends Expr2Context {
		public TerminalNode INT() { return getToken(MyLangParser.INT, 0); }
		public IntContext(Expr2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitInt(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TodoubleContext extends Expr2Context {
		public TerminalNode TODOUBLE() { return getToken(MyLangParser.TODOUBLE, 0); }
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public TodoubleContext(Expr2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterTodouble(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitTodouble(this);
		}
	}

	public final Expr2Context expr2() throws RecognitionException {
		Expr2Context _localctx = new Expr2Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_expr2);
		int _la;
		try {
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new IntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				match(INT);
				}
				break;
			case 2:
				_localctx = new DoubleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				match(DOUBLE);
				}
				break;
			case 3:
				_localctx = new IdContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(75);
				match(ID);
				}
				break;
			case 4:
				_localctx = new ArrayItemContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(76);
				match(ID);
				setState(77);
				match(T__1);
				setState(78);
				expr0();
				setState(79);
				match(T__2);
				}
				break;
			case 5:
				_localctx = new StringContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(81);
				match(STRING);
				}
				break;
			case 6:
				_localctx = new TointContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(82);
				match(TOINT);
				setState(83);
				expr2();
				}
				break;
			case 7:
				_localctx = new TodoubleContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(84);
				match(TODOUBLE);
				setState(85);
				expr2();
				}
				break;
			case 8:
				_localctx = new ArrayContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(86);
				match(T__1);
				setState(87);
				array_element();
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(88);
					match(T__3);
					setState(89);
					array_element();
					}
					}
					setState(94);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(95);
				match(T__2);
				}
				break;
			case 9:
				_localctx = new ParContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(97);
				match(T__4);
				setState(98);
				expr0();
				setState(99);
				match(T__5);
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
	public static class Array_elementContext extends ParserRuleContext {
		public Array_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_element; }
	 
		public Array_elementContext() { }
		public void copyFrom(Array_elementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayElementContext extends Array_elementContext {
		public Expr0Context expr0() {
			return getRuleContext(Expr0Context.class,0);
		}
		public ArrayElementContext(Array_elementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).enterArrayElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLangListener ) ((MyLangListener)listener).exitArrayElement(this);
		}
	}

	public final Array_elementContext array_element() throws RecognitionException {
		Array_elementContext _localctx = new Array_elementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_array_element);
		try {
			_localctx = new ArrayElementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			expr0();
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
		"\u0004\u0001\u0018j\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0001\u0000\u0003\u0000\u000e\b\u0000\u0001\u0000\u0005"+
		"\u0000\u0011\b\u0000\n\u0000\f\u0000\u0014\t\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001$\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002=\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003H\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0005\u0004[\b\u0004\n\u0004\f\u0004^\t\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"f\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0000\u0000\u0006\u0000"+
		"\u0002\u0004\u0006\b\n\u0000\u0000y\u0000\u0012\u0001\u0000\u0000\u0000"+
		"\u0002#\u0001\u0000\u0000\u0000\u0004<\u0001\u0000\u0000\u0000\u0006G"+
		"\u0001\u0000\u0000\u0000\be\u0001\u0000\u0000\u0000\ng\u0001\u0000\u0000"+
		"\u0000\f\u000e\u0003\u0002\u0001\u0000\r\f\u0001\u0000\u0000\u0000\r\u000e"+
		"\u0001\u0000\u0000\u0000\u000e\u000f\u0001\u0000\u0000\u0000\u000f\u0011"+
		"\u0005\u0010\u0000\u0000\u0010\r\u0001\u0000\u0000\u0000\u0011\u0014\u0001"+
		"\u0000\u0000\u0000\u0012\u0010\u0001\u0000\u0000\u0000\u0012\u0013\u0001"+
		"\u0000\u0000\u0000\u0013\u0001\u0001\u0000\u0000\u0000\u0014\u0012\u0001"+
		"\u0000\u0000\u0000\u0015\u0016\u0005\u000b\u0000\u0000\u0016\u0017\u0005"+
		"\u0001\u0000\u0000\u0017$\u0003\u0004\u0002\u0000\u0018\u0019\u0005\u000b"+
		"\u0000\u0000\u0019\u001a\u0005\u0002\u0000\u0000\u001a\u001b\u0003\u0004"+
		"\u0002\u0000\u001b\u001c\u0005\u0003\u0000\u0000\u001c\u001d\u0005\u0001"+
		"\u0000\u0000\u001d\u001e\u0003\u0004\u0002\u0000\u001e$\u0001\u0000\u0000"+
		"\u0000\u001f \u0005\u0007\u0000\u0000 $\u0005\u000b\u0000\u0000!\"\u0005"+
		"\b\u0000\u0000\"$\u0005\u000b\u0000\u0000#\u0015\u0001\u0000\u0000\u0000"+
		"#\u0018\u0001\u0000\u0000\u0000#\u001f\u0001\u0000\u0000\u0000#!\u0001"+
		"\u0000\u0000\u0000$\u0003\u0001\u0000\u0000\u0000%=\u0003\u0006\u0003"+
		"\u0000&\'\u0003\u0006\u0003\u0000\'(\u0005\u000e\u0000\u0000()\u0003\u0006"+
		"\u0003\u0000)=\u0001\u0000\u0000\u0000*+\u0003\u0006\u0003\u0000+,\u0005"+
		"\u0011\u0000\u0000,-\u0003\u0006\u0003\u0000-=\u0001\u0000\u0000\u0000"+
		"./\u0003\u0006\u0003\u0000/0\u0005\u0014\u0000\u000001\u0003\u0006\u0003"+
		"\u00001=\u0001\u0000\u0000\u000023\u0003\u0006\u0003\u000034\u0005\u0015"+
		"\u0000\u000045\u0003\u0006\u0003\u00005=\u0001\u0000\u0000\u000067\u0003"+
		"\u0006\u0003\u000078\u0005\u0016\u0000\u000089\u0003\u0006\u0003\u0000"+
		"9=\u0001\u0000\u0000\u0000:;\u0005\u0017\u0000\u0000;=\u0003\u0006\u0003"+
		"\u0000<%\u0001\u0000\u0000\u0000<&\u0001\u0000\u0000\u0000<*\u0001\u0000"+
		"\u0000\u0000<.\u0001\u0000\u0000\u0000<2\u0001\u0000\u0000\u0000<6\u0001"+
		"\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000=\u0005\u0001\u0000\u0000"+
		"\u0000>H\u0003\b\u0004\u0000?@\u0003\b\u0004\u0000@A\u0005\u000f\u0000"+
		"\u0000AB\u0003\b\u0004\u0000BH\u0001\u0000\u0000\u0000CD\u0003\b\u0004"+
		"\u0000DE\u0005\u0012\u0000\u0000EF\u0003\b\u0004\u0000FH\u0001\u0000\u0000"+
		"\u0000G>\u0001\u0000\u0000\u0000G?\u0001\u0000\u0000\u0000GC\u0001\u0000"+
		"\u0000\u0000H\u0007\u0001\u0000\u0000\u0000If\u0005\r\u0000\u0000Jf\u0005"+
		"\f\u0000\u0000Kf\u0005\u000b\u0000\u0000LM\u0005\u000b\u0000\u0000MN\u0005"+
		"\u0002\u0000\u0000NO\u0003\u0004\u0002\u0000OP\u0005\u0003\u0000\u0000"+
		"Pf\u0001\u0000\u0000\u0000Qf\u0005\u0013\u0000\u0000RS\u0005\t\u0000\u0000"+
		"Sf\u0003\b\u0004\u0000TU\u0005\n\u0000\u0000Uf\u0003\b\u0004\u0000VW\u0005"+
		"\u0002\u0000\u0000W\\\u0003\n\u0005\u0000XY\u0005\u0004\u0000\u0000Y["+
		"\u0003\n\u0005\u0000ZX\u0001\u0000\u0000\u0000[^\u0001\u0000\u0000\u0000"+
		"\\Z\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]_\u0001\u0000\u0000"+
		"\u0000^\\\u0001\u0000\u0000\u0000_`\u0005\u0003\u0000\u0000`f\u0001\u0000"+
		"\u0000\u0000ab\u0005\u0005\u0000\u0000bc\u0003\u0004\u0002\u0000cd\u0005"+
		"\u0006\u0000\u0000df\u0001\u0000\u0000\u0000eI\u0001\u0000\u0000\u0000"+
		"eJ\u0001\u0000\u0000\u0000eK\u0001\u0000\u0000\u0000eL\u0001\u0000\u0000"+
		"\u0000eQ\u0001\u0000\u0000\u0000eR\u0001\u0000\u0000\u0000eT\u0001\u0000"+
		"\u0000\u0000eV\u0001\u0000\u0000\u0000ea\u0001\u0000\u0000\u0000f\t\u0001"+
		"\u0000\u0000\u0000gh\u0003\u0004\u0002\u0000h\u000b\u0001\u0000\u0000"+
		"\u0000\u0007\r\u0012#<G\\e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}