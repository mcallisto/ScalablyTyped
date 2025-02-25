package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VectorTileLayer
  extends Layer
     with ScaleRangeLayer {
  /**
    * The URL that points to the location of the layer's attribution data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#attributionDataUrl)
    */
  val attributionDataUrl: java.lang.String = js.native
  /**
    * Indicates the layer's supported capabilities.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#capabilities)
    */
  val capabilities: VectorTileLayerCapabilities = js.native
  /**
    * The current style information of the VectorTileLayer. See the object specification below.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#currentStyleInfo)
    */
  val currentStyleInfo: VectorTileLayerCurrentStyleInfo = js.native
  /**
    * The portal item from which the layer is loaded. This will load the layer from the portal item, not the vector tile service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#portalItem)
    */
  var portalItem: PortalItem = js.native
  /**
    * The spatial reference of the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#spatialReference)
    */
  var spatialReference: SpatialReference = js.native
  /**
    * A style JSON object of vector tiles that will be used to render the layer. If initializing the layer with a style JSON object, the tiles are fetched from the tile servers specified in the style object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#style)
    */
  var style: js.Any = js.native
  /**
    * The tiling scheme information for the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#tileInfo)
    */
  var tileInfo: TileInfo = js.native
  /**
    * The URL to the vector tile service, or the URL to the style resource of vector tiles that will be used to render the layer. If specifying a URL to a style, the tiles are fetched from the tile servers specified in the style object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#url)
    */
  var url: java.lang.String = js.native
  /**
    * Returns an instance of [layout](https://www.mapbox.com/mapbox-gl-js/style-spec/#layer-layout) properties for the specified [style-layer](https://www.mapbox.com/mapbox-gl-js/style-spec/#layers).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#getLayoutProperties)
    *
    * @param layer The style-layer [id](https://www.mapbox.com/mapbox-gl-js/style-spec/#layer-id) in the VectorTileLayer's [currentStyleInfo.style](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#currentStyleInfo).
    *
    */
  def getLayoutProperties(layer: java.lang.String): js.Any = js.native
  /**
    * Returns an instance of [paint](https://www.mapbox.com/mapbox-gl-js/style-spec/#layer-paint) properties for the specified [style-layer](https://www.mapbox.com/mapbox-gl-js/style-spec/#layers).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#getPaintProperties)
    *
    * @param layer The style-layer [id](https://www.mapbox.com/mapbox-gl-js/style-spec/#layer-id) in the VectorTileLayer's [currentStyleInfo.style](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#currentStyleInfo).
    *
    */
  def getPaintProperties(layer: java.lang.String): js.Any = js.native
  /**
    * Returns the [id](https://www.mapbox.com/mapbox-gl-js/style-spec/#layer-id) of the [style-layer](https://www.mapbox.com/mapbox-gl-js/style-spec/#layers) based on its index.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#getStyleLayerId)
    *
    * @param index Index of the style-layer in the VectorTileLayer's [currentStyleInfo.style](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#currentStyleInfo).
    *
    */
  def getStyleLayerId(index: scala.Double): java.lang.String = js.native
  /**
    * Loads a style to render a layer from the specified URL to a style resource or style JSON object. It is equivalent of changing the entire CSS style sheet for web page. When loading a style, it is the developer's responsibility to make sure that any relative urls in the style resolve correctly.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#loadStyle)
    *
    * @param style The URL to a style of vector tiles or style JSON object.
    * @param options An object with the following properties.
    * @param options.signal Signal object that can be used to abort the asynchronous task. The returned promise will be rejected with an [Error](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Error.html) named `AbortError` when an abort is signaled. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController) for more information on how to construct a controller that can be used to deliver abort signals.
    *
    */
  def loadStyle(style: java.lang.String): arcgisDashJsDashApiLib.IPromise[_] = js.native
  def loadStyle(style: java.lang.String, options: VectorTileLayerLoadStyleOptions): arcgisDashJsDashApiLib.IPromise[_] = js.native
  def loadStyle(style: js.Any): arcgisDashJsDashApiLib.IPromise[_] = js.native
  def loadStyle(style: js.Any, options: VectorTileLayerLoadStyleOptions): arcgisDashJsDashApiLib.IPromise[_] = js.native
  @JSName("on")
  def on_layerviewcreate(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`layerview-create`,
    eventHandler: VectorTileLayerLayerviewCreateEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
  @JSName("on")
  def on_layerviewcreateerror(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`layerview-create-error`,
    eventHandler: VectorTileLayerLayerviewCreateErrorEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
  @JSName("on")
  def on_layerviewdestroy(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`layerview-destroy`,
    eventHandler: VectorTileLayerLayerviewDestroyEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
  /**
    * Assigns new [layout](https://www.mapbox.com/mapbox-gl-js/style-spec/#layer-layout) properties to the specified [style-layer](https://www.mapbox.com/mapbox-gl-js/style-spec/#layers).
    * > **Known Limitations**  This method is only supported in 2D [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#setLayoutProperties)
    *
    * @param layer The style-layer [id](https://www.mapbox.com/mapbox-gl-js/style-spec/#layer-id) in the VectorTileLayer's [currentStyleInfo.style](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#currentStyleInfo).
    * @param layout An instance of layout properties to assign to the style-layer.
    *
    */
  def setLayoutProperties(layer: java.lang.String, layout: js.Any): scala.Unit = js.native
  /**
    * Assigns new [paint](https://www.mapbox.com/mapbox-gl-js/style-spec/#layer-paint) properties to the specified [style-layer](https://www.mapbox.com/mapbox-gl-js/style-spec/#layers).
    * > **Known Limitations**  This method is only supported in 2D [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#setPaintProperties)
    *
    * @param layer The style-layer [id](https://www.mapbox.com/mapbox-gl-js/style-spec/#layer-id) in the VectorTileLayer's [currentStyleInfo.style](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#currentStyleInfo).
    * @param painter An instance of paint properties to assign to the specified style-layer.
    *
    */
  def setPaintProperties(layer: java.lang.String, painter: js.Any): scala.Unit = js.native
}

@JSGlobal("__esri.VectorTileLayer")
@js.native
/**
  * VectorTileLayer accesses cached tiles of data and renders it in vector format. It is similar to a [WebTileLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WebTileLayer.html) in the context of caching; however, a [WebTileLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WebTileLayer.html) renders as a series of images, not vector data. Unlike raster tiles, they can adapt to the resolution of their display device and can be restyled for multiple uses. VectorTileLayer delivers styled maps while taking advantage of cached raster map tiles with vector map data.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html)
  */
class VectorTileLayerCls () extends VectorTileLayer {
  def this(properties: VectorTileLayerProperties) = this()
  /**
    * The maximum scale (most zoomed in) at which the layer is visible in the view. If the map is zoomed in beyond this scale, the layer will not be visible. A value of `0` means the layer does not have a maximum scale. The maxScale value should always be smaller than the [minScale](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ScaleRangeLayer.html#minScale) value, and greater than or equal to the service specification.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ScaleRangeLayer.html#maxScale)
    *
    * @default 0
    */
  /* CompleteClass */
  override var maxScale: scala.Double = js.native
  /**
    * The minimum scale (most zoomed out) at which the layer is visible in the view. If the map is zoomed out beyond this scale, the layer will not be visible. A value of `0` means the layer does not have a minimum scale. The minScale value should always be larger than the [maxScale](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ScaleRangeLayer.html#maxScale) value, and lesser than or equal to the service specification.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ScaleRangeLayer.html#minScale)
    *
    * @default 0
    */
  /* CompleteClass */
  override var minScale: scala.Double = js.native
}

