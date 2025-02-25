package typings
package awsDashSdkLib.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateImageBuilderStreamingURLRequest extends js.Object {
  /**
    * The name of the image builder.
    */
  var Name: String
  /**
    * The time that the streaming URL will be valid, in seconds. Specify a value between 1 and 604800 seconds. The default is 3600 seconds.
    */
  var Validity: js.UndefOr[Long] = js.undefined
}

object CreateImageBuilderStreamingURLRequest {
  @scala.inline
  def apply(Name: String, Validity: js.UndefOr[Long] = js.undefined): CreateImageBuilderStreamingURLRequest = {
    val __obj = js.Dynamic.literal(Name = Name)
    if (!js.isUndefined(Validity)) __obj.updateDynamic("Validity")(Validity)
    __obj.asInstanceOf[CreateImageBuilderStreamingURLRequest]
  }
}

