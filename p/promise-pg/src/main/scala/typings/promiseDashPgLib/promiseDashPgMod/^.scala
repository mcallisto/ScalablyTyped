package typings
package promiseDashPgLib.promiseDashPgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("promise-pg", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def connect(connection: java.lang.String): qLib.qMod.Promise[Client] = js.native
  def connect(connection: pgLib.pgMod.ClientConfig): qLib.qMod.Promise[Client] = js.native
  def end(): qLib.qMod.Promise[scala.Unit] = js.native
}

