package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ConditionalRangeFill object, for use in "conditionalRangeFill.set({ ... })". */
trait ConditionalRangeFillUpdateData extends js.Object {
  /**
    *
    * HTML color code representing the color of the fill, of the form #RRGGBB (e.g. "FFA500") or as a named HTML color (e.g. "orange").
    *
    * [Api set: ExcelApi 1.6]
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
}

object ConditionalRangeFillUpdateData {
  @scala.inline
  def apply(color: java.lang.String = null): ConditionalRangeFillUpdateData = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    __obj.asInstanceOf[ConditionalRangeFillUpdateData]
  }
}

