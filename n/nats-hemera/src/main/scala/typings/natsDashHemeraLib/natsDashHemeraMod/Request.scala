package typings
package natsDashHemeraLib.natsDashHemeraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var id: java.lang.String
  var `type`: RequestType
}

object Request {
  @scala.inline
  def apply(id: java.lang.String, `type`: RequestType): Request = {
    val __obj = js.Dynamic.literal(id = id)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Request]
  }
}

