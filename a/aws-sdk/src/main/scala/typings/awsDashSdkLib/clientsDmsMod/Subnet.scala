package typings
package awsDashSdkLib.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Subnet extends js.Object {
  /**
    * The Availability Zone of the subnet.
    */
  var SubnetAvailabilityZone: js.UndefOr[AvailabilityZone] = js.undefined
  /**
    * The subnet identifier.
    */
  var SubnetIdentifier: js.UndefOr[String] = js.undefined
  /**
    * The status of the subnet.
    */
  var SubnetStatus: js.UndefOr[String] = js.undefined
}

object Subnet {
  @scala.inline
  def apply(
    SubnetAvailabilityZone: AvailabilityZone = null,
    SubnetIdentifier: String = null,
    SubnetStatus: String = null
  ): Subnet = {
    val __obj = js.Dynamic.literal()
    if (SubnetAvailabilityZone != null) __obj.updateDynamic("SubnetAvailabilityZone")(SubnetAvailabilityZone)
    if (SubnetIdentifier != null) __obj.updateDynamic("SubnetIdentifier")(SubnetIdentifier)
    if (SubnetStatus != null) __obj.updateDynamic("SubnetStatus")(SubnetStatus)
    __obj.asInstanceOf[Subnet]
  }
}

