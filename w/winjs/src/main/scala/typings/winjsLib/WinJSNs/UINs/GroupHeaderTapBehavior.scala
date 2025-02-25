package typings
package winjsLib.WinJSNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GroupHeaderTapBehavior extends js.Object

/**
  * Specifies how group headers in a ListView respond to the tap interaction.
  **/
@JSGlobal("WinJS.UI.GroupHeaderTapBehavior")
@js.native
object GroupHeaderTapBehavior extends js.Object {
  /**
    * The group is invoked.
    **/
  @js.native
  sealed trait invoke
    extends winjsLib.WinJSNs.UINs.GroupHeaderTapBehavior
  
  /**
    * Nothing happens.
    **/
  @js.native
  sealed trait none
    extends winjsLib.WinJSNs.UINs.GroupHeaderTapBehavior
  
  /* 0 */ val invoke: invoke with scala.Double = js.native
  /* 1 */ val none: none with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winjsLib.WinJSNs.UINs.GroupHeaderTapBehavior with scala.Double] = js.native
}

