package typings
package mailgunDashJsLib.mailgunDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MailgunRequest extends js.Object {
  def apply(resource: java.lang.String, data: js.Any): js.Promise[_] = js.native
  def apply(
    resource: java.lang.String,
    data: js.Any,
    callback: js.Function2[/* error */ Error, /* response */ js.Any, scala.Unit]
  ): scala.Unit = js.native
}

