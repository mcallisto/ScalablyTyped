package typings
package makeupDashFloatingDashLabelLib.makeupDashFloatingDashLabelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FloatingLabel extends js.Object {
  def refresh(): scala.Unit
}

object FloatingLabel {
  @scala.inline
  def apply(refresh: () => scala.Unit): FloatingLabel = {
    val __obj = js.Dynamic.literal(refresh = js.Any.fromFunction0(refresh))
  
    __obj.asInstanceOf[FloatingLabel]
  }
}

