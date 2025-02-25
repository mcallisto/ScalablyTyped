package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitionEventInit extends EventInit {
  var elapsedTime: js.UndefOr[scala.Double] = js.undefined
  var propertyName: js.UndefOr[java.lang.String] = js.undefined
  var pseudoElement: js.UndefOr[java.lang.String] = js.undefined
}

object TransitionEventInit {
  @scala.inline
  def apply(
    bubbles: js.UndefOr[scala.Boolean] = js.undefined,
    cancelable: js.UndefOr[scala.Boolean] = js.undefined,
    composed: js.UndefOr[scala.Boolean] = js.undefined,
    elapsedTime: scala.Int | scala.Double = null,
    propertyName: java.lang.String = null,
    pseudoElement: java.lang.String = null
  ): TransitionEventInit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles)
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable)
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed)
    if (elapsedTime != null) __obj.updateDynamic("elapsedTime")(elapsedTime.asInstanceOf[js.Any])
    if (propertyName != null) __obj.updateDynamic("propertyName")(propertyName)
    if (pseudoElement != null) __obj.updateDynamic("pseudoElement")(pseudoElement)
    __obj.asInstanceOf[TransitionEventInit]
  }
}

