package typings
package firebaseDashAdminLib.adminNs.authNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request interface for updating a SAML Auth provider. This is used
  * when updating a SAML provider's configuration via
  * {@link https://firebase.google.com/docs/reference/admin/node/admin.auth.Auth#updateProviderConfig `updateProviderConfig()`}.
  */
trait SAMLUpdateAuthProviderRequest extends UpdateAuthProviderRequest {
  /**
    * The SAML provider's callback URL. If not provided, the existing
    * configuration's value is not modified.
    */
  var callbackURL: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The SAML provider's updated display name. If not provided, the existing
    * configuration's value is not modified.
    */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether the SAML provider is enabled or not. If not provided, the existing
    * configuration's setting is not modified.
    */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The SAML provider's updated IdP entity ID. If not provided, the existing
    * configuration's value is not modified.
    */
  var idpEntityId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The SAML provider's updated RP entity ID. If not provided, the existing
    * configuration's value is not modified.
    */
  var rpEntityId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The SAML provider's updated SSO URL. If not provided, the existing
    * configuration's value is not modified.
    */
  var ssoURL: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The SAML provider's updated list of X.509 certificated. If not provided, the
    * existing configuration list is not modified.
    */
  var x509Certificates: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object SAMLUpdateAuthProviderRequest {
  @scala.inline
  def apply(
    callbackURL: java.lang.String = null,
    displayName: java.lang.String = null,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    idpEntityId: java.lang.String = null,
    rpEntityId: java.lang.String = null,
    ssoURL: java.lang.String = null,
    x509Certificates: js.Array[java.lang.String] = null
  ): SAMLUpdateAuthProviderRequest = {
    val __obj = js.Dynamic.literal()
    if (callbackURL != null) __obj.updateDynamic("callbackURL")(callbackURL)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (idpEntityId != null) __obj.updateDynamic("idpEntityId")(idpEntityId)
    if (rpEntityId != null) __obj.updateDynamic("rpEntityId")(rpEntityId)
    if (ssoURL != null) __obj.updateDynamic("ssoURL")(ssoURL)
    if (x509Certificates != null) __obj.updateDynamic("x509Certificates")(x509Certificates)
    __obj.asInstanceOf[SAMLUpdateAuthProviderRequest]
  }
}

