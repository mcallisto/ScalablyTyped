package typings
package easyDashTableLib.easyDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Aggregators extends js.Object {
  /**
    * Average reduction
    */
  var avg: js.Any
  /**
    * Sum reduction
    */
  var sum: js.Any
  /**
    * Create a printer which formats the value with `printer`,
    * adds the `prefix` to it and right aligns the whole thing
    *
    * @param {String} prefix
    * @param {Function} printer
    * @returns {printer}
    */
  def printer[T](prefix: java.lang.String, printer: CellPrinter[T]): CellPrinter[T]
}

object Aggregators {
  @scala.inline
  def apply(avg: js.Any, printer: (java.lang.String, CellPrinter[js.Any]) => CellPrinter[js.Any], sum: js.Any): Aggregators = {
    val __obj = js.Dynamic.literal(avg = avg, printer = js.Any.fromFunction2(printer), sum = sum)
  
    __obj.asInstanceOf[Aggregators]
  }
}

