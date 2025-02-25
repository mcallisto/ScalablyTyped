package typings
package phaserLib.PhaserNs.TypesNs.PluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomPluginContainer extends js.Object {
  /**
    * The unique name of this plugin in the custom plugin cache.
    */
  var key: java.lang.String
  /**
    * The plugin to be stored. Should be the source object, not instantiated.
    */
  var plugin: js.Function
}

object CustomPluginContainer {
  @scala.inline
  def apply(key: java.lang.String, plugin: js.Function): CustomPluginContainer = {
    val __obj = js.Dynamic.literal(key = key, plugin = plugin)
  
    __obj.asInstanceOf[CustomPluginContainer]
  }
}

