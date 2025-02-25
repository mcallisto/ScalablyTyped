package typings
package ejDotWebDotAllLib.ejNs.PivotTreeMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceFilter extends js.Object {
  /** Allows the user to bind the item by using its unique name as field name.
    */
  var fieldName: js.UndefOr[java.lang.String] = js.undefined
  /** Applies filter to the field members.
    * @Default {null}
    */
  var filterItems: js.UndefOr[DataSourceFiltersFilterItems] = js.undefined
}

object DataSourceFilter {
  @scala.inline
  def apply(fieldName: java.lang.String = null, filterItems: DataSourceFiltersFilterItems = null): DataSourceFilter = {
    val __obj = js.Dynamic.literal()
    if (fieldName != null) __obj.updateDynamic("fieldName")(fieldName)
    if (filterItems != null) __obj.updateDynamic("filterItems")(filterItems)
    __obj.asInstanceOf[DataSourceFilter]
  }
}

