package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegionsListResponse extends js.Object {
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var regions: js.UndefOr[js.Array[Region]] = js.undefined
}

object RegionsListResponse {
  @scala.inline
  def apply(kind: java.lang.String = null, regions: js.Array[Region] = null): RegionsListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (regions != null) __obj.updateDynamic("regions")(regions)
    __obj.asInstanceOf[RegionsListResponse]
  }
}

