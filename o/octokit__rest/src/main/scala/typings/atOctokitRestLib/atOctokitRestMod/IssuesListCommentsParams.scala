package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesListCommentsParams extends js.Object {
  var issue_number: scala.Double
  var owner: java.lang.String
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[scala.Double] = js.undefined
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[scala.Double] = js.undefined
  var repo: java.lang.String
  /**
    * Only comments updated at or after this time are returned. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
    */
  var since: js.UndefOr[java.lang.String] = js.undefined
}

object IssuesListCommentsParams {
  @scala.inline
  def apply(
    issue_number: scala.Double,
    owner: java.lang.String,
    repo: java.lang.String,
    page: scala.Int | scala.Double = null,
    per_page: scala.Int | scala.Double = null,
    since: java.lang.String = null
  ): IssuesListCommentsParams = {
    val __obj = js.Dynamic.literal(issue_number = issue_number, owner = owner, repo = repo)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    if (since != null) __obj.updateDynamic("since")(since)
    __obj.asInstanceOf[IssuesListCommentsParams]
  }
}

