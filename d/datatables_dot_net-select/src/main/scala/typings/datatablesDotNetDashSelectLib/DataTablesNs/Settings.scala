package typings
package datatablesDotNetDashSelectLib.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  /*
    * Select extension options
    */
  var select: js.UndefOr[scala.Boolean | java.lang.String | SelectSettings] = js.undefined
}

object Settings {
  @scala.inline
  def apply(select: scala.Boolean | java.lang.String | SelectSettings = null): Settings = {
    val __obj = js.Dynamic.literal()
    if (select != null) __obj.updateDynamic("select")(select.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
}

