package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the background of a range object.
  *
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.RangeFill")
@js.native
class RangeFill ()
  extends officeDashJsDashPreviewLib.OfficeExtensionNs.ClientObject {
  /**
    *
    * HTML color code representing the color of the border line, of the form #RRGGBB (e.g. "FFA500") or as a named HTML color (e.g. "orange")
    *
    * [Api set: ExcelApi 1.1]
    */
  var color: java.lang.String = js.native
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_RangeFill: RequestContext = js.native
  /**
    *
    * Gets or sets the pattern of a Range. See Excel.FillPattern for details. LinearGradient and RectangularGradient are not supported.
    A null value indicates that the entire range doesn't have uniform pattern setting.
    *
    * [Api set: ExcelApi 1.9]
    */
  var pattern: FillPattern | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.None | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Solid | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Gray50 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Gray75 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Gray25 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Horizontal | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Vertical | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Down | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Up | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Checker | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.SemiGray75 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.LightHorizontal | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.LightVertical | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.LightDown | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.LightUp | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Grid | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.CrissCross | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Gray16 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Gray8 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.LinearGradient | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.RectangularGradient = js.native
  /**
    *
    * Sets HTML color code representing the color of the Range pattern, of the form #RRGGBB (e.g. "FFA500") or as a named HTML color (e.g. "orange").
    Gets HTML color code representing the color of the Range pattern, of the form #RRGGBB (e.g. "FFA500").
    *
    * [Api set: ExcelApi 1.9]
    */
  var patternColor: java.lang.String = js.native
  /**
    *
    * Returns or sets a double that lightens or darkens a pattern color for Range Fill, the value is between -1 (darkest) and 1 (brightest), with 0 for the original color.
    If the pattern tintAndShades are not uniform, null will be returned.
    *
    * [Api set: ExcelApi 1.9]
    */
  var patternTintAndShade: scala.Double = js.native
  /**
    *
    * Returns or sets a double that lightens or darkens a color for Range Fill, the value is between -1 (darkest) and 1 (brightest), with 0 for the original color.
    If the tintAndShades are not uniform, null will be returned.
    *
    * [Api set: ExcelApi 1.9]
    */
  var tintAndShade: scala.Double = js.native
  /**
    *
    * Resets the range background.
    *
    * [Api set: ExcelApi 1.1]
    */
  def clear(): scala.Unit = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Excel.RangeFill` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Excel.RangeFill` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.RangeFill` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): RangeFill = js.native
  def load(option: java.lang.String): RangeFill = js.native
  def load(option: js.Array[java.lang.String]): RangeFill = js.native
  def load(option: officeDashJsDashPreviewLib.Anon_Expand): RangeFill = js.native
  def load(option: officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.RangeFillLoadOptions): RangeFill = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.RangeFill): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.RangeFillUpdateData): scala.Unit = js.native
  def set(
    properties: officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.RangeFillUpdateData,
    options: officeDashJsDashPreviewLib.OfficeExtensionNs.UpdateOptions
  ): scala.Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: RangeFill): scala.Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.RangeFill object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.RangeFillData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.RangeFillData = js.native
}

