package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsDeleteDiscussionCommentEndpoint extends js.Object {
  var comment_number: scala.Double
  var discussion_number: scala.Double
  var team_id: scala.Double
}

object TeamsDeleteDiscussionCommentEndpoint {
  @scala.inline
  def apply(comment_number: scala.Double, discussion_number: scala.Double, team_id: scala.Double): TeamsDeleteDiscussionCommentEndpoint = {
    val __obj = js.Dynamic.literal(comment_number = comment_number, discussion_number = discussion_number, team_id = team_id)
  
    __obj.asInstanceOf[TeamsDeleteDiscussionCommentEndpoint]
  }
}

