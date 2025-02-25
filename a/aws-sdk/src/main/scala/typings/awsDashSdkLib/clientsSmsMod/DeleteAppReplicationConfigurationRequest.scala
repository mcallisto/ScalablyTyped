package typings
package awsDashSdkLib.clientsSmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteAppReplicationConfigurationRequest extends js.Object {
  /**
    * ID of the application associated with the replication configuration.
    */
  var appId: js.UndefOr[AppId] = js.undefined
}

object DeleteAppReplicationConfigurationRequest {
  @scala.inline
  def apply(appId: AppId = null): DeleteAppReplicationConfigurationRequest = {
    val __obj = js.Dynamic.literal()
    if (appId != null) __obj.updateDynamic("appId")(appId)
    __obj.asInstanceOf[DeleteAppReplicationConfigurationRequest]
  }
}

