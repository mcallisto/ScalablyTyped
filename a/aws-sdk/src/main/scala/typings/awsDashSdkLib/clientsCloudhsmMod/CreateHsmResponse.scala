package typings
package awsDashSdkLib.clientsCloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateHsmResponse extends js.Object {
  /**
    * The ARN of the HSM.
    */
  var HsmArn: js.UndefOr[HsmArn] = js.undefined
}

object CreateHsmResponse {
  @scala.inline
  def apply(HsmArn: HsmArn = null): CreateHsmResponse = {
    val __obj = js.Dynamic.literal()
    if (HsmArn != null) __obj.updateDynamic("HsmArn")(HsmArn)
    __obj.asInstanceOf[CreateHsmResponse]
  }
}

