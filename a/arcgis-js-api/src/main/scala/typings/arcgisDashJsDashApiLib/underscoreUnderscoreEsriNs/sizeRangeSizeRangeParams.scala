package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait sizeRangeSizeRangeParams
  extends stdLib.Object {
  /**
    * The `polygon` layer for which to generate a suggested min/max size range based on scale for a size visual variable.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-heuristics-sizeRange.html#sizeRange)
    */
  var layer: FeatureLayer | GeoJSONLayer
  /**
    * The [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) where the layer will be rendered.
    *
    * [Read more...](global.html)
    */
  var view: MapView
}

object sizeRangeSizeRangeParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    layer: FeatureLayer | GeoJSONLayer,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    view: MapView
  ): sizeRangeSizeRangeParams = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), layer = layer.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), view = view)
  
    __obj.asInstanceOf[sizeRangeSizeRangeParams]
  }
}

