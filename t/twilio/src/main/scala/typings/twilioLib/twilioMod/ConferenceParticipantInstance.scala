package typings
package twilioLib.twilioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConferenceParticipantInstance extends InstanceResource {
  @JSName("kick")
  var kick_Original: RestMethod = js.native
  def kick(args: js.Any): qLib.qMod.Promise[_] = js.native
  def kick(args: js.Any, callback: RequestCallback): qLib.qMod.Promise[_] = js.native
  def kick(callback: RequestCallback): qLib.qMod.Promise[_] = js.native
}

