package typings
package passportDashAzureDashAdLib.oidcDashStrategyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOIDCStrategyOptionWithRequest extends IOIDCStrategyOption {
  var passReqToCallback: passportDashAzureDashAdLib.passportDashAzureDashAdLibNumbers.`true`
}

object IOIDCStrategyOptionWithRequest {
  @scala.inline
  def apply(
    clientID: java.lang.String,
    identityMetadata: java.lang.String,
    passReqToCallback: passportDashAzureDashAdLib.passportDashAzureDashAdLibNumbers.`true`,
    redirectUrl: java.lang.String,
    responseMode: passportDashAzureDashAdLib.passportDashAzureDashAdLibStrings.query | passportDashAzureDashAdLib.passportDashAzureDashAdLibStrings.form_post,
    responseType: passportDashAzureDashAdLib.passportDashAzureDashAdLibStrings.code | (passportDashAzureDashAdLib.passportDashAzureDashAdLibStrings.`code id_token`) | (passportDashAzureDashAdLib.passportDashAzureDashAdLibStrings.`id_token code`) | passportDashAzureDashAdLib.passportDashAzureDashAdLibStrings.id_token,
    allowHttpForRedirectUrl: js.UndefOr[scala.Boolean] = js.undefined,
    clientSecret: java.lang.String = null,
    clockSkew: scala.Int | scala.Double = null,
    cookieEncryptionKeys: js.Array[passportDashAzureDashAdLib.Anon_Iv] = null,
    isB2C: js.UndefOr[scala.Boolean] = js.undefined,
    issuer: java.lang.String | js.Array[java.lang.String] = null,
    loggingLevel: passportDashAzureDashAdLib.passportDashAzureDashAdLibStrings.info | passportDashAzureDashAdLib.passportDashAzureDashAdLibStrings.warn | passportDashAzureDashAdLib.passportDashAzureDashAdLibStrings.error = null,
    loggingNoPII: js.UndefOr[scala.Boolean] = js.undefined,
    nonceLifetime: scala.Int | scala.Double = null,
    nonceMaxAmount: scala.Int | scala.Double = null,
    privatePEMKey: java.lang.String = null,
    scope: java.lang.String | js.Array[java.lang.String] = null,
    thumbprint: java.lang.String = null,
    useCookieInsteadOfSession: js.UndefOr[scala.Boolean] = js.undefined,
    validateIssuer: js.UndefOr[scala.Boolean] = js.undefined
  ): IOIDCStrategyOptionWithRequest = {
    val __obj = js.Dynamic.literal(clientID = clientID, identityMetadata = identityMetadata, passReqToCallback = passReqToCallback, redirectUrl = redirectUrl, responseMode = responseMode.asInstanceOf[js.Any], responseType = responseType.asInstanceOf[js.Any])
    if (!js.isUndefined(allowHttpForRedirectUrl)) __obj.updateDynamic("allowHttpForRedirectUrl")(allowHttpForRedirectUrl)
    if (clientSecret != null) __obj.updateDynamic("clientSecret")(clientSecret)
    if (clockSkew != null) __obj.updateDynamic("clockSkew")(clockSkew.asInstanceOf[js.Any])
    if (cookieEncryptionKeys != null) __obj.updateDynamic("cookieEncryptionKeys")(cookieEncryptionKeys)
    if (!js.isUndefined(isB2C)) __obj.updateDynamic("isB2C")(isB2C)
    if (issuer != null) __obj.updateDynamic("issuer")(issuer.asInstanceOf[js.Any])
    if (loggingLevel != null) __obj.updateDynamic("loggingLevel")(loggingLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(loggingNoPII)) __obj.updateDynamic("loggingNoPII")(loggingNoPII)
    if (nonceLifetime != null) __obj.updateDynamic("nonceLifetime")(nonceLifetime.asInstanceOf[js.Any])
    if (nonceMaxAmount != null) __obj.updateDynamic("nonceMaxAmount")(nonceMaxAmount.asInstanceOf[js.Any])
    if (privatePEMKey != null) __obj.updateDynamic("privatePEMKey")(privatePEMKey)
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (thumbprint != null) __obj.updateDynamic("thumbprint")(thumbprint)
    if (!js.isUndefined(useCookieInsteadOfSession)) __obj.updateDynamic("useCookieInsteadOfSession")(useCookieInsteadOfSession)
    if (!js.isUndefined(validateIssuer)) __obj.updateDynamic("validateIssuer")(validateIssuer)
    __obj.asInstanceOf[IOIDCStrategyOptionWithRequest]
  }
}

