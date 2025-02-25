package typings
package webappsecDashCredentialDashManagementLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://w3c.github.io/webauthn/#dictdef-authenticatorselectioncriteria}
  */
trait AuthenticatorSelectionCriteria extends js.Object {
  var authenticatorAttachment: js.UndefOr[AuthenticatorAttachment] = js.undefined
  var requireResidentKey: js.UndefOr[scala.Boolean] = js.undefined
  var userVerification: js.UndefOr[UserVerificationRequirement] = js.undefined
}

object AuthenticatorSelectionCriteria {
  @scala.inline
  def apply(
    authenticatorAttachment: AuthenticatorAttachment = null,
    requireResidentKey: js.UndefOr[scala.Boolean] = js.undefined,
    userVerification: UserVerificationRequirement = null
  ): AuthenticatorSelectionCriteria = {
    val __obj = js.Dynamic.literal()
    if (authenticatorAttachment != null) __obj.updateDynamic("authenticatorAttachment")(authenticatorAttachment)
    if (!js.isUndefined(requireResidentKey)) __obj.updateDynamic("requireResidentKey")(requireResidentKey)
    if (userVerification != null) __obj.updateDynamic("userVerification")(userVerification)
    __obj.asInstanceOf[AuthenticatorSelectionCriteria]
  }
}

