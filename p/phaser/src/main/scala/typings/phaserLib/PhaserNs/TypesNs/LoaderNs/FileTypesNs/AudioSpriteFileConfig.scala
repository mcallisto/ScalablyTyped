package typings
package phaserLib.PhaserNs.TypesNs.LoaderNs.FileTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AudioSpriteFileConfig extends js.Object {
  /**
    * The audio configuration options.
    */
  var audioConfig: js.UndefOr[js.Any] = js.undefined
  /**
    * The absolute or relative URL to load the audio file from.
    */
  var audioURL: js.UndefOr[js.Object] = js.undefined
  /**
    * Extra XHR Settings specifically for the audio file.
    */
  var audioXhrSettings: js.UndefOr[phaserLib.PhaserNs.TypesNs.LoaderNs.XHRSettingsObject] = js.undefined
  /**
    * The absolute or relative URL to load the json file from. Or a well formed JSON object to use instead.
    */
  var jsonURL: java.lang.String
  /**
    * Extra XHR Settings specifically for the json file.
    */
  var jsonXhrSettings: js.UndefOr[phaserLib.PhaserNs.TypesNs.LoaderNs.XHRSettingsObject] = js.undefined
  /**
    * The key of the file. Must be unique within both the Loader and the Audio Cache.
    */
  var key: java.lang.String
}

object AudioSpriteFileConfig {
  @scala.inline
  def apply(
    jsonURL: java.lang.String,
    key: java.lang.String,
    audioConfig: js.Any = null,
    audioURL: js.Object = null,
    audioXhrSettings: phaserLib.PhaserNs.TypesNs.LoaderNs.XHRSettingsObject = null,
    jsonXhrSettings: phaserLib.PhaserNs.TypesNs.LoaderNs.XHRSettingsObject = null
  ): AudioSpriteFileConfig = {
    val __obj = js.Dynamic.literal(jsonURL = jsonURL, key = key)
    if (audioConfig != null) __obj.updateDynamic("audioConfig")(audioConfig)
    if (audioURL != null) __obj.updateDynamic("audioURL")(audioURL)
    if (audioXhrSettings != null) __obj.updateDynamic("audioXhrSettings")(audioXhrSettings)
    if (jsonXhrSettings != null) __obj.updateDynamic("jsonXhrSettings")(jsonXhrSettings)
    __obj.asInstanceOf[AudioSpriteFileConfig]
  }
}

