package typings
package gapiDotClientDotSpannerLib.gapiNs.clientNs.spannerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Write extends js.Object {
  /**
    * The names of the columns in table to be written.
    *
    * The list of columns must contain enough columns to allow
    * Cloud Spanner to derive values for all primary key columns in the
    * row(s) to be modified.
    */
  var columns: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Required. The table whose rows will be written. */
  var table: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The values to be written. `values` can contain more than one
    * list of values. If it does, then multiple rows are written, one
    * for each entry in `values`. Each list in `values` must have
    * exactly as many entries as there are entries in columns
    * above. Sending multiple lists is equivalent to sending multiple
    * `Mutation`s, each containing one `values` entry and repeating
    * table and columns. Individual values in each list are
    * encoded as described here.
    */
  var values: js.UndefOr[js.Array[js.Array[_]]] = js.undefined
}

object Write {
  @scala.inline
  def apply(
    columns: js.Array[java.lang.String] = null,
    table: java.lang.String = null,
    values: js.Array[js.Array[_]] = null
  ): Write = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (table != null) __obj.updateDynamic("table")(table)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[Write]
  }
}

