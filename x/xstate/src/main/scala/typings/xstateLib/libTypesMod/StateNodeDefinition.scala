package typings
package xstateLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateNodeDefinition[TContext, TStateSchema /* <: StateSchema */, TEvent /* <: EventObject */] extends StateNodeConfig[TContext, TStateSchema, TEvent] {
  @JSName("activities")
  var activities_StateNodeDefinition: js.Array[ActivityDefinition[TContext, TEvent]]
  @JSName("data")
  var data_StateNodeDefinition: js.UndefOr[(Assigner[TContext, TEvent]) | (PropertyAssigner[TContext, TEvent]) | js.Any] = js.undefined
  @JSName("history")
  var history_StateNodeDefinition: js.UndefOr[
    scala.Boolean | xstateLib.xstateLibStrings.shallow | xstateLib.xstateLibStrings.deep
  ] = js.undefined
  @JSName("id")
  var id_StateNodeDefinition: java.lang.String
  @JSName("initial")
  var initial_StateNodeDefinition: js.UndefOr[
    /* import warning: ImportType.apply Failed type conversion: keyof TStateSchema['states'] */ js.Any
  ] = js.undefined
  @JSName("invoke")
  var invoke_StateNodeDefinition: js.Array[InvokeDefinition[TContext, TEvent]]
  @JSName("key")
  var key_StateNodeDefinition: java.lang.String
  @JSName("onEntry")
  var onEntry_StateNodeDefinition: js.Array[ActionObject[TContext, TEvent]]
  @JSName("onExit")
  var onExit_StateNodeDefinition: js.Array[ActionObject[TContext, TEvent]]
  @JSName("on")
  var on_StateNodeDefinition: TransitionsDefinition[TContext, TEvent]
  @JSName("order")
  var order_StateNodeDefinition: scala.Double
  @JSName("states")
  var states_StateNodeDefinition: StatesDefinition[TContext, TStateSchema, TEvent]
  @JSName("type")
  var type_StateNodeDefinition: StateTypes
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object StateNodeDefinition {
  @scala.inline
  def apply[TContext, TStateSchema /* <: StateSchema */, TEvent /* <: EventObject */](
    activities: js.Array[ActivityDefinition[TContext, TEvent]],
    id: java.lang.String,
    invoke: js.Array[InvokeDefinition[TContext, TEvent]],
    key: java.lang.String,
    meta: js.Any,
    on: TransitionsDefinition[TContext, TEvent],
    onEntry: js.Array[ActionObject[TContext, TEvent]],
    onExit: js.Array[ActionObject[TContext, TEvent]],
    order: scala.Double,
    states: StatesDefinition[TContext, TStateSchema, TEvent],
    `type`: StateTypes,
    after: DelayedTransitions[TContext, TEvent] = null,
    context: TContext = null,
    data: (Assigner[TContext, TEvent]) | (PropertyAssigner[TContext, TEvent]) | js.Any = null,
    delimiter: java.lang.String = null,
    entry: SingleOrArray[Action[TContext, TEvent]] = null,
    exit: SingleOrArray[Action[TContext, TEvent]] = null,
    history: scala.Boolean | xstateLib.xstateLibStrings.shallow | xstateLib.xstateLibStrings.deep = null,
    initial: /* import warning: ImportType.apply Failed type conversion: keyof TStateSchema['states'] */ js.Any = null,
    onDone: java.lang.String | (SingleOrArray[TransitionConfig[TContext, DoneEventObject]]) = null,
    parallel: js.UndefOr[scala.Boolean] = js.undefined,
    parent: xstateLib.libStateNodeMod.StateNode[TContext, _, TEvent] = null,
    strict: js.UndefOr[scala.Boolean] = js.undefined,
    version: java.lang.String = null
  ): StateNodeDefinition[TContext, TStateSchema, TEvent] = {
    val __obj = js.Dynamic.literal(activities = activities, id = id, invoke = invoke, key = key, meta = meta, on = on, onEntry = onEntry, onExit = onExit, order = order, states = states)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter)
    if (entry != null) __obj.updateDynamic("entry")(entry.asInstanceOf[js.Any])
    if (exit != null) __obj.updateDynamic("exit")(exit.asInstanceOf[js.Any])
    if (history != null) __obj.updateDynamic("history")(history.asInstanceOf[js.Any])
    if (initial != null) __obj.updateDynamic("initial")(initial)
    if (onDone != null) __obj.updateDynamic("onDone")(onDone.asInstanceOf[js.Any])
    if (!js.isUndefined(parallel)) __obj.updateDynamic("parallel")(parallel)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[StateNodeDefinition[TContext, TStateSchema, TEvent]]
  }
}

