package typings
package ejDotWebDotAllLib.ejNs.PivotClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceRowsFilterItems extends js.Object {
  /** Sets the type of filter whether to include/exclude the mentioned values.
    * @Default {ej.PivotAnalysis.FilterType.Exclude}
    */
  var filterType: js.UndefOr[ejDotWebDotAllLib.ejNs.PivotAnalysisNs.FilterType | java.lang.String] = js.undefined
  /** Contains the collection of items to be included/excluded among the field members.
    * @Default {[]}
    */
  var values: js.UndefOr[js.Array[_]] = js.undefined
}

object DataSourceRowsFilterItems {
  @scala.inline
  def apply(
    filterType: ejDotWebDotAllLib.ejNs.PivotAnalysisNs.FilterType | java.lang.String = null,
    values: js.Array[_] = null
  ): DataSourceRowsFilterItems = {
    val __obj = js.Dynamic.literal()
    if (filterType != null) __obj.updateDynamic("filterType")(filterType.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[DataSourceRowsFilterItems]
  }
}

