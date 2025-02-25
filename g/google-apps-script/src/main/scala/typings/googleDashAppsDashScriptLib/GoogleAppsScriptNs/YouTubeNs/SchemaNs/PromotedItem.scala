package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromotedItem extends js.Object {
  var customMessage: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[PromotedItemId] = js.undefined
  var promotedByContentOwner: js.UndefOr[scala.Boolean] = js.undefined
  var timing: js.UndefOr[InvideoTiming] = js.undefined
}

object PromotedItem {
  @scala.inline
  def apply(
    customMessage: java.lang.String = null,
    id: PromotedItemId = null,
    promotedByContentOwner: js.UndefOr[scala.Boolean] = js.undefined,
    timing: InvideoTiming = null
  ): PromotedItem = {
    val __obj = js.Dynamic.literal()
    if (customMessage != null) __obj.updateDynamic("customMessage")(customMessage)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(promotedByContentOwner)) __obj.updateDynamic("promotedByContentOwner")(promotedByContentOwner)
    if (timing != null) __obj.updateDynamic("timing")(timing)
    __obj.asInstanceOf[PromotedItem]
  }
}

