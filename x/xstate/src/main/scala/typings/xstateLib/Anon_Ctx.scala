package typings
package xstateLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ctx[TContext, TEvent /* <: xstateLib.esTypesMod.EventObject */] extends js.Object {
  var label: js.UndefOr[java.lang.String] = js.undefined
  var `type`: xstateLib.esTypesMod.ActionTypes
  def expr(ctx: TContext, event: TEvent): js.Any
}

object Anon_Ctx {
  @scala.inline
  def apply[TContext, TEvent /* <: xstateLib.esTypesMod.EventObject */](
    expr: (TContext, TEvent) => js.Any,
    `type`: xstateLib.esTypesMod.ActionTypes,
    label: java.lang.String = null
  ): Anon_Ctx[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(expr = js.Any.fromFunction2(expr))
    __obj.updateDynamic("type")(`type`)
    if (label != null) __obj.updateDynamic("label")(label)
    __obj.asInstanceOf[Anon_Ctx[TContext, TEvent]]
  }
}

