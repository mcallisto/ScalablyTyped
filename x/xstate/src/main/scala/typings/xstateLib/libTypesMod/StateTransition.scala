package typings
package xstateLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateTransition[TContext, TEvent /* <: EventObject */] extends js.Object {
  var actions: js.Array[ActionObject[TContext, TEvent]]
  var context: js.UndefOr[TContext] = js.undefined
  /**
    * The source state that preceded the transition.
    */
  var source: js.UndefOr[xstateLib.libStateMod.State[TContext, EventObject]] = js.undefined
  var tree: js.UndefOr[xstateLib.libStateTreeMod.StateTree] = js.undefined
}

object StateTransition {
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](
    actions: js.Array[ActionObject[TContext, TEvent]],
    context: TContext = null,
    source: xstateLib.libStateMod.State[TContext, EventObject] = null,
    tree: xstateLib.libStateTreeMod.StateTree = null
  ): StateTransition[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(actions = actions)
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source)
    if (tree != null) __obj.updateDynamic("tree")(tree)
    __obj.asInstanceOf[StateTransition[TContext, TEvent]]
  }
}

