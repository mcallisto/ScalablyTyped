package typings
package sharepointLib.SPNs.JsGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ReadOnlyActiveState extends js.Object

@JSGlobal("SP.JsGrid.ReadOnlyActiveState")
@js.native
object ReadOnlyActiveState extends js.Object {
   // 0,
  @js.native
  sealed trait ReadOnlyActive
    extends sharepointLib.SPNs.JsGridNs.ReadOnlyActiveState
  
   // 1
  @js.native
  sealed trait ReadOnlyDisabled
    extends sharepointLib.SPNs.JsGridNs.ReadOnlyActiveState
  
  /* 0 */ val ReadOnlyActive: ReadOnlyActive with scala.Double = js.native
  /* 1 */ val ReadOnlyDisabled: ReadOnlyDisabled with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.JsGridNs.ReadOnlyActiveState with scala.Double] = js.native
}

