package typings
package phaserLib.PhaserNs.TypesNs.LoaderNs.FileTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpriteSheetFileConfig extends js.Object {
  /**
    * The default file extension to use if no url is provided.
    */
  var extension: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The frame configuration object.
    */
  var frameConfig: js.UndefOr[ImageFrameConfig] = js.undefined
  /**
    * The key of the file. Must be unique within both the Loader and the Texture Manager.
    */
  var key: java.lang.String
  /**
    * The filename of an associated normal map. It uses the same path and url to load as the image.
    */
  var normalMap: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The absolute or relative URL to load the file from.
    */
  var url: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Extra XHR Settings specifically for this file.
    */
  var xhrSettings: js.UndefOr[phaserLib.PhaserNs.TypesNs.LoaderNs.XHRSettingsObject] = js.undefined
}

object SpriteSheetFileConfig {
  @scala.inline
  def apply(
    key: java.lang.String,
    extension: java.lang.String = null,
    frameConfig: ImageFrameConfig = null,
    normalMap: java.lang.String = null,
    url: java.lang.String = null,
    xhrSettings: phaserLib.PhaserNs.TypesNs.LoaderNs.XHRSettingsObject = null
  ): SpriteSheetFileConfig = {
    val __obj = js.Dynamic.literal(key = key)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (frameConfig != null) __obj.updateDynamic("frameConfig")(frameConfig)
    if (normalMap != null) __obj.updateDynamic("normalMap")(normalMap)
    if (url != null) __obj.updateDynamic("url")(url)
    if (xhrSettings != null) __obj.updateDynamic("xhrSettings")(xhrSettings)
    __obj.asInstanceOf[SpriteSheetFileConfig]
  }
}

