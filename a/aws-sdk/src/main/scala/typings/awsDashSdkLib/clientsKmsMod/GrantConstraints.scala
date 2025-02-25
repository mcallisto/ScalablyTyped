package typings
package awsDashSdkLib.clientsKmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GrantConstraints extends js.Object {
  /**
    * A list of key-value pairs that must match the encryption context in the cryptographic operation request. The grant allows the operation only when the encryption context in the request is the same as the encryption context specified in this constraint.
    */
  var EncryptionContextEquals: js.UndefOr[EncryptionContextType] = js.undefined
  /**
    * A list of key-value pairs that must be included in the encryption context of the cryptographic operation request. The grant allows the cryptographic operation only when the encryption context in the request includes the key-value pairs specified in this constraint, although it can include additional key-value pairs.
    */
  var EncryptionContextSubset: js.UndefOr[EncryptionContextType] = js.undefined
}

object GrantConstraints {
  @scala.inline
  def apply(
    EncryptionContextEquals: EncryptionContextType = null,
    EncryptionContextSubset: EncryptionContextType = null
  ): GrantConstraints = {
    val __obj = js.Dynamic.literal()
    if (EncryptionContextEquals != null) __obj.updateDynamic("EncryptionContextEquals")(EncryptionContextEquals)
    if (EncryptionContextSubset != null) __obj.updateDynamic("EncryptionContextSubset")(EncryptionContextSubset)
    __obj.asInstanceOf[GrantConstraints]
  }
}

