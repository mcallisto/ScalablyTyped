package typings
package xstateLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoForward extends js.Object {
  var autoForward: js.UndefOr[scala.Boolean] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var sync: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_AutoForward {
  @scala.inline
  def apply(
    autoForward: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    sync: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_AutoForward = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoForward)) __obj.updateDynamic("autoForward")(autoForward)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(sync)) __obj.updateDynamic("sync")(sync)
    __obj.asInstanceOf[Anon_AutoForward]
  }
}

