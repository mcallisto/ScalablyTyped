package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait colorGetSchemesByTagParams
  extends stdLib.Object {
  /**
    * The basemap to pair with the visualization. This value indicates the best symbol colors for visualizing features against the given basemap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-color.html#getSchemesByTag)
    */
  var basemap: java.lang.String | Basemap
  /**
    * When provided, only schemes missing all the provided tags will be returned.  **Known Tags:** light | dark | reds | yellows | oranges | greens | blues | purples | pinks | browns | grays | bright | subdued | deuteranopia | protanopia | tritanopia | grayscale | types | dot-density
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-color.html#getSchemesByTag)
    */
  var excludedTags: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The geometry type of the features to visualize.  **Possible Values:** point | multipoint | polyline | polygon | mesh
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-color.html#getSchemesByTag)
    */
  var geometryType: java.lang.String
  /**
    * When provided, only schemes containing all the matching tags will be returned.  **Known Tags:** light | dark | reds | yellows | oranges | greens | blues | purples | pinks | browns | grays | bright | subdued | deuteranopia | protanopia | tritanopia | grayscale | types | dot-density
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-color.html#getSchemesByTag)
    */
  var includedTags: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The theme determines which values will be emphasized in the continuous ramp and the map. Possible values are listed below.
    *
    * | Value | Description | Example |
    * | ----- | ----------- | ------- |
    * | high-to-low | High values are emphasized with strong colors. | ![high-to-low](https://developers.arcgis.com/javascript/assets/img/apiref/renderers/sm-high-to-low.png) |
    * | above-and-below | Values centered around a given point (e.g. the average) are visualized with weak colors while other values are emphasized with strong colors. | ![above-and-below](https://developers.arcgis.com/javascript/assets/img/apiref/renderers/sm-above-and-below.png) |
    * | centered-on | Values centered around a given point (e.g. the average) are emphasized with strong colors while other values are visualized with weak colors. | ![centered-on](https://developers.arcgis.com/javascript/assets/img/apiref/renderers/sm-centered-on.png) |
    * | extremes | High and low values are emphasized with strong colors. All others are visualized with weak colors. | ![extremes](https://developers.arcgis.com/javascript/assets/img/apiref/renderers/sm-extremes.png) |
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-color.html#getSchemesByTag)
    */
  var theme: java.lang.String
  /**
    * The SceneView instance in which the scheme will be used. This property is only applicable when the scheme will be used in conjunction with 3D symbols.
    *
    * [Read more...](global.html)
    */
  var view: js.UndefOr[SceneView] = js.undefined
  /**
    * Indicates if the size units of the scheme will be in meters. This should be `true` when the scheme is intended for 3D volumetric symbology. A `view` must be provided if this property is set to `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-color.html#getSchemesByTag)
    */
  var worldScale: js.UndefOr[scala.Boolean] = js.undefined
}

object colorGetSchemesByTagParams {
  @scala.inline
  def apply(
    basemap: java.lang.String | Basemap,
    constructor: js.Function,
    geometryType: java.lang.String,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    theme: java.lang.String,
    excludedTags: js.Array[java.lang.String] = null,
    includedTags: js.Array[java.lang.String] = null,
    view: SceneView = null,
    worldScale: js.UndefOr[scala.Boolean] = js.undefined
  ): colorGetSchemesByTagParams = {
    val __obj = js.Dynamic.literal(basemap = basemap.asInstanceOf[js.Any], constructor = constructor, geometryType = geometryType, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), theme = theme)
    if (excludedTags != null) __obj.updateDynamic("excludedTags")(excludedTags)
    if (includedTags != null) __obj.updateDynamic("includedTags")(includedTags)
    if (view != null) __obj.updateDynamic("view")(view)
    if (!js.isUndefined(worldScale)) __obj.updateDynamic("worldScale")(worldScale)
    __obj.asInstanceOf[colorGetSchemesByTagParams]
  }
}

