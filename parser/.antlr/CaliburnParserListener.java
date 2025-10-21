// Generated from /home/excalibur/PersonalProjects/caliburncode/parser/CaliburnParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CaliburnParser}.
 */
public interface CaliburnParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CaliburnParser#module}.
	 * @param ctx the parse tree
	 */
	void enterModule(CaliburnParser.ModuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CaliburnParser#module}.
	 * @param ctx the parse tree
	 */
	void exitModule(CaliburnParser.ModuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CaliburnParser#definition}.
	 * @param ctx the parse tree
	 */
	void enterDefinition(CaliburnParser.DefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CaliburnParser#definition}.
	 * @param ctx the parse tree
	 */
	void exitDefinition(CaliburnParser.DefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CaliburnParser#scoped_block}.
	 * @param ctx the parse tree
	 */
	void enterScoped_block(CaliburnParser.Scoped_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CaliburnParser#scoped_block}.
	 * @param ctx the parse tree
	 */
	void exitScoped_block(CaliburnParser.Scoped_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CaliburnParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CaliburnParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CaliburnParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CaliburnParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CaliburnParser#jump_statement}.
	 * @param ctx the parse tree
	 */
	void enterJump_statement(CaliburnParser.Jump_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CaliburnParser#jump_statement}.
	 * @param ctx the parse tree
	 */
	void exitJump_statement(CaliburnParser.Jump_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CaliburnParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(CaliburnParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CaliburnParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(CaliburnParser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CaliburnParser#break_statement}.
	 * @param ctx the parse tree
	 */
	void enterBreak_statement(CaliburnParser.Break_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CaliburnParser#break_statement}.
	 * @param ctx the parse tree
	 */
	void exitBreak_statement(CaliburnParser.Break_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CaliburnParser#continue_statement}.
	 * @param ctx the parse tree
	 */
	void enterContinue_statement(CaliburnParser.Continue_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CaliburnParser#continue_statement}.
	 * @param ctx the parse tree
	 */
	void exitContinue_statement(CaliburnParser.Continue_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CaliburnParser#control_statement}.
	 * @param ctx the parse tree
	 */
	void enterControl_statement(CaliburnParser.Control_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CaliburnParser#control_statement}.
	 * @param ctx the parse tree
	 */
	void exitControl_statement(CaliburnParser.Control_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CaliburnParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(CaliburnParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CaliburnParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(CaliburnParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CaliburnParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_statement(CaliburnParser.For_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CaliburnParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_statement(CaliburnParser.For_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CaliburnParser#switch_statement}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_statement(CaliburnParser.Switch_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CaliburnParser#switch_statement}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_statement(CaliburnParser.Switch_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CaliburnParser#inline_statement}.
	 * @param ctx the parse tree
	 */
	void enterInline_statement(CaliburnParser.Inline_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CaliburnParser#inline_statement}.
	 * @param ctx the parse tree
	 */
	void exitInline_statement(CaliburnParser.Inline_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CaliburnParser#function_declaration_statement}.
	 * @param ctx the parse tree
	 */
	void enterFunction_declaration_statement(CaliburnParser.Function_declaration_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CaliburnParser#function_declaration_statement}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declaration_statement(CaliburnParser.Function_declaration_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CaliburnParser#assign_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssign_statement(CaliburnParser.Assign_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CaliburnParser#assign_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssign_statement(CaliburnParser.Assign_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CaliburnParser#assign_declarations}.
	 * @param ctx the parse tree
	 */
	void enterAssign_declarations(CaliburnParser.Assign_declarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CaliburnParser#assign_declarations}.
	 * @param ctx the parse tree
	 */
	void exitAssign_declarations(CaliburnParser.Assign_declarationsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DeclaredAssignDeclaration}
	 * labeled alternative in {@link CaliburnParser#assign_declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaredAssignDeclaration(CaliburnParser.DeclaredAssignDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DeclaredAssignDeclaration}
	 * labeled alternative in {@link CaliburnParser#assign_declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaredAssignDeclaration(CaliburnParser.DeclaredAssignDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UndeclaredAssignDeclaration}
	 * labeled alternative in {@link CaliburnParser#assign_declaration}.
	 * @param ctx the parse tree
	 */
	void enterUndeclaredAssignDeclaration(CaliburnParser.UndeclaredAssignDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UndeclaredAssignDeclaration}
	 * labeled alternative in {@link CaliburnParser#assign_declaration}.
	 * @param ctx the parse tree
	 */
	void exitUndeclaredAssignDeclaration(CaliburnParser.UndeclaredAssignDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StructDestrutureAssignDeclaration}
	 * labeled alternative in {@link CaliburnParser#assign_declaration}.
	 * @param ctx the parse tree
	 */
	void enterStructDestrutureAssignDeclaration(CaliburnParser.StructDestrutureAssignDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StructDestrutureAssignDeclaration}
	 * labeled alternative in {@link CaliburnParser#assign_declaration}.
	 * @param ctx the parse tree
	 */
	void exitStructDestrutureAssignDeclaration(CaliburnParser.StructDestrutureAssignDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TupleDestrutureAssignDeclaration}
	 * labeled alternative in {@link CaliburnParser#assign_declaration}.
	 * @param ctx the parse tree
	 */
	void enterTupleDestrutureAssignDeclaration(CaliburnParser.TupleDestrutureAssignDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TupleDestrutureAssignDeclaration}
	 * labeled alternative in {@link CaliburnParser#assign_declaration}.
	 * @param ctx the parse tree
	 */
	void exitTupleDestrutureAssignDeclaration(CaliburnParser.TupleDestrutureAssignDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CaliburnParser#declared_assign_declarations}.
	 * @param ctx the parse tree
	 */
	void enterDeclared_assign_declarations(CaliburnParser.Declared_assign_declarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CaliburnParser#declared_assign_declarations}.
	 * @param ctx the parse tree
	 */
	void exitDeclared_assign_declarations(CaliburnParser.Declared_assign_declarationsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypedDeclaredAssignDeclaration}
	 * labeled alternative in {@link CaliburnParser#declared_assign_declaration}.
	 * @param ctx the parse tree
	 */
	void enterTypedDeclaredAssignDeclaration(CaliburnParser.TypedDeclaredAssignDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypedDeclaredAssignDeclaration}
	 * labeled alternative in {@link CaliburnParser#declared_assign_declaration}.
	 * @param ctx the parse tree
	 */
	void exitTypedDeclaredAssignDeclaration(CaliburnParser.TypedDeclaredAssignDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UntypedDeclaredAssignDeclaration}
	 * labeled alternative in {@link CaliburnParser#declared_assign_declaration}.
	 * @param ctx the parse tree
	 */
	void enterUntypedDeclaredAssignDeclaration(CaliburnParser.UntypedDeclaredAssignDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UntypedDeclaredAssignDeclaration}
	 * labeled alternative in {@link CaliburnParser#declared_assign_declaration}.
	 * @param ctx the parse tree
	 */
	void exitUntypedDeclaredAssignDeclaration(CaliburnParser.UntypedDeclaredAssignDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CaliburnParser#undeclared_assign_declarations}.
	 * @param ctx the parse tree
	 */
	void enterUndeclared_assign_declarations(CaliburnParser.Undeclared_assign_declarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CaliburnParser#undeclared_assign_declarations}.
	 * @param ctx the parse tree
	 */
	void exitUndeclared_assign_declarations(CaliburnParser.Undeclared_assign_declarationsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UndeclaredAtomAssignDeclaration}
	 * labeled alternative in {@link CaliburnParser#undeclared_assign_declaration}.
	 * @param ctx the parse tree
	 */
	void enterUndeclaredAtomAssignDeclaration(CaliburnParser.UndeclaredAtomAssignDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UndeclaredAtomAssignDeclaration}
	 * labeled alternative in {@link CaliburnParser#undeclared_assign_declaration}.
	 * @param ctx the parse tree
	 */
	void exitUndeclaredAtomAssignDeclaration(CaliburnParser.UndeclaredAtomAssignDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UndeclaredStructDestrutureAssignDeclaration}
	 * labeled alternative in {@link CaliburnParser#undeclared_assign_declaration}.
	 * @param ctx the parse tree
	 */
	void enterUndeclaredStructDestrutureAssignDeclaration(CaliburnParser.UndeclaredStructDestrutureAssignDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UndeclaredStructDestrutureAssignDeclaration}
	 * labeled alternative in {@link CaliburnParser#undeclared_assign_declaration}.
	 * @param ctx the parse tree
	 */
	void exitUndeclaredStructDestrutureAssignDeclaration(CaliburnParser.UndeclaredStructDestrutureAssignDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UndeclaredTupleDestrutureAssignDeclaration}
	 * labeled alternative in {@link CaliburnParser#undeclared_assign_declaration}.
	 * @param ctx the parse tree
	 */
	void enterUndeclaredTupleDestrutureAssignDeclaration(CaliburnParser.UndeclaredTupleDestrutureAssignDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UndeclaredTupleDestrutureAssignDeclaration}
	 * labeled alternative in {@link CaliburnParser#undeclared_assign_declaration}.
	 * @param ctx the parse tree
	 */
	void exitUndeclaredTupleDestrutureAssignDeclaration(CaliburnParser.UndeclaredTupleDestrutureAssignDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperatorAssignment}
	 * labeled alternative in {@link CaliburnParser#operator_assign_statement}.
	 * @param ctx the parse tree
	 */
	void enterOperatorAssignment(CaliburnParser.OperatorAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperatorAssignment}
	 * labeled alternative in {@link CaliburnParser#operator_assign_statement}.
	 * @param ctx the parse tree
	 */
	void exitOperatorAssignment(CaliburnParser.OperatorAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CaliburnParser#expression_statement}.
	 * @param ctx the parse tree
	 */
	void enterExpression_statement(CaliburnParser.Expression_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CaliburnParser#expression_statement}.
	 * @param ctx the parse tree
	 */
	void exitExpression_statement(CaliburnParser.Expression_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CaliburnParser#expressions}.
	 * @param ctx the parse tree
	 */
	void enterExpressions(CaliburnParser.ExpressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CaliburnParser#expressions}.
	 * @param ctx the parse tree
	 */
	void exitExpressions(CaliburnParser.ExpressionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BracketedExpression}
	 * labeled alternative in {@link CaliburnParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBracketedExpression(CaliburnParser.BracketedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BracketedExpression}
	 * labeled alternative in {@link CaliburnParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBracketedExpression(CaliburnParser.BracketedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link CaliburnParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExpression(CaliburnParser.LiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link CaliburnParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExpression(CaliburnParser.LiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SliceExpression}
	 * labeled alternative in {@link CaliburnParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSliceExpression(CaliburnParser.SliceExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SliceExpression}
	 * labeled alternative in {@link CaliburnParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSliceExpression(CaliburnParser.SliceExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TupleExpression}
	 * labeled alternative in {@link CaliburnParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTupleExpression(CaliburnParser.TupleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TupleExpression}
	 * labeled alternative in {@link CaliburnParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTupleExpression(CaliburnParser.TupleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanBinaryExpression}
	 * labeled alternative in {@link CaliburnParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanBinaryExpression(CaliburnParser.BooleanBinaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanBinaryExpression}
	 * labeled alternative in {@link CaliburnParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanBinaryExpression(CaliburnParser.BooleanBinaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IndexExpression}
	 * labeled alternative in {@link CaliburnParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIndexExpression(CaliburnParser.IndexExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IndexExpression}
	 * labeled alternative in {@link CaliburnParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIndexExpression(CaliburnParser.IndexExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryExpression}
	 * labeled alternative in {@link CaliburnParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(CaliburnParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryExpression}
	 * labeled alternative in {@link CaliburnParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(CaliburnParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AccessExpression}
	 * labeled alternative in {@link CaliburnParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAccessExpression(CaliburnParser.AccessExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AccessExpression}
	 * labeled alternative in {@link CaliburnParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAccessExpression(CaliburnParser.AccessExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentifierExpression}
	 * labeled alternative in {@link CaliburnParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpression(CaliburnParser.IdentifierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentifierExpression}
	 * labeled alternative in {@link CaliburnParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpression(CaliburnParser.IdentifierExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionExpression}
	 * labeled alternative in {@link CaliburnParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionExpression(CaliburnParser.FunctionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionExpression}
	 * labeled alternative in {@link CaliburnParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionExpression(CaliburnParser.FunctionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StructExpression}
	 * labeled alternative in {@link CaliburnParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterStructExpression(CaliburnParser.StructExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StructExpression}
	 * labeled alternative in {@link CaliburnParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitStructExpression(CaliburnParser.StructExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryExpression}
	 * labeled alternative in {@link CaliburnParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpression(CaliburnParser.BinaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryExpression}
	 * labeled alternative in {@link CaliburnParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpression(CaliburnParser.BinaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CastExpression}
	 * labeled alternative in {@link CaliburnParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(CaliburnParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CastExpression}
	 * labeled alternative in {@link CaliburnParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(CaliburnParser.CastExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CallExpression}
	 * labeled alternative in {@link CaliburnParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCallExpression(CaliburnParser.CallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CallExpression}
	 * labeled alternative in {@link CaliburnParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCallExpression(CaliburnParser.CallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CaliburnParser#function_expression}.
	 * @param ctx the parse tree
	 */
	void enterFunction_expression(CaliburnParser.Function_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CaliburnParser#function_expression}.
	 * @param ctx the parse tree
	 */
	void exitFunction_expression(CaliburnParser.Function_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CaliburnParser#struct_expression}.
	 * @param ctx the parse tree
	 */
	void enterStruct_expression(CaliburnParser.Struct_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CaliburnParser#struct_expression}.
	 * @param ctx the parse tree
	 */
	void exitStruct_expression(CaliburnParser.Struct_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CaliburnParser#tuple_expression}.
	 * @param ctx the parse tree
	 */
	void enterTuple_expression(CaliburnParser.Tuple_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CaliburnParser#tuple_expression}.
	 * @param ctx the parse tree
	 */
	void exitTuple_expression(CaliburnParser.Tuple_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CaliburnParser#type_expression}.
	 * @param ctx the parse tree
	 */
	void enterType_expression(CaliburnParser.Type_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CaliburnParser#type_expression}.
	 * @param ctx the parse tree
	 */
	void exitType_expression(CaliburnParser.Type_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CaliburnParser#complex_type_expression}.
	 * @param ctx the parse tree
	 */
	void enterComplex_type_expression(CaliburnParser.Complex_type_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CaliburnParser#complex_type_expression}.
	 * @param ctx the parse tree
	 */
	void exitComplex_type_expression(CaliburnParser.Complex_type_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CaliburnParser#identifiers}.
	 * @param ctx the parse tree
	 */
	void enterIdentifiers(CaliburnParser.IdentifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CaliburnParser#identifiers}.
	 * @param ctx the parse tree
	 */
	void exitIdentifiers(CaliburnParser.IdentifiersContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UntypedLiteralAtom}
	 * labeled alternative in {@link CaliburnParser#literal_atom}.
	 * @param ctx the parse tree
	 */
	void enterUntypedLiteralAtom(CaliburnParser.UntypedLiteralAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UntypedLiteralAtom}
	 * labeled alternative in {@link CaliburnParser#literal_atom}.
	 * @param ctx the parse tree
	 */
	void exitUntypedLiteralAtom(CaliburnParser.UntypedLiteralAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypedLiteralAtom}
	 * labeled alternative in {@link CaliburnParser#literal_atom}.
	 * @param ctx the parse tree
	 */
	void enterTypedLiteralAtom(CaliburnParser.TypedLiteralAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypedLiteralAtom}
	 * labeled alternative in {@link CaliburnParser#literal_atom}.
	 * @param ctx the parse tree
	 */
	void exitTypedLiteralAtom(CaliburnParser.TypedLiteralAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link CaliburnParser#untyped_literal_atom}.
	 * @param ctx the parse tree
	 */
	void enterUntyped_literal_atom(CaliburnParser.Untyped_literal_atomContext ctx);
	/**
	 * Exit a parse tree produced by {@link CaliburnParser#untyped_literal_atom}.
	 * @param ctx the parse tree
	 */
	void exitUntyped_literal_atom(CaliburnParser.Untyped_literal_atomContext ctx);
	/**
	 * Enter a parse tree produced by {@link CaliburnParser#typed_literal_atom}.
	 * @param ctx the parse tree
	 */
	void enterTyped_literal_atom(CaliburnParser.Typed_literal_atomContext ctx);
	/**
	 * Exit a parse tree produced by {@link CaliburnParser#typed_literal_atom}.
	 * @param ctx the parse tree
	 */
	void exitTyped_literal_atom(CaliburnParser.Typed_literal_atomContext ctx);
}