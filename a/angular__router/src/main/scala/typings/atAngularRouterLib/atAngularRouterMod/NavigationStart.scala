package typings
package atAngularRouterLib.atAngularRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/router", "NavigationStart")
@js.native
class NavigationStart protected () extends RouterEvent {
  def this(/** @docsNotRequired */
  id: scala.Double, /** @docsNotRequired */
  url: java.lang.String) = this()
  def this(/** @docsNotRequired */
  id: scala.Double, /** @docsNotRequired */
  url: java.lang.String, /** @docsNotRequired */
  navigationTrigger: atAngularRouterLib.atAngularRouterLibStrings.hashchange) = this()
  def this(/** @docsNotRequired */
  id: scala.Double, /** @docsNotRequired */
  url: java.lang.String, /** @docsNotRequired */
  navigationTrigger: atAngularRouterLib.atAngularRouterLibStrings.imperative) = this()
  def this(/** @docsNotRequired */
  id: scala.Double, /** @docsNotRequired */
  url: java.lang.String, /** @docsNotRequired */
  navigationTrigger: atAngularRouterLib.atAngularRouterLibStrings.popstate) = this()
  def this(/** @docsNotRequired */
  id: scala.Double, /** @docsNotRequired */
  url: java.lang.String, /** @docsNotRequired */
  navigationTrigger: atAngularRouterLib.atAngularRouterLibStrings.hashchange, /** @docsNotRequired */
  restoredState: atAngularRouterLib.Anon_K) = this()
  def this(/** @docsNotRequired */
  id: scala.Double, /** @docsNotRequired */
  url: java.lang.String, /** @docsNotRequired */
  navigationTrigger: atAngularRouterLib.atAngularRouterLibStrings.imperative, /** @docsNotRequired */
  restoredState: atAngularRouterLib.Anon_K) = this()
  def this(/** @docsNotRequired */
  id: scala.Double, /** @docsNotRequired */
  url: java.lang.String, /** @docsNotRequired */
  navigationTrigger: atAngularRouterLib.atAngularRouterLibStrings.popstate, /** @docsNotRequired */
  restoredState: atAngularRouterLib.Anon_K) = this()
  /**
    * Identifies the trigger of the navigation.
    *
    * * 'imperative'--triggered by `router.navigateByUrl` or `router.navigate`.
    * * 'popstate'--triggered by a popstate event
    * * 'hashchange'--triggered by a hashchange event
    */
  var navigationTrigger: js.UndefOr[
    atAngularRouterLib.atAngularRouterLibStrings.imperative | atAngularRouterLib.atAngularRouterLibStrings.popstate | atAngularRouterLib.atAngularRouterLibStrings.hashchange
  ] = js.native
  /**
    * This reflects the state object that was previously supplied to the pushState call. This is
    * not null only when the navigation is triggered by a popstate event.
    *
    * The router assigns a navigationId to every router transition/navigation. Even when the user
    * clicks on the back button in the browser, a new navigation id will be created. So from
    * the perspective of the router, the router never "goes back". By using the `restoredState`
    * and its navigationId, you can implement behavior that differentiates between creating new
    * states
    * and popstate events. In the latter case you can restore some remembered state (e.g., scroll
    * position).
    *
    * See {@link NavigationExtras} for more information.
    */
  var restoredState: js.UndefOr[atAngularRouterLib.Anon_K | scala.Null] = js.native
}

