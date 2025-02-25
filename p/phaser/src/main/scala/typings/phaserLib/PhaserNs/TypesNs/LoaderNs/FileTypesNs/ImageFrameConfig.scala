package typings
package phaserLib.PhaserNs.TypesNs.LoaderNs.FileTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageFrameConfig extends js.Object {
  /**
    * The frame to stop parsing at. If not provided it will calculate the value based on the image and frame dimensions.
    */
  var endFrame: js.UndefOr[phaserLib.integer] = js.undefined
  /**
    * The height of the frame in pixels. Uses the `frameWidth` value if not provided.
    */
  var frameHeight: js.UndefOr[phaserLib.integer] = js.undefined
  /**
    * The width of the frame in pixels.
    */
  var frameWidth: phaserLib.integer
  /**
    * The margin in the image. This is the space around the edge of the frames.
    */
  var margin: js.UndefOr[phaserLib.integer] = js.undefined
  /**
    * The spacing between each frame in the image.
    */
  var spacing: js.UndefOr[phaserLib.integer] = js.undefined
  /**
    * The first frame to start parsing from.
    */
  var startFrame: js.UndefOr[phaserLib.integer] = js.undefined
}

object ImageFrameConfig {
  @scala.inline
  def apply(
    frameWidth: phaserLib.integer,
    endFrame: js.UndefOr[phaserLib.integer] = js.undefined,
    frameHeight: js.UndefOr[phaserLib.integer] = js.undefined,
    margin: js.UndefOr[phaserLib.integer] = js.undefined,
    spacing: js.UndefOr[phaserLib.integer] = js.undefined,
    startFrame: js.UndefOr[phaserLib.integer] = js.undefined
  ): ImageFrameConfig = {
    val __obj = js.Dynamic.literal(frameWidth = frameWidth)
    if (!js.isUndefined(endFrame)) __obj.updateDynamic("endFrame")(endFrame)
    if (!js.isUndefined(frameHeight)) __obj.updateDynamic("frameHeight")(frameHeight)
    if (!js.isUndefined(margin)) __obj.updateDynamic("margin")(margin)
    if (!js.isUndefined(spacing)) __obj.updateDynamic("spacing")(spacing)
    if (!js.isUndefined(startFrame)) __obj.updateDynamic("startFrame")(startFrame)
    __obj.asInstanceOf[ImageFrameConfig]
  }
}

