package typings
package consulLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackOptsRegisterOptions extends js.Object {
  def apply[TData](opts: consulLib.consulMod.AgentNs.CheckNs.RegisterOptions): consulLib.consulMod.Thenable[TData] = js.native
  def apply[TData](
    opts: consulLib.consulMod.AgentNs.CheckNs.RegisterOptions,
    callback: consulLib.consulMod.Callback[TData]
  ): scala.Unit = js.native
}

