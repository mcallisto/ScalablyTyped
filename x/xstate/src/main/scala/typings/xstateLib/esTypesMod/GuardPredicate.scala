package typings
package xstateLib.esTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GuardPredicate[TContext, TEvent /* <: EventObject */] extends js.Object {
  var name: js.UndefOr[java.lang.String] = js.native
  @JSName("predicate")
  var predicate_Original: ConditionPredicate[TContext, OmniEventObject[TEvent]] = js.native
  var `type`: DefaultGuardType = js.native
  def predicate(
    context: TContext,
    event: OmniEventObject[OmniEventObject[TEvent]],
    meta: GuardMeta[TContext, OmniEventObject[OmniEventObject[TEvent]]]
  ): scala.Boolean = js.native
}

