package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersListFollowersForAuthenticatedUserEndpoint extends js.Object {
  var page: js.UndefOr[scala.Double] = js.undefined
  var per_page: js.UndefOr[scala.Double] = js.undefined
}

object UsersListFollowersForAuthenticatedUserEndpoint {
  @scala.inline
  def apply(page: scala.Int | scala.Double = null, per_page: scala.Int | scala.Double = null): UsersListFollowersForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal()
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsersListFollowersForAuthenticatedUserEndpoint]
  }
}

