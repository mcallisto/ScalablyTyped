package typings
package winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ExportOption extends js.Object

/** Specifies whether a private key can be exported. This enumeration type is used in the Exportable property of a CertificateRequestProperties object. */
@JSGlobal("Windows.Security.Cryptography.Certificates.ExportOption")
@js.native
object ExportOption extends js.Object {
  /** The private key is exportable. */
  @js.native
  sealed trait exportable
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.ExportOption
  
  /** The private key is not exportable. */
  @js.native
  sealed trait notExportable
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.ExportOption
  
  /* 1 */ val exportable: exportable with scala.Double = js.native
  /* 0 */ val notExportable: notExportable with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.ExportOption with scala.Double
  ] = js.native
}

