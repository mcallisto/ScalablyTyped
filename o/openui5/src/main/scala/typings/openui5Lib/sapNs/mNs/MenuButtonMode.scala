package typings
package openui5Lib.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MenuButtonMode extends js.Object

/**
  * Different mode for a MenuButton (predefined types)
  */
@JSGlobal("sap.m.MenuButtonMode")
@js.native
object MenuButtonMode extends js.Object {
  @js.native
  sealed trait Regular
    extends openui5Lib.sapNs.mNs.MenuButtonMode
  
  @js.native
  sealed trait Split
    extends openui5Lib.sapNs.mNs.MenuButtonMode
  
  /* 0 */ val Regular: Regular with scala.Double = js.native
  /* 1 */ val Split: Split with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[openui5Lib.sapNs.mNs.MenuButtonMode with scala.Double] = js.native
}

