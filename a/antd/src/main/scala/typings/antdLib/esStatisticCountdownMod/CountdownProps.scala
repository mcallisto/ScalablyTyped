package typings
package antdLib.esStatisticCountdownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CountdownProps
  extends antdLib.esStatisticStatisticMod.StatisticProps {
  var format: js.UndefOr[java.lang.String] = js.undefined
  var onFinish: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  @JSName("value")
  var value_CountdownProps: js.UndefOr[antdLib.esStatisticUtilsMod.countdownValueType] = js.undefined
}

object CountdownProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    decimalSeparator: java.lang.String = null,
    format: java.lang.String = null,
    formatter: antdLib.esStatisticUtilsMod.Formatter = null,
    groupSeparator: java.lang.String = null,
    onFinish: () => scala.Unit = null,
    precision: scala.Int | scala.Double = null,
    prefix: reactLib.reactMod.ReactNode = null,
    prefixCls: java.lang.String = null,
    style: reactLib.reactMod.CSSProperties = null,
    suffix: reactLib.reactMod.ReactNode = null,
    title: reactLib.reactMod.ReactNode = null,
    value: antdLib.esStatisticUtilsMod.countdownValueType = null,
    valueRender: /* node */ reactLib.reactMod.ReactNode => reactLib.reactMod.ReactNode = null,
    valueStyle: reactLib.reactMod.CSSProperties = null
  ): CountdownProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (decimalSeparator != null) __obj.updateDynamic("decimalSeparator")(decimalSeparator)
    if (format != null) __obj.updateDynamic("format")(format)
    if (formatter != null) __obj.updateDynamic("formatter")(formatter.asInstanceOf[js.Any])
    if (groupSeparator != null) __obj.updateDynamic("groupSeparator")(groupSeparator)
    if (onFinish != null) __obj.updateDynamic("onFinish")(js.Any.fromFunction0(onFinish))
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (style != null) __obj.updateDynamic("style")(style)
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueRender != null) __obj.updateDynamic("valueRender")(js.Any.fromFunction1(valueRender))
    if (valueStyle != null) __obj.updateDynamic("valueStyle")(valueStyle)
    __obj.asInstanceOf[CountdownProps]
  }
}

