package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoJSONLayerCapabilitiesData
  extends stdLib.Object {
  /**
    * Indicates if the attachment is enabled on the layer. At this current time, the GeoJSONLayer doesn’t support attachments.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#capabilities)
    */
  var supportsAttachment: scala.Boolean
  /**
    * Indicates if the features in the layer support M values. Requires ArcGIS Server service 10.1 or greater.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#capabilities)
    */
  var supportsM: scala.Boolean
  /**
    * Indicates if the features in the layer support Z values. Requires ArcGIS Server service 10.1 or greater. See [elevationInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#elevationInfo) for details regarding placement and rendering of features with z-values in 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html#capabilities)
    */
  var supportsZ: scala.Boolean
}

object GeoJSONLayerCapabilitiesData {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    supportsAttachment: scala.Boolean,
    supportsM: scala.Boolean,
    supportsZ: scala.Boolean
  ): GeoJSONLayerCapabilitiesData = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), supportsAttachment = supportsAttachment, supportsM = supportsM, supportsZ = supportsZ)
  
    __obj.asInstanceOf[GeoJSONLayerCapabilitiesData]
  }
}

