package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode", "RelativePattern")
@js.native
class RelativePattern protected () extends js.Object {
  def this(base: java.lang.String, pattern: java.lang.String) = this()
  /**
  		 * Creates a new relative pattern object with a base path and pattern to match. This pattern
  		 * will be matched on file paths relative to the base path.
  		 *
  		 * @param base A base file path to which this pattern will be matched against relatively.
  		 * @param pattern A file glob pattern like `*.{ts,js}` that will be matched on file paths
  		 * relative to the base path.
  		 */
  def this(base: WorkspaceFolder, pattern: java.lang.String) = this()
  /**
  		 * A base file path to which this pattern will be matched against relatively.
  		 */
  var base: java.lang.String = js.native
  /**
  		 * A file glob pattern like `*.{ts,js}` that will be matched on file paths
  		 * relative to the base path.
  		 *
  		 * Example: Given a base of `/home/work/folder` and a file path of `/home/work/folder/index.js`,
  		 * the file glob pattern will match on `index.js`.
  		 */
  var pattern: java.lang.String = js.native
}

