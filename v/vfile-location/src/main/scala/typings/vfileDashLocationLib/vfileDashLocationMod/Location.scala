package typings
package vfileDashLocationLib.vfileDashLocationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Location extends js.Object {
  /**
    * Get the `offset` (`number`) for a line and column-based `position` in the bound file.
    * Returns `-1` when given invalid or out of bounds input.
    */
  def toOffset(position: vfileDashLocationLib.Anon_Column): scala.Double
  /**
    * Get the line and column-based `position` for `offset` in the bound file.
    */
  def toPosition(offset: scala.Double): vfileDashLocationLib.Anon_ColumnLine
}

object Location {
  @scala.inline
  def apply(
    toOffset: vfileDashLocationLib.Anon_Column => scala.Double,
    toPosition: scala.Double => vfileDashLocationLib.Anon_ColumnLine
  ): Location = {
    val __obj = js.Dynamic.literal(toOffset = js.Any.fromFunction1(toOffset), toPosition = js.Any.fromFunction1(toPosition))
  
    __obj.asInstanceOf[Location]
  }
}

