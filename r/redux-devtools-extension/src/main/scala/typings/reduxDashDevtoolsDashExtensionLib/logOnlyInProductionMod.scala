package typings
package reduxDashDevtoolsDashExtensionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-devtools-extension/logOnlyInProduction", JSImport.Namespace)
@js.native
object logOnlyInProductionMod extends js.Object {
  def composeWithDevTools(options: reduxDashDevtoolsDashExtensionLib.reduxDashDevtoolsDashExtensionMod.EnhancerOptions): reduxDashDevtoolsDashExtensionLib.Fn_A = js.native
  def composeWithDevTools[StoreExt, StateExt](funcs: (reduxLib.reduxMod.StoreEnhancer[StoreExt, js.Object])*): reduxLib.reduxMod.StoreEnhancer[StoreExt, js.Object] = js.native
  def devToolsEnhancer(options: reduxDashDevtoolsDashExtensionLib.reduxDashDevtoolsDashExtensionMod.EnhancerOptions): reduxLib.reduxMod.StoreEnhancer[_, js.Object] = js.native
}

