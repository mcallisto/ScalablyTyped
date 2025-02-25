package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCreateFileEndpoint extends js.Object {
  var author: js.UndefOr[js.Object] = js.undefined
  var `author.email`: java.lang.String
  var `author.name`: java.lang.String
  var branch: js.UndefOr[java.lang.String] = js.undefined
  var committer: js.UndefOr[js.Object] = js.undefined
  var `committer.email`: java.lang.String
  var `committer.name`: java.lang.String
  var content: java.lang.String
  var message: java.lang.String
  var owner: java.lang.String
  var path: java.lang.String
  var repo: java.lang.String
  var sha: js.UndefOr[java.lang.String] = js.undefined
}

object ReposCreateFileEndpoint {
  @scala.inline
  def apply(
    `author.email`: java.lang.String,
    `author.name`: java.lang.String,
    `committer.email`: java.lang.String,
    `committer.name`: java.lang.String,
    content: java.lang.String,
    message: java.lang.String,
    owner: java.lang.String,
    path: java.lang.String,
    repo: java.lang.String,
    author: js.Object = null,
    branch: java.lang.String = null,
    committer: js.Object = null,
    sha: java.lang.String = null
  ): ReposCreateFileEndpoint = {
    val __obj = js.Dynamic.literal(content = content, message = message, owner = owner, path = path, repo = repo)
    __obj.updateDynamic("author.email")(`author.email`)
    __obj.updateDynamic("author.name")(`author.name`)
    __obj.updateDynamic("committer.email")(`committer.email`)
    __obj.updateDynamic("committer.name")(`committer.name`)
    if (author != null) __obj.updateDynamic("author")(author)
    if (branch != null) __obj.updateDynamic("branch")(branch)
    if (committer != null) __obj.updateDynamic("committer")(committer)
    if (sha != null) __obj.updateDynamic("sha")(sha)
    __obj.asInstanceOf[ReposCreateFileEndpoint]
  }
}

