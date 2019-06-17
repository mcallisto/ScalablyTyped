package typings
package miniprogramDashWxsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// declare var Boolean: BooleanConstructor;
@js.native
trait Number extends js.Object {
  /**
    * Returns a string containing a number represented in exponential notation.
    * @param fractionDigits Number of digits after the decimal point. Must be in the range 0 - 20, inclusive.
    */
  def toExponential(): java.lang.String = js.native
  def toExponential(fractionDigits: scala.Double): java.lang.String = js.native
  /**
    * Returns a string representing a number in fixed-point notation.
    * @param fractionDigits Number of digits after the decimal point. Must be in the range 0 - 20, inclusive.
    */
  def toFixed(): java.lang.String = js.native
  def toFixed(fractionDigits: scala.Double): java.lang.String = js.native
  def toLocaleString(locales: java.lang.String): java.lang.String = js.native
  def toLocaleString(locales: java.lang.String, options: miniprogramDashWxsLib.IntlNs.NumberFormatOptions): java.lang.String = js.native
  def toLocaleString(locales: Array[java.lang.String]): java.lang.String = js.native
  def toLocaleString(locales: Array[java.lang.String], options: miniprogramDashWxsLib.IntlNs.NumberFormatOptions): java.lang.String = js.native
  /**
    * Returns a string containing a number represented either in exponential or fixed-point notation with a specified number of digits.
    * @param precision Number of significant digits. Must be in the range 1 - 21, inclusive.
    */
  def toPrecision(): java.lang.String = js.native
  def toPrecision(precision: scala.Double): java.lang.String = js.native
  def toString(radix: scala.Double): java.lang.String = js.native
}

