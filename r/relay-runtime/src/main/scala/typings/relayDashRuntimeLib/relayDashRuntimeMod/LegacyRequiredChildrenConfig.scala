package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Unused in Relay Modern
trait LegacyRequiredChildrenConfig extends DeclarativeMutationConfig {
  var children: js.Array[_]
  var `type`: relayDashRuntimeLib.relayDashRuntimeLibStrings.REQUIRED_CHILDREN
}

object LegacyRequiredChildrenConfig {
  @scala.inline
  def apply(children: js.Array[_], `type`: relayDashRuntimeLib.relayDashRuntimeLibStrings.REQUIRED_CHILDREN): LegacyRequiredChildrenConfig = {
    val __obj = js.Dynamic.literal(children = children)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[LegacyRequiredChildrenConfig]
  }
}

