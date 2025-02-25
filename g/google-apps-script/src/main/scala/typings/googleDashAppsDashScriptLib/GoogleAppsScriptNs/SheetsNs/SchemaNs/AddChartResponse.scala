package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddChartResponse extends js.Object {
  var chart: js.UndefOr[EmbeddedChart] = js.undefined
}

object AddChartResponse {
  @scala.inline
  def apply(chart: EmbeddedChart = null): AddChartResponse = {
    val __obj = js.Dynamic.literal()
    if (chart != null) __obj.updateDynamic("chart")(chart)
    __obj.asInstanceOf[AddChartResponse]
  }
}

