package typings
package awsDashSdkLib.clientsAthenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncryptionConfiguration extends js.Object {
  /**
    * Indicates whether Amazon S3 server-side encryption with Amazon S3-managed keys (SSE-S3), server-side encryption with KMS-managed keys (SSE-KMS), or client-side encryption with KMS-managed keys (CSE-KMS) is used. If a query runs in a workgroup and the workgroup overrides client-side settings, then the workgroup's setting for encryption is used. It specifies whether query results must be encrypted, for all queries that run in this workgroup. 
    */
  var EncryptionOption: awsDashSdkLib.clientsAthenaMod.EncryptionOption
  /**
    * For SSE-KMS and CSE-KMS, this is the KMS key ARN or ID.
    */
  var KmsKey: js.UndefOr[String] = js.undefined
}

object EncryptionConfiguration {
  @scala.inline
  def apply(EncryptionOption: EncryptionOption, KmsKey: String = null): EncryptionConfiguration = {
    val __obj = js.Dynamic.literal(EncryptionOption = EncryptionOption.asInstanceOf[js.Any])
    if (KmsKey != null) __obj.updateDynamic("KmsKey")(KmsKey)
    __obj.asInstanceOf[EncryptionConfiguration]
  }
}

