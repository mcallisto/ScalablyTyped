package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotGroupSortValueBucket extends js.Object {
  var buckets: js.UndefOr[js.Array[ExtendedValue]] = js.undefined
  var valuesIndex: js.UndefOr[scala.Double] = js.undefined
}

object PivotGroupSortValueBucket {
  @scala.inline
  def apply(buckets: js.Array[ExtendedValue] = null, valuesIndex: scala.Int | scala.Double = null): PivotGroupSortValueBucket = {
    val __obj = js.Dynamic.literal()
    if (buckets != null) __obj.updateDynamic("buckets")(buckets)
    if (valuesIndex != null) __obj.updateDynamic("valuesIndex")(valuesIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotGroupSortValueBucket]
  }
}

