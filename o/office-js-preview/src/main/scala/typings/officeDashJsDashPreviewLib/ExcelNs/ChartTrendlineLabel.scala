package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * This object represents the attributes for a chart trendline lable object.
  *
  * [Api set: ExcelApi 1.8]
  */
@JSGlobal("Excel.ChartTrendlineLabel")
@js.native
class ChartTrendlineLabel ()
  extends officeDashJsDashPreviewLib.OfficeExtensionNs.ClientObject {
  /**
    *
    * Boolean value representing if trendline label automatically generates appropriate text based on context.
    *
    * [Api set: ExcelApi 1.8]
    */
  var autoText: scala.Boolean = js.native
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ChartTrendlineLabel: RequestContext = js.native
  /**
    *
    * Represents the format of chart trendline label.
    *
    * [Api set: ExcelApi 1.8]
    */
  val format: ChartTrendlineLabelFormat = js.native
  /**
    *
    * String value that represents the formula of chart trendline label using A1-style notation.
    *
    * [Api set: ExcelApi 1.8]
    */
  var formula: java.lang.String = js.native
  /**
    *
    * Returns the height, in points, of the chart trendline label. Read-only. Null if chart trendline label is not visible.
    *
    * [Api set: ExcelApi 1.8]
    */
  val height: scala.Double = js.native
  /**
    *
    * Represents the horizontal alignment for chart trendline label. See Excel.ChartTextHorizontalAlignment for details.
    This property is valid only when TextOrientation of trendline label is 90, -90 or 180.
    *
    * [Api set: ExcelApi 1.8]
    */
  var horizontalAlignment: ChartTextHorizontalAlignment | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Center | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Left | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Right | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Justify | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Distributed = js.native
  /**
    *
    * Represents the distance, in points, from the left edge of chart trendline label to the left edge of chart area. Null if chart trendline label is not visible.
    *
    * [Api set: ExcelApi 1.8]
    */
  var left: scala.Double = js.native
  /**
    *
    * Boolean value representing if the number format is linked to the cells (so that the number format changes in the labels when it changes in the cells).
    *
    * [Api set: ExcelApi 1.9]
    */
  var linkNumberFormat: scala.Boolean = js.native
  /**
    *
    * String value that represents the format code for trendline label.
    *
    * [Api set: ExcelApi 1.8]
    */
  var numberFormat: java.lang.String = js.native
  /**
    *
    * String representing the text of the trendline label on a chart.
    *
    * [Api set: ExcelApi 1.8]
    */
  var text: java.lang.String = js.native
  /**
    *
    * Represents the text orientation of chart trendline label. The value should be an integer either from -90 to 90, or 180 for vertically-oriented text.
    *
    * [Api set: ExcelApi 1.8]
    */
  var textOrientation: scala.Double = js.native
  /**
    *
    * Represents the distance, in points, from the top edge of chart trendline label to the top of chart area. Null if chart trendline label is not visible.
    *
    * [Api set: ExcelApi 1.8]
    */
  var top: scala.Double = js.native
  /**
    *
    * Represents the vertical alignment of chart trendline label. See Excel.ChartTextVerticalAlignment for details.
    This property is valid only when TextOrientation of trendline label is 0.
    *
    * [Api set: ExcelApi 1.8]
    */
  var verticalAlignment: ChartTextVerticalAlignment | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Center | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Bottom | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Top | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Justify | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Distributed = js.native
  /**
    *
    * Returns the width, in points, of the chart trendline label. Read-only. Null if chart trendline label is not visible.
    *
    * [Api set: ExcelApi 1.8]
    */
  val width: scala.Double = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Excel.ChartTrendlineLabel` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Excel.ChartTrendlineLabel` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.ChartTrendlineLabel` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ChartTrendlineLabel = js.native
  def load(option: java.lang.String): ChartTrendlineLabel = js.native
  def load(option: js.Array[java.lang.String]): ChartTrendlineLabel = js.native
  def load(option: officeDashJsDashPreviewLib.Anon_Expand): ChartTrendlineLabel = js.native
  def load(option: officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.ChartTrendlineLabelLoadOptions): ChartTrendlineLabel = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ChartTrendlineLabel): scala.Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.ChartTrendlineLabel): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.ChartTrendlineLabelUpdateData): scala.Unit = js.native
  def set(
    properties: officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.ChartTrendlineLabelUpdateData,
    options: officeDashJsDashPreviewLib.OfficeExtensionNs.UpdateOptions
  ): scala.Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.ChartTrendlineLabel object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ChartTrendlineLabelData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.ChartTrendlineLabelData = js.native
}

