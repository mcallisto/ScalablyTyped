package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposDeleteReleaseEndpoint extends js.Object {
  var owner: java.lang.String
  var release_id: scala.Double
  var repo: java.lang.String
}

object ReposDeleteReleaseEndpoint {
  @scala.inline
  def apply(owner: java.lang.String, release_id: scala.Double, repo: java.lang.String): ReposDeleteReleaseEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, release_id = release_id, repo = repo)
  
    __obj.asInstanceOf[ReposDeleteReleaseEndpoint]
  }
}

