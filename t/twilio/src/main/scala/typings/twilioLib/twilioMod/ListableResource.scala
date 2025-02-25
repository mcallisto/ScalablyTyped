package typings
package twilioLib.twilioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListableResource extends Resource {
  @JSName("list")
  var list_Original: RestMethod = js.native
  def list(args: js.Any): qLib.qMod.Promise[_] = js.native
  def list(args: js.Any, callback: RequestCallback): qLib.qMod.Promise[_] = js.native
  def list(callback: RequestCallback): qLib.qMod.Promise[_] = js.native
}

