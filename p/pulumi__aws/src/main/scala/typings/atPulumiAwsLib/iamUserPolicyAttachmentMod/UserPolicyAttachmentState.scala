package typings
package atPulumiAwsLib.iamUserPolicyAttachmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserPolicyAttachmentState extends js.Object {
  /**
    * The ARN of the policy you want to apply
    */
  val policyArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.arnMod.ARN]] = js.undefined
  /**
    * The user the policy should be applied to
    */
  val user: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.iamUserMod.User]] = js.undefined
}

object UserPolicyAttachmentState {
  @scala.inline
  def apply(
    policyArn: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.arnMod.ARN] = null,
    user: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.iamUserMod.User] = null
  ): UserPolicyAttachmentState = {
    val __obj = js.Dynamic.literal()
    if (policyArn != null) __obj.updateDynamic("policyArn")(policyArn.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserPolicyAttachmentState]
  }
}

