package typings
package openui5Lib.sapNs.uiNs.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OpenState extends js.Object

/**
  * Defines the different possible states of an element that can be open or closed and does not
  * onlytoggle between these states, but also spends some time in between (e.g. because of an
  * animation).
  */
@JSGlobal("sap.ui.core.OpenState")
@js.native
object OpenState extends js.Object {
  @js.native
  sealed trait CLOSED
    extends openui5Lib.sapNs.uiNs.coreNs.OpenState
  
  @js.native
  sealed trait CLOSING
    extends openui5Lib.sapNs.uiNs.coreNs.OpenState
  
  @js.native
  sealed trait OPEN
    extends openui5Lib.sapNs.uiNs.coreNs.OpenState
  
  @js.native
  sealed trait OPENING
    extends openui5Lib.sapNs.uiNs.coreNs.OpenState
  
  /* 0 */ val CLOSED: CLOSED with scala.Double = js.native
  /* 1 */ val CLOSING: CLOSING with scala.Double = js.native
  /* 2 */ val OPEN: OPEN with scala.Double = js.native
  /* 3 */ val OPENING: OPENING with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[openui5Lib.sapNs.uiNs.coreNs.OpenState with scala.Double] = js.native
}

