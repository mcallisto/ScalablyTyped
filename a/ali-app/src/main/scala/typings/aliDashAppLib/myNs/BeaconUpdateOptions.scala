package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeaconUpdateOptions
  extends BaseOptions[js.Any, js.Any] {
  @JSName("success")
  var success_BeaconUpdateOptions: js.UndefOr[js.Function1[/* res */ aliDashAppLib.Anon_Beacons, scala.Unit]] = js.undefined
}

object BeaconUpdateOptions {
  @scala.inline
  def apply(
    complete: /* res */ js.Any => scala.Unit = null,
    fail: js.Any => scala.Unit = null,
    success: /* res */ aliDashAppLib.Anon_Beacons => scala.Unit = null
  ): BeaconUpdateOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[BeaconUpdateOptions]
  }
}

