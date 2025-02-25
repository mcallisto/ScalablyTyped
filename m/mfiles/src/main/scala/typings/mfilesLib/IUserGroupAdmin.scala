package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUserGroupAdmin extends js.Object {
  var AccessControlList: IAccessControlList
  var SemanticAliases: ISemanticAliases
  var UserGroup: IUserGroup
  def Clone(): IUserGroupAdmin
  def CloneFrom(UserGroupAdmin: IUserGroupAdmin): scala.Unit
}

object IUserGroupAdmin {
  @scala.inline
  def apply(
    AccessControlList: IAccessControlList,
    Clone: () => IUserGroupAdmin,
    CloneFrom: IUserGroupAdmin => scala.Unit,
    SemanticAliases: ISemanticAliases,
    UserGroup: IUserGroup
  ): IUserGroupAdmin = {
    val __obj = js.Dynamic.literal(AccessControlList = AccessControlList, Clone = js.Any.fromFunction0(Clone), CloneFrom = js.Any.fromFunction1(CloneFrom), SemanticAliases = SemanticAliases, UserGroup = UserGroup)
  
    __obj.asInstanceOf[IUserGroupAdmin]
  }
}

