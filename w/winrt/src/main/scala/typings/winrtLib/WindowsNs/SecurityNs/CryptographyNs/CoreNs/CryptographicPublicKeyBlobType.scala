package typings
package winrtLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CryptographicPublicKeyBlobType extends js.Object

@JSGlobal("Windows.Security.Cryptography.Core.CryptographicPublicKeyBlobType")
@js.native
object CryptographicPublicKeyBlobType extends js.Object {
  @js.native
  sealed trait bCryptPublicKey
    extends winrtLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs.CryptographicPublicKeyBlobType
  
  @js.native
  sealed trait capi1PublicKey
    extends winrtLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs.CryptographicPublicKeyBlobType
  
  @js.native
  sealed trait pkcs1RsaPublicKey
    extends winrtLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs.CryptographicPublicKeyBlobType
  
  @js.native
  sealed trait x509SubjectPublicKeyInfo
    extends winrtLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs.CryptographicPublicKeyBlobType
  
  /* 2 */ val bCryptPublicKey: bCryptPublicKey with scala.Double = js.native
  /* 3 */ val capi1PublicKey: capi1PublicKey with scala.Double = js.native
  /* 1 */ val pkcs1RsaPublicKey: pkcs1RsaPublicKey with scala.Double = js.native
  /* 0 */ val x509SubjectPublicKeyInfo: x509SubjectPublicKeyInfo with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtLib.WindowsNs.SecurityNs.CryptographyNs.CoreNs.CryptographicPublicKeyBlobType with scala.Double
  ] = js.native
}

