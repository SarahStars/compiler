// Generated from C:/Users/Lenovo/Desktop/Compiler/compiler/src/main/antlr/MyGrammarParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MyGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MyGrammarParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#ngFile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgFile(MyGrammarParser.NgFileContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatement(MyGrammarParser.ImportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#importItems}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportItems(MyGrammarParser.ImportItemsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#importAliasList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportAliasList(MyGrammarParser.ImportAliasListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#importAlias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportAlias(MyGrammarParser.ImportAliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#componentDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentDefinition(MyGrammarParser.ComponentDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#componentObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentObject(MyGrammarParser.ComponentObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#componentProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentProperty(MyGrammarParser.ComponentPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#styleList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleList(MyGrammarParser.StyleListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#classDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDefinition(MyGrammarParser.ClassDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(MyGrammarParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(MyGrammarParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(MyGrammarParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(MyGrammarParser.FunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(MyGrammarParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#otherStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOtherStatement(MyGrammarParser.OtherStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(MyGrammarParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(MyGrammarParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(MyGrammarParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(MyGrammarParser.AssignmentContext ctx);
}