package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait webkitRTCPeerConnection extends RTCPeerConnection

@JSGlobal("webkitRTCPeerConnection")
@js.native
class webkitRTCPeerConnectionCls protected () extends webkitRTCPeerConnection {
  def this(configuration: RTCConfiguration) = this()
}

@JSGlobal("webkitRTCPeerConnection")
@js.native
object webkitRTCPeerConnection
  extends org.scalablytyped.runtime.Instantiable1[/* configuration */ RTCConfiguration, webkitRTCPeerConnection]

