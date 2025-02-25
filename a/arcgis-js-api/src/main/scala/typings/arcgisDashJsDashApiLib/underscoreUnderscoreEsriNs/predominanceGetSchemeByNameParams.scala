package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait predominanceGetSchemeByNameParams
  extends stdLib.Object {
  /**
    * The basemap to pair with the visualization. This value indicates the best symbol color for visualizing features with the given basemap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-predominance.html#getSchemeByName)
    */
  var basemap: java.lang.String | Basemap
  /**
    * The geometry type of the features to visualize.  **Possible Values:** point | multipoint | polyline | polygon | mesh
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-predominance.html#getSchemeByName)
    */
  var geometryType: java.lang.String
  /**
    * The name of the scheme to retrieve.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-predominance.html#getSchemeByName)
    */
  var name: java.lang.String
  /**
    * The number of unique values to include in the predominance visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-predominance.html#getSchemeByName)
    */
  var numColors: scala.Double
  /**
    * Determines which set of primary and secondary color schemes to return  **Possible Values:** default
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-predominance.html#getSchemeByName)
    *
    * @default default
    */
  var theme: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The SceneView instance in which the scheme will be used. This property is only applicable when the scheme will be used in conjunction with 3D symbols.
    *
    * [Read more...](global.html)
    */
  var view: js.UndefOr[SceneView] = js.undefined
  /**
    * Indicates if the size units of the scheme will be in meters. This should be `true` when the scheme is intended for 3D volumetric symbology. A `view` must be provided if this property is set to `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-predominance.html#getSchemeByName)
    */
  var worldScale: js.UndefOr[scala.Boolean] = js.undefined
}

object predominanceGetSchemeByNameParams {
  @scala.inline
  def apply(
    basemap: java.lang.String | Basemap,
    constructor: js.Function,
    geometryType: java.lang.String,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    name: java.lang.String,
    numColors: scala.Double,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    theme: java.lang.String = null,
    view: SceneView = null,
    worldScale: js.UndefOr[scala.Boolean] = js.undefined
  ): predominanceGetSchemeByNameParams = {
    val __obj = js.Dynamic.literal(basemap = basemap.asInstanceOf[js.Any], constructor = constructor, geometryType = geometryType, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), name = name, numColors = numColors, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (view != null) __obj.updateDynamic("view")(view)
    if (!js.isUndefined(worldScale)) __obj.updateDynamic("worldScale")(worldScale)
    __obj.asInstanceOf[predominanceGetSchemeByNameParams]
  }
}

