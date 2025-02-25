package typings
package findDashRootLib.findDashRootMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("find-root", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Returns the path for the nearest directory to startingPath containing a package.json file. If a check function is
    * provided, then this will return the nearest directory for which the function returns true.
    * @param startingPath The path to start searching from, e.g. __dirname
    * @param check The check predicate
    * @throws {Error} if package.json cannot be found or if the function never returns true
    */
  def apply(startingPath: java.lang.String): java.lang.String = js.native
  def apply(startingPath: java.lang.String, check: FindRootCheckFn): java.lang.String = js.native
}

