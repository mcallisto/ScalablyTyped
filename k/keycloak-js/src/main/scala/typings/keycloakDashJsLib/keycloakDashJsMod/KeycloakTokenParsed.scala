package typings
package keycloakDashJsLib.keycloakDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeycloakTokenParsed extends js.Object {
  var exp: js.UndefOr[scala.Double] = js.undefined
  var iat: js.UndefOr[scala.Double] = js.undefined
  var nonce: js.UndefOr[java.lang.String] = js.undefined
  var realm_access: js.UndefOr[keycloakDashJsLib.Anon_Roles] = js.undefined
  var resource_access: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var session_state: js.UndefOr[java.lang.String] = js.undefined
  var sub: js.UndefOr[java.lang.String] = js.undefined
}

object KeycloakTokenParsed {
  @scala.inline
  def apply(
    exp: scala.Int | scala.Double = null,
    iat: scala.Int | scala.Double = null,
    nonce: java.lang.String = null,
    realm_access: keycloakDashJsLib.Anon_Roles = null,
    resource_access: js.Array[java.lang.String] = null,
    session_state: java.lang.String = null,
    sub: java.lang.String = null
  ): KeycloakTokenParsed = {
    val __obj = js.Dynamic.literal()
    if (exp != null) __obj.updateDynamic("exp")(exp.asInstanceOf[js.Any])
    if (iat != null) __obj.updateDynamic("iat")(iat.asInstanceOf[js.Any])
    if (nonce != null) __obj.updateDynamic("nonce")(nonce)
    if (realm_access != null) __obj.updateDynamic("realm_access")(realm_access)
    if (resource_access != null) __obj.updateDynamic("resource_access")(resource_access)
    if (session_state != null) __obj.updateDynamic("session_state")(session_state)
    if (sub != null) __obj.updateDynamic("sub")(sub)
    __obj.asInstanceOf[KeycloakTokenParsed]
  }
}

