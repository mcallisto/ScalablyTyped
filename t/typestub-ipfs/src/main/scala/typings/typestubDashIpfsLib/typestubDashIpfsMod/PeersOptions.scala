package typings
package typestubDashIpfsLib.typestubDashIpfsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PeersOptions extends js.Object {
  var v: js.UndefOr[scala.Boolean] = js.undefined
  var verbose: js.UndefOr[scala.Boolean] = js.undefined
}

object PeersOptions {
  @scala.inline
  def apply(v: js.UndefOr[scala.Boolean] = js.undefined, verbose: js.UndefOr[scala.Boolean] = js.undefined): PeersOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(v)) __obj.updateDynamic("v")(v)
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose)
    __obj.asInstanceOf[PeersOptions]
  }
}

