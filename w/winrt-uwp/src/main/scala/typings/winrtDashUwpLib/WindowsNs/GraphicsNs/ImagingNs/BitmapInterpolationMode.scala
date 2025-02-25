package typings
package winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BitmapInterpolationMode extends js.Object

/** Specifies the interpolation mode used for scaling pixel data. */
@JSGlobal("Windows.Graphics.Imaging.BitmapInterpolationMode")
@js.native
object BitmapInterpolationMode extends js.Object {
  /** A bicubic interpolation algorithm. Destination pixel values are computed as a weighted average of the nearest sixteen pixels in a 4x4 grid. */
  @js.native
  sealed trait cubic
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.BitmapInterpolationMode
  
  /** A Fant resampling algorithm. Destination pixel values are computed as a weighted average of the all the pixels that map to the new pixel in a box shaped kernel. */
  @js.native
  sealed trait fant
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.BitmapInterpolationMode
  
  /** A bilinear interpolation algorithm. The output pixel values are computed as a weighted average of the nearest four pixels in a 2x2 grid. */
  @js.native
  sealed trait linear
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.BitmapInterpolationMode
  
  /** A nearest neighbor interpolation algorithm. Also known as nearest pixel or point interpolation. The output pixel is assigned the value of the pixel that the point falls within. No other pixels are considered. */
  @js.native
  sealed trait nearestNeighbor
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.BitmapInterpolationMode
  
  /* 2 */ val cubic: cubic with scala.Double = js.native
  /* 3 */ val fant: fant with scala.Double = js.native
  /* 1 */ val linear: linear with scala.Double = js.native
  /* 0 */ val nearestNeighbor: nearestNeighbor with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.BitmapInterpolationMode with scala.Double
  ] = js.native
}

