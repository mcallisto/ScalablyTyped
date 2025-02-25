package typings
package mqttDashPacketLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Payload extends js.Object {
  var payload: nodeLib.Buffer
  var properties: js.UndefOr[Anon_ContentType] = js.undefined
  var qos: js.UndefOr[mqttDashPacketLib.mqttDashPacketMod.QoS] = js.undefined
  var retain: js.UndefOr[scala.Boolean] = js.undefined
  var topic: java.lang.String
}

object Anon_Payload {
  @scala.inline
  def apply(
    payload: nodeLib.Buffer,
    topic: java.lang.String,
    properties: Anon_ContentType = null,
    qos: mqttDashPacketLib.mqttDashPacketMod.QoS = null,
    retain: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Payload = {
    val __obj = js.Dynamic.literal(payload = payload, topic = topic)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (qos != null) __obj.updateDynamic("qos")(qos)
    if (!js.isUndefined(retain)) __obj.updateDynamic("retain")(retain)
    __obj.asInstanceOf[Anon_Payload]
  }
}

