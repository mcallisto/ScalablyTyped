package typings
package atFeathersjsErrorsLib.atFeathersjsErrorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@feathersjs/errors", "GeneralError")
@js.native
class GeneralError () extends FeathersError {
  def this(msg: java.lang.String) = this()
  def this(msg: stdLib.Error) = this()
  def this(msg: java.lang.String, data: js.Any) = this()
  def this(msg: stdLib.Error, data: js.Any) = this()
}

