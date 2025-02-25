package typings
package awsDashSdkLib.clientsGlacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitiateMultipartUploadInput extends js.Object {
  /**
    * The AccountId value is the AWS account ID of the account that owns the vault. You can either specify an AWS account ID or optionally a single '-' (hyphen), in which case Amazon Glacier uses the AWS account ID associated with the credentials used to sign the request. If you use an account ID, do not include any hyphens ('-') in the ID. 
    */
  var accountId: java.lang.String
  /**
    * The archive description that you are uploading in parts. The part size must be a megabyte (1024 KB) multiplied by a power of 2, for example 1048576 (1 MB), 2097152 (2 MB), 4194304 (4 MB), 8388608 (8 MB), and so on. The minimum allowable part size is 1 MB, and the maximum is 4 GB (4096 MB).
    */
  var archiveDescription: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The size of each part except the last, in bytes. The last part can be smaller than this part size.
    */
  var partSize: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The name of the vault.
    */
  var vaultName: java.lang.String
}

object InitiateMultipartUploadInput {
  @scala.inline
  def apply(
    accountId: java.lang.String,
    vaultName: java.lang.String,
    archiveDescription: java.lang.String = null,
    partSize: java.lang.String = null
  ): InitiateMultipartUploadInput = {
    val __obj = js.Dynamic.literal(accountId = accountId, vaultName = vaultName)
    if (archiveDescription != null) __obj.updateDynamic("archiveDescription")(archiveDescription)
    if (partSize != null) __obj.updateDynamic("partSize")(partSize)
    __obj.asInstanceOf[InitiateMultipartUploadInput]
  }
}

