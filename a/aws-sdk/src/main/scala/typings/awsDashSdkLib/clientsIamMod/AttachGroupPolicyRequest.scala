package typings
package awsDashSdkLib.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachGroupPolicyRequest extends js.Object {
  /**
    * The name (friendly name, not ARN) of the group to attach the policy to. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var GroupName: groupNameType
  /**
    * The Amazon Resource Name (ARN) of the IAM policy you want to attach. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
    */
  var PolicyArn: arnType
}

object AttachGroupPolicyRequest {
  @scala.inline
  def apply(GroupName: groupNameType, PolicyArn: arnType): AttachGroupPolicyRequest = {
    val __obj = js.Dynamic.literal(GroupName = GroupName, PolicyArn = PolicyArn)
  
    __obj.asInstanceOf[AttachGroupPolicyRequest]
  }
}

