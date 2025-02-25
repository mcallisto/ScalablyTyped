package typings
package nonogramDashSolverLib.nonogramDashSolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Input extends js.Object {
  var columns: js.Array[js.Array[scala.Double]]
  var content: js.UndefOr[js.Array[State]] = js.undefined
  var rows: js.Array[js.Array[scala.Double]]
}

object Input {
  @scala.inline
  def apply(
    columns: js.Array[js.Array[scala.Double]],
    rows: js.Array[js.Array[scala.Double]],
    content: js.Array[State] = null
  ): Input = {
    val __obj = js.Dynamic.literal(columns = columns, rows = rows)
    if (content != null) __obj.updateDynamic("content")(content)
    __obj.asInstanceOf[Input]
  }
}

