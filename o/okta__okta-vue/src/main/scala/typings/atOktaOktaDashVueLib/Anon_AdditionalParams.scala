package typings
package atOktaOktaDashVueLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AdditionalParams extends js.Object {
  def authRedirectGuard(): js.Promise[vueDashRouterLib.typesRouterMod.NavigationGuard[vueLib.typesVueMod.Vue]] = js.native
  def getAccessToken(): js.Promise[java.lang.String] = js.native
  def getFromUri(): java.lang.String = js.native
  def getIdToken(): js.Promise[java.lang.String] = js.native
  def getUser(): js.Promise[_] = js.native
  def handleAuthentication(): js.Promise[scala.Unit] = js.native
  def isAuthenticated(): js.Promise[scala.Boolean] = js.native
  def loginRedirect(): scala.Unit = js.native
  def loginRedirect(fromUri: java.lang.String): scala.Unit = js.native
  def loginRedirect(
    fromUri: java.lang.String,
    additionalParams: atOktaOktaDashVueLib.atOktaOktaDashVueMod.OktaVuePluginNs.OktaOpenIDOptions
  ): scala.Unit = js.native
  def logout(): js.Promise[scala.Unit] = js.native
}

