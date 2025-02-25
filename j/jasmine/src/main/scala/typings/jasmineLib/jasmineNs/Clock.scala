package typings
package jasmineLib.jasmineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Clock extends js.Object {
  def install(): scala.Unit = js.native
  def mockDate(): scala.Unit = js.native
  def mockDate(date: stdLib.Date): scala.Unit = js.native
  /** Calls to any registered callback are triggered when the clock is ticked forward via the jasmine.clock().tick function, which takes a number of milliseconds. */
  def tick(ms: scala.Double): scala.Unit = js.native
  def uninstall(): scala.Unit = js.native
  def withMock(func: js.Function0[scala.Unit]): scala.Unit = js.native
}

