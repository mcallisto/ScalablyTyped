package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OwnershipHistoryListResponse extends js.Object {
  var items: js.UndefOr[js.Array[RightsOwnershipHistory]] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object OwnershipHistoryListResponse {
  @scala.inline
  def apply(items: js.Array[RightsOwnershipHistory] = null, kind: java.lang.String = null): OwnershipHistoryListResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[OwnershipHistoryListResponse]
  }
}

