// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: spark/connect/expressions.proto

package org.apache.spark.connect.proto;

public interface ExpressionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:spark.connect.Expression)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.spark.connect.Expression.Literal literal = 1;</code>
   * @return Whether the literal field is set.
   */
  boolean hasLiteral();
  /**
   * <code>.spark.connect.Expression.Literal literal = 1;</code>
   * @return The literal.
   */
  org.apache.spark.connect.proto.Expression.Literal getLiteral();
  /**
   * <code>.spark.connect.Expression.Literal literal = 1;</code>
   */
  org.apache.spark.connect.proto.Expression.LiteralOrBuilder getLiteralOrBuilder();

  /**
   * <code>.spark.connect.Expression.UnresolvedAttribute unresolved_attribute = 2;</code>
   * @return Whether the unresolvedAttribute field is set.
   */
  boolean hasUnresolvedAttribute();
  /**
   * <code>.spark.connect.Expression.UnresolvedAttribute unresolved_attribute = 2;</code>
   * @return The unresolvedAttribute.
   */
  org.apache.spark.connect.proto.Expression.UnresolvedAttribute getUnresolvedAttribute();
  /**
   * <code>.spark.connect.Expression.UnresolvedAttribute unresolved_attribute = 2;</code>
   */
  org.apache.spark.connect.proto.Expression.UnresolvedAttributeOrBuilder getUnresolvedAttributeOrBuilder();

  /**
   * <code>.spark.connect.Expression.UnresolvedFunction unresolved_function = 3;</code>
   * @return Whether the unresolvedFunction field is set.
   */
  boolean hasUnresolvedFunction();
  /**
   * <code>.spark.connect.Expression.UnresolvedFunction unresolved_function = 3;</code>
   * @return The unresolvedFunction.
   */
  org.apache.spark.connect.proto.Expression.UnresolvedFunction getUnresolvedFunction();
  /**
   * <code>.spark.connect.Expression.UnresolvedFunction unresolved_function = 3;</code>
   */
  org.apache.spark.connect.proto.Expression.UnresolvedFunctionOrBuilder getUnresolvedFunctionOrBuilder();

  /**
   * <code>.spark.connect.Expression.ExpressionString expression_string = 4;</code>
   * @return Whether the expressionString field is set.
   */
  boolean hasExpressionString();
  /**
   * <code>.spark.connect.Expression.ExpressionString expression_string = 4;</code>
   * @return The expressionString.
   */
  org.apache.spark.connect.proto.Expression.ExpressionString getExpressionString();
  /**
   * <code>.spark.connect.Expression.ExpressionString expression_string = 4;</code>
   */
  org.apache.spark.connect.proto.Expression.ExpressionStringOrBuilder getExpressionStringOrBuilder();

  /**
   * <code>.spark.connect.Expression.UnresolvedStar unresolved_star = 5;</code>
   * @return Whether the unresolvedStar field is set.
   */
  boolean hasUnresolvedStar();
  /**
   * <code>.spark.connect.Expression.UnresolvedStar unresolved_star = 5;</code>
   * @return The unresolvedStar.
   */
  org.apache.spark.connect.proto.Expression.UnresolvedStar getUnresolvedStar();
  /**
   * <code>.spark.connect.Expression.UnresolvedStar unresolved_star = 5;</code>
   */
  org.apache.spark.connect.proto.Expression.UnresolvedStarOrBuilder getUnresolvedStarOrBuilder();

  /**
   * <code>.spark.connect.Expression.Alias alias = 6;</code>
   * @return Whether the alias field is set.
   */
  boolean hasAlias();
  /**
   * <code>.spark.connect.Expression.Alias alias = 6;</code>
   * @return The alias.
   */
  org.apache.spark.connect.proto.Expression.Alias getAlias();
  /**
   * <code>.spark.connect.Expression.Alias alias = 6;</code>
   */
  org.apache.spark.connect.proto.Expression.AliasOrBuilder getAliasOrBuilder();

  /**
   * <code>.spark.connect.Expression.Cast cast = 7;</code>
   * @return Whether the cast field is set.
   */
  boolean hasCast();
  /**
   * <code>.spark.connect.Expression.Cast cast = 7;</code>
   * @return The cast.
   */
  org.apache.spark.connect.proto.Expression.Cast getCast();
  /**
   * <code>.spark.connect.Expression.Cast cast = 7;</code>
   */
  org.apache.spark.connect.proto.Expression.CastOrBuilder getCastOrBuilder();

  /**
   * <code>.spark.connect.Expression.UnresolvedRegex unresolved_regex = 8;</code>
   * @return Whether the unresolvedRegex field is set.
   */
  boolean hasUnresolvedRegex();
  /**
   * <code>.spark.connect.Expression.UnresolvedRegex unresolved_regex = 8;</code>
   * @return The unresolvedRegex.
   */
  org.apache.spark.connect.proto.Expression.UnresolvedRegex getUnresolvedRegex();
  /**
   * <code>.spark.connect.Expression.UnresolvedRegex unresolved_regex = 8;</code>
   */
  org.apache.spark.connect.proto.Expression.UnresolvedRegexOrBuilder getUnresolvedRegexOrBuilder();

  /**
   * <code>.spark.connect.Expression.SortOrder sort_order = 9;</code>
   * @return Whether the sortOrder field is set.
   */
  boolean hasSortOrder();
  /**
   * <code>.spark.connect.Expression.SortOrder sort_order = 9;</code>
   * @return The sortOrder.
   */
  org.apache.spark.connect.proto.Expression.SortOrder getSortOrder();
  /**
   * <code>.spark.connect.Expression.SortOrder sort_order = 9;</code>
   */
  org.apache.spark.connect.proto.Expression.SortOrderOrBuilder getSortOrderOrBuilder();

  /**
   * <code>.spark.connect.Expression.LambdaFunction lambda_function = 10;</code>
   * @return Whether the lambdaFunction field is set.
   */
  boolean hasLambdaFunction();
  /**
   * <code>.spark.connect.Expression.LambdaFunction lambda_function = 10;</code>
   * @return The lambdaFunction.
   */
  org.apache.spark.connect.proto.Expression.LambdaFunction getLambdaFunction();
  /**
   * <code>.spark.connect.Expression.LambdaFunction lambda_function = 10;</code>
   */
  org.apache.spark.connect.proto.Expression.LambdaFunctionOrBuilder getLambdaFunctionOrBuilder();

  /**
   * <code>.spark.connect.Expression.Window window = 11;</code>
   * @return Whether the window field is set.
   */
  boolean hasWindow();
  /**
   * <code>.spark.connect.Expression.Window window = 11;</code>
   * @return The window.
   */
  org.apache.spark.connect.proto.Expression.Window getWindow();
  /**
   * <code>.spark.connect.Expression.Window window = 11;</code>
   */
  org.apache.spark.connect.proto.Expression.WindowOrBuilder getWindowOrBuilder();

  /**
   * <code>.spark.connect.Expression.UnresolvedExtractValue unresolved_extract_value = 12;</code>
   * @return Whether the unresolvedExtractValue field is set.
   */
  boolean hasUnresolvedExtractValue();
  /**
   * <code>.spark.connect.Expression.UnresolvedExtractValue unresolved_extract_value = 12;</code>
   * @return The unresolvedExtractValue.
   */
  org.apache.spark.connect.proto.Expression.UnresolvedExtractValue getUnresolvedExtractValue();
  /**
   * <code>.spark.connect.Expression.UnresolvedExtractValue unresolved_extract_value = 12;</code>
   */
  org.apache.spark.connect.proto.Expression.UnresolvedExtractValueOrBuilder getUnresolvedExtractValueOrBuilder();

  /**
   * <code>.spark.connect.Expression.UpdateFields update_fields = 13;</code>
   * @return Whether the updateFields field is set.
   */
  boolean hasUpdateFields();
  /**
   * <code>.spark.connect.Expression.UpdateFields update_fields = 13;</code>
   * @return The updateFields.
   */
  org.apache.spark.connect.proto.Expression.UpdateFields getUpdateFields();
  /**
   * <code>.spark.connect.Expression.UpdateFields update_fields = 13;</code>
   */
  org.apache.spark.connect.proto.Expression.UpdateFieldsOrBuilder getUpdateFieldsOrBuilder();

  /**
   * <code>.spark.connect.Expression.UnresolvedNamedLambdaVariable unresolved_named_lambda_variable = 14;</code>
   * @return Whether the unresolvedNamedLambdaVariable field is set.
   */
  boolean hasUnresolvedNamedLambdaVariable();
  /**
   * <code>.spark.connect.Expression.UnresolvedNamedLambdaVariable unresolved_named_lambda_variable = 14;</code>
   * @return The unresolvedNamedLambdaVariable.
   */
  org.apache.spark.connect.proto.Expression.UnresolvedNamedLambdaVariable getUnresolvedNamedLambdaVariable();
  /**
   * <code>.spark.connect.Expression.UnresolvedNamedLambdaVariable unresolved_named_lambda_variable = 14;</code>
   */
  org.apache.spark.connect.proto.Expression.UnresolvedNamedLambdaVariableOrBuilder getUnresolvedNamedLambdaVariableOrBuilder();

  /**
   * <code>.spark.connect.CommonInlineUserDefinedFunction common_inline_user_defined_function = 15;</code>
   * @return Whether the commonInlineUserDefinedFunction field is set.
   */
  boolean hasCommonInlineUserDefinedFunction();
  /**
   * <code>.spark.connect.CommonInlineUserDefinedFunction common_inline_user_defined_function = 15;</code>
   * @return The commonInlineUserDefinedFunction.
   */
  org.apache.spark.connect.proto.CommonInlineUserDefinedFunction getCommonInlineUserDefinedFunction();
  /**
   * <code>.spark.connect.CommonInlineUserDefinedFunction common_inline_user_defined_function = 15;</code>
   */
  org.apache.spark.connect.proto.CommonInlineUserDefinedFunctionOrBuilder getCommonInlineUserDefinedFunctionOrBuilder();

  /**
   * <pre>
   * This field is used to mark extensions to the protocol. When plugins generate arbitrary
   * relations they can add them here. During the planning the correct resolution is done.
   * </pre>
   *
   * <code>.google.protobuf.Any extension = 999;</code>
   * @return Whether the extension field is set.
   */
  boolean hasExtension();
  /**
   * <pre>
   * This field is used to mark extensions to the protocol. When plugins generate arbitrary
   * relations they can add them here. During the planning the correct resolution is done.
   * </pre>
   *
   * <code>.google.protobuf.Any extension = 999;</code>
   * @return The extension.
   */
  com.google.protobuf.Any getExtension();
  /**
   * <pre>
   * This field is used to mark extensions to the protocol. When plugins generate arbitrary
   * relations they can add them here. During the planning the correct resolution is done.
   * </pre>
   *
   * <code>.google.protobuf.Any extension = 999;</code>
   */
  com.google.protobuf.AnyOrBuilder getExtensionOrBuilder();

  org.apache.spark.connect.proto.Expression.ExprTypeCase getExprTypeCase();
}