package typings
package atOctokitRestLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Agent extends js.Object {
  var agent: js.UndefOr[nodeLib.httpMod.Agent] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Agent {
  @scala.inline
  def apply(agent: nodeLib.httpMod.Agent = null, timeout: scala.Int | scala.Double = null): Anon_Agent = {
    val __obj = js.Dynamic.literal()
    if (agent != null) __obj.updateDynamic("agent")(agent)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Agent]
  }
}

