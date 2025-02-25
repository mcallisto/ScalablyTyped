package typings
package stripeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Day extends js.Object {
  /**
    * The day of birth, between 1 and 31.
    */
  var day: scala.Double
  /**
    * The month of birth, between 1 and 12.
    */
  var month: scala.Double
  /**
    * The four-digit year of birth.
    */
  var year: scala.Double
}

object Anon_Day {
  @scala.inline
  def apply(day: scala.Double, month: scala.Double, year: scala.Double): Anon_Day = {
    val __obj = js.Dynamic.literal(day = day, month = month, year = year)
  
    __obj.asInstanceOf[Anon_Day]
  }
}

