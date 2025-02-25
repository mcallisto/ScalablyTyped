package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dotDensityGetSchemesParams
  extends stdLib.Object {
  /**
    * The basemap to pair with the visualization. This value indicates the best symbol color for visualizing features with the given basemap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-dotDensity.html#getSchemes)
    */
  var basemap: java.lang.String | Basemap
  /**
    * The number of colors to visualize.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-dotDensity.html#getSchemes)
    */
  var numColors: scala.Double
}

object dotDensityGetSchemesParams {
  @scala.inline
  def apply(
    basemap: java.lang.String | Basemap,
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    numColors: scala.Double,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean
  ): dotDensityGetSchemesParams = {
    val __obj = js.Dynamic.literal(basemap = basemap.asInstanceOf[js.Any], constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), numColors = numColors, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
  
    __obj.asInstanceOf[dotDensityGetSchemesParams]
  }
}

