package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HostNameSortOptions extends js.Object

/** Options for how a list of EndpointPair objects is sorted. */
@JSGlobal("Windows.Networking.HostNameSortOptions")
@js.native
object HostNameSortOptions extends js.Object {
  /** Sort a list of EndpointPair objects by the default criteria used the system which is to minimize connection delays. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.HostNameSortOptions
  
  /** Sort a list of EndpointPair objects to optimize for long connections. */
  @js.native
  sealed trait optimizeForLongConnections
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.HostNameSortOptions
  
  /* 0 */ val none: none with scala.Double = js.native
  /* 1 */ val optimizeForLongConnections: optimizeForLongConnections with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.NetworkingNs.HostNameSortOptions with scala.Double] = js.native
}

