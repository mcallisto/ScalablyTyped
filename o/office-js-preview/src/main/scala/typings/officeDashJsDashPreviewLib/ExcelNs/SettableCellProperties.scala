package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the input parameter of setCellProperties.
  *
  * [Api set: ExcelApi 1.9]
  */
trait SettableCellProperties extends js.Object {
  /**
    *
    * Represents the `format` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var format: js.UndefOr[CellPropertiesFormat] = js.undefined
  /**
    *
    * Represents the `hyperlink` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var hyperlink: js.UndefOr[RangeHyperlink] = js.undefined
  /**
    *
    * Represents the `style` property.
    *
    * [Api set: ExcelApi 1.9]
    */
  var style: js.UndefOr[java.lang.String] = js.undefined
}

object SettableCellProperties {
  @scala.inline
  def apply(
    format: CellPropertiesFormat = null,
    hyperlink: RangeHyperlink = null,
    style: java.lang.String = null
  ): SettableCellProperties = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format)
    if (hyperlink != null) __obj.updateDynamic("hyperlink")(hyperlink)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[SettableCellProperties]
  }
}

