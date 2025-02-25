package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveBroadcast extends js.Object {
  var contentDetails: js.UndefOr[LiveBroadcastContentDetails] = js.undefined
  var etag: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var snippet: js.UndefOr[LiveBroadcastSnippet] = js.undefined
  var statistics: js.UndefOr[LiveBroadcastStatistics] = js.undefined
  var status: js.UndefOr[LiveBroadcastStatus] = js.undefined
}

object LiveBroadcast {
  @scala.inline
  def apply(
    contentDetails: LiveBroadcastContentDetails = null,
    etag: java.lang.String = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    snippet: LiveBroadcastSnippet = null,
    statistics: LiveBroadcastStatistics = null,
    status: LiveBroadcastStatus = null
  ): LiveBroadcast = {
    val __obj = js.Dynamic.literal()
    if (contentDetails != null) __obj.updateDynamic("contentDetails")(contentDetails)
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (snippet != null) __obj.updateDynamic("snippet")(snippet)
    if (statistics != null) __obj.updateDynamic("statistics")(statistics)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[LiveBroadcast]
  }
}

