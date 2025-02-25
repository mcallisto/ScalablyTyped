package typings
package loadjsLib.loadjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("loadjs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(
    files: java.lang.String | js.Array[java.lang.String],
    bundleIdOrLoaded: java.lang.String | LoadedFn
  ): scala.Unit = js.native
  def apply(
    files: js.Array[java.lang.String],
    bundleId: java.lang.String,
    optionsOrCallback: LoadOptions | LoadedFn
  ): scala.Unit = js.native
  def done(bundleId: java.lang.String): scala.Unit = js.native
  def isDefined(bundleId: java.lang.String): scala.Boolean = js.native
  def ready(bundleIds: java.lang.String, optionsOrCallback: LoadedFn): loadjsLib.Fn_BundleId = js.native
  def ready(bundleIds: java.lang.String, optionsOrCallback: ReadyOptions): loadjsLib.Fn_BundleId = js.native
  def ready(bundleIds: js.Array[java.lang.String], optionsOrCallback: LoadedFn): loadjsLib.Fn_BundleId = js.native
  def ready(bundleIds: js.Array[java.lang.String], optionsOrCallback: ReadyOptions): loadjsLib.Fn_BundleId = js.native
  def reset(): scala.Unit = js.native
}

