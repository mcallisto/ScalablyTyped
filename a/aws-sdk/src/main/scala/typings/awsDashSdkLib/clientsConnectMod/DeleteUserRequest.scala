package typings
package awsDashSdkLib.clientsConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteUserRequest extends js.Object {
  /**
    * The identifier for your Amazon Connect instance. To find the ID of your instance, open the AWS console and select Amazon Connect. Select the alias of the instance in the Instance alias column. The instance ID is displayed in the Overview section of your instance settings. For example, the instance ID is the set of characters at the end of the instance ARN, after instance/, such as 10a4c4eb-f57e-4d4c-b602-bf39176ced07.
    */
  var InstanceId: awsDashSdkLib.clientsConnectMod.InstanceId
  /**
    * The unique identifier of the user to delete.
    */
  var UserId: awsDashSdkLib.clientsConnectMod.UserId
}

object DeleteUserRequest {
  @scala.inline
  def apply(InstanceId: InstanceId, UserId: UserId): DeleteUserRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId, UserId = UserId)
  
    __obj.asInstanceOf[DeleteUserRequest]
  }
}

