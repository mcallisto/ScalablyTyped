package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsListPendingInvitationsEndpoint extends js.Object {
  var org: java.lang.String
  var page: js.UndefOr[scala.Double] = js.undefined
  var per_page: js.UndefOr[scala.Double] = js.undefined
}

object OrgsListPendingInvitationsEndpoint {
  @scala.inline
  def apply(
    org: java.lang.String,
    page: scala.Int | scala.Double = null,
    per_page: scala.Int | scala.Double = null
  ): OrgsListPendingInvitationsEndpoint = {
    val __obj = js.Dynamic.literal(org = org)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsListPendingInvitationsEndpoint]
  }
}

