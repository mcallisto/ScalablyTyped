package typings
package winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BitmapRotation extends js.Object

/** Specifies the rotation operation to be performed on pixel data. */
@JSGlobal("Windows.Graphics.Imaging.BitmapRotation")
@js.native
object BitmapRotation extends js.Object {
  /** Perform a clockwise rotation of 180 degrees. */
  @js.native
  sealed trait clockwise180Degrees
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.BitmapRotation
  
  /** Perform a clockwise rotation of 270 degrees. */
  @js.native
  sealed trait clockwise270Degrees
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.BitmapRotation
  
  /** Perform a clockwise rotation of 90 degrees. */
  @js.native
  sealed trait clockwise90Degrees
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.BitmapRotation
  
  /** No rotation operation is performed. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.BitmapRotation
  
  /* 2 */ val clockwise180Degrees: clockwise180Degrees with scala.Double = js.native
  /* 3 */ val clockwise270Degrees: clockwise270Degrees with scala.Double = js.native
  /* 1 */ val clockwise90Degrees: clockwise90Degrees with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.BitmapRotation with scala.Double] = js.native
}

