package typings
package knexLib.knexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RawQueryBuilder[TRecord, TResult] extends js.Object {
  def apply[TResult2](raw: Raw[TResult2]): QueryBuilder[TRecord, TResult2] = js.native
  def apply[TResult2](sql: java.lang.String, bindings: RawBinding*): QueryBuilder[TRecord, TResult2] = js.native
  def apply[TResult2](sql: java.lang.String, bindings: js.Array[RawBinding]): QueryBuilder[TRecord, TResult2] = js.native
  def apply[TResult2](sql: java.lang.String, bindings: ValueDict): QueryBuilder[TRecord, TResult2] = js.native
}

