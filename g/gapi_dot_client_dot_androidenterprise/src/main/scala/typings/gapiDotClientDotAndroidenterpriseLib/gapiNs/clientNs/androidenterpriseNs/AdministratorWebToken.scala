package typings
package gapiDotClientDotAndroidenterpriseLib.gapiNs.clientNs.androidenterpriseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdministratorWebToken extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#administratorWebToken". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** An opaque token to be passed to the Play front-end to generate an iframe. */
  var token: js.UndefOr[java.lang.String] = js.undefined
}

object AdministratorWebToken {
  @scala.inline
  def apply(kind: java.lang.String = null, token: java.lang.String = null): AdministratorWebToken = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (token != null) __obj.updateDynamic("token")(token)
    __obj.asInstanceOf[AdministratorWebToken]
  }
}

