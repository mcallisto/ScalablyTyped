package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineFill extends js.Object {
  var solidFill: js.UndefOr[SolidFill] = js.undefined
}

object LineFill {
  @scala.inline
  def apply(solidFill: SolidFill = null): LineFill = {
    val __obj = js.Dynamic.literal()
    if (solidFill != null) __obj.updateDynamic("solidFill")(solidFill)
    __obj.asInstanceOf[LineFill]
  }
}

