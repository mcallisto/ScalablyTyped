package typings
package atIonicCoreLib.distTypesComponentsMod.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonFooter extends js.Object {
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[
    atIonicCoreLib.atIonicCoreLibStrings.ios | atIonicCoreLib.atIonicCoreLibStrings.md
  ] = js.undefined
  /**
    * If `true`, the footer will be translucent. Only applies to `ios` mode. Note: In order to scroll content behind the footer, the `fullscreen` attribute needs to be set on the content.
    */
  var translucent: scala.Boolean
}

object IonFooter {
  @scala.inline
  def apply(
    translucent: scala.Boolean,
    mode: atIonicCoreLib.atIonicCoreLibStrings.ios | atIonicCoreLib.atIonicCoreLibStrings.md = null
  ): IonFooter = {
    val __obj = js.Dynamic.literal(translucent = translucent)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonFooter]
  }
}

