package typings
package hapiDashPinoLib.hapiDashPinoMod.atHapiHapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var logger: pinoLib.pinoMod.Logger
}

object Request {
  @scala.inline
  def apply(logger: pinoLib.pinoMod.Logger): Request = {
    val __obj = js.Dynamic.literal(logger = logger)
  
    __obj.asInstanceOf[Request]
  }
}

