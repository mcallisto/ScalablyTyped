package typings
package awsDashSdkLib.clientsCodestarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserProfileSummary extends js.Object {
  /**
    * The display name of a user in AWS CodeStar. For example, this could be set to both first and last name ("Mary Major") or a single name ("Mary"). The display name is also used to generate the initial icon associated with the user in AWS CodeStar projects. If spaces are included in the display name, the first character that appears after the space will be used as the second character in the user initial icon. The initial icon displays a maximum of two characters, so a display name with more than one space (for example "Mary Jane Major") would generate an initial icon using the first character and the first character after the space ("MJ", not "MM").
    */
  var displayName: js.UndefOr[UserProfileDisplayName] = js.undefined
  /**
    * The email address associated with the user.
    */
  var emailAddress: js.UndefOr[Email] = js.undefined
  /**
    * The SSH public key associated with the user in AWS CodeStar. If a project owner allows the user remote access to project resources, this public key will be used along with the user's private key for SSH access.
    */
  var sshPublicKey: js.UndefOr[SshPublicKey] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the user in IAM.
    */
  var userArn: js.UndefOr[UserArn] = js.undefined
}

object UserProfileSummary {
  @scala.inline
  def apply(
    displayName: UserProfileDisplayName = null,
    emailAddress: Email = null,
    sshPublicKey: SshPublicKey = null,
    userArn: UserArn = null
  ): UserProfileSummary = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (emailAddress != null) __obj.updateDynamic("emailAddress")(emailAddress)
    if (sshPublicKey != null) __obj.updateDynamic("sshPublicKey")(sshPublicKey)
    if (userArn != null) __obj.updateDynamic("userArn")(userArn)
    __obj.asInstanceOf[UserProfileSummary]
  }
}

