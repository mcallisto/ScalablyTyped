package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the `format.protection` properties of `getCellProperties`, `getRowProperties`, and `getColumnProperties` or the `format.protection` input parameter of `setCellProperties`, `setRowProperties`, and `setColumnProperties`.
  *
  * [Api set: ExcelApi 1.9]
  */
trait CellPropertiesProtection extends js.Object {
  /**
    *
    * Represents the `format.protection.formulaHidden` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var formulaHidden: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the `format.protection.locked` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var locked: js.UndefOr[scala.Boolean] = js.undefined
}

object CellPropertiesProtection {
  @scala.inline
  def apply(
    formulaHidden: js.UndefOr[scala.Boolean] = js.undefined,
    locked: js.UndefOr[scala.Boolean] = js.undefined
  ): CellPropertiesProtection = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(formulaHidden)) __obj.updateDynamic("formulaHidden")(formulaHidden)
    if (!js.isUndefined(locked)) __obj.updateDynamic("locked")(locked)
    __obj.asInstanceOf[CellPropertiesProtection]
  }
}

