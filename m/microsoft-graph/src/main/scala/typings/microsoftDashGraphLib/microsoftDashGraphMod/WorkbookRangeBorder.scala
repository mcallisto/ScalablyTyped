package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookRangeBorder extends Entity {
  /** HTML color code representing the color of the border line, of the form #RRGGBB (e.g. 'FFA500') or as a named HTML color (e.g. 'orange'). */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Constant value that indicates the specific side of the border.
    * The possible values are: EdgeTop, EdgeBottom, EdgeLeft, EdgeRight, InsideVertical, InsideHorizontal, DiagonalDown, DiagonalUp. Read-only.
    */
  var sideIndex: js.UndefOr[java.lang.String] = js.undefined
  /** One of the constants of line style specifying the line style for the border. The possible values are: None, Continuous, Dash, DashDot, DashDotDot, Dot, Double, SlantDashDot. */
  var style: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the weight of the border around a range. The possible values are: Hairline, Thin, Medium, Thick. */
  var weight: js.UndefOr[java.lang.String] = js.undefined
}

object WorkbookRangeBorder {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    id: java.lang.String = null,
    sideIndex: java.lang.String = null,
    style: java.lang.String = null,
    weight: java.lang.String = null
  ): WorkbookRangeBorder = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (id != null) __obj.updateDynamic("id")(id)
    if (sideIndex != null) __obj.updateDynamic("sideIndex")(sideIndex)
    if (style != null) __obj.updateDynamic("style")(style)
    if (weight != null) __obj.updateDynamic("weight")(weight)
    __obj.asInstanceOf[WorkbookRangeBorder]
  }
}

