package typings
package actionsDashOnDashGoogleLib.responseDashBuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ImageDisplays extends js.Object

@JSImport("actions-on-google/response-builder", "ImageDisplays")
@js.native
object ImageDisplays extends js.Object {
  /**
    * Image is scaled such that the image width matches the container width. This may crop the top
    * and bottom of the image if the scaled image height is greater than the container height. This
    * is similar to "Zoom Mode" on a widescreen TV when playing a 4:3 video.
    */
  @js.native
  sealed trait CROPPED
    extends actionsDashOnDashGoogleLib.responseDashBuilderMod.ImageDisplays
  
  /**
    * Pads the gaps between the image and image frame with a blurred copy of the
    * same image.
    */
  @js.native
  sealed trait DEFAULT
    extends actionsDashOnDashGoogleLib.responseDashBuilderMod.ImageDisplays
  
  /**
    * Fill the gap between the image and image container with white bars.
    */
  @js.native
  sealed trait WHITE
    extends actionsDashOnDashGoogleLib.responseDashBuilderMod.ImageDisplays
  
  /* 2 */ val CROPPED: CROPPED with scala.Double = js.native
  /* 0 */ val DEFAULT: DEFAULT with scala.Double = js.native
  /* 1 */ val WHITE: WHITE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    actionsDashOnDashGoogleLib.responseDashBuilderMod.ImageDisplays with scala.Double
  ] = js.native
}

