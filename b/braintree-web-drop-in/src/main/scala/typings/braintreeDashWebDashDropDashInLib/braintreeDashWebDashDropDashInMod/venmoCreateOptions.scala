package typings
package braintreeDashWebDashDropDashInLib.braintreeDashWebDashDropDashInMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait venmoCreateOptions extends js.Object {
  var allowNewBrowserTab: js.UndefOr[scala.Boolean] = js.undefined
}

object venmoCreateOptions {
  @scala.inline
  def apply(allowNewBrowserTab: js.UndefOr[scala.Boolean] = js.undefined): venmoCreateOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowNewBrowserTab)) __obj.updateDynamic("allowNewBrowserTab")(allowNewBrowserTab)
    __obj.asInstanceOf[venmoCreateOptions]
  }
}

