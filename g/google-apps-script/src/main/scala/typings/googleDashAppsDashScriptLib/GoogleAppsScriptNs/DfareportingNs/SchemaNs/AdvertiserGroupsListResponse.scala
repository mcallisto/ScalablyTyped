package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdvertiserGroupsListResponse extends js.Object {
  var advertiserGroups: js.UndefOr[js.Array[AdvertiserGroup]] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

object AdvertiserGroupsListResponse {
  @scala.inline
  def apply(
    advertiserGroups: js.Array[AdvertiserGroup] = null,
    kind: java.lang.String = null,
    nextPageToken: java.lang.String = null
  ): AdvertiserGroupsListResponse = {
    val __obj = js.Dynamic.literal()
    if (advertiserGroups != null) __obj.updateDynamic("advertiserGroups")(advertiserGroups)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[AdvertiserGroupsListResponse]
  }
}

