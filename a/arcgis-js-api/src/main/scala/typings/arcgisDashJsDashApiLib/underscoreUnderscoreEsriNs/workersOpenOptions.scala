package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait workersOpenOptions
  extends stdLib.Object {
  /**
    * The objects defining the API accessible from the module.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-workers.html#open)
    */
  var client: js.UndefOr[js.Any] = js.undefined
  /**
    * [AbortSignal](https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal) allows for cancelable asynchronous job. If canceled, the promise will be rejected with an error named `AbortError`. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController).
    *
    * Possible Value | Description
    * ---------------|------------
    * distributed | The module is loaded in each available worker. Each call to [Connection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-workers-Connection.html#invoke) will be targeting an available worker. Use this strategy if the module doesn't maintain information between invocations (stateless).
    * dedicated | The module is loaded in one worker. Each call to [Connection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-workers-Connection.html#invoke) will be targeting a same worker. Use this strategy if the module maintains information from previous invocations or communication between main and worker threads needs to be stateful.
    * local | The module is loaded in the main thread. Use this strategy if when using the worker framework API while disabling the use of workers.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-workers.html#open)
    */
  var signal: js.UndefOr[stdLib.AbortSignal] = js.undefined
  /**
    * Indicates how to load the module. See the table below for a list of possible values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-workers.html#open)
    *
    * @default distributed
    */
  var strategy: js.UndefOr[java.lang.String] = js.undefined
}

object workersOpenOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    client: js.Any = null,
    signal: stdLib.AbortSignal = null,
    strategy: java.lang.String = null
  ): workersOpenOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (client != null) __obj.updateDynamic("client")(client)
    if (signal != null) __obj.updateDynamic("signal")(signal)
    if (strategy != null) __obj.updateDynamic("strategy")(strategy)
    __obj.asInstanceOf[workersOpenOptions]
  }
}

