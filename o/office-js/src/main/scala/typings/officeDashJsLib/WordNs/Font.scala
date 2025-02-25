package typings
package officeDashJsLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a font.
  *
  * [Api set: WordApi 1.1]
  */
@JSGlobal("Word.Font")
@js.native
class Font ()
  extends officeDashJsLib.OfficeExtensionNs.ClientObject {
  /**
    *
    * Gets or sets a value that indicates whether the font is bold. True if the font is formatted as bold, otherwise, false.
    *
    * [Api set: WordApi 1.1]
    */
  var bold: scala.Boolean = js.native
  /**
    *
    * Gets or sets the color for the specified font. You can provide the value in the '#RRGGBB' format or the color name.
    *
    * [Api set: WordApi 1.1]
    */
  var color: java.lang.String = js.native
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_Font: RequestContext = js.native
  /**
    *
    * Gets or sets a value that indicates whether the font has a double strikethrough. True if the font is formatted as double strikethrough text, otherwise, false.
    *
    * [Api set: WordApi 1.1]
    */
  var doubleStrikeThrough: scala.Boolean = js.native
  /**
    *
    * Gets or sets the highlight color. To set it, use a value either in the '#RRGGBB' format or the color name. To remove highlight color, set it to null. The returned highlight color can be in the '#RRGGBB' format, an empty string for mixed highlight colors, or null for no highlight color.
    *
    * **Note**: Only the default highlight colors are available in Office on Windows Desktop. 
    * These are "Yellow", "Lime", "Turquoise", "Pink", "Blue", "Red", "DarkBlue", "Teal", "Green", "Purple", "DarkRed", "Olive", "Gray", "LightGray", and "Black".
    * When the add-in runs in Office on Windows Desktop, any other color is converted to the closest color when applied to the font.
    * 
    * [Api set: WordApi 1.1]
    */
  var highlightColor: java.lang.String = js.native
  /**
    *
    * Gets or sets a value that indicates whether the font is italicized. True if the font is italicized, otherwise, false.
    *
    * [Api set: WordApi 1.1]
    */
  var italic: scala.Boolean = js.native
  /**
    *
    * Gets or sets a value that represents the name of the font.
    *
    * [Api set: WordApi 1.1]
    */
  var name: java.lang.String = js.native
  /**
    *
    * Gets or sets a value that represents the font size in points.
    *
    * [Api set: WordApi 1.1]
    */
  var size: scala.Double = js.native
  /**
    *
    * Gets or sets a value that indicates whether the font has a strikethrough. True if the font is formatted as strikethrough text, otherwise, false.
    *
    * [Api set: WordApi 1.1]
    */
  var strikeThrough: scala.Boolean = js.native
  /**
    *
    * Gets or sets a value that indicates whether the font is a subscript. True if the font is formatted as subscript, otherwise, false.
    *
    * [Api set: WordApi 1.1]
    */
  var subscript: scala.Boolean = js.native
  /**
    *
    * Gets or sets a value that indicates whether the font is a superscript. True if the font is formatted as superscript, otherwise, false.
    *
    * [Api set: WordApi 1.1]
    */
  var superscript: scala.Boolean = js.native
  /**
    *
    * Gets or sets a value that indicates the font's underline type. 'None' if the font is not underlined.
    *
    * [Api set: WordApi 1.1]
    */
  var underline: UnderlineType | officeDashJsLib.officeDashJsLibStrings.Mixed | officeDashJsLib.officeDashJsLibStrings.None | officeDashJsLib.officeDashJsLibStrings.Hidden | officeDashJsLib.officeDashJsLibStrings.DotLine | officeDashJsLib.officeDashJsLibStrings.Single | officeDashJsLib.officeDashJsLibStrings.Word | officeDashJsLib.officeDashJsLibStrings.Double | officeDashJsLib.officeDashJsLibStrings.Thick | officeDashJsLib.officeDashJsLibStrings.Dotted | officeDashJsLib.officeDashJsLibStrings.DottedHeavy | officeDashJsLib.officeDashJsLibStrings.DashLine | officeDashJsLib.officeDashJsLibStrings.DashLineHeavy | officeDashJsLib.officeDashJsLibStrings.DashLineLong | officeDashJsLib.officeDashJsLibStrings.DashLineLongHeavy | officeDashJsLib.officeDashJsLibStrings.DotDashLine | officeDashJsLib.officeDashJsLibStrings.DotDashLineHeavy | officeDashJsLib.officeDashJsLibStrings.TwoDotDashLine | officeDashJsLib.officeDashJsLibStrings.TwoDotDashLineHeavy | officeDashJsLib.officeDashJsLibStrings.Wave | officeDashJsLib.officeDashJsLibStrings.WaveHeavy | officeDashJsLib.officeDashJsLibStrings.WaveDouble = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Word.Font` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Word.Font` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Word.Font` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): Font = js.native
  def load(option: java.lang.String): Font = js.native
  def load(option: js.Array[java.lang.String]): Font = js.native
  def load(option: officeDashJsLib.Anon_Expand): Font = js.native
  def load(option: officeDashJsLib.WordNs.InterfacesNs.FontLoadOptions): Font = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: Font): scala.Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Word.Font): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: officeDashJsLib.WordNs.InterfacesNs.FontUpdateData): scala.Unit = js.native
  def set(
    properties: officeDashJsLib.WordNs.InterfacesNs.FontUpdateData,
    options: officeDashJsLib.OfficeExtensionNs.UpdateOptions
  ): scala.Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Word.Font object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Word.Interfaces.FontData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): officeDashJsLib.WordNs.InterfacesNs.FontData = js.native
  /**
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for context.trackedObjects.add(thisObject). If you are using this object across ".sync" calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you needed to have added the object to the tracked object collection when the object was first created.
    */
  def track(): Font = js.native
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for context.trackedObjects.remove(thisObject). Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call "context.sync()" before the memory release takes effect.
    */
  def untrack(): Font = js.native
}

