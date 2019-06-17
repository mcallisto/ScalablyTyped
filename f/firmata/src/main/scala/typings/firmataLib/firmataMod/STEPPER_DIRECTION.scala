package typings
package firmataLib.firmataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/firmata/firmata.js/blob/v0.15.0/lib/firmata.js#L485-L488
/* Rewritten from type alias, can be one of: 
  - firmataLib.firmataLibNumbers.`0`
  - firmataLib.firmataLibNumbers.`1`
*/
trait STEPPER_DIRECTION extends js.Object

object STEPPER_DIRECTION {
  @scala.inline
  def CCW: firmataLib.firmataLibNumbers.`0` = this.cast(0)
  @scala.inline
  def CW: firmataLib.firmataLibNumbers.`1` = this.cast(1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

