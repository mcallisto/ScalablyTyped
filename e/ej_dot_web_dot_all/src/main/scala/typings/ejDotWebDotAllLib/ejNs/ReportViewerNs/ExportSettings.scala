package typings
package ejDotWebDotAllLib.ejNs.ReportViewerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportSettings extends js.Object {
  /** Add the custom icon item to the export options.
    * @Default {empty}
    */
  var customItems: js.UndefOr[js.Array[_]] = js.undefined
  /** Specifies the excel export format.
    * @Default {ej.ReportViewer.ExcelFormats.Excel97to2003}
    */
  var excelFormat: js.UndefOr[ExcelFormats | java.lang.String] = js.undefined
  /** Specifies the export formats.
    * @Default {ej.ReportViewer.ExportOptions.All}
    */
  var exportOptions: js.UndefOr[ExportOptions | java.lang.String] = js.undefined
  /** Specifies the word export format.
    * @Default {ej.ReportViewer.WordFormats.Doc}
    */
  var wordFormat: js.UndefOr[WordFormats | java.lang.String] = js.undefined
}

object ExportSettings {
  @scala.inline
  def apply(
    customItems: js.Array[_] = null,
    excelFormat: ExcelFormats | java.lang.String = null,
    exportOptions: ExportOptions | java.lang.String = null,
    wordFormat: WordFormats | java.lang.String = null
  ): ExportSettings = {
    val __obj = js.Dynamic.literal()
    if (customItems != null) __obj.updateDynamic("customItems")(customItems)
    if (excelFormat != null) __obj.updateDynamic("excelFormat")(excelFormat.asInstanceOf[js.Any])
    if (exportOptions != null) __obj.updateDynamic("exportOptions")(exportOptions.asInstanceOf[js.Any])
    if (wordFormat != null) __obj.updateDynamic("wordFormat")(wordFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportSettings]
  }
}

