package typings
package qrcodeLib.qrcodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QRCodeToFileOptions extends QRCodeRenderersOptions {
  var rendererOpts: js.UndefOr[qrcodeLib.Anon_DeflateLevel] = js.undefined
  /**
    * Output format.
    * Default: png
    */
  var `type`: js.UndefOr[
    qrcodeLib.qrcodeLibStrings.png | qrcodeLib.qrcodeLibStrings.svg | qrcodeLib.qrcodeLibStrings.utf8
  ] = js.undefined
}

object QRCodeToFileOptions {
  @scala.inline
  def apply(
    color: qrcodeLib.Anon_Dark = null,
    errorCorrectionLevel: QRCodeErrorCorrectionLevel = null,
    margin: scala.Int | scala.Double = null,
    rendererOpts: qrcodeLib.Anon_DeflateLevel = null,
    scale: scala.Int | scala.Double = null,
    toSJISFunc: /* codePoint */ java.lang.String => scala.Double = null,
    `type`: qrcodeLib.qrcodeLibStrings.png | qrcodeLib.qrcodeLibStrings.svg | qrcodeLib.qrcodeLibStrings.utf8 = null,
    version: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): QRCodeToFileOptions = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (errorCorrectionLevel != null) __obj.updateDynamic("errorCorrectionLevel")(errorCorrectionLevel)
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (rendererOpts != null) __obj.updateDynamic("rendererOpts")(rendererOpts)
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (toSJISFunc != null) __obj.updateDynamic("toSJISFunc")(js.Any.fromFunction1(toSJISFunc))
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[QRCodeToFileOptions]
  }
}

