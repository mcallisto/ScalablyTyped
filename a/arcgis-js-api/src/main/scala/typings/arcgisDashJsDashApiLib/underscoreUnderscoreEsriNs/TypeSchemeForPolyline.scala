package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeSchemeForPolyline
  extends stdLib.Object
     with TypeScheme {
  /**
    * The colors of the line symbols comprising the theme.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-type.html#TypeSchemeForPolyline)
    */
  var colors: js.Array[Color]
  /**
    * The unique name of the scheme.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-type.html#TypeSchemeForPolyline)
    */
  var name: java.lang.String
  /**
    * The color of the line symbol used to indicate features with no data and features that are out of range.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-type.html#TypeSchemeForPolyline)
    */
  var noDataColor: Color
  /**
    * The opacity of the line symbol (0 - 1).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-type.html#TypeSchemeForPolyline)
    */
  var opacity: scala.Double
  /**
    * Tags associated with the scheme.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-type.html#TypeSchemeForPolyline)
    */
  var tags: js.Array[java.lang.String]
  /**
    * The default width of the line symbol in pixels or points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-type.html#TypeSchemeForPolyline)
    */
  var width: scala.Double
}

object TypeSchemeForPolyline {
  @scala.inline
  def apply(
    colors: js.Array[Color],
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    name: java.lang.String,
    noDataColor: Color,
    opacity: scala.Double,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    tags: js.Array[java.lang.String],
    width: scala.Double
  ): TypeSchemeForPolyline = {
    val __obj = js.Dynamic.literal(colors = colors, constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), name = name, noDataColor = noDataColor, opacity = opacity, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), tags = tags, width = width)
  
    __obj.asInstanceOf[TypeSchemeForPolyline]
  }
}

