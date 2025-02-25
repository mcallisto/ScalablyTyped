package typings
package miniprogramDashWxsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropertyDescriptor extends js.Object {
  var configurable: js.UndefOr[scala.Boolean] = js.undefined
  var enumerable: js.UndefOr[scala.Boolean] = js.undefined
  var get: js.UndefOr[js.Function0[_]] = js.undefined
  var set: js.UndefOr[js.Function1[/* v */ js.Any, scala.Unit]] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
  var writable: js.UndefOr[scala.Boolean] = js.undefined
}

object PropertyDescriptor {
  @scala.inline
  def apply(
    configurable: js.UndefOr[scala.Boolean] = js.undefined,
    enumerable: js.UndefOr[scala.Boolean] = js.undefined,
    get: () => _ = null,
    set: /* v */ js.Any => scala.Unit = null,
    value: js.Any = null,
    writable: js.UndefOr[scala.Boolean] = js.undefined
  ): PropertyDescriptor = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(configurable)) __obj.updateDynamic("configurable")(configurable)
    if (!js.isUndefined(enumerable)) __obj.updateDynamic("enumerable")(enumerable)
    if (get != null) __obj.updateDynamic("get")(js.Any.fromFunction0(get))
    if (set != null) __obj.updateDynamic("set")(js.Any.fromFunction1(set))
    if (value != null) __obj.updateDynamic("value")(value)
    if (!js.isUndefined(writable)) __obj.updateDynamic("writable")(writable)
    __obj.asInstanceOf[PropertyDescriptor]
  }
}

