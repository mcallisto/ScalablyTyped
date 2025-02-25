package typings
package auth0Lib.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PermissionsData extends js.Object {
  var permissions: js.Array[PermissionData]
}

object PermissionsData {
  @scala.inline
  def apply(permissions: js.Array[PermissionData]): PermissionsData = {
    val __obj = js.Dynamic.literal(permissions = permissions)
  
    __obj.asInstanceOf[PermissionsData]
  }
}

