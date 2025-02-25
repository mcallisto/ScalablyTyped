package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AcceptVpcEndpointConnectionsResult extends js.Object {
  /**
    * Information about the interface endpoints that were not accepted, if applicable.
    */
  var Unsuccessful: js.UndefOr[UnsuccessfulItemSet] = js.undefined
}

object AcceptVpcEndpointConnectionsResult {
  @scala.inline
  def apply(Unsuccessful: UnsuccessfulItemSet = null): AcceptVpcEndpointConnectionsResult = {
    val __obj = js.Dynamic.literal()
    if (Unsuccessful != null) __obj.updateDynamic("Unsuccessful")(Unsuccessful)
    __obj.asInstanceOf[AcceptVpcEndpointConnectionsResult]
  }
}

