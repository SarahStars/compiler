// Generated from C:/Users/Lenovo/Desktop/Compiler/compiler/src/main/antlr/MyGrammarParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MyGrammarParser}.
 */
public interface MyGrammarParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#ngFile}.
	 * @param ctx the parse tree
	 */
	void enterNgFile(MyGrammarParser.NgFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#ngFile}.
	 * @param ctx the parse tree
	 */
	void exitNgFile(MyGrammarParser.NgFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(MyGrammarParser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(MyGrammarParser.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#importItems}.
	 * @param ctx the parse tree
	 */
	void enterImportItems(MyGrammarParser.ImportItemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#importItems}.
	 * @param ctx the parse tree
	 */
	void exitImportItems(MyGrammarParser.ImportItemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#importAliasList}.
	 * @param ctx the parse tree
	 */
	void enterImportAliasList(MyGrammarParser.ImportAliasListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#importAliasList}.
	 * @param ctx the parse tree
	 */
	void exitImportAliasList(MyGrammarParser.ImportAliasListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#importAlias}.
	 * @param ctx the parse tree
	 */
	void enterImportAlias(MyGrammarParser.ImportAliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#importAlias}.
	 * @param ctx the parse tree
	 */
	void exitImportAlias(MyGrammarParser.ImportAliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#componentDefinition}.
	 * @param ctx the parse tree
	 */
	void enterComponentDefinition(MyGrammarParser.ComponentDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#componentDefinition}.
	 * @param ctx the parse tree
	 */
	void exitComponentDefinition(MyGrammarParser.ComponentDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#componentObject}.
	 * @param ctx the parse tree
	 */
	void enterComponentObject(MyGrammarParser.ComponentObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#componentObject}.
	 * @param ctx the parse tree
	 */
	void exitComponentObject(MyGrammarParser.ComponentObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#componentProperty}.
	 * @param ctx the parse tree
	 */
	void enterComponentProperty(MyGrammarParser.ComponentPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#componentProperty}.
	 * @param ctx the parse tree
	 */
	void exitComponentProperty(MyGrammarParser.ComponentPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#styleList}.
	 * @param ctx the parse tree
	 */
	void enterStyleList(MyGrammarParser.StyleListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#styleList}.
	 * @param ctx the parse tree
	 */
	void exitStyleList(MyGrammarParser.StyleListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#classDefinition}.
	 * @param ctx the parse tree
	 */
	void enterClassDefinition(MyGrammarParser.ClassDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#classDefinition}.
	 * @param ctx the parse tree
	 */
	void exitClassDefinition(MyGrammarParser.ClassDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(MyGrammarParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(MyGrammarParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(MyGrammarParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(MyGrammarParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(MyGrammarParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(MyGrammarParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(MyGrammarParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(MyGrammarParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MyGrammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MyGrammarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#otherStatement}.
	 * @param ctx the parse tree
	 */
	void enterOtherStatement(MyGrammarParser.OtherStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#otherStatement}.
	 * @param ctx the parse tree
	 */
	void exitOtherStatement(MyGrammarParser.OtherStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(MyGrammarParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(MyGrammarParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(MyGrammarParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(MyGrammarParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(MyGrammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(MyGrammarParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(MyGrammarParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(MyGrammarParser.AssignmentContext ctx);
}