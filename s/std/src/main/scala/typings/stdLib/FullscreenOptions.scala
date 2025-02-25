package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FullscreenOptions extends js.Object {
  var navigationUI: js.UndefOr[FullscreenNavigationUI] = js.undefined
}

object FullscreenOptions {
  @scala.inline
  def apply(navigationUI: FullscreenNavigationUI = null): FullscreenOptions = {
    val __obj = js.Dynamic.literal()
    if (navigationUI != null) __obj.updateDynamic("navigationUI")(navigationUI)
    __obj.asInstanceOf[FullscreenOptions]
  }
}

