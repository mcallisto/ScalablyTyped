package typings
package appDashRootDashPathLib.appDashRootDashPathMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RootPath extends js.Object {
  /**
    * Application root directory absolute path
    * @type {string}
    */
  var path: java.lang.String
  /**
    * Resolve module by relative addressing from root
    * @param {string} pathToModule
    * @returns {*}
    */
  def require(pathToModule: java.lang.String): js.Any
  /**
    * Resolves relative path from root to absolute path
    * @param {string} pathToModule
    * @returns {string}
    */
  def resolve(pathToModule: java.lang.String): java.lang.String
  /**
    * Explicitly set root path
    * @param {string} explicitlySetPath
    */
  def setPath(explicitlySetPath: java.lang.String): scala.Unit
}

object RootPath {
  @scala.inline
  def apply(
    path: java.lang.String,
    require: java.lang.String => js.Any,
    resolve: java.lang.String => java.lang.String,
    setPath: java.lang.String => scala.Unit,
    toString: () => java.lang.String
  ): RootPath = {
    val __obj = js.Dynamic.literal(path = path, require = js.Any.fromFunction1(require), resolve = js.Any.fromFunction1(resolve), setPath = js.Any.fromFunction1(setPath), toString = js.Any.fromFunction0(toString))
  
    __obj.asInstanceOf[RootPath]
  }
}

