package typings
package atTensorflowTfjsDashCoreLib.distIoRouterUnderscoreRegistryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/io/router_registry", "IORouterRegistry")
@js.native
class IORouterRegistry protected () extends js.Object {
  var loadRouters: js.Any = js.native
  var saveRouters: js.Any = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-core/dist/io/router_registry", "IORouterRegistry")
@js.native
object IORouterRegistry extends js.Object {
  var getHandlers: js.Any = js.native
  var getInstance: js.Any = js.native
  var instance: js.Any = js.native
  /**
    * Look up IOHandler for loading, given a URL-like string.
    *
    * @param url
    * @param onProgress Optional, progress callback function, fired periodically
    *   before the load is completed.
    * @returns All valid handlers for `url`, given the currently registered
    *   handler routers.
    */
  def getLoadHandlers(url: java.lang.String): js.Array[atTensorflowTfjsDashCoreLib.distIoTypesMod.IOHandler] = js.native
  def getLoadHandlers(url: java.lang.String, onProgress: js.Function): js.Array[atTensorflowTfjsDashCoreLib.distIoTypesMod.IOHandler] = js.native
  def getLoadHandlers(url: js.Array[java.lang.String]): js.Array[atTensorflowTfjsDashCoreLib.distIoTypesMod.IOHandler] = js.native
  def getLoadHandlers(url: js.Array[java.lang.String], onProgress: js.Function): js.Array[atTensorflowTfjsDashCoreLib.distIoTypesMod.IOHandler] = js.native
  /**
    * Look up IOHandler for saving, given a URL-like string.
    *
    * @param url
    * @returns If only one match is found, an instance of IOHandler with the
    * `save` method defined. If no match is found, `null`.
    * @throws Error, if more than one match is found.
    */
  def getSaveHandlers(url: java.lang.String): js.Array[atTensorflowTfjsDashCoreLib.distIoTypesMod.IOHandler] = js.native
  def getSaveHandlers(url: js.Array[java.lang.String]): js.Array[atTensorflowTfjsDashCoreLib.distIoTypesMod.IOHandler] = js.native
  /**
    * Register a load-handler router.
    *
    * @param loadRouter A function that maps a URL-like string onto an instance
    * of `IOHandler` with the `load` method defined or `null`.
    */
  def registerLoadRouter(loadRouter: atTensorflowTfjsDashCoreLib.distIoRouterUnderscoreRegistryMod.IORouter): scala.Unit = js.native
  /**
    * Register a save-handler router.
    *
    * @param saveRouter A function that maps a URL-like string onto an instance
    * of `IOHandler` with the `save` method defined or `null`.
    */
  def registerSaveRouter(saveRouter: atTensorflowTfjsDashCoreLib.distIoRouterUnderscoreRegistryMod.IORouter): scala.Unit = js.native
}

