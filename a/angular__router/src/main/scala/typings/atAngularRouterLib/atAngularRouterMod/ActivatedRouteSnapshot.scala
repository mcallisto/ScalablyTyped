package typings
package atAngularRouterLib.atAngularRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/router", "ActivatedRouteSnapshot")
@js.native
class ActivatedRouteSnapshot () extends js.Object {
  /** The children of this route in the router state tree */
  val children: js.Array[ActivatedRouteSnapshot] = js.native
  /** The component of the route */
  var component: atAngularCoreLib.atAngularCoreMod.Type[_] | java.lang.String | scala.Null = js.native
  /** The static and resolved data of this route */
  var data: Data = js.native
  /** The first child of this route in the router state tree */
  val firstChild: ActivatedRouteSnapshot | scala.Null = js.native
  /** The URL fragment shared by all the routes */
  var fragment: java.lang.String = js.native
  /** The outlet name of the route */
  var outlet: java.lang.String = js.native
  val paramMap: ParamMap = js.native
  /** The matrix parameters scoped to this route */
  var params: Params = js.native
  /** The parent of this route in the router state tree */
  val parent: ActivatedRouteSnapshot | scala.Null = js.native
  /** The path from the root of the router state tree to this route */
  val pathFromRoot: js.Array[ActivatedRouteSnapshot] = js.native
  val queryParamMap: ParamMap = js.native
  /** The query parameters shared by all the routes */
  var queryParams: Params = js.native
  /** The root of the router state */
  val root: ActivatedRouteSnapshot = js.native
  /** The configuration used to match this route **/
  val routeConfig: Route | scala.Null = js.native
  /** The URL segments matched by this route */
  var url: js.Array[UrlSegment] = js.native
}

