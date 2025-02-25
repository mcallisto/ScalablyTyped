package typings
package autobahnLib.autobahnMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICallOptions extends js.Object {
  var disclose_me: js.UndefOr[scala.Boolean] = js.undefined
  var receive_progress: js.UndefOr[scala.Boolean] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object ICallOptions {
  @scala.inline
  def apply(
    disclose_me: js.UndefOr[scala.Boolean] = js.undefined,
    receive_progress: js.UndefOr[scala.Boolean] = js.undefined,
    timeout: scala.Int | scala.Double = null
  ): ICallOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disclose_me)) __obj.updateDynamic("disclose_me")(disclose_me)
    if (!js.isUndefined(receive_progress)) __obj.updateDynamic("receive_progress")(receive_progress)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICallOptions]
  }
}

