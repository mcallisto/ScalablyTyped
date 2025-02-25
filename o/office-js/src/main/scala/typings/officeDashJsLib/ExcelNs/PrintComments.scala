package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PrintComments extends js.Object

/**
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.PrintComments")
@js.native
object PrintComments extends js.Object {
  /**
    *
    * Comments will be printed as end notes at the end of the worksheet.
    *
    */
  @js.native
  sealed trait endSheet
    extends officeDashJsLib.ExcelNs.PrintComments
  
  /**
    *
    * Comments will be printed where they were inserted in the worksheet.
    *
    */
  @js.native
  sealed trait inPlace
    extends officeDashJsLib.ExcelNs.PrintComments
  
  /**
    *
    * Comments will not be printed.
    *
    */
  @js.native
  sealed trait noComments
    extends officeDashJsLib.ExcelNs.PrintComments
  
  /* "EndSheet" */ val endSheet: endSheet with java.lang.String = js.native
  /* "InPlace" */ val inPlace: inPlace with java.lang.String = js.native
  /* "NoComments" */ val noComments: noComments with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.ExcelNs.PrintComments with java.lang.String] = js.native
}

