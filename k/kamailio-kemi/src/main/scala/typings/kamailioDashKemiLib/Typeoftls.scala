package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeoftls extends js.Object {
  def is_peer_verified(): scala.Double
}

object Typeoftls {
  @scala.inline
  def apply(is_peer_verified: () => scala.Double): Typeoftls = {
    val __obj = js.Dynamic.literal(is_peer_verified = js.Any.fromFunction0(is_peer_verified))
  
    __obj.asInstanceOf[Typeoftls]
  }
}

