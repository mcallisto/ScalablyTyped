package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesListForOrgResponseItem extends js.Object {
  var active_lock_reason: java.lang.String
  var assignee: IssuesListForOrgResponseItemAssignee
  var assignees: js.Array[IssuesListForOrgResponseItemAssigneesItem]
  var body: java.lang.String
  var closed_at: scala.Null
  var comments: scala.Double
  var comments_url: java.lang.String
  var created_at: java.lang.String
  var events_url: java.lang.String
  var html_url: java.lang.String
  var id: scala.Double
  var labels: js.Array[IssuesListForOrgResponseItemLabelsItem]
  var labels_url: java.lang.String
  var locked: scala.Boolean
  var milestone: IssuesListForOrgResponseItemMilestone
  var node_id: java.lang.String
  var number: scala.Double
  var pull_request: IssuesListForOrgResponseItemPullRequest
  var repository: IssuesListForOrgResponseItemRepository
  var repository_url: java.lang.String
  var state: java.lang.String
  var title: java.lang.String
  var updated_at: java.lang.String
  var url: java.lang.String
  var user: IssuesListForOrgResponseItemUser
}

object IssuesListForOrgResponseItem {
  @scala.inline
  def apply(
    active_lock_reason: java.lang.String,
    assignee: IssuesListForOrgResponseItemAssignee,
    assignees: js.Array[IssuesListForOrgResponseItemAssigneesItem],
    body: java.lang.String,
    closed_at: scala.Null,
    comments: scala.Double,
    comments_url: java.lang.String,
    created_at: java.lang.String,
    events_url: java.lang.String,
    html_url: java.lang.String,
    id: scala.Double,
    labels: js.Array[IssuesListForOrgResponseItemLabelsItem],
    labels_url: java.lang.String,
    locked: scala.Boolean,
    milestone: IssuesListForOrgResponseItemMilestone,
    node_id: java.lang.String,
    number: scala.Double,
    pull_request: IssuesListForOrgResponseItemPullRequest,
    repository: IssuesListForOrgResponseItemRepository,
    repository_url: java.lang.String,
    state: java.lang.String,
    title: java.lang.String,
    updated_at: java.lang.String,
    url: java.lang.String,
    user: IssuesListForOrgResponseItemUser
  ): IssuesListForOrgResponseItem = {
    val __obj = js.Dynamic.literal(active_lock_reason = active_lock_reason, assignee = assignee, assignees = assignees, body = body, closed_at = closed_at, comments = comments, comments_url = comments_url, created_at = created_at, events_url = events_url, html_url = html_url, id = id, labels = labels, labels_url = labels_url, locked = locked, milestone = milestone, node_id = node_id, number = number, pull_request = pull_request, repository = repository, repository_url = repository_url, state = state, title = title, updated_at = updated_at, url = url, user = user)
  
    __obj.asInstanceOf[IssuesListForOrgResponseItem]
  }
}

