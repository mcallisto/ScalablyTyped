package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesGetEventEndpoint extends js.Object {
  var event_id: scala.Double
  var owner: java.lang.String
  var repo: java.lang.String
}

object IssuesGetEventEndpoint {
  @scala.inline
  def apply(event_id: scala.Double, owner: java.lang.String, repo: java.lang.String): IssuesGetEventEndpoint = {
    val __obj = js.Dynamic.literal(event_id = event_id, owner = owner, repo = repo)
  
    __obj.asInstanceOf[IssuesGetEventEndpoint]
  }
}

