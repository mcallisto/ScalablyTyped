package typings
package atJupyterlabCoreutilsLib.libInterfacesMod.IPollNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Definition of poll state at any given time.
  *
  * @typeparam T - The resolved type of the factory's promises.
  *
  * @typeparam U - The rejected type of the factory's promises.
  *
  * @typeparam V - The type to extend the phases supported by a poll.
  */
trait State[T, U, V /* <: java.lang.String */] extends js.Object {
  /**
    * The number of milliseconds until the current tick resolves.
    */
  val interval: scala.Double
  /**
    * The payload of the last poll resolution or rejection.
    *
    * #### Notes
    * The payload is `null` unless the `phase` is `'reconnected`, `'resolved'`,
    * or `'rejected'`. Its type is `T` for resolutions and `U` for rejections.
    */
  val payload: T | U | scala.Null
  /**
    * The current poll phase.
    */
  val phase: Phase[V]
  /**
    * The timestamp for when this tick was scheduled.
    */
  val timestamp: scala.Double
}

object State {
  @scala.inline
  def apply[T, U, V /* <: java.lang.String */](interval: scala.Double, phase: Phase[V], timestamp: scala.Double, payload: T | U = null): State[T, U, V] = {
    val __obj = js.Dynamic.literal(interval = interval, phase = phase.asInstanceOf[js.Any], timestamp = timestamp)
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[State[T, U, V]]
  }
}

