package typings
package rmcDashCalendarLib.libCalendarHeaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropsType extends js.Object {
  var clearIcon: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var closeIcon: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var locale: js.UndefOr[rmcDashCalendarLib.libDateDataTypesMod.ModelsNs.Locale] = js.undefined
  var onCancel: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onClear: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var showClear: js.UndefOr[scala.Boolean] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object PropsType {
  @scala.inline
  def apply(
    clearIcon: reactLib.reactMod.ReactNode = null,
    closeIcon: reactLib.reactMod.ReactNode = null,
    locale: rmcDashCalendarLib.libDateDataTypesMod.ModelsNs.Locale = null,
    onCancel: () => scala.Unit = null,
    onClear: () => scala.Unit = null,
    showClear: js.UndefOr[scala.Boolean] = js.undefined,
    title: java.lang.String = null
  ): PropsType = {
    val __obj = js.Dynamic.literal()
    if (clearIcon != null) __obj.updateDynamic("clearIcon")(clearIcon.asInstanceOf[js.Any])
    if (closeIcon != null) __obj.updateDynamic("closeIcon")(closeIcon.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (onCancel != null) __obj.updateDynamic("onCancel")(js.Any.fromFunction0(onCancel))
    if (onClear != null) __obj.updateDynamic("onClear")(js.Any.fromFunction0(onClear))
    if (!js.isUndefined(showClear)) __obj.updateDynamic("showClear")(showClear)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[PropsType]
  }
}

