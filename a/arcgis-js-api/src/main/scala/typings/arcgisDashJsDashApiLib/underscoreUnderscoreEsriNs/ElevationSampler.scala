package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElevationSampler extends js.Object {
  /**
    * Registers an event handler on the instance. Call this method to hook an event with a listener. See the [Events summary table](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ElevationSampler.html#events-summary) for a list of listened events.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ElevationSampler.html#on)
    *
    * @param type The name of the event or the events to listen for.
    * @param handler? The function to call when the event is fired, if modifiers were specified.
    *
    */
  def on(`type`: java.lang.String): js.Any = js.native
  def on(`type`: java.lang.String, handler: js.Function): js.Any = js.native
  def on(`type`: js.Array[java.lang.String]): js.Any = js.native
  def on(`type`: js.Array[java.lang.String], handler: js.Function): js.Any = js.native
  @JSName("on")
  def on_changed(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.changed,
    eventHandler: ElevationSamplerChangedEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
  def queryElevation(geometry: Multipoint): Point | Multipoint | Polyline = js.native
  /**
    * Query elevation for a [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html), [Polyline](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html) or [Multipoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Multipoint.html) geometry. A query will return a new geometry for which the z-values for each coordinate in the geometry are obtained from the elevation sampler. If the geometry used for the query is outside of the elevation sampler extent, then the returned geometry has `0` as z-values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ElevationSampler.html#queryElevation)
    *
    * @param geometry The geometry to use for sampling elevation data.
    *
    */
  def queryElevation(geometry: Point): Point | Multipoint | Polyline = js.native
  def queryElevation(geometry: Polyline): Point | Multipoint | Polyline = js.native
}

@JSGlobal("__esri.ElevationSampler")
@js.native
/**
  * A cache of elevation values created from an elevation service or the [GroundView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-GroundView.html) used for synchronously querying elevation information for geometries. This class does not have a constructor. You can create an instance of this class by using [ElevationLayer.createElevationSampler()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ElevationLayer.html#createElevationSampler) or [Ground.createElevationSampler()](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html#createElevationSampler) methods. The elevation sampler created from the [Ground](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html) will sample data from the first elevation layer that has data available. To control the layer used for elevation sampling and the sampling resolution, use [ElevationLayer.createElevationSampler()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ElevationLayer.html#createElevationSampler).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ElevationSampler.html)
  */
class ElevationSamplerCls () extends ElevationSampler

