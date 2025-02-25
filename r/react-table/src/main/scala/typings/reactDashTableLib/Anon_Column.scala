package typings
package reactDashTableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Column extends js.Object {
  var column: reactDashTableLib.reactDashTableMod.Column[_]
  var filter: js.Any
  var key: js.UndefOr[java.lang.String] = js.undefined
  var onChange: reactDashTableLib.reactDashTableMod.ReactTableFunction
}

object Anon_Column {
  @scala.inline
  def apply(
    column: reactDashTableLib.reactDashTableMod.Column[_],
    filter: js.Any,
    onChange: reactDashTableLib.reactDashTableMod.ReactTableFunction,
    key: java.lang.String = null
  ): Anon_Column = {
    val __obj = js.Dynamic.literal(column = column, filter = filter, onChange = onChange)
    if (key != null) __obj.updateDynamic("key")(key)
    __obj.asInstanceOf[Anon_Column]
  }
}

