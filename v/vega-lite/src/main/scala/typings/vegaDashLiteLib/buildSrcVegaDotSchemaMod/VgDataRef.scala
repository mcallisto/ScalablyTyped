package typings
package vegaDashLiteLib.buildSrcVegaDotSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VgDataRef
  extends _VgNonUnionDomain
     with _VgRange {
  var data: java.lang.String
  var field: VgFieldRef
  var sort: js.UndefOr[VgSortField] = js.undefined
}

object VgDataRef {
  @scala.inline
  def apply(data: java.lang.String, field: VgFieldRef, sort: VgSortField = null): VgDataRef = {
    val __obj = js.Dynamic.literal(data = data, field = field.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort)
    __obj.asInstanceOf[VgDataRef]
  }
}

