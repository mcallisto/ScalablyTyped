package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiasettingsCustomBatchRequest extends js.Object {
  var entries: js.UndefOr[js.Array[LiasettingsCustomBatchRequestEntry]] = js.undefined
}

object LiasettingsCustomBatchRequest {
  @scala.inline
  def apply(entries: js.Array[LiasettingsCustomBatchRequestEntry] = null): LiasettingsCustomBatchRequest = {
    val __obj = js.Dynamic.literal()
    if (entries != null) __obj.updateDynamic("entries")(entries)
    __obj.asInstanceOf[LiasettingsCustomBatchRequest]
  }
}

