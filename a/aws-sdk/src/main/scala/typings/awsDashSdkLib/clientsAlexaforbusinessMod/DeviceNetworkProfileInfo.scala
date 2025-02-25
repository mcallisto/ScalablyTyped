package typings
package awsDashSdkLib.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceNetworkProfileInfo extends js.Object {
  /**
    * The ARN of the certificate associated with a device.
    */
  var CertificateArn: js.UndefOr[Arn] = js.undefined
  /**
    * The time (in epoch) when the certificate expires.
    */
  var CertificateExpirationTime: js.UndefOr[CertificateTime] = js.undefined
  /**
    * The ARN of the network profile associated with a device.
    */
  var NetworkProfileArn: js.UndefOr[Arn] = js.undefined
}

object DeviceNetworkProfileInfo {
  @scala.inline
  def apply(
    CertificateArn: Arn = null,
    CertificateExpirationTime: CertificateTime = null,
    NetworkProfileArn: Arn = null
  ): DeviceNetworkProfileInfo = {
    val __obj = js.Dynamic.literal()
    if (CertificateArn != null) __obj.updateDynamic("CertificateArn")(CertificateArn)
    if (CertificateExpirationTime != null) __obj.updateDynamic("CertificateExpirationTime")(CertificateExpirationTime)
    if (NetworkProfileArn != null) __obj.updateDynamic("NetworkProfileArn")(NetworkProfileArn)
    __obj.asInstanceOf[DeviceNetworkProfileInfo]
  }
}

