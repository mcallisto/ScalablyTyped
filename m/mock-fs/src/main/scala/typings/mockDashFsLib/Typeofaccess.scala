package typings
package mockDashFsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofaccess extends js.Object {
  /**
    * Asynchronously tests a user's permissions for the file specified by path.
    * @param path A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    */
  def __promisify__(path: nodeLib.fsMod.PathLike): js.Promise[scala.Unit] = js.native
  def __promisify__(path: nodeLib.fsMod.PathLike, mode: scala.Double): js.Promise[scala.Unit] = js.native
}

