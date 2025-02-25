package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "rangeBorder.toJSON()". */
trait RangeBorderData extends js.Object {
  /**
    *
    * HTML color code representing the color of the border line, of the form #RRGGBB (e.g. "FFA500") or as a named HTML color (e.g. "orange").
    *
    * [Api set: ExcelApi 1.1]
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Constant value that indicates the specific side of the border. See Excel.BorderIndex for details. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var sideIndex: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.BorderIndex | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.EdgeTop | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.EdgeBottom | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.EdgeLeft | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.EdgeRight | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.InsideVertical | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.InsideHorizontal | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DiagonalDown | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DiagonalUp
  ] = js.undefined
  /**
    *
    * One of the constants of line style specifying the line style for the border. See Excel.BorderLineStyle for details.
    *
    * [Api set: ExcelApi 1.1]
    */
  var style: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.BorderLineStyle | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.None | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Continuous | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Dash | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DashDot | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DashDotDot | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Dot | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Double | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.SlantDashDot
  ] = js.undefined
  /**
    *
    * Returns or sets a double that lightens or darkens a color for Range Border, the value is between -1 (darkest) and 1 (brightest), with 0 for the original color.
    A null value indicates that the border doesn't have uniform tintAndShade setting.
    *
    * [Api set: ExcelApi 1.9]
    */
  var tintAndShade: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Specifies the weight of the border around a range. See Excel.BorderWeight for details.
    *
    * [Api set: ExcelApi 1.1]
    */
  var weight: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.BorderWeight | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Hairline | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Thin | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Medium | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Thick
  ] = js.undefined
}

object RangeBorderData {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    sideIndex: officeDashJsDashPreviewLib.ExcelNs.BorderIndex | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.EdgeTop | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.EdgeBottom | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.EdgeLeft | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.EdgeRight | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.InsideVertical | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.InsideHorizontal | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DiagonalDown | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DiagonalUp = null,
    style: officeDashJsDashPreviewLib.ExcelNs.BorderLineStyle | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.None | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Continuous | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Dash | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DashDot | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DashDotDot | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Dot | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Double | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.SlantDashDot = null,
    tintAndShade: scala.Int | scala.Double = null,
    weight: officeDashJsDashPreviewLib.ExcelNs.BorderWeight | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Hairline | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Thin | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Medium | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Thick = null
  ): RangeBorderData = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (sideIndex != null) __obj.updateDynamic("sideIndex")(sideIndex.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tintAndShade != null) __obj.updateDynamic("tintAndShade")(tintAndShade.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeBorderData]
  }
}

