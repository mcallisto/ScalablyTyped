package typings
package typescriptDashTupleLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_1EmptyLeft[Right /* <: js.Array[_] */, Left /* <: js.Array[_] */] extends js.Object {
  var emptyLeft: Right
  var infiniteLeft: Anon_CODENAMEERROR
  var multiLeft: js.Any
  var singleLeft: typescriptDashTupleLib.libUtilsMod.Prepend[Right, _]
}

object Anon_1EmptyLeft {
  @scala.inline
  def apply[Right /* <: js.Array[_] */, Left /* <: js.Array[_] */](
    emptyLeft: Right,
    infiniteLeft: Anon_CODENAMEERROR,
    multiLeft: js.Any,
    singleLeft: typescriptDashTupleLib.libUtilsMod.Prepend[Right, _]
  ): Anon_1EmptyLeft[Right, Left] = {
    val __obj = js.Dynamic.literal(emptyLeft = emptyLeft.asInstanceOf[js.Any], infiniteLeft = infiniteLeft, multiLeft = multiLeft, singleLeft = singleLeft)
  
    __obj.asInstanceOf[Anon_1EmptyLeft[Right, Left]]
  }
}

