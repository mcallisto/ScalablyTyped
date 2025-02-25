package typings
package firefoxDashWebextDashBrowserLib.browserNs.webRequestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait _WebRequestOnHeadersReceivedEvent[TCallback] extends js.Object {
  def addListener(cb: TCallback, filter: RequestFilter): scala.Unit = js.native
  def addListener(cb: TCallback, filter: RequestFilter, extraInfoSpec: js.Array[OnHeadersReceivedOptions]): scala.Unit = js.native
  def hasListener(cb: TCallback): scala.Boolean = js.native
  def removeListener(cb: TCallback): scala.Unit = js.native
}

