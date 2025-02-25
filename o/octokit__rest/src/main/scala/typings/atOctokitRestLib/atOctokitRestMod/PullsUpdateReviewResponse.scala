package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsUpdateReviewResponse extends js.Object {
  var _links: PullsUpdateReviewResponseLinks
  var body: java.lang.String
  var commit_id: java.lang.String
  var html_url: java.lang.String
  var id: scala.Double
  var node_id: java.lang.String
  var pull_request_url: java.lang.String
  var state: java.lang.String
  var user: PullsUpdateReviewResponseUser
}

object PullsUpdateReviewResponse {
  @scala.inline
  def apply(
    _links: PullsUpdateReviewResponseLinks,
    body: java.lang.String,
    commit_id: java.lang.String,
    html_url: java.lang.String,
    id: scala.Double,
    node_id: java.lang.String,
    pull_request_url: java.lang.String,
    state: java.lang.String,
    user: PullsUpdateReviewResponseUser
  ): PullsUpdateReviewResponse = {
    val __obj = js.Dynamic.literal(_links = _links, body = body, commit_id = commit_id, html_url = html_url, id = id, node_id = node_id, pull_request_url = pull_request_url, state = state, user = user)
  
    __obj.asInstanceOf[PullsUpdateReviewResponse]
  }
}

