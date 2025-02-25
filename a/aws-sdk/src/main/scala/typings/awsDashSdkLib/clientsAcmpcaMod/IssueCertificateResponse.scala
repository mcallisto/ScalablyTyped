package typings
package awsDashSdkLib.clientsAcmpcaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssueCertificateResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the issued certificate and the certificate serial number. This is of the form:  arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012/certificate/286535153982981100925020015808220737245  
    */
  var CertificateArn: js.UndefOr[Arn] = js.undefined
}

object IssueCertificateResponse {
  @scala.inline
  def apply(CertificateArn: Arn = null): IssueCertificateResponse = {
    val __obj = js.Dynamic.literal()
    if (CertificateArn != null) __obj.updateDynamic("CertificateArn")(CertificateArn)
    __obj.asInstanceOf[IssueCertificateResponse]
  }
}

