package typings
package workboxDashSwLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassRoutingNamespace
  extends org.scalablytyped.runtime.Instantiable0[workboxDashSwLib.workboxDashSwMod.RoutingNamespace] {
  /**
  	 * NavigationRoute makes it easy to create a Route that matches for browser
  	 * [navigation requests]{@link https://developers.google.com/web/fundamentals/primers/service-workers/high-performance-loading#first_what_are_navigation_requests}.
  	 *
  	 * It will only match incoming Requests whose
  	 * [`mode`]{@link https://fetch.spec.whatwg.org/#concept-request-mode}
  	 * is set to `navigate`.
  	 *
  	 * You can optionally only apply this route to a subset of navigation requests
  	 * by using one or both of the `blacklist` and `whitelist` parameters.
  	 */
  val NavigationRoute: workboxDashSwLib.workboxDashSwMod.NavigationRouteConstructor = js.native
  /**
  	 * RegExpRoute makes it easy to create a regular expression based
  	 * Route.
  	 *
  	 * For same-origin requests the RegExp only needs to match part of the URL. For
  	 * requests against third-party servers, you must define a RegExp that matches
  	 * the start of the URL.
  	 *
  	 * [See the module docs for info.]{@link https://developers.google.com/web/tools/workbox/modules/workbox-routing}
  	 */
  val RegExpRoute: workboxDashSwLib.workboxDashSwMod.RegExpRouteConstructor = js.native
  /**
  	 * A `Route` consists of a pair of callback functions, "match" and "handler".
  	 * The "match" callback determine if a route should be used to "handle" a
  	 * request by returning a non-falsy value if it can. The "handler" callback
  	 * is called when there is a match and should return a Promise that resolves
  	 * to a `Response`.
  	 */
  val Route: workboxDashSwLib.workboxDashSwMod.RouteConstructor = js.native
  /**
  	 * The Router can be used to process a FetchEvent through one or more
  	 * Routes responding  with a Request if
  	 * a matching route exists.
  	 *
  	 * If no route matches a given a request, the Router will use a "default"
  	 * handler if one is defined.
  	 *
  	 * Should the matching Route throw an error, the Router will use a "catch"
  	 * handler if one is defined to gracefully deal with issues and respond with a
  	 * Request.
  	 *
  	 * If a request matches multiple routes, the **earliest** registered route will
  	 * be used to respond to the request.
  	 */
  val Router: workboxDashSwLib.workboxDashSwMod.RouterConstructor = js.native
  /**
  	 * Registers a route that will return a precached file for a navigation
  	 * request. This is useful for the
  	 * [application shell pattern]{@link https://developers.google.com/web/fundamentals/architecture/app-shell}.
  	 *
  	 * When determining the URL of the precached HTML document, you will likely need
  	 * to call `workbox.precaching.getCacheKeyForURL(originalUrl)`, to account for
  	 * the fact that Workbox's precaching naming conventions often results in URL
  	 * cache keys that contain extra revisioning info.
  	 *
  	 * This method will generate a NavigationRoute and call Router.registerRoute() on a singleton Router instance.
  	 * @param {string} cachedAssetUrl - The cache key to use for the HTML file.
  	 * @param {Partial<RegisterNavigationRouteOptions>} [options]
  	 * @returns {NavigationRoute} Returns the generated Route.
  	 */
  def registerNavigationRoute(cachedAssetUrl: java.lang.String): workboxDashSwLib.workboxDashSwMod.NavigationRoute = js.native
  def registerNavigationRoute(
    cachedAssetUrl: java.lang.String,
    options: stdLib.Partial[workboxDashSwLib.workboxDashSwMod.RegisterNavigationRouteOptions]
  ): workboxDashSwLib.workboxDashSwMod.NavigationRoute = js.native
  /**
  	 * Easily register a RegExp, string, or function with a caching
  	 * strategy to a singleton Router instance.
  	 *
  	 * This method will generate a Route for you if needed and
  	 * call Router.registerRoute().
  	 * @param {string | RegExp | MatchCallback | Route} capture - If the capture param is a `Route`, all other arguments will be ignored.
  	 * @param {HandlerCallback} handler - A callback function that returns a Promise resulting in a Response.
  	 * @param {string} [method="GET"] - The HTTP method to match the Route against.
  	 * @returns {Route} The generated `Route` (Useful for unregistering).
  	 */
  def registerRoute(capture: java.lang.String, handler: workboxDashSwLib.workboxDashSwMod.HandlerCallback): workboxDashSwLib.workboxDashSwMod.Route = js.native
  def registerRoute(
    capture: java.lang.String,
    handler: workboxDashSwLib.workboxDashSwMod.HandlerCallback,
    method: java.lang.String
  ): workboxDashSwLib.workboxDashSwMod.Route = js.native
  def registerRoute(capture: stdLib.RegExp, handler: workboxDashSwLib.workboxDashSwMod.HandlerCallback): workboxDashSwLib.workboxDashSwMod.Route = js.native
  def registerRoute(
    capture: stdLib.RegExp,
    handler: workboxDashSwLib.workboxDashSwMod.HandlerCallback,
    method: java.lang.String
  ): workboxDashSwLib.workboxDashSwMod.Route = js.native
  def registerRoute(
    capture: workboxDashSwLib.workboxDashSwMod.MatchCallback,
    handler: workboxDashSwLib.workboxDashSwMod.HandlerCallback
  ): workboxDashSwLib.workboxDashSwMod.Route = js.native
  def registerRoute(
    capture: workboxDashSwLib.workboxDashSwMod.MatchCallback,
    handler: workboxDashSwLib.workboxDashSwMod.HandlerCallback,
    method: java.lang.String
  ): workboxDashSwLib.workboxDashSwMod.Route = js.native
  def registerRoute(
    capture: workboxDashSwLib.workboxDashSwMod.Route,
    handler: workboxDashSwLib.workboxDashSwMod.HandlerCallback
  ): workboxDashSwLib.workboxDashSwMod.Route = js.native
  def registerRoute(
    capture: workboxDashSwLib.workboxDashSwMod.Route,
    handler: workboxDashSwLib.workboxDashSwMod.HandlerCallback,
    method: java.lang.String
  ): workboxDashSwLib.workboxDashSwMod.Route = js.native
  /**
  	 * If a Route throws an error while handling a request, this `handler`
  	 * will be called and given a chance to provide a response.
  	 * @param {HandlerCallback} handler - A callback function that returns a Promise resulting in a Response.
  	 */
  def setCatchHandler(handler: workboxDashSwLib.workboxDashSwMod.HandlerCallback): scala.Unit = js.native
  /**
  	 * Define a default `handler` that's called when no routes explicitly
  	 * match the incoming request.
  	 *
  	 * Without a default handler, unmatched requests will go against the
  	 * network as if there were no service worker present.
  	 * @param {HandlerCallback} handler - A callback function that returns a Promise resulting in a Response.
  	 */
  def setDefaultHandler(handler: workboxDashSwLib.workboxDashSwMod.HandlerCallback): js.Promise[stdLib.Response] = js.native
}

