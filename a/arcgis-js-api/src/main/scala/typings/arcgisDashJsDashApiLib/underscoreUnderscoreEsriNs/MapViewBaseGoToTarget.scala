package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapViewBaseGoToTarget
  extends stdLib.Object {
  /**
    * The [MapView.center](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapViewBase.html#center) to go to.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapViewBase.html#goTo)
    */
  var center: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /**
    * The [MapView.scale](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapViewBase.html#scale) to go to.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapViewBase.html#goTo)
    */
  var scale: js.UndefOr[scala.Double] = js.undefined
  /**
    * The target of the animation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapViewBase.html#goTo)
    */
  var target: js.UndefOr[
    (js.Array[scala.Double | Geometry | Graphic]) | Geometry | (Collection[Geometry | Graphic]) | Graphic | Viewpoint
  ] = js.undefined
  /**
    * The [MapView.zoom](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapViewBase.html#zoom) to go to.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapViewBase.html#goTo)
    */
  var zoom: js.UndefOr[scala.Double] = js.undefined
}

object MapViewBaseGoToTarget {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    center: js.Array[scala.Double] = null,
    scale: scala.Int | scala.Double = null,
    target: (js.Array[scala.Double | Geometry | Graphic]) | Geometry | (Collection[Geometry | Graphic]) | Graphic | Viewpoint = null,
    zoom: scala.Int | scala.Double = null
  ): MapViewBaseGoToTarget = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (center != null) __obj.updateDynamic("center")(center)
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapViewBaseGoToTarget]
  }
}

