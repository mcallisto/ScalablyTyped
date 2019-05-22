package typings
package atMaterialDashUiCoreLib.stylesTransitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitionsOptions extends js.Object {
  var create: js.UndefOr[
    js.Function2[
      /* props */ java.lang.String | js.Array[java.lang.String], 
      /* options */ js.UndefOr[atMaterialDashUiCoreLib.Partialdurationnumberstringeasingstringdelaynumber], 
      java.lang.String
    ]
  ] = js.undefined
  var duration: js.UndefOr[atMaterialDashUiCoreLib.PartialDuration] = js.undefined
  var easing: js.UndefOr[atMaterialDashUiCoreLib.PartialEasing] = js.undefined
  var getAutoHeightDuration: js.UndefOr[js.Function1[/* height */ scala.Double, scala.Double]] = js.undefined
}

object TransitionsOptions {
  @scala.inline
  def apply(
    create: (/* props */ java.lang.String | js.Array[java.lang.String], /* options */ js.UndefOr[atMaterialDashUiCoreLib.Partialdurationnumberstringeasingstringdelaynumber]) => java.lang.String = null,
    duration: atMaterialDashUiCoreLib.PartialDuration = null,
    easing: atMaterialDashUiCoreLib.PartialEasing = null,
    getAutoHeightDuration: /* height */ scala.Double => scala.Double = null
  ): TransitionsOptions = {
    val __obj = js.Dynamic.literal()
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction2(create))
    if (duration != null) __obj.updateDynamic("duration")(duration)
    if (easing != null) __obj.updateDynamic("easing")(easing)
    if (getAutoHeightDuration != null) __obj.updateDynamic("getAutoHeightDuration")(js.Any.fromFunction1(getAutoHeightDuration))
    __obj.asInstanceOf[TransitionsOptions]
  }
}

