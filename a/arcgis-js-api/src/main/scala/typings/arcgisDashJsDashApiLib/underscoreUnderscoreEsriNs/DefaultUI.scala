package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultUI extends UI {
  /**
    * An array of strings representing the default widgets visible when a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) is created. The default widgets differ between MapView and SceneView.  The following are the default components in each view:  **MapView:** `["attribution", "zoom"]`  **SceneView:** `["attribution", "navigation-toggle", "compass", "zoom"]`
    * > Esri requires that when you use an ArcGIS Online basemap in your app, the map must include Esri attribution and you must be licensed to use the content. For detailed guidelines on working with attribution, please visit the official [attribution in your app](https://developers.arcgis.com/terms/attribution/) documentation. For information on terms of use, see the [Terms of Use FAQ](https://developers.arcgis.com/terms/faq/).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ui-DefaultUI.html#components)
    */
  var components: js.Array[java.lang.String] = js.native
}

@JSGlobal("__esri.DefaultUI")
@js.native
/**
  * The DefaultUI class exposes the default [widget](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Widget.html) [components](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ui-DefaultUI.html#components) available in either a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). This class also provides a simple API for [adding](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ui-DefaultUI.html#add), [moving](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ui-DefaultUI.html#move) and [removing](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ui-DefaultUI.html#remove) [widgets](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Widget.html) and other HTML components from the view's UI.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ui-DefaultUI.html)
  */
class DefaultUICls () extends DefaultUI {
  def this(properties: DefaultUIProperties) = this()
}

