package com.parser;// Generated from CLanguage.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CLanguageParser}.
 */
public interface CLanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CLanguageParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(CLanguageParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLanguageParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(CLanguageParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLanguageParser#genericSelection}.
	 * @param ctx the parse tree
	 */
	void enterGenericSelection(CLanguageParser.GenericSelectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLanguageParser#genericSelection}.
	 * @param ctx the parse tree
	 */
	void exitGenericSelection(CLanguageParser.GenericSelectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLanguageParser#genericAssocList}.
	 * @param ctx the parse tree
	 */
	void enterGenericAssocList(CLanguageParser.GenericAssocListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLanguageParser#genericAssocList}.
	 * @param ctx the parse tree
	 */
	void exitGenericAssocList(CLanguageParser.GenericAssocListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLanguageParser#genericAssociation}.
	 * @param ctx the parse tree
	 */
	void enterGenericAssociation(CLanguageParser.GenericAssociationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLanguageParser#genericAssociation}.
	 * @param ctx the parse tree
	 */
	void exitGenericAssociation(CLanguageParser.GenericAssociationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLanguageParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(CLanguageParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLanguageParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(CLanguageParser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLanguageParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentExpressionList(CLanguageParser.ArgumentExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLanguageParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentExpressionList(CLanguageParser.ArgumentExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLanguageParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(CLanguageParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLanguageParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(CLanguageParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLanguageParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperator(CLanguageParser.UnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLanguageParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperator(CLanguageParser.UnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLanguageParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(CLanguageParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLanguageParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(CLanguageParser.CastExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLanguageParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(CLanguageParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLanguageParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(CLanguageParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLanguageParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(CLanguageParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLanguageParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(CLanguageParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLanguageParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(CLanguageParser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLanguageParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(CLanguageParser.ShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLanguageParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(CLanguageParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLanguageParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(CLanguageParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLanguageParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(CLanguageParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLanguageParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(CLanguageParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLanguageParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(CLanguageParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLanguageParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(CLanguageParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLanguageParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression(CLanguageParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLanguageParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression(CLanguageParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLanguageParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression(CLanguageParser.InclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLanguageParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression(CLanguageParser.InclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLanguageParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(CLanguageParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLanguageParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(CLanguageParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLanguageParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(CLanguageParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLanguageParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(CLanguageParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLanguageParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(CLanguageParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLanguageParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(CLanguageParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLanguageParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(CLanguageParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLanguageParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(CLanguageParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLanguageParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(CLanguageParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLanguageParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(CLanguageParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CLanguageParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CLanguageParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLanguageParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(CLanguageParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLanguageParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(CLanguageParser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLanguageParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(CLanguageParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLanguageParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(CLanguageParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLanguageParser#declarationSpecifiers}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationSpecifiers(CLanguageParser.DeclarationSpecifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLanguageParser#declarationSpecifiers}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationSpecifiers(CLanguageParser.DeclarationSpecifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLanguageParser#declarationSpecifiers2}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationSpecifiers2(CLanguageParser.DeclarationSpecifiers2Context ctx);
	/**
	 * Exit a parse tree produced by {@link CLanguageParser#declarationSpecifiers2}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationSpecifiers2(CLanguageParser.DeclarationSpecifiers2Context ctx);
	/**
	 * Enter a parse tree produced by {@link CLanguageParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationSpecifier(CLanguageParser.DeclarationSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLanguageParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationSpecifier(CLanguageParser.DeclarationSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLanguageParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclaratorList(CLanguageParser.InitDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLanguageParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclaratorList(CLanguageParser.InitDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLanguageParser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclarator(CLanguageParser.InitDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLanguageParser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclarator(CLanguageParser.InitDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLanguageParser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterStorageClassSpecifier(CLanguageParser.StorageClassSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLanguageParser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitStorageClassSpecifier(CLanguageParser.StorageClassSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLanguageParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpecifier(CLanguageParser.TypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLanguageParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpecifier(CLanguageParser.TypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLanguageParser#structOrUnionSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterStructOrUnionSpecifier(CLanguageParser.StructOrUnionSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLanguageParser#structOrUnionSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitStructOrUnionSpecifier(CLanguageParser.StructOrUnionSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLanguageParser#structOrUnion}.
	 * @param ctx the parse tree
	 */
	void enterStructOrUnion(CLanguageParser.StructOrUnionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLanguageParser#structOrUnion}.
	 * @param ctx the parse tree
	 */
	void exitStructOrUnion(CLanguageParser.StructOrUnionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLanguageParser#structDeclarationList}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclarationList(CLanguageParser.StructDeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLanguageParser#structDeclarationList}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclarationList(CLanguageParser.StructDeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLanguageParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclaration(CLanguageParser.StructDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLanguageParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclaration(CLanguageParser.StructDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLanguageParser#specifierQualifierList}.
	 * @param ctx the parse tree
	 */
	void enterSpecifierQualifierList(CLanguageParser.SpecifierQualifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLanguageParser#specifierQualifierList}.
	 * @param ctx the parse tree
	 */
	void exitSpecifierQualifierList(CLanguageParser.SpecifierQualifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLanguageParser#structDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclaratorList(CLanguageParser.StructDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLanguageParser#structDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclaratorList(CLanguageParser.StructDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLanguageParser#structDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclarator(CLanguageParser.StructDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLanguageParser#structDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclarator(CLanguageParser.StructDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLanguageParser#enumSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterEnumSpecifier(CLanguageParser.EnumSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLanguageParser#enumSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitEnumSpecifier(CLanguageParser.EnumSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLanguageParser#enumeratorList}.
	 * @param ctx the parse tree
	 */
	void enterEnumeratorList(CLanguageParser.EnumeratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLanguageParser#enumeratorList}.
	 * @param ctx the parse tree
	 */
	void exitEnumeratorList(CLanguageParser.EnumeratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLanguageParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void enterEnumerator(CLanguageParser.EnumeratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLanguageParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void exitEnumerator(CLanguageParser.EnumeratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLanguageParser#enumerationConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumerationConstant(CLanguageParser.EnumerationConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLanguageParser#enumerationConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumerationConstant(CLanguageParser.EnumerationConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLanguageParser#atomicTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterAtomicTypeSpecifier(CLanguageParser.AtomicTypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLanguageParser#atomicTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitAtomicTypeSpecifier(CLanguageParser.AtomicTypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLanguageParser#typeQualifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeQualifier(CLanguageParser.TypeQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLanguageParser#typeQualifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeQualifier(CLanguageParser.TypeQualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLanguageParser#functionSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterFunctionSpecifier(CLanguageParser.FunctionSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLanguageParser#functionSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitFunctionSpecifier(CLanguageParser.FunctionSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLanguageParser#alignmentSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterAlignmentSpecifier(CLanguageParser.AlignmentSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLanguageParser#alignmentSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitAlignmentSpecifier(CLanguageParser.AlignmentSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLanguageParser#declarator}.
	 * @param ctx the parse tree
	 */
	void enterDeclarator(CLanguageParser.DeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLanguageParser#declarator}.
	 * @param ctx the parse tree
	 */
	void exitDeclarator(CLanguageParser.DeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLanguageParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterDirectDeclarator(CLanguageParser.DirectDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLanguageParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitDirectDeclarator(CLanguageParser.DirectDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLanguageParser#vcSpecificModifer}.
	 * @param ctx the parse tree
	 */
	void enterVcSpecificModifer(CLanguageParser.VcSpecificModiferContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLanguageParser#vcSpecificModifer}.
	 * @param ctx the parse tree
	 */
	void exitVcSpecificModifer(CLanguageParser.VcSpecificModiferContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLanguageParser#gccDeclaratorExtension}.
	 * @param ctx the parse tree
	 */
	void enterGccDeclaratorExtension(CLanguageParser.GccDeclaratorExtensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLanguageParser#gccDeclaratorExtension}.
	 * @param ctx the parse tree
	 */
	void exitGccDeclaratorExtension(CLanguageParser.GccDeclaratorExtensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLanguageParser#gccAttributeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterGccAttributeSpecifier(CLanguageParser.GccAttributeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLanguageParser#gccAttributeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitGccAttributeSpecifier(CLanguageParser.GccAttributeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLanguageParser#gccAttributeList}.
	 * @param ctx the parse tree
	 */
	void enterGccAttributeList(CLanguageParser.GccAttributeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLanguageParser#gccAttributeList}.
	 * @param ctx the parse tree
	 */
	void exitGccAttributeList(CLanguageParser.GccAttributeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLanguageParser#gccAttribute}.
	 * @param ctx the parse tree
	 */
	void enterGccAttribute(CLanguageParser.GccAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLanguageParser#gccAttribute}.
	 * @param ctx the parse tree
	 */
	void exitGccAttribute(CLanguageParser.GccAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLanguageParser#nestedParenthesesBlock}.
	 * @param ctx the parse tree
	 */
	void enterNestedParenthesesBlock(CLanguageParser.NestedParenthesesBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLanguageParser#nestedParenthesesBlock}.
	 * @param ctx the parse tree
	 */
	void exitNestedParenthesesBlock(CLanguageParser.NestedParenthesesBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLanguageParser#pointer}.
	 * @param ctx the parse tree
	 */
	void enterPointer(CLanguageParser.PointerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLanguageParser#pointer}.
	 * @param ctx the parse tree
	 */
	void exitPointer(CLanguageParser.PointerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLanguageParser#typeQualifierList}.
	 * @param ctx the parse tree
	 */
	void enterTypeQualifierList(CLanguageParser.TypeQualifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLanguageParser#typeQualifierList}.
	 * @param ctx the parse tree
	 */
	void exitTypeQualifierList(CLanguageParser.TypeQualifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLanguageParser#parameterTypeList}.
	 * @param ctx the parse tree
	 */
	void enterParameterTypeList(CLanguageParser.ParameterTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLanguageParser#parameterTypeList}.
	 * @param ctx the parse tree
	 */
	void exitParameterTypeList(CLanguageParser.ParameterTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLanguageParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(CLanguageParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLanguageParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(CLanguageParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLanguageParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterParameterDeclaration(CLanguageParser.ParameterDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLanguageParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitParameterDeclaration(CLanguageParser.ParameterDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLanguageParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(CLanguageParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLanguageParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(CLanguageParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLanguageParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(CLanguageParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLanguageParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(CLanguageParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLanguageParser#abstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterAbstractDeclarator(CLanguageParser.AbstractDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLanguageParser#abstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitAbstractDeclarator(CLanguageParser.AbstractDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLanguageParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterDirectAbstractDeclarator(CLanguageParser.DirectAbstractDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLanguageParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitDirectAbstractDeclarator(CLanguageParser.DirectAbstractDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLanguageParser#typedefName}.
	 * @param ctx the parse tree
	 */
	void enterTypedefName(CLanguageParser.TypedefNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLanguageParser#typedefName}.
	 * @param ctx the parse tree
	 */
	void exitTypedefName(CLanguageParser.TypedefNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLanguageParser#initializer}.
	 * @param ctx the parse tree
	 */
	void enterInitializer(CLanguageParser.InitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLanguageParser#initializer}.
	 * @param ctx the parse tree
	 */
	void exitInitializer(CLanguageParser.InitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLanguageParser#initializerList}.
	 * @param ctx the parse tree
	 */
	void enterInitializerList(CLanguageParser.InitializerListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLanguageParser#initializerList}.
	 * @param ctx the parse tree
	 */
	void exitInitializerList(CLanguageParser.InitializerListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLanguageParser#designation}.
	 * @param ctx the parse tree
	 */
	void enterDesignation(CLanguageParser.DesignationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLanguageParser#designation}.
	 * @param ctx the parse tree
	 */
	void exitDesignation(CLanguageParser.DesignationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLanguageParser#designatorList}.
	 * @param ctx the parse tree
	 */
	void enterDesignatorList(CLanguageParser.DesignatorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLanguageParser#designatorList}.
	 * @param ctx the parse tree
	 */
	void exitDesignatorList(CLanguageParser.DesignatorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLanguageParser#designator}.
	 * @param ctx the parse tree
	 */
	void enterDesignator(CLanguageParser.DesignatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLanguageParser#designator}.
	 * @param ctx the parse tree
	 */
	void exitDesignator(CLanguageParser.DesignatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLanguageParser#staticAssertDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStaticAssertDeclaration(CLanguageParser.StaticAssertDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLanguageParser#staticAssertDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStaticAssertDeclaration(CLanguageParser.StaticAssertDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CLanguageParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLanguageParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CLanguageParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLanguageParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatement(CLanguageParser.LabeledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLanguageParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatement(CLanguageParser.LabeledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLanguageParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(CLanguageParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLanguageParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(CLanguageParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLanguageParser#blockItemList}.
	 * @param ctx the parse tree
	 */
	void enterBlockItemList(CLanguageParser.BlockItemListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLanguageParser#blockItemList}.
	 * @param ctx the parse tree
	 */
	void exitBlockItemList(CLanguageParser.BlockItemListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLanguageParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void enterBlockItem(CLanguageParser.BlockItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLanguageParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void exitBlockItem(CLanguageParser.BlockItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLanguageParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(CLanguageParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLanguageParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(CLanguageParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLanguageParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectionStatement(CLanguageParser.SelectionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLanguageParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectionStatement(CLanguageParser.SelectionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLanguageParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterIterationStatement(CLanguageParser.IterationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLanguageParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitIterationStatement(CLanguageParser.IterationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLanguageParser#forCondition}.
	 * @param ctx the parse tree
	 */
	void enterForCondition(CLanguageParser.ForConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLanguageParser#forCondition}.
	 * @param ctx the parse tree
	 */
	void exitForCondition(CLanguageParser.ForConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLanguageParser#forDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterForDeclaration(CLanguageParser.ForDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLanguageParser#forDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitForDeclaration(CLanguageParser.ForDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLanguageParser#forExpression}.
	 * @param ctx the parse tree
	 */
	void enterForExpression(CLanguageParser.ForExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLanguageParser#forExpression}.
	 * @param ctx the parse tree
	 */
	void exitForExpression(CLanguageParser.ForExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLanguageParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void enterJumpStatement(CLanguageParser.JumpStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLanguageParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void exitJumpStatement(CLanguageParser.JumpStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLanguageParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(CLanguageParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLanguageParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(CLanguageParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLanguageParser#translationUnit}.
	 * @param ctx the parse tree
	 */
	void enterTranslationUnit(CLanguageParser.TranslationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLanguageParser#translationUnit}.
	 * @param ctx the parse tree
	 */
	void exitTranslationUnit(CLanguageParser.TranslationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLanguageParser#externalDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterExternalDeclaration(CLanguageParser.ExternalDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLanguageParser#externalDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitExternalDeclaration(CLanguageParser.ExternalDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLanguageParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(CLanguageParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLanguageParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(CLanguageParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLanguageParser#declarationList}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationList(CLanguageParser.DeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLanguageParser#declarationList}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationList(CLanguageParser.DeclarationListContext ctx);
}