package typings
package xstateLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object esInterpreterMod {
  type ContextListener[TContext] = js.Function2[/* context */ TContext, /* prevContext */ js.UndefOr[TContext], scala.Unit]
  type EventListener[TEvent /* <: xstateLib.esTypesMod.EventObject */] = js.Function1[/* event */ TEvent, scala.Unit]
  type Listener = js.Function0[scala.Unit]
  type Spawnable[TContext] = (xstateLib.esTypesMod.StateMachine[TContext, js.Any, js.Any]) | js.Promise[TContext] | xstateLib.esTypesMod.InvokeCallback | xstateLib.esTypesMod.Subscribable[TContext]
  type StateListener[TContext, TEvent /* <: xstateLib.esTypesMod.EventObject */] = js.Function2[
    /* state */ xstateLib.esStateMod.State[TContext, TEvent], 
    /* event */ xstateLib.esTypesMod.OmniEventObject[TEvent], 
    scala.Unit
  ]
}
