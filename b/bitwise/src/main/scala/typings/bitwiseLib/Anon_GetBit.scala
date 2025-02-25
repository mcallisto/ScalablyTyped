package typings
package bitwiseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GetBit extends js.Object {
  def getBit(int32: scala.Double, position: scala.Double): js.Any
  def setBit(
    int32: scala.Double,
    position: scala.Double,
    value: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ js.Any
  ): js.Any
  def toggleBit(int32: scala.Double, position: scala.Double): scala.Double
}

object Anon_GetBit {
  @scala.inline
  def apply(
    getBit: (scala.Double, scala.Double) => js.Any,
    setBit: (scala.Double, scala.Double, /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ js.Any) => js.Any,
    toggleBit: (scala.Double, scala.Double) => scala.Double
  ): Anon_GetBit = {
    val __obj = js.Dynamic.literal(getBit = js.Any.fromFunction2(getBit), setBit = js.Any.fromFunction3(setBit), toggleBit = js.Any.fromFunction2(toggleBit))
  
    __obj.asInstanceOf[Anon_GetBit]
  }
}

