package typings
package agoraDashRtcDashSdkLib.agoraDashRtcDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Statistics of the network quality. */
trait NetworkQualityStats extends js.Object {
  /**
    * The downlink network quality.
    *
    *  - "0": The network quality is unknown.
    *  - "1": The network quality is excellent.
    *  - "2": The network quality is quite good, but the bitrate may be slightly lower than excellent.
    *  - "3": Users can feel the communication slightly impaired.
    *  - "4": Users can communicate only not very smoothly.
    *  - "5": The network is so bad that users can hardly communicate.
    *  - "6": The network is down and users cannot communicate at all.
    */
  val downlinkNetworkQuality: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The uplink network quality.
    *
    *  - "0": The network quality is unknown.
    *  - "1": The network quality is excellent.
    *  - "2": The network quality is quite good, but the bitrate may be slightly lower than excellent.
    *  - "3": Users can feel the communication slightly impaired.
    *  - "4": Users can communicate only not very smoothly.
    *  - "5": The network is so bad that users can hardly communicate.
    *  - "6": The network is down and users cannot communicate at all.
    */
  val uplinkNetworkQuality: js.UndefOr[java.lang.String] = js.undefined
}

object NetworkQualityStats {
  @scala.inline
  def apply(downlinkNetworkQuality: java.lang.String = null, uplinkNetworkQuality: java.lang.String = null): NetworkQualityStats = {
    val __obj = js.Dynamic.literal()
    if (downlinkNetworkQuality != null) __obj.updateDynamic("downlinkNetworkQuality")(downlinkNetworkQuality)
    if (uplinkNetworkQuality != null) __obj.updateDynamic("uplinkNetworkQuality")(uplinkNetworkQuality)
    __obj.asInstanceOf[NetworkQualityStats]
  }
}

