package typings
package typescriptDashTupleLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_1EmptyInfinite[NotFound, Tuple /* <: js.Array[_] */, Type, Count /* <: js.Array[_] */] extends js.Object {
  var empty: NotFound
  var infinite: js.Any
  var nonEmpty: /* import warning: ImportType.apply Failed type conversion: Count['length'] */ js.Any
}

object Anon_1EmptyInfinite {
  @scala.inline
  def apply[NotFound, Tuple /* <: js.Array[_] */, Type, Count /* <: js.Array[_] */](
    empty: NotFound,
    infinite: js.Any,
    nonEmpty: /* import warning: ImportType.apply Failed type conversion: Count['length'] */ js.Any
  ): Anon_1EmptyInfinite[NotFound, Tuple, Type, Count] = {
    val __obj = js.Dynamic.literal(empty = empty.asInstanceOf[js.Any], infinite = infinite, nonEmpty = nonEmpty)
  
    __obj.asInstanceOf[Anon_1EmptyInfinite[NotFound, Tuple, Type, Count]]
  }
}

