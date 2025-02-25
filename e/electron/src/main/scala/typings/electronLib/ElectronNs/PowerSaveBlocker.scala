package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PowerSaveBlocker extends EventEmitter {
  // Docs: http://electronjs.org/docs/api/power-save-blocker
  def isStarted(id: scala.Double): scala.Boolean = js.native
  /**
    * Starts preventing the system from entering lower-power mode. Returns an integer
    * identifying the power save blocker. Note: prevent-display-sleep has higher
    * precedence over prevent-app-suspension. Only the highest precedence type takes
    * effect. In other words, prevent-display-sleep always takes precedence over
    * prevent-app-suspension. For example, an API calling A requests for
    * prevent-app-suspension, and another calling B requests for
    * prevent-display-sleep. prevent-display-sleep will be used until B stops its
    * request. After that, prevent-app-suspension is used.
    */
  @JSName("start")
  def start_preventappsuspension(`type`: electronLib.electronLibStrings.`prevent-app-suspension`): scala.Double = js.native
  @JSName("start")
  def start_preventdisplaysleep(`type`: electronLib.electronLibStrings.`prevent-display-sleep`): scala.Double = js.native
  /**
    * Stops the specified power save blocker.
    */
  def stop(id: scala.Double): scala.Unit = js.native
}

