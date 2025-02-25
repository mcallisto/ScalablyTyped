package typings
package awsDashSdkLib.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Certificate extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the certificate.
    */
  var CertificateArn: js.UndefOr[CertificateArn] = js.undefined
  /**
    * Indicates whether the certificate is the default certificate. Do not set this value when specifying a certificate as an input. This value is not included in the output when describing a listener, but is included when describing listener certificates.
    */
  var IsDefault: js.UndefOr[Default] = js.undefined
}

object Certificate {
  @scala.inline
  def apply(CertificateArn: CertificateArn = null, IsDefault: js.UndefOr[Default] = js.undefined): Certificate = {
    val __obj = js.Dynamic.literal()
    if (CertificateArn != null) __obj.updateDynamic("CertificateArn")(CertificateArn)
    if (!js.isUndefined(IsDefault)) __obj.updateDynamic("IsDefault")(IsDefault)
    __obj.asInstanceOf[Certificate]
  }
}

