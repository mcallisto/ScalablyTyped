package typings
package antdDashMobileLib.esRadioPropsTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadioItemPropsType extends RadioPropsType {
  var onClick: js.UndefOr[js.Function0[_]] = js.undefined
  var radioProps: js.UndefOr[js.Object] = js.undefined
}

object RadioItemPropsType {
  @scala.inline
  def apply(
    checked: js.UndefOr[scala.Boolean] = js.undefined,
    defaultChecked: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    onChange: /* e */ antdDashMobileLib.Anon_Target => scala.Unit = null,
    onClick: () => _ = null,
    radioProps: js.Object = null,
    wrapLabel: js.UndefOr[scala.Boolean] = js.undefined
  ): RadioItemPropsType = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (name != null) __obj.updateDynamic("name")(name)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction0(onClick))
    if (radioProps != null) __obj.updateDynamic("radioProps")(radioProps)
    if (!js.isUndefined(wrapLabel)) __obj.updateDynamic("wrapLabel")(wrapLabel)
    __obj.asInstanceOf[RadioItemPropsType]
  }
}

