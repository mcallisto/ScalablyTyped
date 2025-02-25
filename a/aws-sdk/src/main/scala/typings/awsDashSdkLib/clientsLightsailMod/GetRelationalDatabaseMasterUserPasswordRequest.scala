package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRelationalDatabaseMasterUserPasswordRequest extends js.Object {
  /**
    * The password version to return. Specifying CURRENT or PREVIOUS returns the current or previous passwords respectively. Specifying PENDING returns the newest version of the password that will rotate to CURRENT. After the PENDING password rotates to CURRENT, the PENDING password is no longer available. Default: CURRENT 
    */
  var passwordVersion: js.UndefOr[RelationalDatabasePasswordVersion] = js.undefined
  /**
    * The name of your database for which to get the master user password.
    */
  var relationalDatabaseName: ResourceName
}

object GetRelationalDatabaseMasterUserPasswordRequest {
  @scala.inline
  def apply(relationalDatabaseName: ResourceName, passwordVersion: RelationalDatabasePasswordVersion = null): GetRelationalDatabaseMasterUserPasswordRequest = {
    val __obj = js.Dynamic.literal(relationalDatabaseName = relationalDatabaseName)
    if (passwordVersion != null) __obj.updateDynamic("passwordVersion")(passwordVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRelationalDatabaseMasterUserPasswordRequest]
  }
}

