package typings
package angularDashOauth2Lib.angularMod.oauth2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OAuthTokenProvider extends js.Object {
  def configure(params: OAuthTokenConfig): OAuthTokenConfig
}

object OAuthTokenProvider {
  @scala.inline
  def apply(configure: OAuthTokenConfig => OAuthTokenConfig): OAuthTokenProvider = {
    val __obj = js.Dynamic.literal(configure = js.Any.fromFunction1(configure))
  
    __obj.asInstanceOf[OAuthTokenProvider]
  }
}

