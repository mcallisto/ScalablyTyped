package typings
package fridaDashGumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait X86RegOperand
  extends X86BaseOperand
     with X86Operand {
  var `type`: fridaDashGumLib.fridaDashGumLibStrings.reg
  var value: X86Register
}

object X86RegOperand {
  @scala.inline
  def apply(size: scala.Double, `type`: fridaDashGumLib.fridaDashGumLibStrings.reg, value: X86Register): X86RegOperand = {
    val __obj = js.Dynamic.literal(size = size, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[X86RegOperand]
  }
}

