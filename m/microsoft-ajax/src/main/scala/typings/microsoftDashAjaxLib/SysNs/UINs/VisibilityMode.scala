package typings
package microsoftDashAjaxLib.SysNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VisibilityMode extends js.Object

/**
  * Describes the layout of a DOM element in the page when the element's visible property is set to false.
  * @see {@link http://msdn.microsoft.com/en-us/library/bb397498(v=vs.100).aspx}
  */
@JSGlobal("Sys.UI.VisibilityMode")
@js.native
object VisibilityMode extends js.Object {
  /**
    * The element is not visible, and the space it occupies is collapsed.
    */
  @js.native
  sealed trait collapse
    extends microsoftDashAjaxLib.SysNs.UINs.VisibilityMode
  
  /**
    * The element is not visible, but it occupies space on the page.
    */
  @js.native
  sealed trait hide
    extends microsoftDashAjaxLib.SysNs.UINs.VisibilityMode
  
  /* 1 */ val collapse: collapse with scala.Double = js.native
  /* 0 */ val hide: hide with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[microsoftDashAjaxLib.SysNs.UINs.VisibilityMode with scala.Double] = js.native
}

