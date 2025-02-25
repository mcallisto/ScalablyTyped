package typings
package sharepointLib.SPNs.WebPartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PersonalizationScope extends js.Object

@JSGlobal("SP.WebParts.PersonalizationScope")
@js.native
object PersonalizationScope extends js.Object {
  @js.native
  sealed trait shared
    extends sharepointLib.SPNs.WebPartsNs.PersonalizationScope
  
  @js.native
  sealed trait user
    extends sharepointLib.SPNs.WebPartsNs.PersonalizationScope
  
  /* 1 */ val shared: shared with scala.Double = js.native
  /* 0 */ val user: user with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.WebPartsNs.PersonalizationScope with scala.Double] = js.native
}

