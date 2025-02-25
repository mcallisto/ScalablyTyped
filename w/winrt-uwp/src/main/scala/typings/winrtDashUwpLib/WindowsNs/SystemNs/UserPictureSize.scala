package typings
package winrtDashUwpLib.WindowsNs.SystemNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UserPictureSize extends js.Object

/** Represents user picture sizes. */
@JSGlobal("Windows.System.UserPictureSize")
@js.native
object UserPictureSize extends js.Object {
  /** The picture size is 1080x1080. */
  @js.native
  sealed trait size1080x1080
    extends winrtDashUwpLib.WindowsNs.SystemNs.UserPictureSize
  
  /** The picture size is 208x208. */
  @js.native
  sealed trait size208x208
    extends winrtDashUwpLib.WindowsNs.SystemNs.UserPictureSize
  
  /** The picture size is 424x424. */
  @js.native
  sealed trait size424x424
    extends winrtDashUwpLib.WindowsNs.SystemNs.UserPictureSize
  
  /** The picture size is 64x64. */
  @js.native
  sealed trait size64x64
    extends winrtDashUwpLib.WindowsNs.SystemNs.UserPictureSize
  
  /* 3 */ val size1080x1080: size1080x1080 with scala.Double = js.native
  /* 1 */ val size208x208: size208x208 with scala.Double = js.native
  /* 2 */ val size424x424: size424x424 with scala.Double = js.native
  /* 0 */ val size64x64: size64x64 with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.SystemNs.UserPictureSize with scala.Double] = js.native
}

