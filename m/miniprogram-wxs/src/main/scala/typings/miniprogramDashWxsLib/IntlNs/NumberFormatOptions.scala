package typings
package miniprogramDashWxsLib.IntlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberFormatOptions extends js.Object {
  var currency: js.UndefOr[java.lang.String] = js.undefined
  var currencyDisplay: js.UndefOr[java.lang.String] = js.undefined
  var localeMatcher: js.UndefOr[java.lang.String] = js.undefined
  var maximumFractionDigits: js.UndefOr[scala.Double] = js.undefined
  var maximumSignificantDigits: js.UndefOr[scala.Double] = js.undefined
  var minimumFractionDigits: js.UndefOr[scala.Double] = js.undefined
  var minimumIntegerDigits: js.UndefOr[scala.Double] = js.undefined
  var minimumSignificantDigits: js.UndefOr[scala.Double] = js.undefined
  var style: js.UndefOr[java.lang.String] = js.undefined
  var useGrouping: js.UndefOr[scala.Boolean] = js.undefined
}

object NumberFormatOptions {
  @scala.inline
  def apply(
    currency: java.lang.String = null,
    currencyDisplay: java.lang.String = null,
    localeMatcher: java.lang.String = null,
    maximumFractionDigits: scala.Int | scala.Double = null,
    maximumSignificantDigits: scala.Int | scala.Double = null,
    minimumFractionDigits: scala.Int | scala.Double = null,
    minimumIntegerDigits: scala.Int | scala.Double = null,
    minimumSignificantDigits: scala.Int | scala.Double = null,
    style: java.lang.String = null,
    useGrouping: js.UndefOr[scala.Boolean] = js.undefined
  ): NumberFormatOptions = {
    val __obj = js.Dynamic.literal()
    if (currency != null) __obj.updateDynamic("currency")(currency)
    if (currencyDisplay != null) __obj.updateDynamic("currencyDisplay")(currencyDisplay)
    if (localeMatcher != null) __obj.updateDynamic("localeMatcher")(localeMatcher)
    if (maximumFractionDigits != null) __obj.updateDynamic("maximumFractionDigits")(maximumFractionDigits.asInstanceOf[js.Any])
    if (maximumSignificantDigits != null) __obj.updateDynamic("maximumSignificantDigits")(maximumSignificantDigits.asInstanceOf[js.Any])
    if (minimumFractionDigits != null) __obj.updateDynamic("minimumFractionDigits")(minimumFractionDigits.asInstanceOf[js.Any])
    if (minimumIntegerDigits != null) __obj.updateDynamic("minimumIntegerDigits")(minimumIntegerDigits.asInstanceOf[js.Any])
    if (minimumSignificantDigits != null) __obj.updateDynamic("minimumSignificantDigits")(minimumSignificantDigits.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (!js.isUndefined(useGrouping)) __obj.updateDynamic("useGrouping")(useGrouping)
    __obj.asInstanceOf[NumberFormatOptions]
  }
}

