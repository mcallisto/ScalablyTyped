package typings
package bluebirdDashGlobalLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_ErrorOnFulfilled[T] extends js.Object {
  def apply[U](): scala.Unit = js.native
  def apply[U](onFulfilled: js.Function1[/* value */ T, bluebirdLib.bluebirdMod.Resolvable[U]]): scala.Unit = js.native
  def apply[U](
    onFulfilled: js.Function1[/* value */ T, bluebirdLib.bluebirdMod.Resolvable[U]],
    onRejected: js.Function1[/* error */ js.Any, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): scala.Unit = js.native
}

