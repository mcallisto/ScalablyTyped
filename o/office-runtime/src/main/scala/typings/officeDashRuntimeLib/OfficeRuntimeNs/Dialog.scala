package typings
package officeDashRuntimeLib.OfficeRuntimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Object representing the dialog box. */
trait Dialog extends js.Object {
  /** Method to close a dialog box. Returns a Promise. */
  def close(): js.Promise[scala.Unit]
}

object Dialog {
  @scala.inline
  def apply(close: () => js.Promise[scala.Unit]): Dialog = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close))
  
    __obj.asInstanceOf[Dialog]
  }
}

