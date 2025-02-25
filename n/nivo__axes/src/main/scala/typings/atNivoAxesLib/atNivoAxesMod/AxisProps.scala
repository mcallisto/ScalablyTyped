package typings
package atNivoAxesLib.atNivoAxesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxisProps extends js.Object {
  var format: js.UndefOr[java.lang.String | TickFormatter] = js.undefined
  var legend: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var legendOffset: js.UndefOr[scala.Double] = js.undefined
  var legendPosition: js.UndefOr[
    atNivoAxesLib.atNivoAxesLibStrings.start | atNivoAxesLib.atNivoAxesLibStrings.middle | atNivoAxesLib.atNivoAxesLibStrings.end
  ] = js.undefined
  var orient: js.UndefOr[
    atNivoAxesLib.atNivoAxesLibStrings.top | atNivoAxesLib.atNivoAxesLibStrings.right | atNivoAxesLib.atNivoAxesLibStrings.bottom | atNivoAxesLib.atNivoAxesLibStrings.left
  ] = js.undefined
  var renderTick: js.UndefOr[js.Function1[/* data */ js.Any, reactLib.reactMod.ReactNode]] = js.undefined
  var tickPadding: js.UndefOr[scala.Double] = js.undefined
  var tickRotation: js.UndefOr[scala.Double] = js.undefined
  var tickSize: js.UndefOr[scala.Double] = js.undefined
  var tickValues: js.UndefOr[
    scala.Double | (js.Array[stdLib.Date | scala.Double | java.lang.String]) | java.lang.String
  ] = js.undefined
}

object AxisProps {
  @scala.inline
  def apply(
    format: java.lang.String | TickFormatter = null,
    legend: reactLib.reactMod.ReactNode = null,
    legendOffset: scala.Int | scala.Double = null,
    legendPosition: atNivoAxesLib.atNivoAxesLibStrings.start | atNivoAxesLib.atNivoAxesLibStrings.middle | atNivoAxesLib.atNivoAxesLibStrings.end = null,
    orient: atNivoAxesLib.atNivoAxesLibStrings.top | atNivoAxesLib.atNivoAxesLibStrings.right | atNivoAxesLib.atNivoAxesLibStrings.bottom | atNivoAxesLib.atNivoAxesLibStrings.left = null,
    renderTick: /* data */ js.Any => reactLib.reactMod.ReactNode = null,
    tickPadding: scala.Int | scala.Double = null,
    tickRotation: scala.Int | scala.Double = null,
    tickSize: scala.Int | scala.Double = null,
    tickValues: scala.Double | (js.Array[stdLib.Date | scala.Double | java.lang.String]) | java.lang.String = null
  ): AxisProps = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (legend != null) __obj.updateDynamic("legend")(legend.asInstanceOf[js.Any])
    if (legendOffset != null) __obj.updateDynamic("legendOffset")(legendOffset.asInstanceOf[js.Any])
    if (legendPosition != null) __obj.updateDynamic("legendPosition")(legendPosition.asInstanceOf[js.Any])
    if (orient != null) __obj.updateDynamic("orient")(orient.asInstanceOf[js.Any])
    if (renderTick != null) __obj.updateDynamic("renderTick")(js.Any.fromFunction1(renderTick))
    if (tickPadding != null) __obj.updateDynamic("tickPadding")(tickPadding.asInstanceOf[js.Any])
    if (tickRotation != null) __obj.updateDynamic("tickRotation")(tickRotation.asInstanceOf[js.Any])
    if (tickSize != null) __obj.updateDynamic("tickSize")(tickSize.asInstanceOf[js.Any])
    if (tickValues != null) __obj.updateDynamic("tickValues")(tickValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxisProps]
  }
}

