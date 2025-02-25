package typings
package officeDashJsDashPreviewLib.VisioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the Hyperlink Collection.
  *
  * [Api set:  1.1]
  */
@JSGlobal("Visio.HyperlinkCollection")
@js.native
class HyperlinkCollection ()
  extends officeDashJsDashPreviewLib.OfficeExtensionNs.ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_HyperlinkCollection: RequestContext = js.native
  /** Gets the loaded child items in this collection. */
  val items: js.Array[Hyperlink] = js.native
  /**
    *
    * Gets the number of hyperlinks.
    *
    * [Api set:  1.1]
    */
  def getCount(): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[scala.Double] = js.native
  def getItem(Key: java.lang.String): Hyperlink = js.native
  /**
    *
    * Gets a Hyperlink using its key (name or Id).
    *
    * [Api set:  1.1]
    *
    * @param Key Key is the name or index of the Hyperlink to be retrieved.
    */
  def getItem(Key: scala.Double): Hyperlink = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Visio.HyperlinkCollection` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Visio.HyperlinkCollection` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Visio.HyperlinkCollection` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): HyperlinkCollection = js.native
  def load(
    option: officeDashJsDashPreviewLib.VisioNs.InterfacesNs.HyperlinkCollectionLoadOptions with officeDashJsDashPreviewLib.VisioNs.InterfacesNs.CollectionLoadOptions
  ): HyperlinkCollection = js.native
  def load(option: java.lang.String): HyperlinkCollection = js.native
  def load(option: js.Array[java.lang.String]): HyperlinkCollection = js.native
  def load(option: officeDashJsDashPreviewLib.OfficeExtensionNs.LoadOption): HyperlinkCollection = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Visio.HyperlinkCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Visio.Interfaces.HyperlinkCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): officeDashJsDashPreviewLib.VisioNs.InterfacesNs.HyperlinkCollectionData = js.native
}

