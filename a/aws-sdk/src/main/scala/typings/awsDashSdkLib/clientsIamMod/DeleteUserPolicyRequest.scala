package typings
package awsDashSdkLib.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteUserPolicyRequest extends js.Object {
  /**
    * The name identifying the policy document to delete. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var PolicyName: policyNameType
  /**
    * The name (friendly name, not ARN) identifying the user that the policy is embedded in. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var UserName: existingUserNameType
}

object DeleteUserPolicyRequest {
  @scala.inline
  def apply(PolicyName: policyNameType, UserName: existingUserNameType): DeleteUserPolicyRequest = {
    val __obj = js.Dynamic.literal(PolicyName = PolicyName, UserName = UserName)
  
    __obj.asInstanceOf[DeleteUserPolicyRequest]
  }
}

