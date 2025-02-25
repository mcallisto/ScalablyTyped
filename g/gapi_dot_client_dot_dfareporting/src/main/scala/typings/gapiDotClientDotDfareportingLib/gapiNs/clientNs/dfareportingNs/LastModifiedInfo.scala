package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LastModifiedInfo extends js.Object {
  /** Timestamp of the last change in milliseconds since epoch. */
  var time: js.UndefOr[java.lang.String] = js.undefined
}

object LastModifiedInfo {
  @scala.inline
  def apply(time: java.lang.String = null): LastModifiedInfo = {
    val __obj = js.Dynamic.literal()
    if (time != null) __obj.updateDynamic("time")(time)
    __obj.asInstanceOf[LastModifiedInfo]
  }
}

