package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorRampElement
  extends stdLib.Object
     with LegendElement {
  /**
    * The color of the border surrounding the ramp. This corresponds with the outline color defined in the default symbol of the renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#ColorRampElement)
    */
  var borderColor: Color
  /**
    * The individual color stops rendered in the legend that correspond to the color visual variable in the renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#ColorRampElement)
    */
  var infos: js.Array[ColorRampStop]
  /**
    * The overlay color of the color ramp. This is typically transparent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#ColorRampElement)
    */
  var overlayColor: Color
  /**
    * The title of the color ramp as displayed in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#ColorRampElement)
    */
  var title: java.lang.String | RampTitle
  /**
    * The type of this element is always `color-ramp`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#ColorRampElement)
    */
  var `type`: java.lang.String
}

object ColorRampElement {
  @scala.inline
  def apply(
    borderColor: Color,
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    infos: js.Array[ColorRampStop],
    overlayColor: Color,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    title: java.lang.String | RampTitle,
    `type`: java.lang.String
  ): ColorRampElement = {
    val __obj = js.Dynamic.literal(borderColor = borderColor, constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), infos = infos, overlayColor = overlayColor, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ColorRampElement]
  }
}

