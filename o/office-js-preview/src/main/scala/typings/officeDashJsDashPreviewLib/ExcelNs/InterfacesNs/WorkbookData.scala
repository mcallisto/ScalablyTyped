package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "workbook.toJSON()". */
trait WorkbookData extends js.Object {
  /**
    *
    * Specifies whether or not the workbook is in autosave mode. Read-Only.
    *
    * [Api set: ExcelApi 1.9]
    */
  var autoSave: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents a collection of bindings that are part of the workbook. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var bindings: js.UndefOr[js.Array[BindingData]] = js.undefined
  /**
    *
    * Returns a number about the version of Excel Calculation Engine. Read-Only.
    *
    * [Api set: ExcelApi 1.9]
    */
  var calculationEngineVersion: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * True if all charts in the workbook are tracking the actual data points to which they are attached.
    False if the charts track the index of the data points.
    *
    * [Api set: ExcelApi 1.9]
    */
  var chartDataPointTrack: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents a collection of Comments associated with the workbook. Read-only.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var comments: js.UndefOr[js.Array[CommentData]] = js.undefined
  /**
    *
    * Represents the collection of custom XML parts contained by this workbook. Read-only.
    *
    * [Api set: ExcelApi 1.5]
    */
  var customXmlParts: js.UndefOr[js.Array[CustomXmlPartData]] = js.undefined
  /**
    *
    * Specifies whether or not changes have been made since the workbook was last saved.
    You can set this property to true if you want to close a modified workbook without either saving it or being prompted to save it.
    *
    * [Api set: ExcelApi 1.9]
    */
  var isDirty: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets the workbook name. Read-only.
    *
    * [Api set: ExcelApi 1.7]
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Represents a collection of workbook scoped named items (named ranges and constants). Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var names: js.UndefOr[js.Array[NamedItemData]] = js.undefined
  /**
    *
    * Represents a collection of PivotTableStyles associated with the workbook. Read-only.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var pivotTableStyles: js.UndefOr[js.Array[PivotTableStyleData]] = js.undefined
  /**
    *
    * Represents a collection of PivotTables associated with the workbook. Read-only.
    *
    * [Api set: ExcelApi 1.3]
    */
  var pivotTables: js.UndefOr[js.Array[PivotTableData]] = js.undefined
  /**
    *
    * Specifies whether or not the workbook has ever been saved locally or online. Read-Only.
    *
    * [Api set: ExcelApi 1.9]
    */
  var previouslySaved: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets the workbook properties. Read-only.
    *
    * [Api set: ExcelApi 1.7]
    */
  var properties: js.UndefOr[DocumentPropertiesData] = js.undefined
  /**
    *
    * Returns workbook protection object for a workbook. Read-only.
    *
    * [Api set: ExcelApi 1.7]
    */
  var protection: js.UndefOr[WorkbookProtectionData] = js.undefined
  /**
    *
    * True if the workbook is open in Read-only mode. Read-only.
    *
    * [Api set: ExcelApi 1.8]
    */
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents a collection of Settings associated with the workbook. Read-only.
    *
    * [Api set: ExcelApi 1.4]
    */
  var settings: js.UndefOr[js.Array[SettingData]] = js.undefined
  /**
    *
    * Represents a collection of SlicerStyles associated with the workbook. Read-only.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var slicerStyles: js.UndefOr[js.Array[SlicerStyleData]] = js.undefined
  /**
    *
    * Represents a collection of Slicers associated with the workbook. Read-only.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var slicers: js.UndefOr[js.Array[SlicerData]] = js.undefined
  /**
    *
    * Represents a collection of styles associated with the workbook. Read-only.
    *
    * [Api set: ExcelApi 1.7]
    */
  var styles: js.UndefOr[js.Array[StyleData]] = js.undefined
  /**
    *
    * Represents a collection of TableStyles associated with the workbook. Read-only.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var tableStyles: js.UndefOr[js.Array[TableStyleData]] = js.undefined
  /**
    *
    * Represents a collection of tables associated with the workbook. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var tables: js.UndefOr[js.Array[TableData]] = js.undefined
  /**
    *
    * Represents a collection of TimelineStyles associated with the workbook. Read-only.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var timelineStyles: js.UndefOr[js.Array[TimelineStyleData]] = js.undefined
  /**
    *
    * True if the workbook uses the 1904 date system.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var use1904DateSystem: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * True if calculations in this workbook will be done using only the precision of the numbers as they're displayed.
    Data will permanently lose accuracy when switching this property from false to true.
    *
    * [Api set: ExcelApi 1.9]
    */
  var usePrecisionAsDisplayed: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents a collection of worksheets associated with the workbook. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var worksheets: js.UndefOr[js.Array[WorksheetData]] = js.undefined
}

object WorkbookData {
  @scala.inline
  def apply(
    autoSave: js.UndefOr[scala.Boolean] = js.undefined,
    bindings: js.Array[BindingData] = null,
    calculationEngineVersion: scala.Int | scala.Double = null,
    chartDataPointTrack: js.UndefOr[scala.Boolean] = js.undefined,
    comments: js.Array[CommentData] = null,
    customXmlParts: js.Array[CustomXmlPartData] = null,
    isDirty: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    names: js.Array[NamedItemData] = null,
    pivotTableStyles: js.Array[PivotTableStyleData] = null,
    pivotTables: js.Array[PivotTableData] = null,
    previouslySaved: js.UndefOr[scala.Boolean] = js.undefined,
    properties: DocumentPropertiesData = null,
    protection: WorkbookProtectionData = null,
    readOnly: js.UndefOr[scala.Boolean] = js.undefined,
    settings: js.Array[SettingData] = null,
    slicerStyles: js.Array[SlicerStyleData] = null,
    slicers: js.Array[SlicerData] = null,
    styles: js.Array[StyleData] = null,
    tableStyles: js.Array[TableStyleData] = null,
    tables: js.Array[TableData] = null,
    timelineStyles: js.Array[TimelineStyleData] = null,
    use1904DateSystem: js.UndefOr[scala.Boolean] = js.undefined,
    usePrecisionAsDisplayed: js.UndefOr[scala.Boolean] = js.undefined,
    worksheets: js.Array[WorksheetData] = null
  ): WorkbookData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoSave)) __obj.updateDynamic("autoSave")(autoSave)
    if (bindings != null) __obj.updateDynamic("bindings")(bindings)
    if (calculationEngineVersion != null) __obj.updateDynamic("calculationEngineVersion")(calculationEngineVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(chartDataPointTrack)) __obj.updateDynamic("chartDataPointTrack")(chartDataPointTrack)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (customXmlParts != null) __obj.updateDynamic("customXmlParts")(customXmlParts)
    if (!js.isUndefined(isDirty)) __obj.updateDynamic("isDirty")(isDirty)
    if (name != null) __obj.updateDynamic("name")(name)
    if (names != null) __obj.updateDynamic("names")(names)
    if (pivotTableStyles != null) __obj.updateDynamic("pivotTableStyles")(pivotTableStyles)
    if (pivotTables != null) __obj.updateDynamic("pivotTables")(pivotTables)
    if (!js.isUndefined(previouslySaved)) __obj.updateDynamic("previouslySaved")(previouslySaved)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (protection != null) __obj.updateDynamic("protection")(protection)
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (settings != null) __obj.updateDynamic("settings")(settings)
    if (slicerStyles != null) __obj.updateDynamic("slicerStyles")(slicerStyles)
    if (slicers != null) __obj.updateDynamic("slicers")(slicers)
    if (styles != null) __obj.updateDynamic("styles")(styles)
    if (tableStyles != null) __obj.updateDynamic("tableStyles")(tableStyles)
    if (tables != null) __obj.updateDynamic("tables")(tables)
    if (timelineStyles != null) __obj.updateDynamic("timelineStyles")(timelineStyles)
    if (!js.isUndefined(use1904DateSystem)) __obj.updateDynamic("use1904DateSystem")(use1904DateSystem)
    if (!js.isUndefined(usePrecisionAsDisplayed)) __obj.updateDynamic("usePrecisionAsDisplayed")(usePrecisionAsDisplayed)
    if (worksheets != null) __obj.updateDynamic("worksheets")(worksheets)
    __obj.asInstanceOf[WorkbookData]
  }
}

