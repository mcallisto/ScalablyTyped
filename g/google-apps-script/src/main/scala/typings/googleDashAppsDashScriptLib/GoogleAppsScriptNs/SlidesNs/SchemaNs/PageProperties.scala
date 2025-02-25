package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageProperties extends js.Object {
  var colorScheme: js.UndefOr[ColorScheme] = js.undefined
  var pageBackgroundFill: js.UndefOr[PageBackgroundFill] = js.undefined
}

object PageProperties {
  @scala.inline
  def apply(colorScheme: ColorScheme = null, pageBackgroundFill: PageBackgroundFill = null): PageProperties = {
    val __obj = js.Dynamic.literal()
    if (colorScheme != null) __obj.updateDynamic("colorScheme")(colorScheme)
    if (pageBackgroundFill != null) __obj.updateDynamic("pageBackgroundFill")(pageBackgroundFill)
    __obj.asInstanceOf[PageProperties]
  }
}

