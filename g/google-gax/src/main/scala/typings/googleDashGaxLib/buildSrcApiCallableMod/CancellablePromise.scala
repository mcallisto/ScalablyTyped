package typings
package googleDashGaxLib.buildSrcApiCallableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancellablePromise[T]
  extends stdLib.Promise[T] {
  def cancel(): scala.Unit = js.native
}

