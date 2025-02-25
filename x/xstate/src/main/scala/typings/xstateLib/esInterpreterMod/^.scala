package typings
package xstateLib.esInterpreterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate/es/interpreter", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def interpret[TContext, TStateSchema /* <: xstateLib.esTypesMod.StateSchema */, TEvent /* <: xstateLib.esTypesMod.EventObject */](machine: xstateLib.esTypesMod.StateMachine[TContext, TStateSchema, TEvent]): Interpreter[TContext, TStateSchema, TEvent] = js.native
  def interpret[TContext, TStateSchema /* <: xstateLib.esTypesMod.StateSchema */, TEvent /* <: xstateLib.esTypesMod.EventObject */](
    machine: xstateLib.esTypesMod.StateMachine[TContext, TStateSchema, TEvent],
    options: stdLib.Partial[xstateLib.esTypesMod.InterpreterOptions]
  ): Interpreter[TContext, TStateSchema, TEvent] = js.native
  def spawn[TContext](entity: Spawnable[TContext]): xstateLib.esActorMod.Actor[TContext, xstateLib.esTypesMod.EventObject] = js.native
  def spawn[TContext](entity: Spawnable[TContext], name: java.lang.String): xstateLib.esActorMod.Actor[TContext, xstateLib.esTypesMod.EventObject] = js.native
  def spawn[TContext](entity: Spawnable[TContext], options: SpawnOptions): xstateLib.esActorMod.Actor[TContext, xstateLib.esTypesMod.EventObject] = js.native
}

