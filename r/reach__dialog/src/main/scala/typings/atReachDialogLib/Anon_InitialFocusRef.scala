package typings
package atReachDialogLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InitialFocusRef extends js.Object {
  var initialFocusRef: js.UndefOr[reactLib.reactMod.RefObject[stdLib.HTMLElement]] = js.undefined
}

object Anon_InitialFocusRef {
  @scala.inline
  def apply(initialFocusRef: reactLib.reactMod.RefObject[stdLib.HTMLElement] = null): Anon_InitialFocusRef = {
    val __obj = js.Dynamic.literal()
    if (initialFocusRef != null) __obj.updateDynamic("initialFocusRef")(initialFocusRef)
    __obj.asInstanceOf[Anon_InitialFocusRef]
  }
}

