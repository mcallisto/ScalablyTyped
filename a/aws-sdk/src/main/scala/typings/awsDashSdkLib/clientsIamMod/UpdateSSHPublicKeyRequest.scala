package typings
package awsDashSdkLib.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateSSHPublicKeyRequest extends js.Object {
  /**
    * The unique identifier for the SSH public key. This parameter allows (through its regex pattern) a string of characters that can consist of any upper or lowercased letter or digit.
    */
  var SSHPublicKeyId: publicKeyIdType
  /**
    * The status to assign to the SSH public key. Active means that the key can be used for authentication with an AWS CodeCommit repository. Inactive means that the key cannot be used.
    */
  var Status: statusType
  /**
    * The name of the IAM user associated with the SSH public key. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var UserName: userNameType
}

object UpdateSSHPublicKeyRequest {
  @scala.inline
  def apply(SSHPublicKeyId: publicKeyIdType, Status: statusType, UserName: userNameType): UpdateSSHPublicKeyRequest = {
    val __obj = js.Dynamic.literal(SSHPublicKeyId = SSHPublicKeyId, Status = Status.asInstanceOf[js.Any], UserName = UserName)
  
    __obj.asInstanceOf[UpdateSSHPublicKeyRequest]
  }
}

