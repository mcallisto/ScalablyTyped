package typings
package gitlabLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GroupIdProjectId extends js.Object {
  var groupId: js.UndefOr[gitlabLib.distServicesMod.GroupId] = js.undefined
  var projectId: js.UndefOr[gitlabLib.distServicesMod.ProjectId] = js.undefined
}

object Anon_GroupIdProjectId {
  @scala.inline
  def apply(
    groupId: gitlabLib.distServicesMod.GroupId = null,
    projectId: gitlabLib.distServicesMod.ProjectId = null
  ): Anon_GroupIdProjectId = {
    val __obj = js.Dynamic.literal()
    if (groupId != null) __obj.updateDynamic("groupId")(groupId.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_GroupIdProjectId]
  }
}

