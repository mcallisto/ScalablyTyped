package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofnetwork extends js.Object {
  /** Retrieves information about local adapters on this system. */
  def getNetworkInterfaces(
    callback: js.Function1[
      /* networkInterfaces */ js.Array[chromeDashAppsLib.chromeNs.systemNs.networkNs.NetworkInterface], 
      scala.Unit
    ]
  ): scala.Unit
}

object Typeofnetwork {
  @scala.inline
  def apply(
    getNetworkInterfaces: js.Function1[
      /* networkInterfaces */ js.Array[chromeDashAppsLib.chromeNs.systemNs.networkNs.NetworkInterface], 
      scala.Unit
    ] => scala.Unit
  ): Typeofnetwork = {
    val __obj = js.Dynamic.literal(getNetworkInterfaces = js.Any.fromFunction1(getNetworkInterfaces))
  
    __obj.asInstanceOf[Typeofnetwork]
  }
}

