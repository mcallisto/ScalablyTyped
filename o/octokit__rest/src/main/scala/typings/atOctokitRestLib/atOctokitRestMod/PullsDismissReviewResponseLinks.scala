package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsDismissReviewResponseLinks extends js.Object {
  var html: PullsDismissReviewResponseLinksHtml
  var pull_request: PullsDismissReviewResponseLinksPullRequest
}

object PullsDismissReviewResponseLinks {
  @scala.inline
  def apply(
    html: PullsDismissReviewResponseLinksHtml,
    pull_request: PullsDismissReviewResponseLinksPullRequest
  ): PullsDismissReviewResponseLinks = {
    val __obj = js.Dynamic.literal(html = html, pull_request = pull_request)
  
    __obj.asInstanceOf[PullsDismissReviewResponseLinks]
  }
}

