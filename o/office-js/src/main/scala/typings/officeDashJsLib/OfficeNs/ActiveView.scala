package typings
package officeDashJsLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ActiveView extends js.Object

// Enumerations
/**
  * Specifies the state of the active view of the document, for example, whether the user can edit the document.
  */
@JSGlobal("Office.ActiveView")
@js.native
object ActiveView extends js.Object {
  /**
    * The active view of the host application lets the user edit the content in the document.
    */
  @js.native
  sealed trait Edit
    extends officeDashJsLib.OfficeNs.ActiveView
  
  /**
    * The active view of the host application only lets the user read the content in the document.
    */
  @js.native
  sealed trait Read
    extends officeDashJsLib.OfficeNs.ActiveView
  
  /* 1 */ val Edit: Edit with scala.Double = js.native
  /* 0 */ val Read: Read with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[officeDashJsLib.OfficeNs.ActiveView with scala.Double] = js.native
}

