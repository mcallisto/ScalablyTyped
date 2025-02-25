package typings
package reactDashGaLib.reactDashGaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutboundLinkProps extends js.Object {
  var eventLabel: java.lang.String
  var onClick: js.UndefOr[js.Function] = js.undefined
  var target: js.UndefOr[java.lang.String] = js.undefined
  var to: java.lang.String
  var trackerNames: js.UndefOr[TrackerNames] = js.undefined
}

object OutboundLinkProps {
  @scala.inline
  def apply(
    eventLabel: java.lang.String,
    to: java.lang.String,
    onClick: js.Function = null,
    target: java.lang.String = null,
    trackerNames: TrackerNames = null
  ): OutboundLinkProps = {
    val __obj = js.Dynamic.literal(eventLabel = eventLabel, to = to)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (target != null) __obj.updateDynamic("target")(target)
    if (trackerNames != null) __obj.updateDynamic("trackerNames")(trackerNames)
    __obj.asInstanceOf[OutboundLinkProps]
  }
}

