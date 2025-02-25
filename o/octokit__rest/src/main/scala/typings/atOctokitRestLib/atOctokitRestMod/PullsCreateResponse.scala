package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsCreateResponse extends js.Object {
  var _links: PullsCreateResponseLinks
  var active_lock_reason: java.lang.String
  var additions: scala.Double
  var assignee: PullsCreateResponseAssignee
  var assignees: js.Array[PullsCreateResponseAssigneesItem]
  var author_association: java.lang.String
  var base: PullsCreateResponseBase
  var body: java.lang.String
  var changed_files: scala.Double
  var closed_at: java.lang.String
  var comments: scala.Double
  var comments_url: java.lang.String
  var commits: scala.Double
  var commits_url: java.lang.String
  var created_at: java.lang.String
  var deletions: scala.Double
  var diff_url: java.lang.String
  var draft: scala.Boolean
  var head: PullsCreateResponseHead
  var html_url: java.lang.String
  var id: scala.Double
  var issue_url: java.lang.String
  var labels: js.Array[PullsCreateResponseLabelsItem]
  var locked: scala.Boolean
  var maintainer_can_modify: scala.Boolean
  var merge_commit_sha: java.lang.String
  var mergeable: scala.Boolean
  var mergeable_state: java.lang.String
  var merged: scala.Boolean
  var merged_at: java.lang.String
  var merged_by: PullsCreateResponseMergedBy
  var milestone: PullsCreateResponseMilestone
  var node_id: java.lang.String
  var number: scala.Double
  var patch_url: java.lang.String
  var rebaseable: scala.Boolean
  var requested_reviewers: js.Array[PullsCreateResponseRequestedReviewersItem]
  var requested_teams: js.Array[PullsCreateResponseRequestedTeamsItem]
  var review_comment_url: java.lang.String
  var review_comments: scala.Double
  var review_comments_url: java.lang.String
  var state: java.lang.String
  var statuses_url: java.lang.String
  var title: java.lang.String
  var updated_at: java.lang.String
  var url: java.lang.String
  var user: PullsCreateResponseUser
}

object PullsCreateResponse {
  @scala.inline
  def apply(
    _links: PullsCreateResponseLinks,
    active_lock_reason: java.lang.String,
    additions: scala.Double,
    assignee: PullsCreateResponseAssignee,
    assignees: js.Array[PullsCreateResponseAssigneesItem],
    author_association: java.lang.String,
    base: PullsCreateResponseBase,
    body: java.lang.String,
    changed_files: scala.Double,
    closed_at: java.lang.String,
    comments: scala.Double,
    comments_url: java.lang.String,
    commits: scala.Double,
    commits_url: java.lang.String,
    created_at: java.lang.String,
    deletions: scala.Double,
    diff_url: java.lang.String,
    draft: scala.Boolean,
    head: PullsCreateResponseHead,
    html_url: java.lang.String,
    id: scala.Double,
    issue_url: java.lang.String,
    labels: js.Array[PullsCreateResponseLabelsItem],
    locked: scala.Boolean,
    maintainer_can_modify: scala.Boolean,
    merge_commit_sha: java.lang.String,
    mergeable: scala.Boolean,
    mergeable_state: java.lang.String,
    merged: scala.Boolean,
    merged_at: java.lang.String,
    merged_by: PullsCreateResponseMergedBy,
    milestone: PullsCreateResponseMilestone,
    node_id: java.lang.String,
    number: scala.Double,
    patch_url: java.lang.String,
    rebaseable: scala.Boolean,
    requested_reviewers: js.Array[PullsCreateResponseRequestedReviewersItem],
    requested_teams: js.Array[PullsCreateResponseRequestedTeamsItem],
    review_comment_url: java.lang.String,
    review_comments: scala.Double,
    review_comments_url: java.lang.String,
    state: java.lang.String,
    statuses_url: java.lang.String,
    title: java.lang.String,
    updated_at: java.lang.String,
    url: java.lang.String,
    user: PullsCreateResponseUser
  ): PullsCreateResponse = {
    val __obj = js.Dynamic.literal(_links = _links, active_lock_reason = active_lock_reason, additions = additions, assignee = assignee, assignees = assignees, author_association = author_association, base = base, body = body, changed_files = changed_files, closed_at = closed_at, comments = comments, comments_url = comments_url, commits = commits, commits_url = commits_url, created_at = created_at, deletions = deletions, diff_url = diff_url, draft = draft, head = head, html_url = html_url, id = id, issue_url = issue_url, labels = labels, locked = locked, maintainer_can_modify = maintainer_can_modify, merge_commit_sha = merge_commit_sha, mergeable = mergeable, mergeable_state = mergeable_state, merged = merged, merged_at = merged_at, merged_by = merged_by, milestone = milestone, node_id = node_id, number = number, patch_url = patch_url, rebaseable = rebaseable, requested_reviewers = requested_reviewers, requested_teams = requested_teams, review_comment_url = review_comment_url, review_comments = review_comments, review_comments_url = review_comments_url, state = state, statuses_url = statuses_url, title = title, updated_at = updated_at, url = url, user = user)
  
    __obj.asInstanceOf[PullsCreateResponse]
  }
}

