package typings
package enhancedDashResolveLib.libModuleAppendPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModuleAppendPlugin extends js.Object {
  var appending: java.lang.String
  var source: java.lang.String
  var target: java.lang.String
  @JSName("apply")
  def apply(resolver: enhancedDashResolveLib.libResolverMod.^): scala.Unit
}

object ModuleAppendPlugin {
  @scala.inline
  def apply(
    appending: java.lang.String,
    apply: enhancedDashResolveLib.libResolverMod.^ => scala.Unit,
    source: java.lang.String,
    target: java.lang.String
  ): ModuleAppendPlugin = {
    val __obj = js.Dynamic.literal(appending = appending, apply = js.Any.fromFunction1(apply), source = source, target = target)
  
    __obj.asInstanceOf[ModuleAppendPlugin]
  }
}

