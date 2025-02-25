package typings
package workboxDashSwLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassStreamsNamespace
  extends org.scalablytyped.runtime.Instantiable0[workboxDashSwLib.workboxDashSwMod.StreamsNamespace] {
  /**
  	 * Takes multiple source Promises, each of which could resolve to a Response, a
  	 * ReadableStream, or a [BodyInit](https://fetch.spec.whatwg.org/#bodyinit).
  	 *
  	 * Returns an object exposing a ReadableStream with each individual stream's
  	 * data returned in sequence, along with a Promise which signals when the
  	 * stream is finished (useful for passing to a FetchEvent's waitUntil()).
  	 * @param {Promise<StreamSource>[]} sourcePromises - Array of Promise containing StreamSource
  	 * @returns {ConcatenateResult}
  	 */
  def concatenate(sourcePromises: js.Array[js.Promise[workboxDashSwLib.workboxDashSwMod.StreamSource]]): workboxDashSwLib.workboxDashSwMod.ConcatenateResult = js.native
  /**
  	 * Takes multiple source Promises, each of which could resolve to a Response, a
  	 * ReadableStream, or a [BodyInit](https://fetch.spec.whatwg.org/#bodyinit),
  	 * along with a
  	 * [HeadersInit](https://fetch.spec.whatwg.org/#typedefdef-headersinit).
  	 *
  	 * Returns an object exposing a Response whose body consists of each individual
  	 * stream's data returned in sequence, along with a Promise which signals when
  	 * the stream is finished (useful for passing to a FetchEvent's waitUntil()).
  	 * @param {Promise<StreamSource>[]} sourcePromises - Array of Promise containing StreamSource
  	 * @param {HeadersInit} [headersInit] - If there's no `Content-Type` specified, `'text/html'` will be used by default.
  	 * @returns {ConcatenateToResponseResult}
  	 */
  def concatenateToResponse(sourcePromises: js.Array[js.Promise[workboxDashSwLib.workboxDashSwMod.StreamSource]]): workboxDashSwLib.workboxDashSwMod.ConcatenateToResponseResult = js.native
  def concatenateToResponse(
    sourcePromises: js.Array[js.Promise[workboxDashSwLib.workboxDashSwMod.StreamSource]],
    headersInit: stdLib.HeadersInit
  ): workboxDashSwLib.workboxDashSwMod.ConcatenateToResponseResult = js.native
  /**
  	 * This is a utility method that determines whether the current browser supports
  	 * the features required to create streamed responses. Currently, it checks if
  	 * [`ReadableStream`](https://developer.mozilla.org/en-US/docs/Web/API/ReadableStream/ReadableStream)
  	 * can be created.
  	 * @returns {boolean} `true`, if the current browser meets the requirements for streaming responses, and `false` otherwise.
  	 */
  def isSupported(): scala.Boolean = js.native
  /**
  	 * A shortcut to create a strategy that could be dropped-in to Workbox's router.
  	 *
  	 * On browsers that do not support constructing new `ReadableStream`s, this
  	 * strategy will automatically wait for all the `sourceFunctions` to complete,
  	 * and create a final response that concatenates their values together.
  	 * @param {HandlerCallback[]} sourceFunctions - Each function should return a StreamSource (or a Promise which resolves to one).
  	 * @param {HeadersInit} headersInit - If there's no `Content-Type` specified, `'text/html'` will be used by default.
  	 * @returns {HandlerCallback}
  	 */
  def strategy(sourceFunctions: js.Array[workboxDashSwLib.workboxDashSwMod.HandlerCallback]): workboxDashSwLib.workboxDashSwMod.HandlerCallback = js.native
  def strategy(
    sourceFunctions: js.Array[workboxDashSwLib.workboxDashSwMod.HandlerCallback],
    headersInit: stdLib.HeadersInit
  ): workboxDashSwLib.workboxDashSwMod.HandlerCallback = js.native
}

