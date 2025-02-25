package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityMarkNotificationsAsReadForRepoEndpoint extends js.Object {
  var last_read_at: js.UndefOr[java.lang.String] = js.undefined
  var owner: java.lang.String
  var repo: java.lang.String
}

object ActivityMarkNotificationsAsReadForRepoEndpoint {
  @scala.inline
  def apply(owner: java.lang.String, repo: java.lang.String, last_read_at: java.lang.String = null): ActivityMarkNotificationsAsReadForRepoEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
    if (last_read_at != null) __obj.updateDynamic("last_read_at")(last_read_at)
    __obj.asInstanceOf[ActivityMarkNotificationsAsReadForRepoEndpoint]
  }
}

