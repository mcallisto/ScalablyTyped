package typings
package xstateLib.esTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateConfig[TContext, TEvent /* <: EventObject */] extends js.Object {
  var actions: js.UndefOr[js.Array[ActionObject[TContext, TEvent]]] = js.undefined
  var activities: js.UndefOr[ActivityMap] = js.undefined
  var context: TContext
  var event: OmniEventObject[TEvent]
  var events: js.UndefOr[js.Array[TEvent]] = js.undefined
  var history: js.UndefOr[xstateLib.esStateMod.State[TContext, EventObject]] = js.undefined
  var historyValue: js.UndefOr[HistoryValue] = js.undefined
  var meta: js.UndefOr[js.Any] = js.undefined
  var tree: js.UndefOr[xstateLib.esStateTreeMod.StateTree] = js.undefined
  var value: StateValue
}

object StateConfig {
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](
    context: TContext,
    event: OmniEventObject[TEvent],
    value: StateValue,
    actions: js.Array[ActionObject[TContext, TEvent]] = null,
    activities: ActivityMap = null,
    events: js.Array[TEvent] = null,
    history: xstateLib.esStateMod.State[TContext, EventObject] = null,
    historyValue: HistoryValue = null,
    meta: js.Any = null,
    tree: xstateLib.esStateTreeMod.StateTree = null
  ): StateConfig[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (actions != null) __obj.updateDynamic("actions")(actions)
    if (activities != null) __obj.updateDynamic("activities")(activities)
    if (events != null) __obj.updateDynamic("events")(events)
    if (history != null) __obj.updateDynamic("history")(history)
    if (historyValue != null) __obj.updateDynamic("historyValue")(historyValue)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (tree != null) __obj.updateDynamic("tree")(tree)
    __obj.asInstanceOf[StateConfig[TContext, TEvent]]
  }
}

