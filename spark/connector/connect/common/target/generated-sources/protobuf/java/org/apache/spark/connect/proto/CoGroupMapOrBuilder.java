// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: spark/connect/relations.proto

package org.apache.spark.connect.proto;

public interface CoGroupMapOrBuilder extends
    // @@protoc_insertion_point(interface_extends:spark.connect.CoGroupMap)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * (Required) One input relation for CoGroup Map API - applyInPandas.
   * </pre>
   *
   * <code>.spark.connect.Relation input = 1;</code>
   * @return Whether the input field is set.
   */
  boolean hasInput();
  /**
   * <pre>
   * (Required) One input relation for CoGroup Map API - applyInPandas.
   * </pre>
   *
   * <code>.spark.connect.Relation input = 1;</code>
   * @return The input.
   */
  org.apache.spark.connect.proto.Relation getInput();
  /**
   * <pre>
   * (Required) One input relation for CoGroup Map API - applyInPandas.
   * </pre>
   *
   * <code>.spark.connect.Relation input = 1;</code>
   */
  org.apache.spark.connect.proto.RelationOrBuilder getInputOrBuilder();

  /**
   * <pre>
   * Expressions for grouping keys of the first input relation.
   * </pre>
   *
   * <code>repeated .spark.connect.Expression input_grouping_expressions = 2;</code>
   */
  java.util.List<org.apache.spark.connect.proto.Expression> 
      getInputGroupingExpressionsList();
  /**
   * <pre>
   * Expressions for grouping keys of the first input relation.
   * </pre>
   *
   * <code>repeated .spark.connect.Expression input_grouping_expressions = 2;</code>
   */
  org.apache.spark.connect.proto.Expression getInputGroupingExpressions(int index);
  /**
   * <pre>
   * Expressions for grouping keys of the first input relation.
   * </pre>
   *
   * <code>repeated .spark.connect.Expression input_grouping_expressions = 2;</code>
   */
  int getInputGroupingExpressionsCount();
  /**
   * <pre>
   * Expressions for grouping keys of the first input relation.
   * </pre>
   *
   * <code>repeated .spark.connect.Expression input_grouping_expressions = 2;</code>
   */
  java.util.List<? extends org.apache.spark.connect.proto.ExpressionOrBuilder> 
      getInputGroupingExpressionsOrBuilderList();
  /**
   * <pre>
   * Expressions for grouping keys of the first input relation.
   * </pre>
   *
   * <code>repeated .spark.connect.Expression input_grouping_expressions = 2;</code>
   */
  org.apache.spark.connect.proto.ExpressionOrBuilder getInputGroupingExpressionsOrBuilder(
      int index);

  /**
   * <pre>
   * (Required) The other input relation.
   * </pre>
   *
   * <code>.spark.connect.Relation other = 3;</code>
   * @return Whether the other field is set.
   */
  boolean hasOther();
  /**
   * <pre>
   * (Required) The other input relation.
   * </pre>
   *
   * <code>.spark.connect.Relation other = 3;</code>
   * @return The other.
   */
  org.apache.spark.connect.proto.Relation getOther();
  /**
   * <pre>
   * (Required) The other input relation.
   * </pre>
   *
   * <code>.spark.connect.Relation other = 3;</code>
   */
  org.apache.spark.connect.proto.RelationOrBuilder getOtherOrBuilder();

  /**
   * <pre>
   * Expressions for grouping keys of the other input relation.
   * </pre>
   *
   * <code>repeated .spark.connect.Expression other_grouping_expressions = 4;</code>
   */
  java.util.List<org.apache.spark.connect.proto.Expression> 
      getOtherGroupingExpressionsList();
  /**
   * <pre>
   * Expressions for grouping keys of the other input relation.
   * </pre>
   *
   * <code>repeated .spark.connect.Expression other_grouping_expressions = 4;</code>
   */
  org.apache.spark.connect.proto.Expression getOtherGroupingExpressions(int index);
  /**
   * <pre>
   * Expressions for grouping keys of the other input relation.
   * </pre>
   *
   * <code>repeated .spark.connect.Expression other_grouping_expressions = 4;</code>
   */
  int getOtherGroupingExpressionsCount();
  /**
   * <pre>
   * Expressions for grouping keys of the other input relation.
   * </pre>
   *
   * <code>repeated .spark.connect.Expression other_grouping_expressions = 4;</code>
   */
  java.util.List<? extends org.apache.spark.connect.proto.ExpressionOrBuilder> 
      getOtherGroupingExpressionsOrBuilderList();
  /**
   * <pre>
   * Expressions for grouping keys of the other input relation.
   * </pre>
   *
   * <code>repeated .spark.connect.Expression other_grouping_expressions = 4;</code>
   */
  org.apache.spark.connect.proto.ExpressionOrBuilder getOtherGroupingExpressionsOrBuilder(
      int index);

  /**
   * <pre>
   * (Required) Input user-defined function.
   * </pre>
   *
   * <code>.spark.connect.CommonInlineUserDefinedFunction func = 5;</code>
   * @return Whether the func field is set.
   */
  boolean hasFunc();
  /**
   * <pre>
   * (Required) Input user-defined function.
   * </pre>
   *
   * <code>.spark.connect.CommonInlineUserDefinedFunction func = 5;</code>
   * @return The func.
   */
  org.apache.spark.connect.proto.CommonInlineUserDefinedFunction getFunc();
  /**
   * <pre>
   * (Required) Input user-defined function.
   * </pre>
   *
   * <code>.spark.connect.CommonInlineUserDefinedFunction func = 5;</code>
   */
  org.apache.spark.connect.proto.CommonInlineUserDefinedFunctionOrBuilder getFuncOrBuilder();

  /**
   * <pre>
   * (Optional) Expressions for sorting. Only used by Scala Sorted CoGroup Map API.
   * </pre>
   *
   * <code>repeated .spark.connect.Expression input_sorting_expressions = 6;</code>
   */
  java.util.List<org.apache.spark.connect.proto.Expression> 
      getInputSortingExpressionsList();
  /**
   * <pre>
   * (Optional) Expressions for sorting. Only used by Scala Sorted CoGroup Map API.
   * </pre>
   *
   * <code>repeated .spark.connect.Expression input_sorting_expressions = 6;</code>
   */
  org.apache.spark.connect.proto.Expression getInputSortingExpressions(int index);
  /**
   * <pre>
   * (Optional) Expressions for sorting. Only used by Scala Sorted CoGroup Map API.
   * </pre>
   *
   * <code>repeated .spark.connect.Expression input_sorting_expressions = 6;</code>
   */
  int getInputSortingExpressionsCount();
  /**
   * <pre>
   * (Optional) Expressions for sorting. Only used by Scala Sorted CoGroup Map API.
   * </pre>
   *
   * <code>repeated .spark.connect.Expression input_sorting_expressions = 6;</code>
   */
  java.util.List<? extends org.apache.spark.connect.proto.ExpressionOrBuilder> 
      getInputSortingExpressionsOrBuilderList();
  /**
   * <pre>
   * (Optional) Expressions for sorting. Only used by Scala Sorted CoGroup Map API.
   * </pre>
   *
   * <code>repeated .spark.connect.Expression input_sorting_expressions = 6;</code>
   */
  org.apache.spark.connect.proto.ExpressionOrBuilder getInputSortingExpressionsOrBuilder(
      int index);

  /**
   * <pre>
   * (Optional) Expressions for sorting. Only used by Scala Sorted CoGroup Map API.
   * </pre>
   *
   * <code>repeated .spark.connect.Expression other_sorting_expressions = 7;</code>
   */
  java.util.List<org.apache.spark.connect.proto.Expression> 
      getOtherSortingExpressionsList();
  /**
   * <pre>
   * (Optional) Expressions for sorting. Only used by Scala Sorted CoGroup Map API.
   * </pre>
   *
   * <code>repeated .spark.connect.Expression other_sorting_expressions = 7;</code>
   */
  org.apache.spark.connect.proto.Expression getOtherSortingExpressions(int index);
  /**
   * <pre>
   * (Optional) Expressions for sorting. Only used by Scala Sorted CoGroup Map API.
   * </pre>
   *
   * <code>repeated .spark.connect.Expression other_sorting_expressions = 7;</code>
   */
  int getOtherSortingExpressionsCount();
  /**
   * <pre>
   * (Optional) Expressions for sorting. Only used by Scala Sorted CoGroup Map API.
   * </pre>
   *
   * <code>repeated .spark.connect.Expression other_sorting_expressions = 7;</code>
   */
  java.util.List<? extends org.apache.spark.connect.proto.ExpressionOrBuilder> 
      getOtherSortingExpressionsOrBuilderList();
  /**
   * <pre>
   * (Optional) Expressions for sorting. Only used by Scala Sorted CoGroup Map API.
   * </pre>
   *
   * <code>repeated .spark.connect.Expression other_sorting_expressions = 7;</code>
   */
  org.apache.spark.connect.proto.ExpressionOrBuilder getOtherSortingExpressionsOrBuilder(
      int index);
}
