package typings
package mockDashRafLib.mockDashRafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Creates a mockRaf instance, exposing the functions you'll use to interact with the mock. */
@js.native
trait Creator extends js.Object {
  /** Replacement for cancelAnimationFrame or a polyfill.Removes all currently scheduled requestAnimationFrame callbacks from the queue. */
  def cancel(handle: scala.Double): scala.Unit = js.native
  /**
    * Returns the current now value of the mock. Starts at 0 and increases with each step() taken.
    * Useful for stubbing out performance.now() or a polyfill when using requestAnimationFrame with timers.
    */
  def now(): scala.Double = js.native
  /** Replacement for requestAnimationFrame or a polyfill.Adds a callback to be fired on the next step. */
  def raf(callback: stdLib.FrameRequestCallback): scala.Double = js.native
  /** Takes requestAnimationFrame steps. Fires currently queued callbacks for each step and increments now time for each step. The primary way to interact with a mockRaf instance for testing. */
  def step(): scala.Unit = js.native
  def step(options: Options): scala.Unit = js.native
}

