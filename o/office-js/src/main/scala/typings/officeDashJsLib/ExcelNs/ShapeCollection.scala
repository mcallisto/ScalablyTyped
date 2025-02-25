package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a collection of all the shapes in the worksheet.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ShapeCollection")
@js.native
class ShapeCollection ()
  extends officeDashJsLib.OfficeExtensionNs.ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ShapeCollection: RequestContext = js.native
  /** Gets the loaded child items in this collection. */
  val items: js.Array[Shape] = js.native
  /**
    *
    * Adds a geometric shape to the worksheet. Returns a Shape object that represents the new shape.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param geometricShapeType Represents the type of the geometric shape. See Excel.GeometricShapeType for details.
    */
  def addGeometricShape(
    geometricShapeType: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 177 */ js.Any
  ): Shape = js.native
  /**
    *
    * Adds a geometric shape to the worksheet. Returns a Shape object that represents the new shape.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param geometricShapeType Represents the type of the geometric shape. See Excel.GeometricShapeType for details.
    */
  def addGeometricShape(geometricShapeType: GeometricShapeType): Shape = js.native
  /**
    *
    * Groups a subset of shapes in this collection's worksheet. Returns a Shape object that represents the new group of shapes.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param values An array of shape ID or shape objects.
    */
  def addGroup(values: js.Array[java.lang.String | Shape]): Shape = js.native
  /**
    *
    * Creates an image from a base64-encoded string and adds it to the worksheet. Returns the Shape object that represents the new image.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param base64ImageString A base64-encoded string representing an image in either JPEG or PNG format.
    */
  def addImage(base64ImageString: java.lang.String): Shape = js.native
  /**
    *
    * Adds a line to worksheet. Returns a Shape object that represents the new line.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param startLeft The distance, in points, from the start of the line to the left side of the worksheet.
    * @param startTop The distance, in points, from the start of the line to the top of the worksheet.
    * @param endLeft The distance, in points, from the end of the line to the left of the worksheet.
    * @param endTop The distance, in points, from the end of the line to the top of the worksheet.
    * @param connectorType Represents the connector type. See Excel.ConnectorType for details.
    */
  def addLine(startLeft: scala.Double, startTop: scala.Double, endLeft: scala.Double, endTop: scala.Double): Shape = js.native
  def addLine(
    startLeft: scala.Double,
    startTop: scala.Double,
    endLeft: scala.Double,
    endTop: scala.Double,
    connectorType: ConnectorType
  ): Shape = js.native
  @JSName("addLine")
  def addLine_Curve(
    startLeft: scala.Double,
    startTop: scala.Double,
    endLeft: scala.Double,
    endTop: scala.Double,
    connectorType: officeDashJsLib.officeDashJsLibStrings.Curve
  ): Shape = js.native
  @JSName("addLine")
  def addLine_Elbow(
    startLeft: scala.Double,
    startTop: scala.Double,
    endLeft: scala.Double,
    endTop: scala.Double,
    connectorType: officeDashJsLib.officeDashJsLibStrings.Elbow
  ): Shape = js.native
  @JSName("addLine")
  def addLine_Straight(
    startLeft: scala.Double,
    startTop: scala.Double,
    endLeft: scala.Double,
    endTop: scala.Double,
    connectorType: officeDashJsLib.officeDashJsLibStrings.Straight
  ): Shape = js.native
  /**
    *
    * Adds a text box to the worksheet with the provided text as the content. Returns a Shape object that represents the new text box.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param text Represents the text that will be shown in the created text box.
    */
  def addTextBox(): Shape = js.native
  def addTextBox(text: java.lang.String): Shape = js.native
  /**
    *
    * Returns the number of shapes in the worksheet. Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  def getCount(): officeDashJsLib.OfficeExtensionNs.ClientResult[scala.Double] = js.native
  /**
    *
    * Gets a shape using its Name or ID.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param key Name or ID of the shape to be retrieved.
    */
  def getItem(key: java.lang.String): Shape = js.native
  /**
    *
    * Gets a shape using its position in the collection.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param index The zero-based index of the shape to be retrieved.
    */
  def getItemAt(index: scala.Double): Shape = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Excel.ShapeCollection` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Excel.ShapeCollection` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.ShapeCollection` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ShapeCollection = js.native
  def load(
    option: officeDashJsLib.ExcelNs.InterfacesNs.ShapeCollectionLoadOptions with officeDashJsLib.ExcelNs.InterfacesNs.CollectionLoadOptions
  ): ShapeCollection = js.native
  def load(option: java.lang.String): ShapeCollection = js.native
  def load(option: js.Array[java.lang.String]): ShapeCollection = js.native
  def load(option: officeDashJsLib.OfficeExtensionNs.LoadOption): ShapeCollection = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Excel.ShapeCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ShapeCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): officeDashJsLib.ExcelNs.InterfacesNs.ShapeCollectionData = js.native
}

