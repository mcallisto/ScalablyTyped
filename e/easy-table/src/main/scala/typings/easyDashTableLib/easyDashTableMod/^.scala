package typings
package easyDashTableLib.easyDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("easy-table", JSImport.Namespace)
@js.native
class ^ () extends EasyTable

@JSImport("easy-table", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Predefined helpers for totals
    */
  var aggr: Aggregators = js.native
  @JSName("padLeft")
  var padLeft_Original: CellPrinter[java.lang.String] = js.native
  /**
    * Create a printer which right aligns the content by padding with `ch` on the left
    *
    * @param {String} ch
    * @returns {Function}
    */
  def leftPadder[T](ch: java.lang.String): CellPrinter[T] = js.native
  /**
    * Same as `Table.print()` but yields the result to `console.log()`
    */
  def log[T](obj: T): scala.Unit = js.native
  def log[T](obj: T, format: FormatFunction[T]): scala.Unit = js.native
  def log[T](obj: T, format: FormatFunction[T], cb: TablePostProcessing): scala.Unit = js.native
  def log[T](obj: T, format: FormatObject): scala.Unit = js.native
  def log[T](obj: T, format: FormatObject, cb: TablePostProcessing): scala.Unit = js.native
  def log[T](obj: js.Array[T]): scala.Unit = js.native
  def log[T](obj: js.Array[T], format: FormatFunction[T]): scala.Unit = js.native
  def log[T](obj: js.Array[T], format: FormatFunction[T], cb: TablePostProcessing): scala.Unit = js.native
  def log[T](obj: js.Array[T], format: FormatObject): scala.Unit = js.native
  def log[T](obj: js.Array[T], format: FormatObject, cb: TablePostProcessing): scala.Unit = js.native
  // public static padRight: CellPrinter<string>;
  /**
    * Create a printer for numbers
    *
    * Will do right alignment and optionally fix the number of digits after decimal point
    *
    * @param {Number} [digits] - Number of digits for fixpoint notation
    * @returns {Function}
    */
  def number(): CellPrinter[scala.Double] = js.native
  def number(digits: scala.Double): CellPrinter[scala.Double] = js.native
  def padLeft(`val`: java.lang.String, width: scala.Double): java.lang.String = js.native
  /**
    * Print the array or object
    *
    * @param {Array|Object} obj - Object to print
    * @param {Function|Object} [format] - Format options
    * @param {Function} [cb] - Table post processing and formating
    * @returns {String}
    */
  def print[T](obj: T): java.lang.String = js.native
  def print[T](obj: T, format: FormatFunction[T]): java.lang.String = js.native
  def print[T](obj: T, format: FormatFunction[T], cb: TablePostProcessing): java.lang.String = js.native
  def print[T](obj: T, format: FormatObject): java.lang.String = js.native
  def print[T](obj: T, format: FormatObject, cb: TablePostProcessing): java.lang.String = js.native
  def print[T](obj: js.Array[T]): java.lang.String = js.native
  def print[T](obj: js.Array[T], format: FormatFunction[T]): java.lang.String = js.native
  def print[T](obj: js.Array[T], format: FormatFunction[T], cb: TablePostProcessing): java.lang.String = js.native
  def print[T](obj: js.Array[T], format: FormatObject): java.lang.String = js.native
  def print[T](obj: js.Array[T], format: FormatObject, cb: TablePostProcessing): java.lang.String = js.native
  /**
    * Create a printer which pads with `ch` on the right
    *
    * @param {String} ch
    * @returns {Function}
    */
  def rightPadder[T](ch: java.lang.String): CellPrinter[T] = js.native
  /**
    * Default printer
    */
  def string(value: js.Any): java.lang.String = js.native
}

