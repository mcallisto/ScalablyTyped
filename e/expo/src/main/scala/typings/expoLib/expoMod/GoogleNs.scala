package typings
package expoLib.expoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "Google")
@js.native
object GoogleNs extends js.Object {
  trait LogInConfig extends js.Object {
    var androidClientId: js.UndefOr[java.lang.String] = js.undefined
    var androidStandaloneAppClientId: js.UndefOr[java.lang.String] = js.undefined
    var behavior: js.UndefOr[expoLib.expoLibStrings.system | expoLib.expoLibStrings.web] = js.undefined
    var iosClientId: js.UndefOr[java.lang.String] = js.undefined
    var iosStandaloneAppClientId: js.UndefOr[java.lang.String] = js.undefined
    var scopes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
    var webClientId: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait LogInResult extends js.Object {
    var accessToken: js.UndefOr[java.lang.String] = js.undefined
    var idToken: js.UndefOr[java.lang.String] = js.undefined
    var refreshToken: js.UndefOr[java.lang.String] = js.undefined
    var serverAuthCode: js.UndefOr[java.lang.String] = js.undefined
    var `type`: js.UndefOr[expoLib.expoLibStrings.cancel | expoLib.expoLibStrings.success] = js.undefined
    var user: js.UndefOr[expoLib.Anon_Email] = js.undefined
  }
  
  def logInAsync(config: LogInConfig): js.Promise[LogInResult] = js.native
}

