package typings
package twilioLib.twilioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IncomingPhoneNumberInstance extends InstanceResource {
  @JSName("put")
  var put_Original: RestMethod = js.native
  def put(args: js.Any): qLib.qMod.Promise[_] = js.native
  def put(args: js.Any, callback: RequestCallback): qLib.qMod.Promise[_] = js.native
  def put(callback: RequestCallback): qLib.qMod.Promise[_] = js.native
}

