package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BorderedDataSourceFalse extends js.Object {
  var bordered: scala.Boolean
  var dataSource: js.Array[scala.Nothing]
  var loading: scala.Boolean
  var pagination: js.UndefOr[
    antdLib.antdLibNumbers.`false` | antdLib.libPaginationPaginationMod.PaginationConfig
  ] = js.undefined
  var split: scala.Boolean
}

object Anon_BorderedDataSourceFalse {
  @scala.inline
  def apply(
    bordered: scala.Boolean,
    dataSource: js.Array[scala.Nothing],
    loading: scala.Boolean,
    split: scala.Boolean,
    pagination: antdLib.antdLibNumbers.`false` | antdLib.libPaginationPaginationMod.PaginationConfig = null
  ): Anon_BorderedDataSourceFalse = {
    val __obj = js.Dynamic.literal(bordered = bordered, dataSource = dataSource, loading = loading, split = split)
    if (pagination != null) __obj.updateDynamic("pagination")(pagination.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BorderedDataSourceFalse]
  }
}

