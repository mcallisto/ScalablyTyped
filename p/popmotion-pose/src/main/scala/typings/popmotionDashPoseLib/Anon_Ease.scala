package typings
package popmotionDashPoseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ease extends js.Object {
  var ease: js.UndefOr[
    atPopmotionEasingLib.atPopmotionEasingMod.Easing | js.Array[atPopmotionEasingLib.atPopmotionEasingMod.Easing] | org.scalablytyped.runtime.StringDictionary[atPopmotionEasingLib.atPopmotionEasingMod.Easing] | java.lang.String | popmotionDashPoseLib.libTypesMod.CubicBezierArgs
  ] = js.undefined
}

object Anon_Ease {
  @scala.inline
  def apply(
    ease: atPopmotionEasingLib.atPopmotionEasingMod.Easing | js.Array[atPopmotionEasingLib.atPopmotionEasingMod.Easing] | org.scalablytyped.runtime.StringDictionary[atPopmotionEasingLib.atPopmotionEasingMod.Easing] | java.lang.String | popmotionDashPoseLib.libTypesMod.CubicBezierArgs = null
  ): Anon_Ease = {
    val __obj = js.Dynamic.literal()
    if (ease != null) __obj.updateDynamic("ease")(ease.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Ease]
  }
}

