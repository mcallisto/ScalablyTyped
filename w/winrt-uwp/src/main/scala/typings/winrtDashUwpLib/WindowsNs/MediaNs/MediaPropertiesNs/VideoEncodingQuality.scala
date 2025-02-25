package typings
package winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VideoEncodingQuality extends js.Object

/** Determines the video encoding format. */
@JSGlobal("Windows.Media.MediaProperties.VideoEncodingQuality")
@js.native
object VideoEncodingQuality extends js.Object {
  /** Auto fills in the proper settings based on the current camera settings. So when Auto is used, settings that are manually modified are ignored. For example, if you create a preset profile using one the static create methods, such as CreateWmv , and specify Auto as the encoding quality, any changes you make to the properties will be overwritten with values based on the current camera settings. */
  @js.native
  sealed trait auto
    extends winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.VideoEncodingQuality
  
  /** HD1080p format. */
  @js.native
  sealed trait hd1080p
    extends winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.VideoEncodingQuality
  
  /** HD720p format. */
  @js.native
  sealed trait hd720p
    extends winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.VideoEncodingQuality
  
  /** Ntsc format. */
  @js.native
  sealed trait ntsc
    extends winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.VideoEncodingQuality
  
  /** Pal format. */
  @js.native
  sealed trait pal
    extends winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.VideoEncodingQuality
  
  /** Qvga format. */
  @js.native
  sealed trait qvga
    extends winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.VideoEncodingQuality
  
  /** Vga format. */
  @js.native
  sealed trait vga
    extends winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.VideoEncodingQuality
  
  /** Wvga format. */
  @js.native
  sealed trait wvga
    extends winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.VideoEncodingQuality
  
  /* 0 */ val auto: auto with scala.Double = js.native
  /* 1 */ val hd1080p: hd1080p with scala.Double = js.native
  /* 2 */ val hd720p: hd720p with scala.Double = js.native
  /* 4 */ val ntsc: ntsc with scala.Double = js.native
  /* 5 */ val pal: pal with scala.Double = js.native
  /* 7 */ val qvga: qvga with scala.Double = js.native
  /* 6 */ val vga: vga with scala.Double = js.native
  /* 3 */ val wvga: wvga with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.VideoEncodingQuality with scala.Double
  ] = js.native
}

