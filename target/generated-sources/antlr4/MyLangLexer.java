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
		TODOUBLE=10, ID=11, DOUBLE=12, INT=13, ADD=14, MULTIPLY=15, NEWLINE=16, 
		SUBSTRACT=17, DIVIDE=18, STRING=19, AND=20, OR=21, XOR=22, NOT=23, WS=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "PRINT", "READ", "TOINT", 
			"TODOUBLE", "ID", "DOUBLE", "INT", "ADD", "MULTIPLY", "NEWLINE", "SUBSTRACT", 
			"DIVIDE", "STRING", "AND", "OR", "XOR", "NOT", "WS"
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
		case 23:
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
		"\u0004\u0000\u0018\u0093\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0004\nY\b\n\u000b\n\f\nZ\u0001"+
		"\u000b\u0004\u000b^\b\u000b\u000b\u000b\f\u000b_\u0001\u000b\u0001\u000b"+
		"\u0004\u000bd\b\u000b\u000b\u000b\f\u000be\u0001\f\u0004\fi\b\f\u000b"+
		"\f\f\fj\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0003\u000f"+
		"r\b\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0005\u0012|\b\u0012\n\u0012\f\u0012"+
		"\u007f\t\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0004\u0017\u008e\b\u0017\u000b\u0017\f\u0017"+
		"\u008f\u0001\u0017\u0001\u0017\u0000\u0000\u0018\u0001\u0001\u0003\u0002"+
		"\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013"+
		"\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u0018\u0001\u0000\u0003\u0002"+
		"\u0000AZaz\u0002\u0000\"\"\\\\\u0002\u0000\t\t  \u0099\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000"+
		"\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000"+
		"\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'"+
		"\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000"+
		"\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000"+
		"\u00011\u0001\u0000\u0000\u0000\u00033\u0001\u0000\u0000\u0000\u00055"+
		"\u0001\u0000\u0000\u0000\u00077\u0001\u0000\u0000\u0000\t9\u0001\u0000"+
		"\u0000\u0000\u000b;\u0001\u0000\u0000\u0000\r=\u0001\u0000\u0000\u0000"+
		"\u000fC\u0001\u0000\u0000\u0000\u0011H\u0001\u0000\u0000\u0000\u0013N"+
		"\u0001\u0000\u0000\u0000\u0015X\u0001\u0000\u0000\u0000\u0017]\u0001\u0000"+
		"\u0000\u0000\u0019h\u0001\u0000\u0000\u0000\u001bl\u0001\u0000\u0000\u0000"+
		"\u001dn\u0001\u0000\u0000\u0000\u001fq\u0001\u0000\u0000\u0000!u\u0001"+
		"\u0000\u0000\u0000#w\u0001\u0000\u0000\u0000%y\u0001\u0000\u0000\u0000"+
		"\'\u0082\u0001\u0000\u0000\u0000)\u0085\u0001\u0000\u0000\u0000+\u0088"+
		"\u0001\u0000\u0000\u0000-\u008a\u0001\u0000\u0000\u0000/\u008d\u0001\u0000"+
		"\u0000\u000012\u0005=\u0000\u00002\u0002\u0001\u0000\u0000\u000034\u0005"+
		"[\u0000\u00004\u0004\u0001\u0000\u0000\u000056\u0005]\u0000\u00006\u0006"+
		"\u0001\u0000\u0000\u000078\u0005,\u0000\u00008\b\u0001\u0000\u0000\u0000"+
		"9:\u0005(\u0000\u0000:\n\u0001\u0000\u0000\u0000;<\u0005)\u0000\u0000"+
		"<\f\u0001\u0000\u0000\u0000=>\u0005p\u0000\u0000>?\u0005r\u0000\u0000"+
		"?@\u0005i\u0000\u0000@A\u0005n\u0000\u0000AB\u0005t\u0000\u0000B\u000e"+
		"\u0001\u0000\u0000\u0000CD\u0005r\u0000\u0000DE\u0005e\u0000\u0000EF\u0005"+
		"a\u0000\u0000FG\u0005d\u0000\u0000G\u0010\u0001\u0000\u0000\u0000HI\u0005"+
		"(\u0000\u0000IJ\u0005i\u0000\u0000JK\u0005n\u0000\u0000KL\u0005t\u0000"+
		"\u0000LM\u0005)\u0000\u0000M\u0012\u0001\u0000\u0000\u0000NO\u0005(\u0000"+
		"\u0000OP\u0005d\u0000\u0000PQ\u0005o\u0000\u0000QR\u0005u\u0000\u0000"+
		"RS\u0005b\u0000\u0000ST\u0005l\u0000\u0000TU\u0005e\u0000\u0000UV\u0005"+
		")\u0000\u0000V\u0014\u0001\u0000\u0000\u0000WY\u0007\u0000\u0000\u0000"+
		"XW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000"+
		"\u0000Z[\u0001\u0000\u0000\u0000[\u0016\u0001\u0000\u0000\u0000\\^\u0002"+
		"09\u0000]\\\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_]\u0001"+
		"\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000"+
		"ac\u0005.\u0000\u0000bd\u000209\u0000cb\u0001\u0000\u0000\u0000de\u0001"+
		"\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000"+
		"f\u0018\u0001\u0000\u0000\u0000gi\u000209\u0000hg\u0001\u0000\u0000\u0000"+
		"ij\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000"+
		"\u0000k\u001a\u0001\u0000\u0000\u0000lm\u0005+\u0000\u0000m\u001c\u0001"+
		"\u0000\u0000\u0000no\u0005*\u0000\u0000o\u001e\u0001\u0000\u0000\u0000"+
		"pr\u0005\r\u0000\u0000qp\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000"+
		"rs\u0001\u0000\u0000\u0000st\u0005\n\u0000\u0000t \u0001\u0000\u0000\u0000"+
		"uv\u0005-\u0000\u0000v\"\u0001\u0000\u0000\u0000wx\u0005/\u0000\u0000"+
		"x$\u0001\u0000\u0000\u0000y}\u0005\"\u0000\u0000z|\b\u0001\u0000\u0000"+
		"{z\u0001\u0000\u0000\u0000|\u007f\u0001\u0000\u0000\u0000}{\u0001\u0000"+
		"\u0000\u0000}~\u0001\u0000\u0000\u0000~\u0080\u0001\u0000\u0000\u0000"+
		"\u007f}\u0001\u0000\u0000\u0000\u0080\u0081\u0005\"\u0000\u0000\u0081"+
		"&\u0001\u0000\u0000\u0000\u0082\u0083\u0005&\u0000\u0000\u0083\u0084\u0005"+
		"&\u0000\u0000\u0084(\u0001\u0000\u0000\u0000\u0085\u0086\u0005|\u0000"+
		"\u0000\u0086\u0087\u0005|\u0000\u0000\u0087*\u0001\u0000\u0000\u0000\u0088"+
		"\u0089\u0005^\u0000\u0000\u0089,\u0001\u0000\u0000\u0000\u008a\u008b\u0005"+
		"!\u0000\u0000\u008b.\u0001\u0000\u0000\u0000\u008c\u008e\u0007\u0002\u0000"+
		"\u0000\u008d\u008c\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000"+
		"\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000"+
		"\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u0092\u0006\u0017\u0000"+
		"\u0000\u00920\u0001\u0000\u0000\u0000\b\u0000Z_ejq}\u008f\u0001\u0001"+
		"\u0017\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}