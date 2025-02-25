package typings
package mqttDashPacketLib.mqttDashPacketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUnsubscribePacket
  extends IPacket
     with Packet {
  @JSName("cmd")
  var cmd_IUnsubscribePacket: mqttDashPacketLib.mqttDashPacketLibStrings.unsubscribe
  var properties: js.UndefOr[mqttDashPacketLib.Anon_ReasonString] = js.undefined
  var unsubscriptions: js.Array[java.lang.String]
}

object IUnsubscribePacket {
  @scala.inline
  def apply(
    cmd: mqttDashPacketLib.mqttDashPacketLibStrings.unsubscribe,
    unsubscriptions: js.Array[java.lang.String],
    length: scala.Int | scala.Double = null,
    messageId: scala.Int | scala.Double = null,
    properties: mqttDashPacketLib.Anon_ReasonString = null
  ): IUnsubscribePacket = {
    val __obj = js.Dynamic.literal(cmd = cmd, unsubscriptions = unsubscriptions)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (messageId != null) __obj.updateDynamic("messageId")(messageId.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties)
    __obj.asInstanceOf[IUnsubscribePacket]
  }
}

