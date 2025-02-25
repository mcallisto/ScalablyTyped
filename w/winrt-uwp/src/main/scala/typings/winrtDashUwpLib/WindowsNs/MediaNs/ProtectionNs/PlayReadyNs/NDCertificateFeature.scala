package typings
package winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NDCertificateFeature extends js.Object

/** Indicates the PlayReady-ND feature to which the certificate controls access. */
@JSGlobal("Windows.Media.Protection.PlayReady.NDCertificateFeature")
@js.native
object NDCertificateFeature extends js.Object {
  /** Device implements anti-rollback clock. */
  @js.native
  sealed trait antiRollBackClock
    extends winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.NDCertificateFeature
  
  /** Entity supports certificate revocation lists. */
  @js.native
  sealed trait crls
    extends winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.NDCertificateFeature
  
  /** Entity supports PlayReady version 3.x features such as per-stream keys. */
  @js.native
  sealed trait playReady3Features
    extends winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.NDCertificateFeature
  
  /** Entity implements receiver functionality. */
  @js.native
  sealed trait receiver
    extends winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.NDCertificateFeature
  
  /** Device implements SecureClock. */
  @js.native
  sealed trait secureClock
    extends winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.NDCertificateFeature
  
  /** Entity shares receiver key across multiple devices. */
  @js.native
  sealed trait sharedCertificate
    extends winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.NDCertificateFeature
  
  /** Entity implements transmitter functionality. */
  @js.native
  sealed trait transmitter
    extends winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.NDCertificateFeature
  
  /* 4 */ val antiRollBackClock: antiRollBackClock with scala.Double = js.native
  /* 5 */ val crls: crls with scala.Double = js.native
  /* 6 */ val playReady3Features: playReady3Features with scala.Double = js.native
  /* 1 */ val receiver: receiver with scala.Double = js.native
  /* 3 */ val secureClock: secureClock with scala.Double = js.native
  /* 2 */ val sharedCertificate: sharedCertificate with scala.Double = js.native
  /* 0 */ val transmitter: transmitter with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.NDCertificateFeature with scala.Double
  ] = js.native
}

