package typings
package xstateLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorPlatformEvent extends EventObject {
  var data: js.Any
}

object ErrorPlatformEvent {
  @scala.inline
  def apply(data: js.Any, `type`: java.lang.String, id: java.lang.String | scala.Double = null): ErrorPlatformEvent = {
    val __obj = js.Dynamic.literal(data = data)
    __obj.updateDynamic("type")(`type`)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorPlatformEvent]
  }
}

