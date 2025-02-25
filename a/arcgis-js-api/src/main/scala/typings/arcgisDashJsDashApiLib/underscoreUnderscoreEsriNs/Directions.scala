package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Directions
  extends Widget
     with GoTo {
  /**
    * The widget's default CSS icon class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#iconClass)
    */
  var iconClass: java.lang.String = js.native
  /**
    * The most recent route result. Returns an object containing properties for any barriers used when generating the route, messages that may arise when solving the route, and finally an array of returned [RouteResults](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteResult.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#lastRoute)
    *
    * @default null
    */
  val lastRoute: DirectionsLastRoute = js.native
  /**
    * The maximum number of stops allowed for routing.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#maxStops)
    *
    * @default 50
    */
  var maxStops: scala.Double = js.native
  /**
    * The URL of the REST endpoint of the Route service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#routeServiceUrl)
    *
    * @default "https://route.arcgis.com/arcgis/rest/services/World/Route/NAServer/Route_World"
    */
  var routeServiceUrl: java.lang.String = js.native
  /**
    * Defines the symbol used to draw the route on the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#routeSymbol)
    */
  var routeSymbol: SimpleLineSymbol = js.native
  /**
    * Controls the default properties used when [searching](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html). Note that the default `searchProperties` differ slightly from the [Search widget](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#searchProperties)
    *
    * @default null
    */
  var searchProperties: DirectionsSearchProperties = js.native
  /**
    * The default stop symbols used to display locations between the origin and final destination.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#stopSymbols)
    */
  var stopSymbols: DirectionsStopSymbols = js.native
  /**
    * The view from which the widget will operate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#view)
    */
  var view: MapView | SceneView = js.native
  /**
    * The view model for this widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [DirectionsViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html) class to access all properties and methods on the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#viewModel)
    */
  var viewModel: DirectionsViewModel = js.native
  /**
    * Calculate the route to the input locations and display the list of directions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#getDirections)
    *
    *
    */
  def getDirections(): arcgisDashJsDashApiLib.IPromise[RouteResult] = js.native
  /**
    * *This method is primarily used by developers when implementing custom widgets.* It must be implemented by subclasses for rendering.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#render)
    *
    *
    */
  def render(): js.Any = js.native
  /**
    * Zoom so that the full route is displayed within the current map extent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#zoomToRoute)
    *
    *
    */
  def zoomToRoute(): scala.Unit = js.native
}

@JSGlobal("__esri.Directions")
@js.native
/**
  * The Directions Widget provides a way to build driving and walking directions using ArcGIS Online and custom Network Analysis Route services. Similar to how the [RouteTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-RouteTask.html) works, this widget generates a route finding a least-cost path between multiple points using a specified network. When searching for an address, the location of the points used to navigate depends on the `locationType` of the [Search properties](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html#SearchProperties). The default value will be `"street"` for any locator source that does not define a `locationType`. The resulting directions are displayed with detailed turn-by-turn instructions.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html)
  */
class DirectionsCls () extends Directions {
  def this(properties: DirectionsProperties) = this()
}

