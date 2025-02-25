package typings
package sharepointLib.SPNs.JsGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.JsGrid.ColumnInfo")
@js.native
class ColumnInfo protected () extends js.Object {
  def this(name: java.lang.String, imgSrc: java.lang.String, key: java.lang.String, width: scala.Double) = this()
  var bOpenMenuOnContentClick: scala.Boolean = js.native
  /** Column identifier */
  var columnKey: java.lang.String = js.native
  /** Field keys of the fields, that are displayed in this column */
  var fieldKeys: js.Array[java.lang.String] = js.native
  /** Custom image HTML.
    If you define this in addition to the imgSrc attribute, then instead of standard img tag
    the custom HTML defined by this field will be used. */
  var imgRawSrc: java.lang.String = js.native
  /** Column image URL.
    If not null, the column header cell will show the image instead of title text.
    If the title is defined at the same time as the imgSrc, the title will be shown as a tooltip. */
  var imgSrc: java.lang.String = js.native
  /** true by default */
  var isAutoFilterable: scala.Boolean = js.native
  /** false by default */
  var isFooter: scala.Boolean = js.native
  /** true by default */
  var isHidable: scala.Boolean = js.native
  /** true by default */
  var isResizable: scala.Boolean = js.native
  /** true by default */
  var isSortable: scala.Boolean = js.native
  /** true by default */
  var isVisible: scala.Boolean = js.native
  /** Column title */
  var name: java.lang.String = js.native
  /** Width of the column */
  var width: scala.Double = js.native
  /** always returns 'column' */
  def ColumnType(): java.lang.String = js.native
  /** this is used when you need to make some of the cells in the column readonly, but at the same time keep others editable */
  def fnGetCellEditMode(record: IRecord, fieldKey: java.lang.String): EditMode = js.native
  /** this function should return id of the style for the given cell in the column
    styles and their ids are registered for a JsGridControl via jsGridParams.styleManager.RegisterCellStyle method */
  def fnGetCellStyleId(record: IRecord, fieldKey: java.lang.String, dataValue: js.Any): java.lang.String = js.native
  /** this function should return name of the display control for the given cell in the column
    the name should be previously associated with the display control via SP.JsGrid.PropertyType.Utils.RegisterDisplayControl method */
  def fnGetDisplayControlName(record: IRecord, fieldKey: java.lang.String): java.lang.String = js.native
  /** this function should return name of the edit control for the given cell in the column
    the name should be previously associated with the edit control via SP.JsGrid.PropertyType.Utils.RegisterEditControl method */
  def fnGetEditControlName(record: IRecord, fieldKey: java.lang.String): java.lang.String = js.native
  /** set custom tooltip for the given cell in the column. by default, localized value is displayed as the tooltip */
  def fnGetSingleValueTooltip(record: IRecord, fieldKey: java.lang.String, dataValue: js.Any, localizedValue: js.Any): java.lang.String = js.native
  /** set widget control names for a particular cell
    widgets are basically in-cell buttons with associated popup controls, e.g. date selector or address book button
    standard widget ids are defined in the SP.JsGrid.WidgetControl.Type enumeration
    it is also possible to create your own widgets
    usually this function is not used, and instead, widget control names are determined via PropertyType
    */
  def fnGetWidgetControlNames(record: IRecord, fieldKey: java.lang.String): js.Array[java.lang.String] = js.native
  /** determine whether the cells in this column should be clickable */
  def fnShouldLinkSingleValue(record: IRecord, fieldKey: java.lang.String, dataValue: js.Any, localizedValue: js.Any): scala.Boolean = js.native
  /** if a particular cell is determined as clickable by fnShouldLinkSingleValue, this function will be called when the cell is clicked */
  def fnSingleValueClicked(record: IRecord, fieldKey: java.lang.String, dataValue: js.Any, localizedValue: js.Any): scala.Unit = js.native
}

