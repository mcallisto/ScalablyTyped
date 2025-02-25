package typings
package officeDashJsDashPreviewLib.VisioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the ShapeView class.
  *
  * [Api set:  1.1]
  */
@JSGlobal("Visio.ShapeView")
@js.native
class ShapeView ()
  extends officeDashJsDashPreviewLib.OfficeExtensionNs.ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ShapeView: RequestContext = js.native
  /**
    *
    * Represents the highlight around the shape.
    *
    * [Api set:  1.1]
    */
  var highlight: Highlight = js.native
  /**
    *
    * Adds an overlay on top of the shape.
    *
    * [Api set:  1.1]
    *
    * @param OverlayType An Overlay Type. Can be 'Text' or 'Image'.
    * @param Content Content of Overlay.
    * @param OverlayHorizontalAlignment Horizontal Alignment of Overlay. Can be 'Left', 'Center', or 'Right'.
    * @param OverlayVerticalAlignment Vertical Alignment of Overlay. Can be 'Top', 'Middle', 'Bottom'.
    * @param Width Overlay Width.
    * @param Height Overlay Height.
    */
  def addOverlay(
    OverlayType: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Text | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Image | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Html,
    Content: java.lang.String,
    OverlayHorizontalAlignment: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Left | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Center | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Right,
    OverlayVerticalAlignment: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Top | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Middle | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Bottom,
    Width: scala.Double,
    Height: scala.Double
  ): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[scala.Double] = js.native
  /**
    *
    * Adds an overlay on top of the shape.
    *
    * [Api set:  1.1]
    *
    * @param OverlayType An Overlay Type. Can be 'Text' or 'Image'.
    * @param Content Content of Overlay.
    * @param OverlayHorizontalAlignment Horizontal Alignment of Overlay. Can be 'Left', 'Center', or 'Right'.
    * @param OverlayVerticalAlignment Vertical Alignment of Overlay. Can be 'Top', 'Middle', 'Bottom'.
    * @param Width Overlay Width.
    * @param Height Overlay Height.
    */
  def addOverlay(
    OverlayType: OverlayType,
    Content: java.lang.String,
    OverlayHorizontalAlignment: OverlayHorizontalAlignment,
    OverlayVerticalAlignment: OverlayVerticalAlignment,
    Width: scala.Double,
    Height: scala.Double
  ): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[scala.Double] = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Visio.ShapeView` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Visio.ShapeView` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Visio.ShapeView` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ShapeView = js.native
  def load(option: java.lang.String): ShapeView = js.native
  def load(option: js.Array[java.lang.String]): ShapeView = js.native
  def load(option: officeDashJsDashPreviewLib.Anon_Expand): ShapeView = js.native
  def load(option: officeDashJsDashPreviewLib.VisioNs.InterfacesNs.ShapeViewLoadOptions): ShapeView = js.native
  /**
    *
    * Removes particular overlay or all overlays on the Shape.
    *
    * [Api set:  1.1]
    *
    * @param OverlayId An Overlay Id. Removes the specific overlay id from the shape.
    */
  def removeOverlay(OverlayId: scala.Double): scala.Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Visio.ShapeView): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: officeDashJsDashPreviewLib.VisioNs.InterfacesNs.ShapeViewUpdateData): scala.Unit = js.native
  def set(
    properties: officeDashJsDashPreviewLib.VisioNs.InterfacesNs.ShapeViewUpdateData,
    options: officeDashJsDashPreviewLib.OfficeExtensionNs.UpdateOptions
  ): scala.Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ShapeView): scala.Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Visio.ShapeView object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Visio.Interfaces.ShapeViewData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): officeDashJsDashPreviewLib.VisioNs.InterfacesNs.ShapeViewData = js.native
}

