package typings
package arcgisDashJsDashApiLib.esriWidgetsSupportGeolocationPositioningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/widgets/support/GeolocationPositioning", JSImport.Namespace)
@js.native
class Class ()
  extends arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.GeolocationPositioning {
  /**
    * The HTML5 Geolocation Position options for locating. Refer to [Geolocation API Specification](http://www.w3.org/TR/geolocation-API/#position-options) for details.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-GeolocationPositioning.html#geolocationOptions)
    *
    * @default { maximumAge: 0, timeout: 15000, enableHighAccuracy: true }
    */
  /* CompleteClass */
  override var geolocationOptions: js.Any = js.native
  /**
    * Indicates whether to navigate the view to the position and scale of the geolocated result.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-GeolocationPositioning.html#goToLocationEnabled)
    *
    * @default true
    */
  /* CompleteClass */
  override var goToLocationEnabled: scala.Boolean = js.native
  /**
    * The graphic used to show the user's location on the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-GeolocationPositioning.html#graphic)
    */
  /* CompleteClass */
  override var graphic: arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.Graphic = js.native
  /**
    * The scale to set on the view when navigating to the position of the geolocated result. If a scale value is not explicitly set, then the view will navigate to a default scale of `2500`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-GeolocationPositioning.html#scale)
    *
    * @default null
    */
  /* CompleteClass */
  override var scale: scala.Double = js.native
  /**
    * The view associated with the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-GeolocationPositioning.html#view)
    */
  /* CompleteClass */
  override var view: arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.MapView | arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.SceneView = js.native
}

