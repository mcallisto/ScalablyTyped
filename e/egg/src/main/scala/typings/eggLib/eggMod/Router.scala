package typings
package eggLib.eggMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Router
  extends koaDashRouterLib.koaDashRouterMod.^[js.Any, eggDashViewLib.eggMod.Context] {
  /**
    * restful router api
    */
  def resources(name: java.lang.String, prefix: java.lang.String, middleware: js.Any*): Router = js.native
}

