package typings
package atHapiBellLib.atHapiBellMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnownProviderOptions
  extends RequiredProviderOptions
     with OptionalOptions
     with BellOptions {
  var provider: Provider
}

object KnownProviderOptions {
  @scala.inline
  def apply(
    clientId: java.lang.String,
    clientSecret: java.lang.String,
    password: java.lang.String,
    provider: Provider,
    allowRuntimeProviderParams: StringLikeMap | scala.Boolean = null,
    config: atHapiBellLib.Anon_ExtendedProfile | atHapiBellLib.Anon_Uri = null,
    cookie: java.lang.String = null,
    domain: java.lang.String = null,
    forceHttps: js.UndefOr[scala.Boolean] = js.undefined,
    isHttpOnly: js.UndefOr[scala.Boolean] = js.undefined,
    isSecure: js.UndefOr[scala.Boolean] = js.undefined,
    location: java.lang.String | (js.Function1[/* req */ atHapiHapiLib.atHapiHapiMod.Request, java.lang.String]) = null,
    profileParams: StringLikeMap = null,
    providerParams: StringLikeMap | (js.Function1[/* request */ atHapiHapiLib.atHapiHapiMod.Request, StringLikeMap]) = null,
    runtimeStateCallback: /* req */ atHapiHapiLib.atHapiHapiMod.Request => java.lang.String = null,
    scope: js.Array[java.lang.String] | (js.Function1[/* request */ atHapiHapiLib.atHapiHapiMod.Request, js.Array[java.lang.String]]) = null,
    skipProfile: js.UndefOr[scala.Boolean] = js.undefined,
    ttl: scala.Int | scala.Double = null
  ): KnownProviderOptions = {
    val __obj = js.Dynamic.literal(clientId = clientId, clientSecret = clientSecret, password = password, provider = provider)
    if (allowRuntimeProviderParams != null) __obj.updateDynamic("allowRuntimeProviderParams")(allowRuntimeProviderParams.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (cookie != null) __obj.updateDynamic("cookie")(cookie)
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (!js.isUndefined(forceHttps)) __obj.updateDynamic("forceHttps")(forceHttps)
    if (!js.isUndefined(isHttpOnly)) __obj.updateDynamic("isHttpOnly")(isHttpOnly)
    if (!js.isUndefined(isSecure)) __obj.updateDynamic("isSecure")(isSecure)
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (profileParams != null) __obj.updateDynamic("profileParams")(profileParams)
    if (providerParams != null) __obj.updateDynamic("providerParams")(providerParams.asInstanceOf[js.Any])
    if (runtimeStateCallback != null) __obj.updateDynamic("runtimeStateCallback")(js.Any.fromFunction1(runtimeStateCallback))
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (!js.isUndefined(skipProfile)) __obj.updateDynamic("skipProfile")(skipProfile)
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnownProviderOptions]
  }
}

