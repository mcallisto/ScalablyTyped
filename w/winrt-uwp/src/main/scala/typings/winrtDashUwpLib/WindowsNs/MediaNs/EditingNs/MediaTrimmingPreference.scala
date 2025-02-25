package typings
package winrtDashUwpLib.WindowsNs.MediaNs.EditingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MediaTrimmingPreference extends js.Object

/** Used to specify if media trimming should use a faster or a more precise algorithm during transcoding. */
@JSGlobal("Windows.Media.Editing.MediaTrimmingPreference")
@js.native
object MediaTrimmingPreference extends js.Object {
  /** Use the faster trimming algorithm during transcoding. */
  @js.native
  sealed trait fast
    extends winrtDashUwpLib.WindowsNs.MediaNs.EditingNs.MediaTrimmingPreference
  
  /** Use the more precise trimming algorithm during transcoding. */
  @js.native
  sealed trait precise
    extends winrtDashUwpLib.WindowsNs.MediaNs.EditingNs.MediaTrimmingPreference
  
  /* 0 */ val fast: fast with scala.Double = js.native
  /* 1 */ val precise: precise with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.EditingNs.MediaTrimmingPreference with scala.Double
  ] = js.native
}

