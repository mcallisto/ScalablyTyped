package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableColumnProperties extends js.Object {
  var width: js.UndefOr[Dimension] = js.undefined
  var widthType: js.UndefOr[java.lang.String] = js.undefined
}

object TableColumnProperties {
  @scala.inline
  def apply(width: Dimension = null, widthType: java.lang.String = null): TableColumnProperties = {
    val __obj = js.Dynamic.literal()
    if (width != null) __obj.updateDynamic("width")(width)
    if (widthType != null) __obj.updateDynamic("widthType")(widthType)
    __obj.asInstanceOf[TableColumnProperties]
  }
}

