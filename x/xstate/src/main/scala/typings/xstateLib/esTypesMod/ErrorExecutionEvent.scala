package typings
package xstateLib.esTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorExecutionEvent
  extends EventObject
     with BuiltInEvent[js.Any] {
  var data: js.Any
  var src: java.lang.String
  @JSName("type")
  var type_ErrorExecutionEvent: xstateLib.esTypesMod.ActionTypes.ErrorExecution
}

object ErrorExecutionEvent {
  @scala.inline
  def apply(
    data: js.Any,
    src: java.lang.String,
    `type`: xstateLib.esTypesMod.ActionTypes.ErrorExecution,
    id: java.lang.String | scala.Double = null
  ): ErrorExecutionEvent = {
    val __obj = js.Dynamic.literal(data = data, src = src)
    __obj.updateDynamic("type")(`type`)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorExecutionEvent]
  }
}

