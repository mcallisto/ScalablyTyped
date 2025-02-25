package typings
package atJupyterlabCoreutilsLib.libActivitymonitorMod.ActivityMonitorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to construct a new `ActivityMonitor`.
  */
trait IOptions[Sender, Args] extends js.Object {
  /**
    * The signal to monitor.
    */
  var signal: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[Sender, Args]
  /**
    * The activity timeout in milliseconds.
    *
    * The default is 1 second.
    */
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object IOptions {
  @scala.inline
  def apply[Sender, Args](
    signal: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[Sender, Args],
    timeout: scala.Int | scala.Double = null
  ): IOptions[Sender, Args] = {
    val __obj = js.Dynamic.literal(signal = signal)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions[Sender, Args]]
  }
}

