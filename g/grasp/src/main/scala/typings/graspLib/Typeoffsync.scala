package typings
package graspLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeoffsync extends js.Object {
  /**
    * Asynchronous fsync(2) - synchronize a file's in-core state with the underlying storage device.
    * @param fd A file descriptor.
    */
  def __promisify__(fd: scala.Double): js.Promise[scala.Unit]
}

object Typeoffsync {
  @scala.inline
  def apply(__promisify__ : scala.Double => js.Promise[scala.Unit]): Typeoffsync = {
    val __obj = js.Dynamic.literal(__promisify__ = js.Any.fromFunction1(__promisify__))
  
    __obj.asInstanceOf[Typeoffsync]
  }
}

