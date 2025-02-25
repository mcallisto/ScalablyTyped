package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionalColor extends js.Object {
  var color: js.UndefOr[Color] = js.undefined
}

object OptionalColor {
  @scala.inline
  def apply(color: Color = null): OptionalColor = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    __obj.asInstanceOf[OptionalColor]
  }
}

