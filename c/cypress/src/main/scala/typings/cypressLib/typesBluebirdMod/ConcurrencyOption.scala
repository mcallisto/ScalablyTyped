package typings
package cypressLib.typesBluebirdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConcurrencyOption extends js.Object {
  var concurrency: scala.Double
}

object ConcurrencyOption {
  @scala.inline
  def apply(concurrency: scala.Double): ConcurrencyOption = {
    val __obj = js.Dynamic.literal(concurrency = concurrency)
  
    __obj.asInstanceOf[ConcurrencyOption]
  }
}

