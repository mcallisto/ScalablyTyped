package typings
package fridaDashGumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BaseDisp extends js.Object {
  var base: js.UndefOr[ArmRegister] = js.undefined
  var disp: scala.Double
  var index: js.UndefOr[ArmRegister] = js.undefined
  var scale: scala.Double
}

object Anon_BaseDisp {
  @scala.inline
  def apply(disp: scala.Double, scale: scala.Double, base: ArmRegister = null, index: ArmRegister = null): Anon_BaseDisp = {
    val __obj = js.Dynamic.literal(disp = disp, scale = scale)
    if (base != null) __obj.updateDynamic("base")(base)
    if (index != null) __obj.updateDynamic("index")(index)
    __obj.asInstanceOf[Anon_BaseDisp]
  }
}

