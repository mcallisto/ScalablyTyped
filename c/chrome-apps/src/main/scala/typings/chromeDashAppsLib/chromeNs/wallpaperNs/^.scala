package typings
package chromeDashAppsLib.chromeNs.wallpaperNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.wallpaper")
@js.native
object ^ extends js.Object {
  /**
    * Sets wallpaper to the image at url or wallpaperData with the specified layout
    * @param callback Contains the optional parameter thumbnail: The jpeg encoded wallpaper thumbnail. It is generated by resizing the wallpaper to 128x60.
    */
  def setWallpaper(
    details: WallpaperDetails,
    callback: js.Function1[/* thumbnail */ js.UndefOr[java.lang.String], scala.Unit]
  ): scala.Unit = js.native
}

