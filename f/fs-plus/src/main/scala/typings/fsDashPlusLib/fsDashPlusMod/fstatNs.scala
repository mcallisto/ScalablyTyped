package typings
package fsDashPlusLib.fsDashPlusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@JSImport("fs-plus", "fstat")
@js.native
object fstatNs extends js.Object {
  /**
    * Asynchronous fstat(2) - Get file status.
    * @param fd A file descriptor.
    */
  def __promisify__(fd: scala.Double): js.Promise[nodeLib.fsMod.Stats] = js.native
}

