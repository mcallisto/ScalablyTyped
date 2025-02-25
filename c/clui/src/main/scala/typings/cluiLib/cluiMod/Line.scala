package typings
package cluiLib.cluiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("clui", "Line")
@js.native
/**
  * Create a new instance of Line object
  * @param buffer Object to be used as buffer
  */
class Line () extends js.Object {
  def this(buffer: LineBuffer) = this()
  /**
    * Output text within a column of the specified width
    * @param text Text to print
    * @param width Width of the column
    * @param styles List of `cli-color` styles to apply
    */
  def column(text: java.lang.String, width: scala.Double): Line = js.native
  def column(
    text: java.lang.String,
    width: scala.Double,
    styles: js.Array[cliDashColorLib.cliDashColorMod.Format]
  ): Line = js.native
  /**
    * Return the contents of this line as a string
    */
  def contents(): java.lang.String = js.native
  /**
    * At the end of a line, fill the rest of the columns to the right edge
    */
  def fill(): Line = js.native
  /**
    * Print the generated line of text to the console
    */
  def output(): Line = js.native
  /**
    * Output `width` characters of blank space
    * @param width Number of characters to print
    */
  def padding(width: scala.Double): Line = js.native
  /**
    * Store this line into the buffer
    */
  def store(): scala.Unit = js.native
}

