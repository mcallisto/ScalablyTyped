package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "pivotTableStyle.toJSON()". */
trait PivotTableStyleData extends js.Object {
  /**
    *
    * Gets the name of the PivotTableStyle.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Specifies if this PivotTableStyle object is read-only. Read-only.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
}

object PivotTableStyleData {
  @scala.inline
  def apply(name: java.lang.String = null, readOnly: js.UndefOr[scala.Boolean] = js.undefined): PivotTableStyleData = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    __obj.asInstanceOf[PivotTableStyleData]
  }
}

