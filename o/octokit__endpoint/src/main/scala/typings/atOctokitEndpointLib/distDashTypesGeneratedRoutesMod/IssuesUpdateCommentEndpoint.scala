package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesUpdateCommentEndpoint extends js.Object {
  var body: java.lang.String
  var comment_id: scala.Double
  var owner: java.lang.String
  var repo: java.lang.String
}

object IssuesUpdateCommentEndpoint {
  @scala.inline
  def apply(body: java.lang.String, comment_id: scala.Double, owner: java.lang.String, repo: java.lang.String): IssuesUpdateCommentEndpoint = {
    val __obj = js.Dynamic.literal(body = body, comment_id = comment_id, owner = owner, repo = repo)
  
    __obj.asInstanceOf[IssuesUpdateCommentEndpoint]
  }
}

