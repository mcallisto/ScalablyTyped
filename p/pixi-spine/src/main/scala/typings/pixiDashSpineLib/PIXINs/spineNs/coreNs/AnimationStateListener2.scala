package typings
package pixiDashSpineLib.PIXINs.spineNs.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationStateListener2 extends js.Object {
  var complete: js.UndefOr[js.Function1[/* entry */ TrackEntry, scala.Unit]] = js.undefined
  var dispose: js.UndefOr[js.Function1[/* entry */ TrackEntry, scala.Unit]] = js.undefined
  var end: js.UndefOr[js.Function1[/* entry */ TrackEntry, scala.Unit]] = js.undefined
  var event: js.UndefOr[js.Function2[/* entry */ TrackEntry, /* event */ Event, scala.Unit]] = js.undefined
  var interrupt: js.UndefOr[js.Function1[/* entry */ TrackEntry, scala.Unit]] = js.undefined
  var start: js.UndefOr[js.Function1[/* entry */ TrackEntry, scala.Unit]] = js.undefined
}

object AnimationStateListener2 {
  @scala.inline
  def apply(
    complete: /* entry */ TrackEntry => scala.Unit = null,
    dispose: /* entry */ TrackEntry => scala.Unit = null,
    end: /* entry */ TrackEntry => scala.Unit = null,
    event: (/* entry */ TrackEntry, /* event */ Event) => scala.Unit = null,
    interrupt: /* entry */ TrackEntry => scala.Unit = null,
    start: /* entry */ TrackEntry => scala.Unit = null
  ): AnimationStateListener2 = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (dispose != null) __obj.updateDynamic("dispose")(js.Any.fromFunction1(dispose))
    if (end != null) __obj.updateDynamic("end")(js.Any.fromFunction1(end))
    if (event != null) __obj.updateDynamic("event")(js.Any.fromFunction2(event))
    if (interrupt != null) __obj.updateDynamic("interrupt")(js.Any.fromFunction1(interrupt))
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction1(start))
    __obj.asInstanceOf[AnimationStateListener2]
  }
}

