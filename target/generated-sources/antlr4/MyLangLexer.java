// Generated from MyLang.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class MyLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, PRINT=7, READ=8, TOINT=9, 
		TODOUBLE=10, TOFLOAT=11, TOLONG=12, ID=13, INT=14, DOUBLE=15, ADD=16, 
		MULTIPLY=17, NEWLINE=18, SUBSTRACT=19, DIVIDE=20, STRING=21, WS=22, AND=23, 
		OR=24, XOR=25, NEG=26, BOOL=27;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "PRINT", "READ", "TOINT", 
			"TODOUBLE", "TOFLOAT", "TOLONG", "ID", "INT", "DOUBLE", "ADD", "MULTIPLY", 
			"NEWLINE", "SUBSTRACT", "DIVIDE", "STRING", "WS", "AND", "OR", "XOR", 
			"NEG", "BOOL"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'['", "']'", "','", "'('", "')'", "'print'", "'read'", 
			"'(int)'", "'(double)'", "'(float)'", "'(long)'", null, null, null, "'+'", 
			"'*'", null, "'-'", "'/'", null, null, "'&'", "'|'", "'^'", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "PRINT", "READ", "TOINT", "TODOUBLE", 
			"TOFLOAT", "TOLONG", "ID", "INT", "DOUBLE", "ADD", "MULTIPLY", "NEWLINE", 
			"SUBSTRACT", "DIVIDE", "STRING", "WS", "AND", "OR", "XOR", "NEG", "BOOL"
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


	public MyLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MyLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 21:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 skip(); 
			break;
		}
	}

	public static final String _serializedATN =
		"\u0004\u0000\u001b\u00b1\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0004\fn\b\f\u000b\f\f\f"+
		"o\u0001\r\u0004\rs\b\r\u000b\r\f\rt\u0001\u000e\u0004\u000ex\b\u000e\u000b"+
		"\u000e\f\u000ey\u0001\u000e\u0001\u000e\u0004\u000e~\b\u000e\u000b\u000e"+
		"\f\u000e\u007f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0003\u0011\u0087\b\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0005\u0014\u0091\b\u0014"+
		"\n\u0014\f\u0014\u0094\t\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0004"+
		"\u0015\u0099\b\u0015\u000b\u0015\f\u0015\u009a\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a"+
		"\u00b0\b\u001a\u0000\u0000\u001b\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b"+
		"\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013"+
		"\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b\u0001\u0000"+
		"\u0004\u0002\u0000AZaz\u0001\u000009\u0002\u0000\"\"\\\\\u0002\u0000\t"+
		"\t  \u00b8\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000"+
		"\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%"+
		"\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000"+
		"\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u0000"+
		"3\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00017\u0001"+
		"\u0000\u0000\u0000\u00039\u0001\u0000\u0000\u0000\u0005;\u0001\u0000\u0000"+
		"\u0000\u0007=\u0001\u0000\u0000\u0000\t?\u0001\u0000\u0000\u0000\u000b"+
		"A\u0001\u0000\u0000\u0000\rC\u0001\u0000\u0000\u0000\u000fI\u0001\u0000"+
		"\u0000\u0000\u0011N\u0001\u0000\u0000\u0000\u0013T\u0001\u0000\u0000\u0000"+
		"\u0015]\u0001\u0000\u0000\u0000\u0017e\u0001\u0000\u0000\u0000\u0019m"+
		"\u0001\u0000\u0000\u0000\u001br\u0001\u0000\u0000\u0000\u001dw\u0001\u0000"+
		"\u0000\u0000\u001f\u0081\u0001\u0000\u0000\u0000!\u0083\u0001\u0000\u0000"+
		"\u0000#\u0086\u0001\u0000\u0000\u0000%\u008a\u0001\u0000\u0000\u0000\'"+
		"\u008c\u0001\u0000\u0000\u0000)\u008e\u0001\u0000\u0000\u0000+\u0098\u0001"+
		"\u0000\u0000\u0000-\u009e\u0001\u0000\u0000\u0000/\u00a0\u0001\u0000\u0000"+
		"\u00001\u00a2\u0001\u0000\u0000\u00003\u00a4\u0001\u0000\u0000\u00005"+
		"\u00af\u0001\u0000\u0000\u000078\u0005=\u0000\u00008\u0002\u0001\u0000"+
		"\u0000\u00009:\u0005[\u0000\u0000:\u0004\u0001\u0000\u0000\u0000;<\u0005"+
		"]\u0000\u0000<\u0006\u0001\u0000\u0000\u0000=>\u0005,\u0000\u0000>\b\u0001"+
		"\u0000\u0000\u0000?@\u0005(\u0000\u0000@\n\u0001\u0000\u0000\u0000AB\u0005"+
		")\u0000\u0000B\f\u0001\u0000\u0000\u0000CD\u0005p\u0000\u0000DE\u0005"+
		"r\u0000\u0000EF\u0005i\u0000\u0000FG\u0005n\u0000\u0000GH\u0005t\u0000"+
		"\u0000H\u000e\u0001\u0000\u0000\u0000IJ\u0005r\u0000\u0000JK\u0005e\u0000"+
		"\u0000KL\u0005a\u0000\u0000LM\u0005d\u0000\u0000M\u0010\u0001\u0000\u0000"+
		"\u0000NO\u0005(\u0000\u0000OP\u0005i\u0000\u0000PQ\u0005n\u0000\u0000"+
		"QR\u0005t\u0000\u0000RS\u0005)\u0000\u0000S\u0012\u0001\u0000\u0000\u0000"+
		"TU\u0005(\u0000\u0000UV\u0005d\u0000\u0000VW\u0005o\u0000\u0000WX\u0005"+
		"u\u0000\u0000XY\u0005b\u0000\u0000YZ\u0005l\u0000\u0000Z[\u0005e\u0000"+
		"\u0000[\\\u0005)\u0000\u0000\\\u0014\u0001\u0000\u0000\u0000]^\u0005("+
		"\u0000\u0000^_\u0005f\u0000\u0000_`\u0005l\u0000\u0000`a\u0005o\u0000"+
		"\u0000ab\u0005a\u0000\u0000bc\u0005t\u0000\u0000cd\u0005)\u0000\u0000"+
		"d\u0016\u0001\u0000\u0000\u0000ef\u0005(\u0000\u0000fg\u0005l\u0000\u0000"+
		"gh\u0005o\u0000\u0000hi\u0005n\u0000\u0000ij\u0005g\u0000\u0000jk\u0005"+
		")\u0000\u0000k\u0018\u0001\u0000\u0000\u0000ln\u0007\u0000\u0000\u0000"+
		"ml\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000om\u0001\u0000\u0000"+
		"\u0000op\u0001\u0000\u0000\u0000p\u001a\u0001\u0000\u0000\u0000qs\u0007"+
		"\u0001\u0000\u0000rq\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000"+
		"tr\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000u\u001c\u0001\u0000"+
		"\u0000\u0000vx\u0007\u0001\u0000\u0000wv\u0001\u0000\u0000\u0000xy\u0001"+
		"\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000"+
		"z{\u0001\u0000\u0000\u0000{}\u0005.\u0000\u0000|~\u0007\u0001\u0000\u0000"+
		"}|\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f}\u0001"+
		"\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u001e\u0001"+
		"\u0000\u0000\u0000\u0081\u0082\u0005+\u0000\u0000\u0082 \u0001\u0000\u0000"+
		"\u0000\u0083\u0084\u0005*\u0000\u0000\u0084\"\u0001\u0000\u0000\u0000"+
		"\u0085\u0087\u0005\r\u0000\u0000\u0086\u0085\u0001\u0000\u0000\u0000\u0086"+
		"\u0087\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088"+
		"\u0089\u0005\n\u0000\u0000\u0089$\u0001\u0000\u0000\u0000\u008a\u008b"+
		"\u0005-\u0000\u0000\u008b&\u0001\u0000\u0000\u0000\u008c\u008d\u0005/"+
		"\u0000\u0000\u008d(\u0001\u0000\u0000\u0000\u008e\u0092\u0005\"\u0000"+
		"\u0000\u008f\u0091\b\u0002\u0000\u0000\u0090\u008f\u0001\u0000\u0000\u0000"+
		"\u0091\u0094\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000"+
		"\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0095\u0001\u0000\u0000\u0000"+
		"\u0094\u0092\u0001\u0000\u0000\u0000\u0095\u0096\u0005\"\u0000\u0000\u0096"+
		"*\u0001\u0000\u0000\u0000\u0097\u0099\u0007\u0003\u0000\u0000\u0098\u0097"+
		"\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u0098"+
		"\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u009c"+
		"\u0001\u0000\u0000\u0000\u009c\u009d\u0006\u0015\u0000\u0000\u009d,\u0001"+
		"\u0000\u0000\u0000\u009e\u009f\u0005&\u0000\u0000\u009f.\u0001\u0000\u0000"+
		"\u0000\u00a0\u00a1\u0005|\u0000\u0000\u00a10\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a3\u0005^\u0000\u0000\u00a32\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005"+
		"!\u0000\u0000\u00a54\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005t\u0000"+
		"\u0000\u00a7\u00a8\u0005r\u0000\u0000\u00a8\u00a9\u0005u\u0000\u0000\u00a9"+
		"\u00b0\u0005e\u0000\u0000\u00aa\u00ab\u0005f\u0000\u0000\u00ab\u00ac\u0005"+
		"a\u0000\u0000\u00ac\u00ad\u0005l\u0000\u0000\u00ad\u00ae\u0005s\u0000"+
		"\u0000\u00ae\u00b0\u0005e\u0000\u0000\u00af\u00a6\u0001\u0000\u0000\u0000"+
		"\u00af\u00aa\u0001\u0000\u0000\u0000\u00b06\u0001\u0000\u0000\u0000\t"+
		"\u0000oty\u007f\u0086\u0092\u009a\u00af\u0001\u0001\u0015\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}