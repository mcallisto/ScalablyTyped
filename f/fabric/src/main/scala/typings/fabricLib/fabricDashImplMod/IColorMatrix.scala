package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IColorMatrix extends IBaseFilter {
  var matrix: js.UndefOr[js.Array[scala.Double]] = js.native
  /**
  	 * Applies filter to canvas element
  	 * @param canvasEl Canvas element to apply filter to
  	 */
  def applyTo(canvasEl: stdLib.HTMLCanvasElement): scala.Unit = js.native
}

