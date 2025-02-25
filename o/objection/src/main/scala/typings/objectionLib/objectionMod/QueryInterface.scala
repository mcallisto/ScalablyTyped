package typings
package objectionLib.objectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryInterface[QM /* <: Model */, RM, RV] extends js.Object {
  @JSName("andHaving")
  var andHaving_Original: Where[QM, RM, RV] = js.native
  @JSName("andWhereBetween")
  var andWhereBetween_Original: WhereBetween[QM, RM, RV] = js.native
  @JSName("andWhereColumn")
  var andWhereColumn_Original: Where[QM, RM, RV] = js.native
  @JSName("andWhereNotBetween")
  var andWhereNotBetween_Original: WhereBetween[QM, RM, RV] = js.native
  @JSName("andWhereNotColumn")
  var andWhereNotColumn_Original: Where[QM, RM, RV] = js.native
  @JSName("andWhereNot")
  var andWhereNot_Original: Where[QM, RM, RV] = js.native
  @JSName("andWhereRaw")
  var andWhereRaw_Original: WhereRaw[QM, RM, RV] = js.native
  @JSName("andWhere")
  var andWhere_Original: Where[QM, RM, RV] = js.native
  @JSName("as")
  var as_Original: As[QM, RM, RV] = js.native
  @JSName("column")
  var column_Original: Select[QM, RM, RV] = js.native
  @JSName("columns")
  var columns_Original: Select[QM, RM, RV] = js.native
  @JSName("crossJoin")
  var crossJoin_Original: Join[QM, RM, RV] = js.native
  @JSName("distinct")
  var distinct_Original: Distinct[QM, RM, RV] = js.native
  @JSName("from")
  var from_Original: Table[QM, RM, RV] = js.native
  @JSName("fullOuterJoin")
  var fullOuterJoin_Original: Join[QM, RM, RV] = js.native
  @JSName("groupByRaw")
  var groupByRaw_Original: RawMethod[QM, RM, RV] = js.native
  // Group by
  @JSName("groupBy")
  var groupBy_Original: GroupBy[QM, RM, RV] = js.native
  @JSName("havingBetween")
  var havingBetween_Original: WhereBetween[QM, RM, RV] = js.native
  @JSName("havingExists")
  var havingExists_Original: WhereExists[QM, RM, RV] = js.native
  @JSName("havingIn")
  var havingIn_Original: WhereIn[QM, RM, RV] = js.native
  @JSName("havingNotBetween")
  var havingNotBetween_Original: WhereBetween[QM, RM, RV] = js.native
  @JSName("havingNotExists")
  var havingNotExists_Original: WhereExists[QM, RM, RV] = js.native
  @JSName("havingNotIn")
  var havingNotIn_Original: WhereIn[QM, RM, RV] = js.native
  @JSName("havingNotNull")
  var havingNotNull_Original: WhereNull[QM, RM, RV] = js.native
  @JSName("havingNull")
  var havingNull_Original: WhereNull[QM, RM, RV] = js.native
  @JSName("havingRaw")
  var havingRaw_Original: WhereRaw[QM, RM, RV] = js.native
  @JSName("havingWrapped")
  var havingWrapped_Original: WhereWrapped[QM, RM, RV] = js.native
  // Having
  @JSName("having")
  var having_Original: Where[QM, RM, RV] = js.native
  @JSName("innerJoin")
  var innerJoin_Original: Join[QM, RM, RV] = js.native
  @JSName("intersect")
  var intersect_Original: SetOperations[QM] = js.native
  @JSName("into")
  var into_Original: Table[QM, RM, RV] = js.native
  @JSName("joinRaw")
  var joinRaw_Original: JoinRaw[QM, RM, RV] = js.native
  // Joins
  @JSName("join")
  var join_Original: Join[QM, RM, RV] = js.native
  @JSName("leftJoin")
  var leftJoin_Original: Join[QM, RM, RV] = js.native
  @JSName("leftOuterJoin")
  var leftOuterJoin_Original: Join[QM, RM, RV] = js.native
  @JSName("orHavingBetween")
  var orHavingBetween_Original: WhereBetween[QM, RM, RV] = js.native
  @JSName("orHavingExists")
  var orHavingExists_Original: WhereExists[QM, RM, RV] = js.native
  @JSName("orHavingIn")
  var orHavingIn_Original: WhereIn[QM, RM, RV] = js.native
  @JSName("orHavingNotBetween")
  var orHavingNotBetween_Original: WhereBetween[QM, RM, RV] = js.native
  @JSName("orHavingNotExists")
  var orHavingNotExists_Original: WhereExists[QM, RM, RV] = js.native
  @JSName("orHavingNotIn")
  var orHavingNotIn_Original: WhereIn[QM, RM, RV] = js.native
  @JSName("orHavingNotNull")
  var orHavingNotNull_Original: WhereNull[QM, RM, RV] = js.native
  @JSName("orHavingNull")
  var orHavingNull_Original: WhereNull[QM, RM, RV] = js.native
  @JSName("orHavingRaw")
  var orHavingRaw_Original: WhereRaw[QM, RM, RV] = js.native
  @JSName("orHaving")
  var orHaving_Original: Where[QM, RM, RV] = js.native
  @JSName("orWhereBetween")
  var orWhereBetween_Original: WhereBetween[QM, RM, RV] = js.native
  @JSName("orWhereColumn")
  var orWhereColumn_Original: Where[QM, RM, RV] = js.native
  @JSName("orWhereExists")
  var orWhereExists_Original: WhereExists[QM, RM, RV] = js.native
  @JSName("orWhereIn")
  var orWhereIn_Original: WhereIn[QM, RM, RV] = js.native
  @JSName("orWhereNotBetween")
  var orWhereNotBetween_Original: WhereBetween[QM, RM, RV] = js.native
  @JSName("orWhereNotColumn")
  var orWhereNotColumn_Original: Where[QM, RM, RV] = js.native
  @JSName("orWhereNotExists")
  var orWhereNotExists_Original: WhereExists[QM, RM, RV] = js.native
  @JSName("orWhereNotIn")
  var orWhereNotIn_Original: WhereIn[QM, RM, RV] = js.native
  @JSName("orWhereNotNull")
  var orWhereNotNull_Original: WhereNull[QM, RM, RV] = js.native
  @JSName("orWhereNot")
  var orWhereNot_Original: Where[QM, RM, RV] = js.native
  @JSName("orWhereNull")
  var orWhereNull_Original: WhereNull[QM, RM, RV] = js.native
  @JSName("orWhereRaw")
  var orWhereRaw_Original: WhereRaw[QM, RM, RV] = js.native
  @JSName("orWhere")
  var orWhere_Original: Where[QM, RM, RV] = js.native
  @JSName("orderByRaw")
  var orderByRaw_Original: RawMethod[QM, RM, RV] = js.native
  // Order by
  @JSName("orderBy")
  var orderBy_Original: OrderBy[QM, RM, RV] = js.native
  @JSName("outerJoin")
  var outerJoin_Original: Join[QM, RM, RV] = js.native
  @JSName("rightJoin")
  var rightJoin_Original: Join[QM, RM, RV] = js.native
  @JSName("rightOuterJoin")
  var rightOuterJoin_Original: Join[QM, RM, RV] = js.native
  @JSName("select")
  var select_Original: Select[QM, RM, RV] = js.native
  @JSName("table")
  var table_Original: Table[QM, RM, RV] = js.native
  @JSName("unionAll")
  var unionAll_Original: SetOperations[QM] = js.native
  // Union
  @JSName("union")
  var union_Original: SetOperations[QM] = js.native
  @JSName("whereBetween")
  var whereBetween_Original: WhereBetween[QM, RM, RV] = js.native
  @JSName("whereColumn")
  var whereColumn_Original: Where[QM, RM, RV] = js.native
  @JSName("whereExists")
  var whereExists_Original: WhereExists[QM, RM, RV] = js.native
  @JSName("whereIn")
  var whereIn_Original: WhereIn[QM, RM, RV] = js.native
  @JSName("whereNotBetween")
  var whereNotBetween_Original: WhereBetween[QM, RM, RV] = js.native
  @JSName("whereNotColumn")
  var whereNotColumn_Original: Where[QM, RM, RV] = js.native
  @JSName("whereNotExists")
  var whereNotExists_Original: WhereExists[QM, RM, RV] = js.native
  @JSName("whereNotIn")
  var whereNotIn_Original: WhereIn[QM, RM, RV] = js.native
  @JSName("whereNotNull")
  var whereNotNull_Original: WhereNull[QM, RM, RV] = js.native
  @JSName("whereNot")
  var whereNot_Original: Where[QM, RM, RV] = js.native
  @JSName("whereNull")
  var whereNull_Original: WhereNull[QM, RM, RV] = js.native
  @JSName("whereRaw")
  var whereRaw_Original: WhereRaw[QM, RM, RV] = js.native
  @JSName("whereWrapped")
  var whereWrapped_Original: WhereWrapped[QM, RM, RV] = js.native
  // Wheres
  @JSName("where")
  var where_Original: Where[QM, RM, RV] = js.native
  @JSName("withRaw")
  var withRaw_Original: WithRaw[QM, RM, RV] = js.native
  @JSName("withWrapped")
  var withWrapped_Original: WithWrapped[QM, RM, RV] = js.native
  // Withs
  @JSName("with")
  var with_Original: With[QM, RM, RV] = js.native
  def andHaving(
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      scala.Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def andHaving(
    column: java.lang.String,
    operator: java.lang.String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def andHaving(column: java.lang.String, operator: java.lang.String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def andHaving(column: java.lang.String, operator: java.lang.String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def andHaving(
    column: java.lang.String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def andHaving(column: java.lang.String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def andHaving(column: java.lang.String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def andHaving(
    column: ColumnRef,
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      scala.Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def andHaving(
    column: ColumnRef,
    operator: java.lang.String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def andHaving(column: ColumnRef, operator: java.lang.String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def andHaving(column: ColumnRef, operator: java.lang.String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def andHaving(
    column: ColumnRef,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def andHaving(column: ColumnRef, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def andHaving(column: ColumnRef, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def andHaving(condition: scala.Boolean): QueryBuilder[QM, RM, RV] = js.native
  def andHaving(`object`: js.Object): QueryBuilder[QM, RM, RV] = js.native
  def andHaving(raw: Raw): QueryBuilder[QM, RM, RV] = js.native
  def andHaving(sql: java.lang.String, bindings: js.Any*): QueryBuilder[QM, RM, RV] = js.native
  def andHaving(sql: java.lang.String, bindings: js.Any): QueryBuilder[QM, RM, RV] = js.native
  def andWhere(
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      scala.Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def andWhere(
    column: java.lang.String,
    operator: java.lang.String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def andWhere(column: java.lang.String, operator: java.lang.String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def andWhere(column: java.lang.String, operator: java.lang.String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def andWhere(
    column: java.lang.String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def andWhere(column: java.lang.String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def andWhere(column: java.lang.String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def andWhere(
    column: ColumnRef,
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      scala.Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def andWhere(
    column: ColumnRef,
    operator: java.lang.String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def andWhere(column: ColumnRef, operator: java.lang.String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def andWhere(column: ColumnRef, operator: java.lang.String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def andWhere(
    column: ColumnRef,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def andWhere(column: ColumnRef, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def andWhere(column: ColumnRef, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def andWhere(condition: scala.Boolean): QueryBuilder[QM, RM, RV] = js.native
  def andWhere(`object`: js.Object): QueryBuilder[QM, RM, RV] = js.native
  def andWhere(raw: Raw): QueryBuilder[QM, RM, RV] = js.native
  def andWhere(sql: java.lang.String, bindings: js.Any*): QueryBuilder[QM, RM, RV] = js.native
  def andWhere(sql: java.lang.String, bindings: js.Any): QueryBuilder[QM, RM, RV] = js.native
  def andWhereBetween(column: ColumnRef, range: js.Tuple2[Value, Value]): QueryBuilder[QM, RM, RV] = js.native
  def andWhereColumn(
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      scala.Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def andWhereColumn(
    column: java.lang.String,
    operator: java.lang.String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def andWhereColumn(column: java.lang.String, operator: java.lang.String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def andWhereColumn(column: java.lang.String, operator: java.lang.String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def andWhereColumn(
    column: java.lang.String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def andWhereColumn(column: java.lang.String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def andWhereColumn(column: java.lang.String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def andWhereColumn(
    column: ColumnRef,
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      scala.Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def andWhereColumn(
    column: ColumnRef,
    operator: java.lang.String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def andWhereColumn(column: ColumnRef, operator: java.lang.String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def andWhereColumn(column: ColumnRef, operator: java.lang.String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def andWhereColumn(
    column: ColumnRef,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def andWhereColumn(column: ColumnRef, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def andWhereColumn(column: ColumnRef, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def andWhereColumn(condition: scala.Boolean): QueryBuilder[QM, RM, RV] = js.native
  def andWhereColumn(`object`: js.Object): QueryBuilder[QM, RM, RV] = js.native
  def andWhereColumn(raw: Raw): QueryBuilder[QM, RM, RV] = js.native
  def andWhereColumn(sql: java.lang.String, bindings: js.Any*): QueryBuilder[QM, RM, RV] = js.native
  def andWhereColumn(sql: java.lang.String, bindings: js.Any): QueryBuilder[QM, RM, RV] = js.native
  def andWhereNot(
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      scala.Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def andWhereNot(
    column: java.lang.String,
    operator: java.lang.String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def andWhereNot(column: java.lang.String, operator: java.lang.String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def andWhereNot(column: java.lang.String, operator: java.lang.String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def andWhereNot(
    column: java.lang.String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def andWhereNot(column: java.lang.String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def andWhereNot(column: java.lang.String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def andWhereNot(
    column: ColumnRef,
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      scala.Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def andWhereNot(
    column: ColumnRef,
    operator: java.lang.String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def andWhereNot(column: ColumnRef, operator: java.lang.String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def andWhereNot(column: ColumnRef, operator: java.lang.String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def andWhereNot(
    column: ColumnRef,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def andWhereNot(column: ColumnRef, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def andWhereNot(column: ColumnRef, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def andWhereNot(condition: scala.Boolean): QueryBuilder[QM, RM, RV] = js.native
  def andWhereNot(`object`: js.Object): QueryBuilder[QM, RM, RV] = js.native
  def andWhereNot(raw: Raw): QueryBuilder[QM, RM, RV] = js.native
  def andWhereNot(sql: java.lang.String, bindings: js.Any*): QueryBuilder[QM, RM, RV] = js.native
  def andWhereNot(sql: java.lang.String, bindings: js.Any): QueryBuilder[QM, RM, RV] = js.native
  def andWhereNotBetween(column: ColumnRef, range: js.Tuple2[Value, Value]): QueryBuilder[QM, RM, RV] = js.native
  def andWhereNotColumn(
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      scala.Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def andWhereNotColumn(
    column: java.lang.String,
    operator: java.lang.String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def andWhereNotColumn(column: java.lang.String, operator: java.lang.String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def andWhereNotColumn(column: java.lang.String, operator: java.lang.String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def andWhereNotColumn(
    column: java.lang.String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def andWhereNotColumn(column: java.lang.String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def andWhereNotColumn(column: java.lang.String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def andWhereNotColumn(
    column: ColumnRef,
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      scala.Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def andWhereNotColumn(
    column: ColumnRef,
    operator: java.lang.String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def andWhereNotColumn(column: ColumnRef, operator: java.lang.String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def andWhereNotColumn(column: ColumnRef, operator: java.lang.String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def andWhereNotColumn(
    column: ColumnRef,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def andWhereNotColumn(column: ColumnRef, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def andWhereNotColumn(column: ColumnRef, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def andWhereNotColumn(condition: scala.Boolean): QueryBuilder[QM, RM, RV] = js.native
  def andWhereNotColumn(`object`: js.Object): QueryBuilder[QM, RM, RV] = js.native
  def andWhereNotColumn(raw: Raw): QueryBuilder[QM, RM, RV] = js.native
  def andWhereNotColumn(sql: java.lang.String, bindings: js.Any*): QueryBuilder[QM, RM, RV] = js.native
  def andWhereNotColumn(sql: java.lang.String, bindings: js.Any): QueryBuilder[QM, RM, RV] = js.native
  def andWhereRaw(condition: scala.Boolean): QueryBuilder[QM, RM, RV] = js.native
  def andWhereRaw(raw: Raw): QueryBuilder[QM, RM, RV] = js.native
  def andWhereRaw(sql: java.lang.String, bindings: js.Any*): QueryBuilder[QM, RM, RV] = js.native
  def andWhereRaw(sql: java.lang.String, bindings: js.Any): QueryBuilder[QM, RM, RV] = js.native
  def as(alias: java.lang.String): QueryBuilder[QM, RM, RV] = js.native
  def avg(columnName: java.lang.String): this.type = js.native
  def avgDistinct(columnName: java.lang.String): this.type = js.native
  def clearOrder(): this.type = js.native
  // Clear
  def clearSelect(): this.type = js.native
  def clearWhere(): this.type = js.native
  def column(columnNames: ColumnRef*): QueryBuilder[QM, RM, RV] = js.native
  def column(columnNames: js.Array[ColumnRef]): QueryBuilder[QM, RM, RV] = js.native
  def columns(columnNames: ColumnRef*): QueryBuilder[QM, RM, RV] = js.native
  def columns(columnNames: js.Array[ColumnRef]): QueryBuilder[QM, RM, RV] = js.native
  def connection(connection: js.Any): this.type = js.native
  // Aggregation
  def count(): this.type = js.native
  def count(columnName: java.lang.String): this.type = js.native
  def countDistinct(): this.type = js.native
  def countDistinct(columnName: java.lang.String): this.type = js.native
  def crossJoin(
    queryBuilder: QueryBuilder[
      Model, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RM */ _, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def crossJoin(raw: Raw): QueryBuilder[QM, RM, RV] = js.native
  def crossJoin(
    tableName: TableName,
    clause: js.ThisFunction1[
      /* this */ knexLib.knexMod.JoinClause, 
      /* join */ knexLib.knexMod.JoinClause, 
      scala.Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def crossJoin(tableName: TableName, column1: ColumnRef, column2: ColumnRef): QueryBuilder[QM, RM, RV] = js.native
  def crossJoin(tableName: TableName, column1: ColumnRef, operator: java.lang.String, column2: ColumnRef): QueryBuilder[QM, RM, RV] = js.native
  def crossJoin(
    tableName: TableName,
    columns: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | Raw | Reference]
  ): QueryBuilder[QM, RM, RV] = js.native
  def crossJoin(tableName: TableName, raw: Raw): QueryBuilder[QM, RM, RV] = js.native
  def debug(): this.type = js.native
  def debug(enabled: scala.Boolean): this.type = js.native
  def decrement(columnName: java.lang.String): this.type = js.native
  def decrement(columnName: java.lang.String, amount: scala.Double): this.type = js.native
  def del(): QueryBuilderYieldingCount[QM, RM] = js.native
  def delete(): QueryBuilderYieldingCount[QM, RM] = js.native
  def distinct(columnNames: ColumnRef*): QueryBuilder[QM, RM, RV] = js.native
  def distinct(columnNames: js.Array[ColumnRef]): QueryBuilder[QM, RM, RV] = js.native
  def from(
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      scala.Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def from(tableName: TableName): QueryBuilder[QM, RM, RV] = js.native
  def fullOuterJoin(
    queryBuilder: QueryBuilder[
      Model, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RM */ _, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def fullOuterJoin(raw: Raw): QueryBuilder[QM, RM, RV] = js.native
  def fullOuterJoin(
    tableName: TableName,
    clause: js.ThisFunction1[
      /* this */ knexLib.knexMod.JoinClause, 
      /* join */ knexLib.knexMod.JoinClause, 
      scala.Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def fullOuterJoin(tableName: TableName, column1: ColumnRef, column2: ColumnRef): QueryBuilder[QM, RM, RV] = js.native
  def fullOuterJoin(tableName: TableName, column1: ColumnRef, operator: java.lang.String, column2: ColumnRef): QueryBuilder[QM, RM, RV] = js.native
  def fullOuterJoin(
    tableName: TableName,
    columns: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | Raw | Reference]
  ): QueryBuilder[QM, RM, RV] = js.native
  def fullOuterJoin(tableName: TableName, raw: Raw): QueryBuilder[QM, RM, RV] = js.native
  // Group by
  def groupBy(columnNames: ColumnRef*): QueryBuilder[QM, RM, RV] = js.native
  // Group by
  def groupBy(columnNames: js.Array[ColumnRef]): QueryBuilder[QM, RM, RV] = js.native
  // Group by
  def groupBy(raw: Raw): QueryBuilder[QM, RM, RV] = js.native
  // Group by
  def groupBy(sql: java.lang.String, bindings: js.Any*): QueryBuilder[QM, RM, RV] = js.native
  // Group by
  def groupBy(sql: java.lang.String, bindings: js.Any): QueryBuilder[QM, RM, RV] = js.native
  def groupByRaw(raw: Raw): QueryBuilder[QM, RM, RV] = js.native
  def groupByRaw(sql: java.lang.String, bindings: js.Any*): QueryBuilder[QM, RM, RV] = js.native
  def groupByRaw(sql: java.lang.String, bindings: js.Any): QueryBuilder[QM, RM, RV] = js.native
  // Having
  def having(
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      scala.Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def having(
    column: java.lang.String,
    operator: java.lang.String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def having(column: java.lang.String, operator: java.lang.String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  // Having
  def having(column: java.lang.String, operator: java.lang.String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def having(
    column: java.lang.String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def having(column: java.lang.String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  // Having
  def having(column: java.lang.String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  // Having
  def having(
    column: ColumnRef,
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      scala.Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def having(
    column: ColumnRef,
    operator: java.lang.String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def having(column: ColumnRef, operator: java.lang.String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def having(column: ColumnRef, operator: java.lang.String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def having(
    column: ColumnRef,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def having(column: ColumnRef, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def having(column: ColumnRef, value: Value): QueryBuilder[QM, RM, RV] = js.native
  // Having
  def having(condition: scala.Boolean): QueryBuilder[QM, RM, RV] = js.native
  // Having
  def having(`object`: js.Object): QueryBuilder[QM, RM, RV] = js.native
  // Having
  def having(raw: Raw): QueryBuilder[QM, RM, RV] = js.native
  // Having
  def having(sql: java.lang.String, bindings: js.Any*): QueryBuilder[QM, RM, RV] = js.native
  // Having
  def having(sql: java.lang.String, bindings: js.Any): QueryBuilder[QM, RM, RV] = js.native
  def havingBetween(column: ColumnRef, range: js.Tuple2[Value, Value]): QueryBuilder[QM, RM, RV] = js.native
  def havingExists(
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      scala.Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def havingExists(
    query: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def havingExists(raw: Raw): QueryBuilder[QM, RM, RV] = js.native
  def havingIn(
    column: js.Array[ColumnRef],
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      scala.Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def havingIn(
    column: js.Array[ColumnRef],
    query: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def havingIn(column: js.Array[ColumnRef], values: js.Array[Value]): QueryBuilder[QM, RM, RV] = js.native
  def havingIn(
    column: ColumnRef,
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      scala.Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def havingIn(
    column: ColumnRef,
    query: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def havingIn(column: ColumnRef, values: js.Array[Value]): QueryBuilder[QM, RM, RV] = js.native
  def havingNotBetween(column: ColumnRef, range: js.Tuple2[Value, Value]): QueryBuilder[QM, RM, RV] = js.native
  def havingNotExists(
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      scala.Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def havingNotExists(
    query: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def havingNotExists(raw: Raw): QueryBuilder[QM, RM, RV] = js.native
  def havingNotIn(
    column: js.Array[ColumnRef],
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      scala.Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def havingNotIn(
    column: js.Array[ColumnRef],
    query: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def havingNotIn(column: js.Array[ColumnRef], values: js.Array[Value]): QueryBuilder[QM, RM, RV] = js.native
  def havingNotIn(
    column: ColumnRef,
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      scala.Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def havingNotIn(
    column: ColumnRef,
    query: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def havingNotIn(column: ColumnRef, values: js.Array[Value]): QueryBuilder[QM, RM, RV] = js.native
  def havingNotNull(column: ColumnRef): QueryBuilder[QM, RM, RV] = js.native
  def havingNull(column: ColumnRef): QueryBuilder[QM, RM, RV] = js.native
  def havingRaw(condition: scala.Boolean): QueryBuilder[QM, RM, RV] = js.native
  def havingRaw(raw: Raw): QueryBuilder[QM, RM, RV] = js.native
  def havingRaw(sql: java.lang.String, bindings: js.Any*): QueryBuilder[QM, RM, RV] = js.native
  def havingRaw(sql: java.lang.String, bindings: js.Any): QueryBuilder[QM, RM, RV] = js.native
  def havingWrapped(
    callback: js.Function1[
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      scala.Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def increment(columnName: java.lang.String): this.type = js.native
  def increment(columnName: java.lang.String, amount: scala.Double): this.type = js.native
  def innerJoin(
    queryBuilder: QueryBuilder[
      Model, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RM */ _, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def innerJoin(raw: Raw): QueryBuilder[QM, RM, RV] = js.native
  def innerJoin(
    tableName: TableName,
    clause: js.ThisFunction1[
      /* this */ knexLib.knexMod.JoinClause, 
      /* join */ knexLib.knexMod.JoinClause, 
      scala.Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def innerJoin(tableName: TableName, column1: ColumnRef, column2: ColumnRef): QueryBuilder[QM, RM, RV] = js.native
  def innerJoin(tableName: TableName, column1: ColumnRef, operator: java.lang.String, column2: ColumnRef): QueryBuilder[QM, RM, RV] = js.native
  def innerJoin(
    tableName: TableName,
    columns: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | Raw | Reference]
  ): QueryBuilder[QM, RM, RV] = js.native
  def innerJoin(tableName: TableName, raw: Raw): QueryBuilder[QM, RM, RV] = js.native
  def intersect(
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      scala.Unit
    ]
  ): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def intersect(
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      scala.Unit
    ],
    wrap: scala.Boolean
  ): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def intersect(
    callbacks: (js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      scala.Unit
    ])*
  ): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def intersect(
    callbacks: js.Array[
      js.ThisFunction1[
        /* this */ QueryBuilder[
          QM, 
          js.Array[QM], 
          /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
        ], 
        /* queryBuilder */ QueryBuilder[
          QM, 
          js.Array[QM], 
          /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
        ], 
        scala.Unit
      ]
    ]
  ): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def intersect(
    callbacks: js.Array[
      js.ThisFunction1[
        /* this */ QueryBuilder[
          QM, 
          js.Array[QM], 
          /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
        ], 
        /* queryBuilder */ QueryBuilder[
          QM, 
          js.Array[QM], 
          /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
        ], 
        scala.Unit
      ]
    ],
    wrap: scala.Boolean
  ): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def into(
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      scala.Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def into(tableName: TableName): QueryBuilder[QM, RM, RV] = js.native
  // Joins
  def join(
    queryBuilder: QueryBuilder[
      Model, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RM */ _, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  // Joins
  def join(raw: Raw): QueryBuilder[QM, RM, RV] = js.native
  // Joins
  def join(
    tableName: TableName,
    clause: js.ThisFunction1[
      /* this */ knexLib.knexMod.JoinClause, 
      /* join */ knexLib.knexMod.JoinClause, 
      scala.Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  // Joins
  def join(tableName: TableName, column1: ColumnRef, column2: ColumnRef): QueryBuilder[QM, RM, RV] = js.native
  // Joins
  def join(tableName: TableName, column1: ColumnRef, operator: java.lang.String, column2: ColumnRef): QueryBuilder[QM, RM, RV] = js.native
  // Joins
  def join(
    tableName: TableName,
    columns: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | Raw | Reference]
  ): QueryBuilder[QM, RM, RV] = js.native
  // Joins
  def join(tableName: TableName, raw: Raw): QueryBuilder[QM, RM, RV] = js.native
  def joinRaw(sql: java.lang.String): QueryBuilder[QM, RM, RV] = js.native
  def joinRaw(sql: java.lang.String, bindings: js.Any): QueryBuilder[QM, RM, RV] = js.native
  def leftJoin(
    queryBuilder: QueryBuilder[
      Model, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RM */ _, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def leftJoin(raw: Raw): QueryBuilder[QM, RM, RV] = js.native
  def leftJoin(
    tableName: TableName,
    clause: js.ThisFunction1[
      /* this */ knexLib.knexMod.JoinClause, 
      /* join */ knexLib.knexMod.JoinClause, 
      scala.Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def leftJoin(tableName: TableName, column1: ColumnRef, column2: ColumnRef): QueryBuilder[QM, RM, RV] = js.native
  def leftJoin(tableName: TableName, column1: ColumnRef, operator: java.lang.String, column2: ColumnRef): QueryBuilder[QM, RM, RV] = js.native
  def leftJoin(
    tableName: TableName,
    columns: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | Raw | Reference]
  ): QueryBuilder[QM, RM, RV] = js.native
  def leftJoin(tableName: TableName, raw: Raw): QueryBuilder[QM, RM, RV] = js.native
  def leftOuterJoin(
    queryBuilder: QueryBuilder[
      Model, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RM */ _, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def leftOuterJoin(raw: Raw): QueryBuilder[QM, RM, RV] = js.native
  def leftOuterJoin(
    tableName: TableName,
    clause: js.ThisFunction1[
      /* this */ knexLib.knexMod.JoinClause, 
      /* join */ knexLib.knexMod.JoinClause, 
      scala.Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def leftOuterJoin(tableName: TableName, column1: ColumnRef, column2: ColumnRef): QueryBuilder[QM, RM, RV] = js.native
  def leftOuterJoin(tableName: TableName, column1: ColumnRef, operator: java.lang.String, column2: ColumnRef): QueryBuilder[QM, RM, RV] = js.native
  def leftOuterJoin(
    tableName: TableName,
    columns: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | Raw | Reference]
  ): QueryBuilder[QM, RM, RV] = js.native
  def leftOuterJoin(tableName: TableName, raw: Raw): QueryBuilder[QM, RM, RV] = js.native
  def limit(limit: scala.Double): this.type = js.native
  def max(columnName: java.lang.String): this.type = js.native
  def min(columnName: java.lang.String): this.type = js.native
  // Paging
  def offset(offset: scala.Double): this.type = js.native
  def orHaving(
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      scala.Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orHaving(
    column: java.lang.String,
    operator: java.lang.String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orHaving(column: java.lang.String, operator: java.lang.String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def orHaving(column: java.lang.String, operator: java.lang.String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def orHaving(
    column: java.lang.String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orHaving(column: java.lang.String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def orHaving(column: java.lang.String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def orHaving(
    column: ColumnRef,
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      scala.Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orHaving(
    column: ColumnRef,
    operator: java.lang.String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orHaving(column: ColumnRef, operator: java.lang.String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def orHaving(column: ColumnRef, operator: java.lang.String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def orHaving(
    column: ColumnRef,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orHaving(column: ColumnRef, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def orHaving(column: ColumnRef, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def orHaving(condition: scala.Boolean): QueryBuilder[QM, RM, RV] = js.native
  def orHaving(`object`: js.Object): QueryBuilder[QM, RM, RV] = js.native
  def orHaving(raw: Raw): QueryBuilder[QM, RM, RV] = js.native
  def orHaving(sql: java.lang.String, bindings: js.Any*): QueryBuilder[QM, RM, RV] = js.native
  def orHaving(sql: java.lang.String, bindings: js.Any): QueryBuilder[QM, RM, RV] = js.native
  def orHavingBetween(column: ColumnRef, range: js.Tuple2[Value, Value]): QueryBuilder[QM, RM, RV] = js.native
  def orHavingExists(
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      scala.Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orHavingExists(
    query: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orHavingExists(raw: Raw): QueryBuilder[QM, RM, RV] = js.native
  def orHavingIn(
    column: js.Array[ColumnRef],
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      scala.Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orHavingIn(
    column: js.Array[ColumnRef],
    query: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orHavingIn(column: js.Array[ColumnRef], values: js.Array[Value]): QueryBuilder[QM, RM, RV] = js.native
  def orHavingIn(
    column: ColumnRef,
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      scala.Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orHavingIn(
    column: ColumnRef,
    query: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orHavingIn(column: ColumnRef, values: js.Array[Value]): QueryBuilder[QM, RM, RV] = js.native
  def orHavingNotBetween(column: ColumnRef, range: js.Tuple2[Value, Value]): QueryBuilder[QM, RM, RV] = js.native
  def orHavingNotExists(
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      scala.Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orHavingNotExists(
    query: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orHavingNotExists(raw: Raw): QueryBuilder[QM, RM, RV] = js.native
  def orHavingNotIn(
    column: js.Array[ColumnRef],
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      scala.Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orHavingNotIn(
    column: js.Array[ColumnRef],
    query: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orHavingNotIn(column: js.Array[ColumnRef], values: js.Array[Value]): QueryBuilder[QM, RM, RV] = js.native
  def orHavingNotIn(
    column: ColumnRef,
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      scala.Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orHavingNotIn(
    column: ColumnRef,
    query: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orHavingNotIn(column: ColumnRef, values: js.Array[Value]): QueryBuilder[QM, RM, RV] = js.native
  def orHavingNotNull(column: ColumnRef): QueryBuilder[QM, RM, RV] = js.native
  def orHavingNull(column: ColumnRef): QueryBuilder[QM, RM, RV] = js.native
  def orHavingRaw(condition: scala.Boolean): QueryBuilder[QM, RM, RV] = js.native
  def orHavingRaw(raw: Raw): QueryBuilder[QM, RM, RV] = js.native
  def orHavingRaw(sql: java.lang.String, bindings: js.Any*): QueryBuilder[QM, RM, RV] = js.native
  def orHavingRaw(sql: java.lang.String, bindings: js.Any): QueryBuilder[QM, RM, RV] = js.native
  def orWhere(
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      scala.Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orWhere(
    column: java.lang.String,
    operator: java.lang.String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orWhere(column: java.lang.String, operator: java.lang.String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def orWhere(column: java.lang.String, operator: java.lang.String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def orWhere(
    column: java.lang.String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orWhere(column: java.lang.String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def orWhere(column: java.lang.String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def orWhere(
    column: ColumnRef,
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      scala.Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orWhere(
    column: ColumnRef,
    operator: java.lang.String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orWhere(column: ColumnRef, operator: java.lang.String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def orWhere(column: ColumnRef, operator: java.lang.String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def orWhere(
    column: ColumnRef,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orWhere(column: ColumnRef, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def orWhere(column: ColumnRef, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def orWhere(condition: scala.Boolean): QueryBuilder[QM, RM, RV] = js.native
  def orWhere(`object`: js.Object): QueryBuilder[QM, RM, RV] = js.native
  def orWhere(raw: Raw): QueryBuilder[QM, RM, RV] = js.native
  def orWhere(sql: java.lang.String, bindings: js.Any*): QueryBuilder[QM, RM, RV] = js.native
  def orWhere(sql: java.lang.String, bindings: js.Any): QueryBuilder[QM, RM, RV] = js.native
  def orWhereBetween(column: ColumnRef, range: js.Tuple2[Value, Value]): QueryBuilder[QM, RM, RV] = js.native
  def orWhereColumn(
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      scala.Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orWhereColumn(
    column: java.lang.String,
    operator: java.lang.String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orWhereColumn(column: java.lang.String, operator: java.lang.String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def orWhereColumn(column: java.lang.String, operator: java.lang.String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def orWhereColumn(
    column: java.lang.String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orWhereColumn(column: java.lang.String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def orWhereColumn(column: java.lang.String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def orWhereColumn(
    column: ColumnRef,
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      scala.Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orWhereColumn(
    column: ColumnRef,
    operator: java.lang.String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orWhereColumn(column: ColumnRef, operator: java.lang.String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def orWhereColumn(column: ColumnRef, operator: java.lang.String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def orWhereColumn(
    column: ColumnRef,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orWhereColumn(column: ColumnRef, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def orWhereColumn(column: ColumnRef, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def orWhereColumn(condition: scala.Boolean): QueryBuilder[QM, RM, RV] = js.native
  def orWhereColumn(`object`: js.Object): QueryBuilder[QM, RM, RV] = js.native
  def orWhereColumn(raw: Raw): QueryBuilder[QM, RM, RV] = js.native
  def orWhereColumn(sql: java.lang.String, bindings: js.Any*): QueryBuilder[QM, RM, RV] = js.native
  def orWhereColumn(sql: java.lang.String, bindings: js.Any): QueryBuilder[QM, RM, RV] = js.native
  def orWhereExists(
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      scala.Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orWhereExists(
    query: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orWhereExists(raw: Raw): QueryBuilder[QM, RM, RV] = js.native
  def orWhereIn(
    column: js.Array[ColumnRef],
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      scala.Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orWhereIn(
    column: js.Array[ColumnRef],
    query: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orWhereIn(column: js.Array[ColumnRef], values: js.Array[Value]): QueryBuilder[QM, RM, RV] = js.native
  def orWhereIn(
    column: ColumnRef,
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      scala.Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orWhereIn(
    column: ColumnRef,
    query: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orWhereIn(column: ColumnRef, values: js.Array[Value]): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNot(
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      scala.Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNot(
    column: java.lang.String,
    operator: java.lang.String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNot(column: java.lang.String, operator: java.lang.String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNot(column: java.lang.String, operator: java.lang.String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNot(
    column: java.lang.String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNot(column: java.lang.String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNot(column: java.lang.String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNot(
    column: ColumnRef,
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      scala.Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNot(
    column: ColumnRef,
    operator: java.lang.String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNot(column: ColumnRef, operator: java.lang.String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNot(column: ColumnRef, operator: java.lang.String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNot(
    column: ColumnRef,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNot(column: ColumnRef, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNot(column: ColumnRef, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNot(condition: scala.Boolean): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNot(`object`: js.Object): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNot(raw: Raw): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNot(sql: java.lang.String, bindings: js.Any*): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNot(sql: java.lang.String, bindings: js.Any): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNotBetween(column: ColumnRef, range: js.Tuple2[Value, Value]): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNotColumn(
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      scala.Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNotColumn(
    column: java.lang.String,
    operator: java.lang.String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNotColumn(column: java.lang.String, operator: java.lang.String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNotColumn(column: java.lang.String, operator: java.lang.String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNotColumn(
    column: java.lang.String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNotColumn(column: java.lang.String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNotColumn(column: java.lang.String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNotColumn(
    column: ColumnRef,
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      scala.Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNotColumn(
    column: ColumnRef,
    operator: java.lang.String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNotColumn(column: ColumnRef, operator: java.lang.String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNotColumn(column: ColumnRef, operator: java.lang.String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNotColumn(
    column: ColumnRef,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNotColumn(column: ColumnRef, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNotColumn(column: ColumnRef, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNotColumn(condition: scala.Boolean): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNotColumn(`object`: js.Object): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNotColumn(raw: Raw): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNotColumn(sql: java.lang.String, bindings: js.Any*): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNotColumn(sql: java.lang.String, bindings: js.Any): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNotExists(
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      scala.Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNotExists(
    query: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNotExists(raw: Raw): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNotIn(
    column: js.Array[ColumnRef],
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      scala.Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNotIn(
    column: js.Array[ColumnRef],
    query: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNotIn(column: js.Array[ColumnRef], values: js.Array[Value]): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNotIn(
    column: ColumnRef,
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      scala.Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNotIn(
    column: ColumnRef,
    query: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNotIn(column: ColumnRef, values: js.Array[Value]): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNotNull(column: ColumnRef): QueryBuilder[QM, RM, RV] = js.native
  def orWhereNull(column: ColumnRef): QueryBuilder[QM, RM, RV] = js.native
  def orWhereRaw(condition: scala.Boolean): QueryBuilder[QM, RM, RV] = js.native
  def orWhereRaw(raw: Raw): QueryBuilder[QM, RM, RV] = js.native
  def orWhereRaw(sql: java.lang.String, bindings: js.Any*): QueryBuilder[QM, RM, RV] = js.native
  def orWhereRaw(sql: java.lang.String, bindings: js.Any): QueryBuilder[QM, RM, RV] = js.native
  // Order by
  def orderBy(column: ColumnRef): QueryBuilder[QM, RM, RV] = js.native
  def orderBy(column: ColumnRef, direction: java.lang.String): QueryBuilder[QM, RM, RV] = js.native
  def orderByRaw(raw: Raw): QueryBuilder[QM, RM, RV] = js.native
  def orderByRaw(sql: java.lang.String, bindings: js.Any*): QueryBuilder[QM, RM, RV] = js.native
  def orderByRaw(sql: java.lang.String, bindings: js.Any): QueryBuilder[QM, RM, RV] = js.native
  def outerJoin(
    queryBuilder: QueryBuilder[
      Model, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RM */ _, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def outerJoin(raw: Raw): QueryBuilder[QM, RM, RV] = js.native
  def outerJoin(
    tableName: TableName,
    clause: js.ThisFunction1[
      /* this */ knexLib.knexMod.JoinClause, 
      /* join */ knexLib.knexMod.JoinClause, 
      scala.Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def outerJoin(tableName: TableName, column1: ColumnRef, column2: ColumnRef): QueryBuilder[QM, RM, RV] = js.native
  def outerJoin(tableName: TableName, column1: ColumnRef, operator: java.lang.String, column2: ColumnRef): QueryBuilder[QM, RM, RV] = js.native
  def outerJoin(
    tableName: TableName,
    columns: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | Raw | Reference]
  ): QueryBuilder[QM, RM, RV] = js.native
  def outerJoin(tableName: TableName, raw: Raw): QueryBuilder[QM, RM, RV] = js.native
  def pluck(column: java.lang.String): this.type = js.native
  def rightJoin(
    queryBuilder: QueryBuilder[
      Model, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RM */ _, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def rightJoin(raw: Raw): QueryBuilder[QM, RM, RV] = js.native
  def rightJoin(
    tableName: TableName,
    clause: js.ThisFunction1[
      /* this */ knexLib.knexMod.JoinClause, 
      /* join */ knexLib.knexMod.JoinClause, 
      scala.Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def rightJoin(tableName: TableName, column1: ColumnRef, column2: ColumnRef): QueryBuilder[QM, RM, RV] = js.native
  def rightJoin(tableName: TableName, column1: ColumnRef, operator: java.lang.String, column2: ColumnRef): QueryBuilder[QM, RM, RV] = js.native
  def rightJoin(
    tableName: TableName,
    columns: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | Raw | Reference]
  ): QueryBuilder[QM, RM, RV] = js.native
  def rightJoin(tableName: TableName, raw: Raw): QueryBuilder[QM, RM, RV] = js.native
  def rightOuterJoin(
    queryBuilder: QueryBuilder[
      Model, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RM */ _, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def rightOuterJoin(raw: Raw): QueryBuilder[QM, RM, RV] = js.native
  def rightOuterJoin(
    tableName: TableName,
    clause: js.ThisFunction1[
      /* this */ knexLib.knexMod.JoinClause, 
      /* join */ knexLib.knexMod.JoinClause, 
      scala.Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def rightOuterJoin(tableName: TableName, column1: ColumnRef, column2: ColumnRef): QueryBuilder[QM, RM, RV] = js.native
  def rightOuterJoin(tableName: TableName, column1: ColumnRef, operator: java.lang.String, column2: ColumnRef): QueryBuilder[QM, RM, RV] = js.native
  def rightOuterJoin(
    tableName: TableName,
    columns: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | Raw | Reference]
  ): QueryBuilder[QM, RM, RV] = js.native
  def rightOuterJoin(tableName: TableName, raw: Raw): QueryBuilder[QM, RM, RV] = js.native
  def select(columnNames: ColumnRef*): QueryBuilder[QM, RM, RV] = js.native
  def select(columnNames: js.Array[ColumnRef]): QueryBuilder[QM, RM, RV] = js.native
  def sum(columnName: java.lang.String): this.type = js.native
  def sumDistinct(columnName: java.lang.String): this.type = js.native
  def table(
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      scala.Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def table(tableName: TableName): QueryBuilder[QM, RM, RV] = js.native
  def transacting(trx: Transaction): this.type = js.native
  def truncate(): this.type = js.native
  // Union
  def union(
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      scala.Unit
    ]
  ): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def union(
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      scala.Unit
    ],
    wrap: scala.Boolean
  ): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  // Union
  def union(
    callbacks: (js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      scala.Unit
    ])*
  ): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  // Union
  def union(
    callbacks: js.Array[
      js.ThisFunction1[
        /* this */ QueryBuilder[
          QM, 
          js.Array[QM], 
          /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
        ], 
        /* queryBuilder */ QueryBuilder[
          QM, 
          js.Array[QM], 
          /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
        ], 
        scala.Unit
      ]
    ]
  ): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def union(
    callbacks: js.Array[
      js.ThisFunction1[
        /* this */ QueryBuilder[
          QM, 
          js.Array[QM], 
          /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
        ], 
        /* queryBuilder */ QueryBuilder[
          QM, 
          js.Array[QM], 
          /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
        ], 
        scala.Unit
      ]
    ],
    wrap: scala.Boolean
  ): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def unionAll(
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      scala.Unit
    ]
  ): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def unionAll(
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      scala.Unit
    ],
    wrap: scala.Boolean
  ): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def unionAll(
    callbacks: (js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      scala.Unit
    ])*
  ): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def unionAll(
    callbacks: js.Array[
      js.ThisFunction1[
        /* this */ QueryBuilder[
          QM, 
          js.Array[QM], 
          /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
        ], 
        /* queryBuilder */ QueryBuilder[
          QM, 
          js.Array[QM], 
          /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
        ], 
        scala.Unit
      ]
    ]
  ): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  def unionAll(
    callbacks: js.Array[
      js.ThisFunction1[
        /* this */ QueryBuilder[
          QM, 
          js.Array[QM], 
          /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
        ], 
        /* queryBuilder */ QueryBuilder[
          QM, 
          js.Array[QM], 
          /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
        ], 
        scala.Unit
      ]
    ],
    wrap: scala.Boolean
  ): QueryBuilder[
    QM, 
    js.Array[QM], 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
  ] = js.native
  // Wheres
  def where(
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      scala.Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def where(
    column: java.lang.String,
    operator: java.lang.String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def where(column: java.lang.String, operator: java.lang.String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  // Wheres
  def where(column: java.lang.String, operator: java.lang.String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def where(
    column: java.lang.String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def where(column: java.lang.String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  // Wheres
  def where(column: java.lang.String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  // Wheres
  def where(
    column: ColumnRef,
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      scala.Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def where(
    column: ColumnRef,
    operator: java.lang.String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def where(column: ColumnRef, operator: java.lang.String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def where(column: ColumnRef, operator: java.lang.String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def where(
    column: ColumnRef,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def where(column: ColumnRef, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def where(column: ColumnRef, value: Value): QueryBuilder[QM, RM, RV] = js.native
  // Wheres
  def where(condition: scala.Boolean): QueryBuilder[QM, RM, RV] = js.native
  // Wheres
  def where(`object`: js.Object): QueryBuilder[QM, RM, RV] = js.native
  // Wheres
  def where(raw: Raw): QueryBuilder[QM, RM, RV] = js.native
  // Wheres
  def where(sql: java.lang.String, bindings: js.Any*): QueryBuilder[QM, RM, RV] = js.native
  // Wheres
  def where(sql: java.lang.String, bindings: js.Any): QueryBuilder[QM, RM, RV] = js.native
  def whereBetween(column: ColumnRef, range: js.Tuple2[Value, Value]): QueryBuilder[QM, RM, RV] = js.native
  def whereColumn(
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      scala.Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def whereColumn(
    column: java.lang.String,
    operator: java.lang.String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def whereColumn(column: java.lang.String, operator: java.lang.String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def whereColumn(column: java.lang.String, operator: java.lang.String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def whereColumn(
    column: java.lang.String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def whereColumn(column: java.lang.String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def whereColumn(column: java.lang.String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def whereColumn(
    column: ColumnRef,
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      scala.Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def whereColumn(
    column: ColumnRef,
    operator: java.lang.String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def whereColumn(column: ColumnRef, operator: java.lang.String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def whereColumn(column: ColumnRef, operator: java.lang.String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def whereColumn(
    column: ColumnRef,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def whereColumn(column: ColumnRef, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def whereColumn(column: ColumnRef, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def whereColumn(condition: scala.Boolean): QueryBuilder[QM, RM, RV] = js.native
  def whereColumn(`object`: js.Object): QueryBuilder[QM, RM, RV] = js.native
  def whereColumn(raw: Raw): QueryBuilder[QM, RM, RV] = js.native
  def whereColumn(sql: java.lang.String, bindings: js.Any*): QueryBuilder[QM, RM, RV] = js.native
  def whereColumn(sql: java.lang.String, bindings: js.Any): QueryBuilder[QM, RM, RV] = js.native
  def whereExists(
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      scala.Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def whereExists(
    query: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def whereExists(raw: Raw): QueryBuilder[QM, RM, RV] = js.native
  def whereIn(
    column: js.Array[ColumnRef],
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      scala.Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def whereIn(
    column: js.Array[ColumnRef],
    query: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def whereIn(column: js.Array[ColumnRef], values: js.Array[Value]): QueryBuilder[QM, RM, RV] = js.native
  def whereIn(
    column: ColumnRef,
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      scala.Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def whereIn(
    column: ColumnRef,
    query: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def whereIn(column: ColumnRef, values: js.Array[Value]): QueryBuilder[QM, RM, RV] = js.native
  def whereNot(
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      scala.Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def whereNot(
    column: java.lang.String,
    operator: java.lang.String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def whereNot(column: java.lang.String, operator: java.lang.String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def whereNot(column: java.lang.String, operator: java.lang.String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def whereNot(
    column: java.lang.String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def whereNot(column: java.lang.String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def whereNot(column: java.lang.String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def whereNot(
    column: ColumnRef,
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      scala.Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def whereNot(
    column: ColumnRef,
    operator: java.lang.String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def whereNot(column: ColumnRef, operator: java.lang.String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def whereNot(column: ColumnRef, operator: java.lang.String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def whereNot(
    column: ColumnRef,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def whereNot(column: ColumnRef, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def whereNot(column: ColumnRef, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def whereNot(condition: scala.Boolean): QueryBuilder[QM, RM, RV] = js.native
  def whereNot(`object`: js.Object): QueryBuilder[QM, RM, RV] = js.native
  def whereNot(raw: Raw): QueryBuilder[QM, RM, RV] = js.native
  def whereNot(sql: java.lang.String, bindings: js.Any*): QueryBuilder[QM, RM, RV] = js.native
  def whereNot(sql: java.lang.String, bindings: js.Any): QueryBuilder[QM, RM, RV] = js.native
  def whereNotBetween(column: ColumnRef, range: js.Tuple2[Value, Value]): QueryBuilder[QM, RM, RV] = js.native
  def whereNotColumn(
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      scala.Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def whereNotColumn(
    column: java.lang.String,
    operator: java.lang.String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def whereNotColumn(column: java.lang.String, operator: java.lang.String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def whereNotColumn(column: java.lang.String, operator: java.lang.String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def whereNotColumn(
    column: java.lang.String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def whereNotColumn(column: java.lang.String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def whereNotColumn(column: java.lang.String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def whereNotColumn(
    column: ColumnRef,
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      scala.Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def whereNotColumn(
    column: ColumnRef,
    operator: java.lang.String,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def whereNotColumn(column: ColumnRef, operator: java.lang.String, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def whereNotColumn(column: ColumnRef, operator: java.lang.String, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def whereNotColumn(
    column: ColumnRef,
    value: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def whereNotColumn(column: ColumnRef, value: Reference): QueryBuilder[QM, RM, RV] = js.native
  def whereNotColumn(column: ColumnRef, value: Value): QueryBuilder[QM, RM, RV] = js.native
  def whereNotColumn(condition: scala.Boolean): QueryBuilder[QM, RM, RV] = js.native
  def whereNotColumn(`object`: js.Object): QueryBuilder[QM, RM, RV] = js.native
  def whereNotColumn(raw: Raw): QueryBuilder[QM, RM, RV] = js.native
  def whereNotColumn(sql: java.lang.String, bindings: js.Any*): QueryBuilder[QM, RM, RV] = js.native
  def whereNotColumn(sql: java.lang.String, bindings: js.Any): QueryBuilder[QM, RM, RV] = js.native
  def whereNotExists(
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      scala.Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def whereNotExists(
    query: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def whereNotExists(raw: Raw): QueryBuilder[QM, RM, RV] = js.native
  def whereNotIn(
    column: js.Array[ColumnRef],
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      scala.Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def whereNotIn(
    column: js.Array[ColumnRef],
    query: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def whereNotIn(column: js.Array[ColumnRef], values: js.Array[Value]): QueryBuilder[QM, RM, RV] = js.native
  def whereNotIn(
    column: ColumnRef,
    callback: js.ThisFunction1[
      /* this */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      scala.Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def whereNotIn(
    column: ColumnRef,
    query: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def whereNotIn(column: ColumnRef, values: js.Array[Value]): QueryBuilder[QM, RM, RV] = js.native
  def whereNotNull(column: ColumnRef): QueryBuilder[QM, RM, RV] = js.native
  def whereNull(column: ColumnRef): QueryBuilder[QM, RM, RV] = js.native
  def whereRaw(condition: scala.Boolean): QueryBuilder[QM, RM, RV] = js.native
  def whereRaw(raw: Raw): QueryBuilder[QM, RM, RV] = js.native
  def whereRaw(sql: java.lang.String, bindings: js.Any*): QueryBuilder[QM, RM, RV] = js.native
  def whereRaw(sql: java.lang.String, bindings: js.Any): QueryBuilder[QM, RM, RV] = js.native
  def whereWrapped(
    callback: js.Function1[
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      scala.Unit
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  // Withs
  def `with`(alias: java.lang.String, raw: Raw): QueryBuilder[QM, RM, RV] = js.native
  // Withs
  def `with`(alias: java.lang.String, sql: java.lang.String): QueryBuilder[QM, RM, RV] = js.native
  def `with`(alias: java.lang.String, sql: java.lang.String, bindings: js.Any): QueryBuilder[QM, RM, RV] = js.native
  def withRaw(alias: java.lang.String, raw: Raw): QueryBuilder[QM, RM, RV] = js.native
  def withRaw(alias: java.lang.String, sql: java.lang.String): QueryBuilder[QM, RM, RV] = js.native
  def withRaw(alias: java.lang.String, sql: java.lang.String, bindings: js.Any): QueryBuilder[QM, RM, RV] = js.native
  def withWrapped(
    alias: java.lang.String,
    callback: js.Function1[
      /* queryBuilder */ QueryBuilder[
        QM, 
        js.Array[QM], 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
      ], 
      _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
}

