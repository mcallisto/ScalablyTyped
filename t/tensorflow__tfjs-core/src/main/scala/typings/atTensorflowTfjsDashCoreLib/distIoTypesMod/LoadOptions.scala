package typings
package atTensorflowTfjsDashCoreLib.distIoTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadOptions extends js.Object {
  /**
    * A function used to override the `window.fetch` function.
    */
  var fetchFunc: js.UndefOr[js.Function] = js.undefined
  /**
    * Whether the module or model is to be loaded from TF Hub.
    *
    * Setting this to `true` allows passing a TF-Hub module URL, omitting the
    * standard model file name and the query parameters.
    *
    * Default: `false`.
    */
  var fromTFHub: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Progress callback.
    */
  var onProgress: js.UndefOr[OnProgressCallback] = js.undefined
  /**
    * RequestInit (options) for HTTP requests.
    *
    * For detailed information on the supported fields, see
    * [https://developer.mozilla.org/en-US/docs/Web/API/Request/Request](
    *     https://developer.mozilla.org/en-US/docs/Web/API/Request/Request)
    */
  var requestInit: js.UndefOr[stdLib.RequestInit] = js.undefined
  /**
    * Strict loading model: whether extraneous weights or missing
    * weights should trigger an `Error`.
    *
    * If `true`, require that the provided weights exactly match those
    * required by the layers. `false` means that both extra weights
    * and missing weights will be silently ignored.
    *
    * Default: `true`.
    */
  var strict: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Path prefix for weight files, by default this is calculated from the
    * path of the model JSON file.
    *
    * For instance, if the path to the model JSON file is
    * `http://localhost/foo/model.json`, then the default path prefix will be
    * `http://localhost/foo/`. If a weight file has the path value
    * `group1-shard1of2` in the weight manifest, then the weight file will be
    * loaded from `http://localhost/foo/group1-shard1of2` by default. However,
    * if you provide a `weightPathPrefix` value of
    * `http://localhost/foo/alt-weights`, then the weight file will be loaded
    * from the path `http://localhost/foo/alt-weights/group1-shard1of2` instead.
    */
  var weightPathPrefix: js.UndefOr[java.lang.String] = js.undefined
}

object LoadOptions {
  @scala.inline
  def apply(
    fetchFunc: js.Function = null,
    fromTFHub: js.UndefOr[scala.Boolean] = js.undefined,
    onProgress: OnProgressCallback = null,
    requestInit: stdLib.RequestInit = null,
    strict: js.UndefOr[scala.Boolean] = js.undefined,
    weightPathPrefix: java.lang.String = null
  ): LoadOptions = {
    val __obj = js.Dynamic.literal()
    if (fetchFunc != null) __obj.updateDynamic("fetchFunc")(fetchFunc)
    if (!js.isUndefined(fromTFHub)) __obj.updateDynamic("fromTFHub")(fromTFHub)
    if (onProgress != null) __obj.updateDynamic("onProgress")(onProgress)
    if (requestInit != null) __obj.updateDynamic("requestInit")(requestInit)
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    if (weightPathPrefix != null) __obj.updateDynamic("weightPathPrefix")(weightPathPrefix)
    __obj.asInstanceOf[LoadOptions]
  }
}

