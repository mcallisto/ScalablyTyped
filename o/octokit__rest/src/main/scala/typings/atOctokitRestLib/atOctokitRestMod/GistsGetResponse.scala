package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GistsGetResponse extends js.Object {
  var comments: scala.Double
  var comments_url: java.lang.String
  var commits_url: java.lang.String
  var created_at: java.lang.String
  var description: java.lang.String
  var files: GistsGetResponseFiles
  var forks: js.Array[GistsGetResponseForksItem]
  var forks_url: java.lang.String
  var git_pull_url: java.lang.String
  var git_push_url: java.lang.String
  var history: js.Array[GistsGetResponseHistoryItem]
  var html_url: java.lang.String
  var id: java.lang.String
  var node_id: java.lang.String
  var owner: GistsGetResponseOwner
  var public: scala.Boolean
  var truncated: scala.Boolean
  var updated_at: java.lang.String
  var url: java.lang.String
  var user: scala.Null
}

object GistsGetResponse {
  @scala.inline
  def apply(
    comments: scala.Double,
    comments_url: java.lang.String,
    commits_url: java.lang.String,
    created_at: java.lang.String,
    description: java.lang.String,
    files: GistsGetResponseFiles,
    forks: js.Array[GistsGetResponseForksItem],
    forks_url: java.lang.String,
    git_pull_url: java.lang.String,
    git_push_url: java.lang.String,
    history: js.Array[GistsGetResponseHistoryItem],
    html_url: java.lang.String,
    id: java.lang.String,
    node_id: java.lang.String,
    owner: GistsGetResponseOwner,
    public: scala.Boolean,
    truncated: scala.Boolean,
    updated_at: java.lang.String,
    url: java.lang.String,
    user: scala.Null
  ): GistsGetResponse = {
    val __obj = js.Dynamic.literal(comments = comments, comments_url = comments_url, commits_url = commits_url, created_at = created_at, description = description, files = files, forks = forks, forks_url = forks_url, git_pull_url = git_pull_url, git_push_url = git_push_url, history = history, html_url = html_url, id = id, node_id = node_id, owner = owner, public = public, truncated = truncated, updated_at = updated_at, url = url, user = user)
  
    __obj.asInstanceOf[GistsGetResponse]
  }
}

