package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstancePortState extends js.Object {
  /**
    * The first port in the range.
    */
  var fromPort: js.UndefOr[Port] = js.undefined
  /**
    * The protocol being used. Can be one of the following.    tcp - Transmission Control Protocol (TCP) provides reliable, ordered, and error-checked delivery of streamed data between applications running on hosts communicating by an IP network. If you have an application that doesn't require reliable data stream service, use UDP instead.    all - All transport layer protocol types. For more general information, see Transport layer on Wikipedia.    udp - With User Datagram Protocol (UDP), computer applications can send messages (or datagrams) to other hosts on an Internet Protocol (IP) network. Prior communications are not required to set up transmission channels or data paths. Applications that don't require reliable data stream service can use UDP, which provides a connectionless datagram service that emphasizes reduced latency over reliability. If you do require reliable data stream service, use TCP instead.  
    */
  var protocol: js.UndefOr[NetworkProtocol] = js.undefined
  /**
    * Specifies whether the instance port is open or closed.
    */
  var state: js.UndefOr[PortState] = js.undefined
  /**
    * The last port in the range.
    */
  var toPort: js.UndefOr[Port] = js.undefined
}

object InstancePortState {
  @scala.inline
  def apply(
    fromPort: js.UndefOr[Port] = js.undefined,
    protocol: NetworkProtocol = null,
    state: PortState = null,
    toPort: js.UndefOr[Port] = js.undefined
  ): InstancePortState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fromPort)) __obj.updateDynamic("fromPort")(fromPort)
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (!js.isUndefined(toPort)) __obj.updateDynamic("toPort")(toPort)
    __obj.asInstanceOf[InstancePortState]
  }
}

