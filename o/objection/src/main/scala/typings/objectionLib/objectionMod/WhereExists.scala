package typings
package objectionLib.objectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WhereExists[QM /* <: Model */, RM, RV] extends js.Object {
  def apply(
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
  def apply(
    query: QueryBuilder[
      _, 
      js.Array[_], 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for RV */ _
    ]
  ): QueryBuilder[QM, RM, RV] = js.native
  def apply(raw: Raw): QueryBuilder[QM, RM, RV] = js.native
}

