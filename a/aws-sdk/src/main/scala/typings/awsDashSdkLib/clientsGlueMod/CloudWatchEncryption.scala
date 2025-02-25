package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudWatchEncryption extends js.Object {
  /**
    * The encryption mode to use for CloudWatch data.
    */
  var CloudWatchEncryptionMode: js.UndefOr[CloudWatchEncryptionMode] = js.undefined
  /**
    * The AWS ARN of the KMS key to be used to encrypt the data.
    */
  var KmsKeyArn: js.UndefOr[KmsKeyArn] = js.undefined
}

object CloudWatchEncryption {
  @scala.inline
  def apply(CloudWatchEncryptionMode: CloudWatchEncryptionMode = null, KmsKeyArn: KmsKeyArn = null): CloudWatchEncryption = {
    val __obj = js.Dynamic.literal()
    if (CloudWatchEncryptionMode != null) __obj.updateDynamic("CloudWatchEncryptionMode")(CloudWatchEncryptionMode.asInstanceOf[js.Any])
    if (KmsKeyArn != null) __obj.updateDynamic("KmsKeyArn")(KmsKeyArn)
    __obj.asInstanceOf[CloudWatchEncryption]
  }
}

