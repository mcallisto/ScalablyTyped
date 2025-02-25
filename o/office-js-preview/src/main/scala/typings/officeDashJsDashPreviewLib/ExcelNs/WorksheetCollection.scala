package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a collection of worksheet objects that are part of the workbook.
  *
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.WorksheetCollection")
@js.native
class WorksheetCollection ()
  extends officeDashJsDashPreviewLib.OfficeExtensionNs.ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_WorksheetCollection: RequestContext = js.native
  /** Gets the loaded child items in this collection. */
  val items: js.Array[Worksheet] = js.native
  /**
    *
    * Occurs when any worksheet in the workbook is activated.
    *
    * [Api set: ExcelApi 1.7]
    *
    * @eventproperty
    */
  val onActivated: officeDashJsDashPreviewLib.OfficeExtensionNs.EventHandlers[WorksheetActivatedEventArgs] = js.native
  /**
    *
    * Occurs when a new worksheet is added to the workbook.
    *
    * [Api set: ExcelApi 1.7]
    *
    * @eventproperty
    */
  val onAdded: officeDashJsDashPreviewLib.OfficeExtensionNs.EventHandlers[WorksheetAddedEventArgs] = js.native
  /**
    *
    * Occurs when any worksheet in the workbook is calculated.
    *
    * [Api set: ExcelApi 1.8]
    *
    * @eventproperty
    */
  val onCalculated: officeDashJsDashPreviewLib.OfficeExtensionNs.EventHandlers[WorksheetCalculatedEventArgs] = js.native
  /**
    *
    * Occurs when any worksheet in the workbook is changed.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @eventproperty
    */
  val onChanged: officeDashJsDashPreviewLib.OfficeExtensionNs.EventHandlers[WorksheetChangedEventArgs] = js.native
  /**
    *
    * Occurs when sorting on columns.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    *
    * @eventproperty
    * @beta
    */
  val onColumnSorted: officeDashJsDashPreviewLib.OfficeExtensionNs.EventHandlers[WorksheetColumnSortedEventArgs] = js.native
  /**
    *
    * Occurs when any worksheet in the workbook is deactivated.
    *
    * [Api set: ExcelApi 1.7]
    *
    * @eventproperty
    */
  val onDeactivated: officeDashJsDashPreviewLib.OfficeExtensionNs.EventHandlers[WorksheetDeactivatedEventArgs] = js.native
  /**
    *
    * Occurs when a worksheet is deleted from the workbook.
    *
    * [Api set: ExcelApi 1.7]
    *
    * @eventproperty
    */
  val onDeleted: officeDashJsDashPreviewLib.OfficeExtensionNs.EventHandlers[WorksheetDeletedEventArgs] = js.native
  /**
    *
    * Occurs when any worksheet's filter is applied in the workbook.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    *
    * @eventproperty
    * @beta
    */
  val onFiltered: officeDashJsDashPreviewLib.OfficeExtensionNs.EventHandlers[WorksheetFilteredEventArgs] = js.native
  /**
    *
    * Occurs when any worksheet in the workbook has format changed.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @eventproperty
    */
  val onFormatChanged: officeDashJsDashPreviewLib.OfficeExtensionNs.EventHandlers[WorksheetFormatChangedEventArgs] = js.native
  /**
    *
    * Occurs when any worksheet in the workbook has row hidden state changed.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    *
    * @eventproperty
    * @beta
    */
  val onRowHiddenChanged: officeDashJsDashPreviewLib.OfficeExtensionNs.EventHandlers[WorksheetRowHiddenChangedEventArgs] = js.native
  /**
    *
    * Occurs when sorting on rows.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    *
    * @eventproperty
    * @beta
    */
  val onRowSorted: officeDashJsDashPreviewLib.OfficeExtensionNs.EventHandlers[WorksheetRowSortedEventArgs] = js.native
  /**
    *
    * Occurs when the selection changes on any worksheet.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @eventproperty
    */
  val onSelectionChanged: officeDashJsDashPreviewLib.OfficeExtensionNs.EventHandlers[WorksheetSelectionChangedEventArgs] = js.native
  /**
    *
    * Occurs when left-clicked/tapped operation happens in the worksheet collection.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    *
    * @eventproperty
    * @beta
    */
  val onSingleClicked: officeDashJsDashPreviewLib.OfficeExtensionNs.EventHandlers[WorksheetSingleClickedEventArgs] = js.native
  /**
    *
    * Adds a new worksheet to the workbook. The worksheet will be added at the end of existing worksheets. If you wish to activate the newly added worksheet, call ".activate() on it.
    *
    * [Api set: ExcelApi 1.1]
    *
    * @param name Optional. The name of the worksheet to be added. If specified, name should be unqiue. If not specified, Excel determines the name of the new worksheet.
    */
  def add(): Worksheet = js.native
  def add(name: java.lang.String): Worksheet = js.native
  /**
    *
    * Inserts the specified worksheets of a workbook into the current workbook.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param base64File Required. The base64-encoded string representing the source workbook file.
    * @param sheetNamesToInsert Optional. The names of individual worksheets to insert. By default, all the worksheets from the source workbook are inserted.
    * @param positionType Optional. Where in the current workbook the new worksheets will be inserted. See Excel.WorksheetPositionType for details. Default is "Start".
    * @param relativeTo Optional. The worksheet in the current workbook that is referenced for the positionType parameter. Default is null and, based on positionType, it will insert worksheets at the start or end of the current workbook.
    * @returns An array of ids corresponding to each newly inserted worksheet.
    */
  def addFromBase64(base64File: java.lang.String): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[js.Array[java.lang.String]] = js.native
  def addFromBase64(base64File: java.lang.String, sheetNamesToInsert: js.Array[java.lang.String]): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[js.Array[java.lang.String]] = js.native
  def addFromBase64(
    base64File: java.lang.String,
    sheetNamesToInsert: js.Array[java.lang.String],
    positionType: WorksheetPositionType
  ): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[js.Array[java.lang.String]] = js.native
  def addFromBase64(
    base64File: java.lang.String,
    sheetNamesToInsert: js.Array[java.lang.String],
    positionType: WorksheetPositionType,
    relativeTo: java.lang.String
  ): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[js.Array[java.lang.String]] = js.native
  def addFromBase64(
    base64File: java.lang.String,
    sheetNamesToInsert: js.Array[java.lang.String],
    positionType: WorksheetPositionType,
    relativeTo: Worksheet
  ): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[js.Array[java.lang.String]] = js.native
  @JSName("addFromBase64")
  def addFromBase64_After(
    base64File: java.lang.String,
    sheetNamesToInsert: js.Array[java.lang.String],
    positionType: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.After
  ): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[js.Array[java.lang.String]] = js.native
  @JSName("addFromBase64")
  def addFromBase64_After(
    base64File: java.lang.String,
    sheetNamesToInsert: js.Array[java.lang.String],
    positionType: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.After,
    relativeTo: java.lang.String
  ): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[js.Array[java.lang.String]] = js.native
  @JSName("addFromBase64")
  def addFromBase64_After(
    base64File: java.lang.String,
    sheetNamesToInsert: js.Array[java.lang.String],
    positionType: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.After,
    relativeTo: Worksheet
  ): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[js.Array[java.lang.String]] = js.native
  @JSName("addFromBase64")
  def addFromBase64_Before(
    base64File: java.lang.String,
    sheetNamesToInsert: js.Array[java.lang.String],
    positionType: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Before
  ): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[js.Array[java.lang.String]] = js.native
  @JSName("addFromBase64")
  def addFromBase64_Before(
    base64File: java.lang.String,
    sheetNamesToInsert: js.Array[java.lang.String],
    positionType: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Before,
    relativeTo: java.lang.String
  ): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[js.Array[java.lang.String]] = js.native
  @JSName("addFromBase64")
  def addFromBase64_Before(
    base64File: java.lang.String,
    sheetNamesToInsert: js.Array[java.lang.String],
    positionType: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Before,
    relativeTo: Worksheet
  ): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[js.Array[java.lang.String]] = js.native
  @JSName("addFromBase64")
  def addFromBase64_Beginning(
    base64File: java.lang.String,
    sheetNamesToInsert: js.Array[java.lang.String],
    positionType: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Beginning
  ): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[js.Array[java.lang.String]] = js.native
  @JSName("addFromBase64")
  def addFromBase64_Beginning(
    base64File: java.lang.String,
    sheetNamesToInsert: js.Array[java.lang.String],
    positionType: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Beginning,
    relativeTo: java.lang.String
  ): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[js.Array[java.lang.String]] = js.native
  @JSName("addFromBase64")
  def addFromBase64_Beginning(
    base64File: java.lang.String,
    sheetNamesToInsert: js.Array[java.lang.String],
    positionType: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Beginning,
    relativeTo: Worksheet
  ): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[js.Array[java.lang.String]] = js.native
  @JSName("addFromBase64")
  def addFromBase64_End(
    base64File: java.lang.String,
    sheetNamesToInsert: js.Array[java.lang.String],
    positionType: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.End
  ): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[js.Array[java.lang.String]] = js.native
  @JSName("addFromBase64")
  def addFromBase64_End(
    base64File: java.lang.String,
    sheetNamesToInsert: js.Array[java.lang.String],
    positionType: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.End,
    relativeTo: java.lang.String
  ): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[js.Array[java.lang.String]] = js.native
  @JSName("addFromBase64")
  def addFromBase64_End(
    base64File: java.lang.String,
    sheetNamesToInsert: js.Array[java.lang.String],
    positionType: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.End,
    relativeTo: Worksheet
  ): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[js.Array[java.lang.String]] = js.native
  @JSName("addFromBase64")
  def addFromBase64_None(
    base64File: java.lang.String,
    sheetNamesToInsert: js.Array[java.lang.String],
    positionType: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.None
  ): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[js.Array[java.lang.String]] = js.native
  @JSName("addFromBase64")
  def addFromBase64_None(
    base64File: java.lang.String,
    sheetNamesToInsert: js.Array[java.lang.String],
    positionType: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.None,
    relativeTo: java.lang.String
  ): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[js.Array[java.lang.String]] = js.native
  @JSName("addFromBase64")
  def addFromBase64_None(
    base64File: java.lang.String,
    sheetNamesToInsert: js.Array[java.lang.String],
    positionType: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.None,
    relativeTo: Worksheet
  ): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[js.Array[java.lang.String]] = js.native
  /**
    *
    * Gets the currently active worksheet in the workbook.
    *
    * [Api set: ExcelApi 1.1]
    */
  def getActiveWorksheet(): Worksheet = js.native
  /**
    *
    * Gets the number of worksheets in the collection.
    *
    * [Api set: ExcelApi 1.4]
    *
    * @param visibleOnly Optional. If true, considers only visible worksheets, skipping over any hidden ones.
    */
  def getCount(): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[scala.Double] = js.native
  def getCount(visibleOnly: scala.Boolean): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[scala.Double] = js.native
  /**
    *
    * Gets the first worksheet in the collection.
    *
    * [Api set: ExcelApi 1.5]
    *
    * @param visibleOnly Optional. If true, considers only visible worksheets, skipping over any hidden ones.
    */
  def getFirst(): Worksheet = js.native
  def getFirst(visibleOnly: scala.Boolean): Worksheet = js.native
  /**
    *
    * Gets a worksheet object using its Name or ID.
    *
    * [Api set: ExcelApi 1.1]
    *
    * @param key The Name or ID of the worksheet.
    */
  def getItem(key: java.lang.String): Worksheet = js.native
  /**
    *
    * Gets a worksheet object using its Name or ID. If the worksheet does not exist, will return a null object.
    *
    * [Api set: ExcelApi 1.4]
    *
    * @param key The Name or ID of the worksheet.
    */
  def getItemOrNullObject(key: java.lang.String): Worksheet = js.native
  /**
    *
    * Gets the last worksheet in the collection.
    *
    * [Api set: ExcelApi 1.5]
    *
    * @param visibleOnly Optional. If true, considers only visible worksheets, skipping over any hidden ones.
    */
  def getLast(): Worksheet = js.native
  def getLast(visibleOnly: scala.Boolean): Worksheet = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Excel.WorksheetCollection` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Excel.WorksheetCollection` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.WorksheetCollection` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): WorksheetCollection = js.native
  def load(
    option: officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.WorksheetCollectionLoadOptions with officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.CollectionLoadOptions
  ): WorksheetCollection = js.native
  def load(option: java.lang.String): WorksheetCollection = js.native
  def load(option: js.Array[java.lang.String]): WorksheetCollection = js.native
  def load(option: officeDashJsDashPreviewLib.OfficeExtensionNs.LoadOption): WorksheetCollection = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Excel.WorksheetCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.WorksheetCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.WorksheetCollectionData = js.native
}

