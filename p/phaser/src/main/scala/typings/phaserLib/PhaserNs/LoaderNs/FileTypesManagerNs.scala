package typings
package phaserLib.PhaserNs.LoaderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Phaser.Loader.FileTypesManager")
@js.native
object FileTypesManagerNs extends js.Object {
  /**
    * Removed all associated file types.
    */
  def destroy(): scala.Unit = js.native
  /**
    * Static method called when a LoaderPlugin is created.
    * 
    * Loops through the local types object and injects all of them as
    * properties into the LoaderPlugin instance.
    * @param loader The LoaderPlugin to install the types into.
    */
  def install(loader: phaserLib.PhaserNs.LoaderNs.LoaderPlugin): scala.Unit = js.native
  /**
    * Static method called directly by the File Types.
    * 
    * The key is a reference to the function used to load the files via the Loader, i.e. `image`.
    * @param key The key that will be used as the method name in the LoaderPlugin.
    * @param factoryFunction The function that will be called when LoaderPlugin.key is invoked.
    */
  def register(key: java.lang.String, factoryFunction: js.Function): scala.Unit = js.native
}

