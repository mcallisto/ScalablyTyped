package typings
package styletronDashReactLib.styletronDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyletronComponentInjectedProps[P /* <: js.Object */] extends js.Object {
  @JSName("$as")
  var $as: js.UndefOr[StyletronBase] = js.undefined
  @JSName("$style")
  var $style: js.UndefOr[$StyleProp[P]] = js.undefined
}

object StyletronComponentInjectedProps {
  @scala.inline
  def apply[P /* <: js.Object */]($as: StyletronBase = null, $style: $StyleProp[P] = null): StyletronComponentInjectedProps[P] = {
    val __obj = js.Dynamic.literal()
    if ($as != null) __obj.updateDynamic("$as")($as.asInstanceOf[js.Any])
    if ($style != null) __obj.updateDynamic("$style")($style.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyletronComponentInjectedProps[P]]
  }
}

