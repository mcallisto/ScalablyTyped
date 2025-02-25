package typings
package xstateLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnyAssignAction[TContext, TEvent /* <: EventObject */] extends ActionObject[TContext, TEvent] {
  var assignment: js.Any
  @JSName("type")
  var type_AnyAssignAction: xstateLib.libTypesMod.ActionTypes.Assign
}

object AnyAssignAction {
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](
    assignment: js.Any,
    `type`: xstateLib.libTypesMod.ActionTypes.Assign,
    exec: ActionFunction[TContext, TEvent] = null
  ): AnyAssignAction[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(assignment = assignment)
    __obj.updateDynamic("type")(`type`)
    if (exec != null) __obj.updateDynamic("exec")(exec)
    __obj.asInstanceOf[AnyAssignAction[TContext, TEvent]]
  }
}

