package typings
package awsDashSdkLib.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetServerCertificateResponse extends js.Object {
  /**
    * A structure containing details about the server certificate.
    */
  var ServerCertificate: awsDashSdkLib.clientsIamMod.ServerCertificate
}

object GetServerCertificateResponse {
  @scala.inline
  def apply(ServerCertificate: ServerCertificate): GetServerCertificateResponse = {
    val __obj = js.Dynamic.literal(ServerCertificate = ServerCertificate)
  
    __obj.asInstanceOf[GetServerCertificateResponse]
  }
}

