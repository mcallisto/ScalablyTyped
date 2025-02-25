package typings
package passportDashHttpLib.passportDashHttpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasicStrategyOptions[req /* <: scala.Boolean */] extends js.Object {
  var passReqToCallback: js.UndefOr[req] = js.undefined
  var realm: js.UndefOr[java.lang.String] = js.undefined
}

object BasicStrategyOptions {
  @scala.inline
  def apply[req /* <: scala.Boolean */](passReqToCallback: req = null, realm: java.lang.String = null): BasicStrategyOptions[req] = {
    val __obj = js.Dynamic.literal()
    if (passReqToCallback != null) __obj.updateDynamic("passReqToCallback")(passReqToCallback.asInstanceOf[js.Any])
    if (realm != null) __obj.updateDynamic("realm")(realm)
    __obj.asInstanceOf[BasicStrategyOptions[req]]
  }
}

