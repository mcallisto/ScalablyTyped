package typings
package koaDashJoiDashRouterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Middleware extends js.Object {
  def apply(middleware: (koaDashRouterLib.koaDashRouterMod.IMiddleware[_, js.Object])*): koaDashRouterLib.koaDashRouterMod.Router[_, js.Object] = js.native
  def apply(path: java.lang.String, middleware: (koaDashRouterLib.koaDashRouterMod.IMiddleware[_, js.Object])*): koaDashRouterLib.koaDashRouterMod.Router[_, js.Object] = js.native
  def apply(
    path: js.Array[java.lang.String],
    middleware: (koaDashRouterLib.koaDashRouterMod.IMiddleware[_, js.Object])*
  ): koaDashRouterLib.koaDashRouterMod.Router[_, js.Object] = js.native
  def apply(path: stdLib.RegExp, middleware: (koaDashRouterLib.koaDashRouterMod.IMiddleware[_, js.Object])*): koaDashRouterLib.koaDashRouterMod.Router[_, js.Object] = js.native
}

