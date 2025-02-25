package typings
package dockerodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dockerodeMod {
  type Callback[T] = js.Function2[/* error */ js.UndefOr[js.Any], /* result */ js.UndefOr[T], scala.Unit]
  type EndpointsConfig = org.scalablytyped.runtime.StringDictionary[EndpointSettings]
  type MountConfig = js.Array[MountSettings]
  type NetworkStats = org.scalablytyped.runtime.StringDictionary[dockerodeLib.Anon_Rxbytes]
  type PluginInspectInfo = PluginInfo
  type PortMap = org.scalablytyped.runtime.StringDictionary[js.Array[PortBinding]]
}
