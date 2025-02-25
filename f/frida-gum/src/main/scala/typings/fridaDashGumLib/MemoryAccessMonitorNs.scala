package typings
package fridaDashGumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Monitors one or more memory ranges for access, and notifies on the first
  * access of each contained memory page.
  *
  * Only available on Windows for now. We would love to support this on the other
  * platforms too, so if you find this useful and would like to help out, please
  * get in touch.
  */
@JSGlobal("MemoryAccessMonitor")
@js.native
object MemoryAccessMonitorNs extends js.Object {
  /**
    * Stops monitoring the remaining memory ranges passed to
    * `MemoryAccessMonitor.enable()`.
    */
  def disable(): scala.Unit = js.native
  /**
    * Starts monitoring one or more memory ranges for access, and notifies on
    * the first access of each contained memory page.
    *
    * @param ranges One or more ranges to monitor.
    * @param callbacks Callbacks to be notified on access.
    */
  def enable(ranges: fridaDashGumLib.MemoryAccessRange, callbacks: fridaDashGumLib.MemoryAccessCallbacks): scala.Unit = js.native
  def enable(
    ranges: js.Array[fridaDashGumLib.MemoryAccessRange],
    callbacks: fridaDashGumLib.MemoryAccessCallbacks
  ): scala.Unit = js.native
}

