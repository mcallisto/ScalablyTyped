package typings
package swaggerDashRestifyDashMwLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("swagger-restify-mw", JSImport.Namespace)
@js.native
object swaggerDashRestifyDashMwMod extends js.Object {
  def create(
    config: swaggerDashNodeDashRunnerLib.swaggerDashNodeDashRunnerMod.Config,
    cb: js.Function2[
      /* err */ js.UndefOr[stdLib.Error], 
      /* middleware */ swaggerDashNodeDashRunnerLib.swaggerDashNodeDashRunnerMod.RestifyMiddleware, 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

