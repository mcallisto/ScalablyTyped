package typings
package baseuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Close extends js.Object {
  def close(): scala.Unit
}

object Anon_Close {
  @scala.inline
  def apply(close: () => scala.Unit): Anon_Close = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close))
  
    __obj.asInstanceOf[Anon_Close]
  }
}

