package typings
package googleDashGaxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cancel extends js.Object {
  def cancel(): scala.Unit
}

object Anon_Cancel {
  @scala.inline
  def apply(cancel: () => scala.Unit): Anon_Cancel = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel))
  
    __obj.asInstanceOf[Anon_Cancel]
  }
}

