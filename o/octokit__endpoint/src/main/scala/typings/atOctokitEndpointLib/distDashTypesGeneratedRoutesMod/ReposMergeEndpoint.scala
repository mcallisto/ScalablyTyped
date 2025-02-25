package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposMergeEndpoint extends js.Object {
  var base: java.lang.String
  var commit_message: js.UndefOr[java.lang.String] = js.undefined
  var head: java.lang.String
  var owner: java.lang.String
  var repo: java.lang.String
}

object ReposMergeEndpoint {
  @scala.inline
  def apply(
    base: java.lang.String,
    head: java.lang.String,
    owner: java.lang.String,
    repo: java.lang.String,
    commit_message: java.lang.String = null
  ): ReposMergeEndpoint = {
    val __obj = js.Dynamic.literal(base = base, head = head, owner = owner, repo = repo)
    if (commit_message != null) __obj.updateDynamic("commit_message")(commit_message)
    __obj.asInstanceOf[ReposMergeEndpoint]
  }
}

