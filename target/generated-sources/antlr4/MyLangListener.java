// Generated from MyLang.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MyLangParser}.
 */
public interface MyLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MyLangParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(MyLangParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(MyLangParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link MyLangParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssign(MyLangParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link MyLangParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssign(MyLangParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignArray}
	 * labeled alternative in {@link MyLangParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssignArray(MyLangParser.AssignArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignArray}
	 * labeled alternative in {@link MyLangParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssignArray(MyLangParser.AssignArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code print}
	 * labeled alternative in {@link MyLangParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterPrint(MyLangParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code print}
	 * labeled alternative in {@link MyLangParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitPrint(MyLangParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code read}
	 * labeled alternative in {@link MyLangParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterRead(MyLangParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code read}
	 * labeled alternative in {@link MyLangParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitRead(MyLangParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code single0}
	 * labeled alternative in {@link MyLangParser#expr0}.
	 * @param ctx the parse tree
	 */
	void enterSingle0(MyLangParser.Single0Context ctx);
	/**
	 * Exit a parse tree produced by the {@code single0}
	 * labeled alternative in {@link MyLangParser#expr0}.
	 * @param ctx the parse tree
	 */
	void exitSingle0(MyLangParser.Single0Context ctx);
	/**
	 * Enter a parse tree produced by the {@code add}
	 * labeled alternative in {@link MyLangParser#expr0}.
	 * @param ctx the parse tree
	 */
	void enterAdd(MyLangParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code add}
	 * labeled alternative in {@link MyLangParser#expr0}.
	 * @param ctx the parse tree
	 */
	void exitAdd(MyLangParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sub}
	 * labeled alternative in {@link MyLangParser#expr0}.
	 * @param ctx the parse tree
	 */
	void enterSub(MyLangParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sub}
	 * labeled alternative in {@link MyLangParser#expr0}.
	 * @param ctx the parse tree
	 */
	void exitSub(MyLangParser.SubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code and}
	 * labeled alternative in {@link MyLangParser#expr0}.
	 * @param ctx the parse tree
	 */
	void enterAnd(MyLangParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code and}
	 * labeled alternative in {@link MyLangParser#expr0}.
	 * @param ctx the parse tree
	 */
	void exitAnd(MyLangParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code or}
	 * labeled alternative in {@link MyLangParser#expr0}.
	 * @param ctx the parse tree
	 */
	void enterOr(MyLangParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code or}
	 * labeled alternative in {@link MyLangParser#expr0}.
	 * @param ctx the parse tree
	 */
	void exitOr(MyLangParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xor}
	 * labeled alternative in {@link MyLangParser#expr0}.
	 * @param ctx the parse tree
	 */
	void enterXor(MyLangParser.XorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xor}
	 * labeled alternative in {@link MyLangParser#expr0}.
	 * @param ctx the parse tree
	 */
	void exitXor(MyLangParser.XorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code not}
	 * labeled alternative in {@link MyLangParser#expr0}.
	 * @param ctx the parse tree
	 */
	void enterNot(MyLangParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code not}
	 * labeled alternative in {@link MyLangParser#expr0}.
	 * @param ctx the parse tree
	 */
	void exitNot(MyLangParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code single1}
	 * labeled alternative in {@link MyLangParser#expr1}.
	 * @param ctx the parse tree
	 */
	void enterSingle1(MyLangParser.Single1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code single1}
	 * labeled alternative in {@link MyLangParser#expr1}.
	 * @param ctx the parse tree
	 */
	void exitSingle1(MyLangParser.Single1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code multiply}
	 * labeled alternative in {@link MyLangParser#expr1}.
	 * @param ctx the parse tree
	 */
	void enterMultiply(MyLangParser.MultiplyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiply}
	 * labeled alternative in {@link MyLangParser#expr1}.
	 * @param ctx the parse tree
	 */
	void exitMultiply(MyLangParser.MultiplyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divide}
	 * labeled alternative in {@link MyLangParser#expr1}.
	 * @param ctx the parse tree
	 */
	void enterDivide(MyLangParser.DivideContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divide}
	 * labeled alternative in {@link MyLangParser#expr1}.
	 * @param ctx the parse tree
	 */
	void exitDivide(MyLangParser.DivideContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link MyLangParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterInt(MyLangParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link MyLangParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitInt(MyLangParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code double}
	 * labeled alternative in {@link MyLangParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterDouble(MyLangParser.DoubleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code double}
	 * labeled alternative in {@link MyLangParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitDouble(MyLangParser.DoubleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link MyLangParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterId(MyLangParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link MyLangParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitId(MyLangParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayItem}
	 * labeled alternative in {@link MyLangParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterArrayItem(MyLangParser.ArrayItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayItem}
	 * labeled alternative in {@link MyLangParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitArrayItem(MyLangParser.ArrayItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string}
	 * labeled alternative in {@link MyLangParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterString(MyLangParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string}
	 * labeled alternative in {@link MyLangParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitString(MyLangParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code toint}
	 * labeled alternative in {@link MyLangParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterToint(MyLangParser.TointContext ctx);
	/**
	 * Exit a parse tree produced by the {@code toint}
	 * labeled alternative in {@link MyLangParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitToint(MyLangParser.TointContext ctx);
	/**
	 * Enter a parse tree produced by the {@code todouble}
	 * labeled alternative in {@link MyLangParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterTodouble(MyLangParser.TodoubleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code todouble}
	 * labeled alternative in {@link MyLangParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitTodouble(MyLangParser.TodoubleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code array}
	 * labeled alternative in {@link MyLangParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterArray(MyLangParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code array}
	 * labeled alternative in {@link MyLangParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitArray(MyLangParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code par}
	 * labeled alternative in {@link MyLangParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterPar(MyLangParser.ParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code par}
	 * labeled alternative in {@link MyLangParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitPar(MyLangParser.ParContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayElement}
	 * labeled alternative in {@link MyLangParser#array_element}.
	 * @param ctx the parse tree
	 */
	void enterArrayElement(MyLangParser.ArrayElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayElement}
	 * labeled alternative in {@link MyLangParser#array_element}.
	 * @param ctx the parse tree
	 */
	void exitArrayElement(MyLangParser.ArrayElementContext ctx);
}