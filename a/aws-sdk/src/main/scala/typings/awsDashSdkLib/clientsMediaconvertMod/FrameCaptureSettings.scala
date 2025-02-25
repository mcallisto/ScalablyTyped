package typings
package awsDashSdkLib.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FrameCaptureSettings extends js.Object {
  /**
    * Frame capture will encode the first frame of the output stream, then one frame every framerateDenominator/framerateNumerator seconds. For example, settings of framerateNumerator = 1 and framerateDenominator = 3 (a rate of 1/3 frame per second) will capture the first frame, then 1 frame every 3s. Files will be named as filename.n.jpg where n is the 0-based sequence number of each Capture.
    */
  var FramerateDenominator: js.UndefOr[__integerMin1Max2147483647] = js.undefined
  /**
    * Frame capture will encode the first frame of the output stream, then one frame every framerateDenominator/framerateNumerator seconds. For example, settings of framerateNumerator = 1 and framerateDenominator = 3 (a rate of 1/3 frame per second) will capture the first frame, then 1 frame every 3s. Files will be named as filename.NNNNNNN.jpg where N is the 0-based frame sequence number zero padded to 7 decimal places.
    */
  var FramerateNumerator: js.UndefOr[__integerMin1Max2147483647] = js.undefined
  /**
    * Maximum number of captures (encoded jpg output files).
    */
  var MaxCaptures: js.UndefOr[__integerMin1Max10000000] = js.undefined
  /**
    * JPEG Quality - a higher value equals higher quality.
    */
  var Quality: js.UndefOr[__integerMin1Max100] = js.undefined
}

object FrameCaptureSettings {
  @scala.inline
  def apply(
    FramerateDenominator: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
    FramerateNumerator: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
    MaxCaptures: js.UndefOr[__integerMin1Max10000000] = js.undefined,
    Quality: js.UndefOr[__integerMin1Max100] = js.undefined
  ): FrameCaptureSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(FramerateDenominator)) __obj.updateDynamic("FramerateDenominator")(FramerateDenominator)
    if (!js.isUndefined(FramerateNumerator)) __obj.updateDynamic("FramerateNumerator")(FramerateNumerator)
    if (!js.isUndefined(MaxCaptures)) __obj.updateDynamic("MaxCaptures")(MaxCaptures)
    if (!js.isUndefined(Quality)) __obj.updateDynamic("Quality")(Quality)
    __obj.asInstanceOf[FrameCaptureSettings]
  }
}

