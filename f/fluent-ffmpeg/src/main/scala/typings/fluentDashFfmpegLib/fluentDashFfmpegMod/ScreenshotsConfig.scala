package typings
package fluentDashFfmpegLib.fluentDashFfmpegMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScreenshotsConfig extends js.Object {
  var count: js.UndefOr[scala.Double] = js.undefined
  var fastSeek: js.UndefOr[scala.Boolean] = js.undefined
  var filename: js.UndefOr[java.lang.String] = js.undefined
  var folder: js.UndefOr[java.lang.String] = js.undefined
  var size: js.UndefOr[java.lang.String] = js.undefined
  var timemarks: js.UndefOr[js.Array[scala.Double | java.lang.String]] = js.undefined
  var timestamps: js.UndefOr[js.Array[scala.Double | java.lang.String]] = js.undefined
}

object ScreenshotsConfig {
  @scala.inline
  def apply(
    count: scala.Int | scala.Double = null,
    fastSeek: js.UndefOr[scala.Boolean] = js.undefined,
    filename: java.lang.String = null,
    folder: java.lang.String = null,
    size: java.lang.String = null,
    timemarks: js.Array[scala.Double | java.lang.String] = null,
    timestamps: js.Array[scala.Double | java.lang.String] = null
  ): ScreenshotsConfig = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (!js.isUndefined(fastSeek)) __obj.updateDynamic("fastSeek")(fastSeek)
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (folder != null) __obj.updateDynamic("folder")(folder)
    if (size != null) __obj.updateDynamic("size")(size)
    if (timemarks != null) __obj.updateDynamic("timemarks")(timemarks)
    if (timestamps != null) __obj.updateDynamic("timestamps")(timestamps)
    __obj.asInstanceOf[ScreenshotsConfig]
  }
}

