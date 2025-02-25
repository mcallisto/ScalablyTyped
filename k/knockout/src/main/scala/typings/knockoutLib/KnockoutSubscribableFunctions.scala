package typings
package knockoutLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutSubscribableFunctions[T] extends js.Object {
  /**
    * Notify subscribers of knockout "change" event. This doesn't actually change the observable value.
    * @param eventValue A value to be sent with the event.
    * @param event The knockout event.
    */
  def notifySubscribers(): scala.Unit = js.native
  def notifySubscribers(eventValue: T): scala.Unit = js.native
  /**
    * Notify subscribers of a knockout or user defined event.
    * @param eventValue A value to be sent with the event.
    * @param event The knockout or user defined event name.
    */
  def notifySubscribers[U](eventValue: U, event: java.lang.String): scala.Unit = js.native
  @JSName("notifySubscribers")
  def notifySubscribers_change(eventValue: T, event: knockoutLib.knockoutLibStrings.change): scala.Unit = js.native
}

