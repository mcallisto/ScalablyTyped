package typings
package jsonDashToDashAstLib.jsonDashToDashAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Location extends js.Object {
  var end: Position
  var source: java.lang.String | scala.Null
  var start: Position
}

object Location {
  @scala.inline
  def apply(end: Position, start: Position, source: java.lang.String = null): Location = {
    val __obj = js.Dynamic.literal(end = end, start = start)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[Location]
  }
}

