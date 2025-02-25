package typings
package awsDashSdkLib.clientsOpsworkscmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestoreServerRequest extends js.Object {
  /**
    *  The ID of the backup that you want to use to restore a server. 
    */
  var BackupId: awsDashSdkLib.clientsOpsworkscmMod.BackupId
  /**
    *  The type of the instance to create. Valid values must be specified in the following format: ^([cm][34]|t2).* For example, m5.large. Valid values are m5.large, r5.xlarge, and r5.2xlarge. If you do not specify this parameter, RestoreServer uses the instance type from the specified backup. 
    */
  var InstanceType: js.UndefOr[String] = js.undefined
  /**
    *  The name of the key pair to set on the new EC2 instance. This can be helpful if the administrator no longer has the SSH key. 
    */
  var KeyPair: js.UndefOr[KeyPair] = js.undefined
  /**
    *  The name of the server that you want to restore. 
    */
  var ServerName: awsDashSdkLib.clientsOpsworkscmMod.ServerName
}

object RestoreServerRequest {
  @scala.inline
  def apply(BackupId: BackupId, ServerName: ServerName, InstanceType: String = null, KeyPair: KeyPair = null): RestoreServerRequest = {
    val __obj = js.Dynamic.literal(BackupId = BackupId, ServerName = ServerName)
    if (InstanceType != null) __obj.updateDynamic("InstanceType")(InstanceType)
    if (KeyPair != null) __obj.updateDynamic("KeyPair")(KeyPair)
    __obj.asInstanceOf[RestoreServerRequest]
  }
}

