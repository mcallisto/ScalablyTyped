package typings
package awsDashSdkLib.clientsDaxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RebootNodeResponse extends js.Object {
  /**
    * A description of the DAX cluster after a node has been rebooted.
    */
  var Cluster: js.UndefOr[Cluster] = js.undefined
}

object RebootNodeResponse {
  @scala.inline
  def apply(Cluster: Cluster = null): RebootNodeResponse = {
    val __obj = js.Dynamic.literal()
    if (Cluster != null) __obj.updateDynamic("Cluster")(Cluster)
    __obj.asInstanceOf[RebootNodeResponse]
  }
}

