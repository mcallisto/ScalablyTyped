package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookRangeFill extends Entity {
  /** HTML color code representing the color of the border line, of the form #RRGGBB (e.g. 'FFA500') or as a named HTML color (e.g. 'orange') */
  var color: js.UndefOr[java.lang.String] = js.undefined
}

object WorkbookRangeFill {
  @scala.inline
  def apply(color: java.lang.String = null, id: java.lang.String = null): WorkbookRangeFill = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[WorkbookRangeFill]
  }
}

