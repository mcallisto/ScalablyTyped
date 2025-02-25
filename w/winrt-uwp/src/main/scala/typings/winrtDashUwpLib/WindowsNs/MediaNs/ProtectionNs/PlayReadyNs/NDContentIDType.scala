package typings
package winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NDContentIDType extends js.Object

/** Indicates the types of content that PlayReady can use in different scenarios. */
@JSGlobal("Windows.Media.Protection.PlayReady.NDContentIDType")
@js.native
object NDContentIDType extends js.Object {
  /** Custom object specific to the transmitter. It is expected that the transmitter will understand the data contained therein. PlayReady does not define a standard format for custom content identifiers. */
  @js.native
  sealed trait custom
    extends winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.NDContentIDType
  
  /** License key identifier. */
  @js.native
  sealed trait keyID
    extends winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.NDContentIDType
  
  /** PlayReadyObject can be one of the following two objects. */
  @js.native
  sealed trait playReadyObject
    extends winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.NDContentIDType
  
  /* 2 */ val custom: custom with scala.Double = js.native
  /* 0 */ val keyID: keyID with scala.Double = js.native
  /* 1 */ val playReadyObject: playReadyObject with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs.NDContentIDType with scala.Double
  ] = js.native
}

