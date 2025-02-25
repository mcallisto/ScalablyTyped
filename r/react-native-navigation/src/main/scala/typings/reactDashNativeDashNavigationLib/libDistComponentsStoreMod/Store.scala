package typings
package reactDashNativeDashNavigationLib.libDistComponentsStoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-navigation/lib/dist/components/Store", "Store")
@js.native
class Store () extends js.Object {
  var componentsByName: js.Any = js.native
  var propsById: js.Any = js.native
  def cleanId(componentId: java.lang.String): scala.Unit = js.native
  def getComponentClassForName(componentName: java.lang.String): js.UndefOr[reactDashNativeLib.reactDashNativeMod.ComponentProvider] = js.native
  def getComponentClassForName(componentName: scala.Double): js.UndefOr[reactDashNativeLib.reactDashNativeMod.ComponentProvider] = js.native
  def getPropsForId(componentId: java.lang.String): js.Any = js.native
  def setComponentClassForName(
    componentName: java.lang.String,
    ComponentClass: reactDashNativeLib.reactDashNativeMod.ComponentProvider
  ): scala.Unit = js.native
  def setComponentClassForName(
    componentName: scala.Double,
    ComponentClass: reactDashNativeLib.reactDashNativeMod.ComponentProvider
  ): scala.Unit = js.native
  def setPropsForId(componentId: java.lang.String, props: js.Any): scala.Unit = js.native
}

