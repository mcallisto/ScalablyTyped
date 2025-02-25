package typings
package workboxDashSwLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassBroadcastUpdateNamespace
  extends org.scalablytyped.runtime.Instantiable0[workboxDashSwLib.workboxDashSwMod.BroadcastUpdateNamespace] {
  /**
  	 * Uses the [Broadcast Channel API]{@link https://developers.google.com/web/updates/2016/09/broadcastchannel}
  	 * to notify interested parties when a cached response has been updated.
  	 * In browsers that do not support the Broadcast Channel API, the instance
  	 * falls back to sending the update via `postMessage()` to all window clients.
  	 *
  	 * For efficiency's sake, the underlying response bodies are not compared;
  	 * only specific response headers are checked.
  	 */
  val BroadcastCacheUpdate: workboxDashSwLib.workboxDashSwMod.BroadcastCacheUpdateConstructor = js.native
  /**
  	 * Construct a BroadcastCacheUpdate instance with the passed options and
  	 * calls its `notifyIfUpdated()` method whenever the plugin's
  	 * `cacheDidUpdate` callback is invoked.
  	 */
  val Plugin: workboxDashSwLib.workboxDashSwMod.BroadcastUpdatePluginConstructor = js.native
  /**
  	 * You would not normally call this method directly; it's called automatically
  	 * by an instance of the {@link BroadcastCacheUpdate} class. It's exposed here
  	 * for the benefit of developers who would rather not use the full
  	 * `BroadcastCacheUpdate` implementation.
  	 *
  	 * Calling this will dispatch a message on the provided
  	 * {@link https://developers.google.com/web/updates/2016/09/broadcastchannel|Broadcast Channel}
  	 * to notify interested subscribers about a change to a cached resource.
  	 *
  	 * The message that's posted has a formation inspired by the
  	 * [Flux standard action](https://github.com/acdlite/flux-standard-action#introduction)
  	 * format like so:
  	 *
  	 * ```
  	 * {
  	 *   type: 'CACHE_UPDATED',
  	 *   meta: 'workbox-broadcast-update',
  	 *   payload: {
  	 *     cacheName: 'the-cache-name',
  	 *     updatedURL: 'https://example.com/'
  	 *   }
  	 * }
  	 * ```
  	 *
  	 * (Usage of [Flux](https://facebook.github.io/flux/) itself is not at
  	 * all required.)
  	 * @param {BroadcastUpdateOptions} options
  	 * @returns {Promise<void>}
  	 */
  def broadCastUpdate(options: workboxDashSwLib.workboxDashSwMod.BroadcastUpdateOptions): js.Promise[scala.Unit] = js.native
  /**
  	 * Given two `Response's`, compares several header values to see if they are
  	 * the same or not.
  	 * @param {Response} firstResponse
  	 * @param {Response} secondResponse
  	 * @param {string[]} headersToCheck
  	 * @return {boolean}
  	 */
  def responsesAreSame(
    firstResponse: stdLib.Response,
    secondResponse: stdLib.Response,
    headersToCheck: js.Array[java.lang.String]
  ): scala.Boolean = js.native
}

