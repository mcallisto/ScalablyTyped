package typings
package phaserLib.PhaserNs.TypesNs.AnimationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenerateFrameNames extends js.Object {
  /**
    * If `frames` is not provided, the number of the last frame to return.
    */
  var end: js.UndefOr[phaserLib.integer] = js.undefined
  /**
    * If provided as an array, the range defined by `start` and `end` will be ignored and these frame numbers will be used.
    */
  var frames: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The array to append the created configuration objects to.
    */
  var outputArray: js.UndefOr[js.Array[AnimationFrame]] = js.undefined
  /**
    * The string to append to every resulting frame name if using a range or an array of `frames`.
    */
  var prefix: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If `frames` is not provided, the number of the first frame to return.
    */
  var start: js.UndefOr[phaserLib.integer] = js.undefined
  /**
    * The string to append to every resulting frame name if using a range or an array of `frames`.
    */
  var suffix: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The minimum expected lengths of each resulting frame's number. Numbers will be left-padded with zeroes until they are this long, then prepended and appended to create the resulting frame name.
    */
  var zeroPad: js.UndefOr[phaserLib.integer] = js.undefined
}

object GenerateFrameNames {
  @scala.inline
  def apply(
    end: js.UndefOr[phaserLib.integer] = js.undefined,
    frames: js.UndefOr[scala.Boolean] = js.undefined,
    outputArray: js.Array[AnimationFrame] = null,
    prefix: java.lang.String = null,
    start: js.UndefOr[phaserLib.integer] = js.undefined,
    suffix: java.lang.String = null,
    zeroPad: js.UndefOr[phaserLib.integer] = js.undefined
  ): GenerateFrameNames = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(end)) __obj.updateDynamic("end")(end)
    if (!js.isUndefined(frames)) __obj.updateDynamic("frames")(frames)
    if (outputArray != null) __obj.updateDynamic("outputArray")(outputArray)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (!js.isUndefined(start)) __obj.updateDynamic("start")(start)
    if (suffix != null) __obj.updateDynamic("suffix")(suffix)
    if (!js.isUndefined(zeroPad)) __obj.updateDynamic("zeroPad")(zeroPad)
    __obj.asInstanceOf[GenerateFrameNames]
  }
}

