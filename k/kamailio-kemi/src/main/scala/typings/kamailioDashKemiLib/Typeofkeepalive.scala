package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofkeepalive extends js.Object {
  def is_alive(dest: java.lang.String): scala.Double
}

object Typeofkeepalive {
  @scala.inline
  def apply(is_alive: java.lang.String => scala.Double): Typeofkeepalive = {
    val __obj = js.Dynamic.literal(is_alive = js.Any.fromFunction1(is_alive))
  
    __obj.asInstanceOf[Typeofkeepalive]
  }
}

