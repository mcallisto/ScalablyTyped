package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Colors extends js.Object {
  var calendar: js.UndefOr[js.Object] = js.undefined
  var event: js.UndefOr[js.Object] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var updated: js.UndefOr[java.lang.String] = js.undefined
}

object Colors {
  @scala.inline
  def apply(
    calendar: js.Object = null,
    event: js.Object = null,
    kind: java.lang.String = null,
    updated: java.lang.String = null
  ): Colors = {
    val __obj = js.Dynamic.literal()
    if (calendar != null) __obj.updateDynamic("calendar")(calendar)
    if (event != null) __obj.updateDynamic("event")(event)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (updated != null) __obj.updateDynamic("updated")(updated)
    __obj.asInstanceOf[Colors]
  }
}

