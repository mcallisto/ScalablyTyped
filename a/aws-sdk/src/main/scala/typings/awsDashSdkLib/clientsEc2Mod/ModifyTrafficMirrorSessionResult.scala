package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyTrafficMirrorSessionResult extends js.Object {
  /**
    * Information about the Traffic Mirror session.
    */
  var TrafficMirrorSession: js.UndefOr[TrafficMirrorSession] = js.undefined
}

object ModifyTrafficMirrorSessionResult {
  @scala.inline
  def apply(TrafficMirrorSession: TrafficMirrorSession = null): ModifyTrafficMirrorSessionResult = {
    val __obj = js.Dynamic.literal()
    if (TrafficMirrorSession != null) __obj.updateDynamic("TrafficMirrorSession")(TrafficMirrorSession)
    __obj.asInstanceOf[ModifyTrafficMirrorSessionResult]
  }
}

