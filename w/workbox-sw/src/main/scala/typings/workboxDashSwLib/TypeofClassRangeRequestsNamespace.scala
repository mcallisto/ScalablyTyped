package typings
package workboxDashSwLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassRangeRequestsNamespace
  extends org.scalablytyped.runtime.Instantiable0[workboxDashSwLib.workboxDashSwMod.RangeRequestsNamespace] {
  /**
  	 * The range request plugin makes it easy for a request with a 'Range' header to
  	 * be fulfilled by a cached response.
  	 *
  	 * It does this by intercepting the `cachedResponseWillBeUsed` plugin callback
  	 * and returning the appropriate subset of the cached response body.
  	 */
  val Plugin: workboxDashSwLib.workboxDashSwMod.RangeRequestsPluginConstructor = js.native
  /**
  	 * Given a `Request` and `Response` objects as input, this will return a
  	 * promise for a new `Response`.
  	 *
  	 * If the original `Response` already contains partial content (i.e. it has
  	 * a status of 206), then this assumes it already fulfills the `Range:`
  	 * requirements, and will return it as-is.
  	 *
  	 * @param {Request} request A request, which should contain a Range:
  	 * header.
  	 * @param {Response} originalResponse A response.
  	 * @return {Promise<Response>} Either a `206 Partial Content` response, with
  	 * the response body set to the slice of content specified by the request's
  	 * `Range:` header, or a `416 Range Not Satisfiable` response if the
  	 * conditions of the `Range:` header can't be met.
  	 *
  	 * @param {Request} request - A request, which should contain a Range: header.
  	 * @param {Response} originalResponse - A response.
  	 * @returns {Promise<Response>} Either a `206 Partial Content` response, with the response body
  	 *                              set to the slice of content specified by the request's `Range:` header,
  	 *                              or a `416 Range Not Satisfiable` response if the conditions of the `Range:`
  	 *                              header can't be met.
  	 */
  def createPartialResponse(request: stdLib.Request, originalResponse: stdLib.Response): js.Promise[stdLib.Response] = js.native
}

