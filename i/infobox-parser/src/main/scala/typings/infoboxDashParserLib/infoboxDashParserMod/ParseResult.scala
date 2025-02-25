package typings
package infoboxDashParserLib.infoboxDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseResult extends js.Object {
  var general: js.Any
  var lists: js.Array[_]
  var tables: js.Array[_]
}

object ParseResult {
  @scala.inline
  def apply(general: js.Any, lists: js.Array[_], tables: js.Array[_]): ParseResult = {
    val __obj = js.Dynamic.literal(general = general, lists = lists, tables = tables)
  
    __obj.asInstanceOf[ParseResult]
  }
}

