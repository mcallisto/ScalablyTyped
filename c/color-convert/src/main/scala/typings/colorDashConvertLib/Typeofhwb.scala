package typings
package colorDashConvertLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofhwb extends js.Object {
  val channels: colorDashConvertLib.colorDashConvertLibNumbers.`3`
  val labels: colorDashConvertLib.colorDashConvertLibStrings.hwb
  def hcg(hwb: colorDashConvertLib.conversionsMod.HWB): colorDashConvertLib.conversionsMod.HCG
  def rgb(hwb: colorDashConvertLib.conversionsMod.HWB): colorDashConvertLib.conversionsMod.RGB
}

object Typeofhwb {
  @scala.inline
  def apply(
    channels: colorDashConvertLib.colorDashConvertLibNumbers.`3`,
    hcg: colorDashConvertLib.conversionsMod.HWB => colorDashConvertLib.conversionsMod.HCG,
    labels: colorDashConvertLib.colorDashConvertLibStrings.hwb,
    rgb: colorDashConvertLib.conversionsMod.HWB => colorDashConvertLib.conversionsMod.RGB
  ): Typeofhwb = {
    val __obj = js.Dynamic.literal(channels = channels, hcg = js.Any.fromFunction1(hcg), labels = labels, rgb = js.Any.fromFunction1(rgb))
  
    __obj.asInstanceOf[Typeofhwb]
  }
}

