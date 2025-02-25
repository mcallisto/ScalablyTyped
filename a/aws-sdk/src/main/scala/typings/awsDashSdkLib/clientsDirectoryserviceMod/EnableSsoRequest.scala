package typings
package awsDashSdkLib.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnableSsoRequest extends js.Object {
  /**
    * The identifier of the directory for which to enable single-sign on.
    */
  var DirectoryId: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryId
  /**
    * The password of an alternate account to use to enable single-sign on. This is only used for AD Connector directories. For more information, see the UserName parameter.
    */
  var Password: js.UndefOr[ConnectPassword] = js.undefined
  /**
    * The username of an alternate account to use to enable single-sign on. This is only used for AD Connector directories. This account must have privileges to add a service principal name. If the AD Connector service account does not have privileges to add a service principal name, you can specify an alternate account with the UserName and Password parameters. These credentials are only used to enable single sign-on and are not stored by the service. The AD Connector service account is not changed.
    */
  var UserName: js.UndefOr[UserName] = js.undefined
}

object EnableSsoRequest {
  @scala.inline
  def apply(DirectoryId: DirectoryId, Password: ConnectPassword = null, UserName: UserName = null): EnableSsoRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId)
    if (Password != null) __obj.updateDynamic("Password")(Password)
    if (UserName != null) __obj.updateDynamic("UserName")(UserName)
    __obj.asInstanceOf[EnableSsoRequest]
  }
}

