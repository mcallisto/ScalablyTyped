package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsCreateFromIssueResponseHeadRepoPermissions extends js.Object {
  var admin: scala.Boolean
  var pull: scala.Boolean
  var push: scala.Boolean
}

object PullsCreateFromIssueResponseHeadRepoPermissions {
  @scala.inline
  def apply(admin: scala.Boolean, pull: scala.Boolean, push: scala.Boolean): PullsCreateFromIssueResponseHeadRepoPermissions = {
    val __obj = js.Dynamic.literal(admin = admin, pull = pull, push = push)
  
    __obj.asInstanceOf[PullsCreateFromIssueResponseHeadRepoPermissions]
  }
}

