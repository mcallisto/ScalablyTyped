package typings
package debugLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Debug extends js.Object {
  @JSName("debug")
  var debug_Original: debugLib.debugMod.Debug = js.native
  @JSName("default")
  var default_Original: debugLib.debugMod.Debug = js.native
  def debug(namespace: java.lang.String): debugLib.debugMod.Debugger = js.native
  def default(namespace: java.lang.String): debugLib.debugMod.Debugger = js.native
}

