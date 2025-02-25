package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WaterSymbol3DLayerProperties extends Symbol3DLayerProperties {
  /**
    * The dominant color used to shade the water. The water has different shades of the dominant color based on the reflection of the light. The image below shows how different types of water can be represented with different colors. For example for deep water the dominant color could be navy blue.  ![symbol3D-water](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbol3d-water-colors.png)  The color can be autocast with an array of rgb(a) values, named string, hex string or an hsl(a) string, an object with `r`, `g`, `b`, and `a` properties, or a [Color](https://developers.arcgis.com/javascript/latest/api-reference/esri-Color.html) object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WaterSymbol3DLayer.html#color)
    *
    * @default #0077BE
    */
  var color: js.UndefOr[Color] = js.undefined
  /**
    * Indicates the size of the waterbody which is represented by the symbol layer. `small` can be set for small lakes, rivers or swimming pools, `medium` can be set for large lakes, whereas `large` is recommended for ocean and sea waterbodies.  **Possible values:** small | medium | large
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WaterSymbol3DLayer.html#waterbodySize)
    *
    * @default medium
    */
  var waterbodySize: js.UndefOr[
    arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.small | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.medium | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.large
  ] = js.undefined
  /**
    * Indicates the direction in which the waves travel. This value represents the geographic rotation in degrees and it ranges from 0 to 360 degrees. A value of 0 degrees corresponds to geographic north, which means that the wave travels from south to north.  The default is set to `null`, which will display the waves without a distinct direction.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WaterSymbol3DLayer.html#waveDirection)
    *
    * @default null
    */
  var waveDirection: js.UndefOr[scala.Double] = js.undefined
  /**
    * Indicates the shape and intensity of the waves. Currently only calm to moderate waterbodies can be represented. A `calm` wave strength represents water without waves, acting almost like a mirror. A water with `rippled` wave strength has very small and short waves. `slight` wave strength displays the waves with a more pronounced form, but they are still quite short. Choosing `moderate` will display waves with a longer form and a slightly increased intensity.  **Possible values:** calm | rippled | slight | moderate
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WaterSymbol3DLayer.html#waveStrength)
    *
    * @default moderate
    */
  var waveStrength: js.UndefOr[
    arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.calm | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.rippled | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.slight | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.moderate
  ] = js.undefined
}

object WaterSymbol3DLayerProperties {
  @scala.inline
  def apply(
    color: Color = null,
    waterbodySize: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.small | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.medium | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.large = null,
    waveDirection: scala.Int | scala.Double = null,
    waveStrength: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.calm | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.rippled | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.slight | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.moderate = null
  ): WaterSymbol3DLayerProperties = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (waterbodySize != null) __obj.updateDynamic("waterbodySize")(waterbodySize.asInstanceOf[js.Any])
    if (waveDirection != null) __obj.updateDynamic("waveDirection")(waveDirection.asInstanceOf[js.Any])
    if (waveStrength != null) __obj.updateDynamic("waveStrength")(waveStrength.asInstanceOf[js.Any])
    __obj.asInstanceOf[WaterSymbol3DLayerProperties]
  }
}

