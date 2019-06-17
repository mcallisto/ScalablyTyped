package typings
package vuexLib.vuexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionObject[S, R] extends js.Object {
  @JSName("handler")
  var handler_Original: ActionHandler[S, R] = js.native
  var root: js.UndefOr[scala.Boolean] = js.native
  def handler(`this`: Store[R], injectee: ActionContext[S, R]): js.Any = js.native
  def handler(`this`: Store[R], injectee: ActionContext[S, R], payload: js.Any): js.Any = js.native
}

