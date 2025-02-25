package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportFloodlightCriteriaReportProperties extends js.Object {
  var includeAttributedIPConversions: js.UndefOr[scala.Boolean] = js.undefined
  var includeUnattributedCookieConversions: js.UndefOr[scala.Boolean] = js.undefined
  var includeUnattributedIPConversions: js.UndefOr[scala.Boolean] = js.undefined
}

object ReportFloodlightCriteriaReportProperties {
  @scala.inline
  def apply(
    includeAttributedIPConversions: js.UndefOr[scala.Boolean] = js.undefined,
    includeUnattributedCookieConversions: js.UndefOr[scala.Boolean] = js.undefined,
    includeUnattributedIPConversions: js.UndefOr[scala.Boolean] = js.undefined
  ): ReportFloodlightCriteriaReportProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeAttributedIPConversions)) __obj.updateDynamic("includeAttributedIPConversions")(includeAttributedIPConversions)
    if (!js.isUndefined(includeUnattributedCookieConversions)) __obj.updateDynamic("includeUnattributedCookieConversions")(includeUnattributedCookieConversions)
    if (!js.isUndefined(includeUnattributedIPConversions)) __obj.updateDynamic("includeUnattributedIPConversions")(includeUnattributedIPConversions)
    __obj.asInstanceOf[ReportFloodlightCriteriaReportProperties]
  }
}

