package typings
package linearDashGradientLib.linearDashGradientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Gradient extends js.Object {
  /**
    * the input value should be normalized to the range between 0 and 1
    */
  def calcArray(normalizedPercent: scala.Double): Color
  /**
    * the input value should be normalized to the range between 0 and 1
    */
  def calcHex(normalizedPrecent: scala.Double): java.lang.String
}

object Gradient {
  @scala.inline
  def apply(calcArray: scala.Double => Color, calcHex: scala.Double => java.lang.String): Gradient = {
    val __obj = js.Dynamic.literal(calcArray = js.Any.fromFunction1(calcArray), calcHex = js.Any.fromFunction1(calcHex))
  
    __obj.asInstanceOf[Gradient]
  }
}

