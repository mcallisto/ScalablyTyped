package typings
package sequelizeLib.sequelizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait cast extends js.Object {
  var `type`: java.lang.String
  var `val`: js.Any
}

object cast {
  @scala.inline
  def apply(`type`: java.lang.String, `val`: js.Any): cast = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.updateDynamic("val")(`val`)
    __obj.asInstanceOf[cast]
  }
}

