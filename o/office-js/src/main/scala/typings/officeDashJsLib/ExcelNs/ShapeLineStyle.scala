package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ShapeLineStyle extends js.Object

/**
  *
  * The style for a line.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ShapeLineStyle")
@js.native
object ShapeLineStyle extends js.Object {
  /**
    *
    * Single line.
    *
    */
  @js.native
  sealed trait single
    extends officeDashJsLib.ExcelNs.ShapeLineStyle
  
  /**
    *
    * Thick line with a thin line on each side.
    *
    */
  @js.native
  sealed trait thickBetweenThin
    extends officeDashJsLib.ExcelNs.ShapeLineStyle
  
  /**
    *
    * Thick line next to thin line. For horizontal lines, the thick line is above the thin line. For vertical lines, the thick line is to the left of the thin line.
    *
    */
  @js.native
  sealed trait thickThin
    extends officeDashJsLib.ExcelNs.ShapeLineStyle
  
  /**
    *
    * Thick line next to thin line. For horizontal lines, the thick line is below the thin line. For vertical lines, the thick line is to the right of the thin line.
    *
    */
  @js.native
  sealed trait thinThick
    extends officeDashJsLib.ExcelNs.ShapeLineStyle
  
  /**
    *
    * Two thin lines.
    *
    */
  @js.native
  sealed trait thinThin
    extends officeDashJsLib.ExcelNs.ShapeLineStyle
  
  /* "Single" */ val single: single with java.lang.String = js.native
  /* "ThickBetweenThin" */ val thickBetweenThin: thickBetweenThin with java.lang.String = js.native
  /* "ThickThin" */ val thickThin: thickThin with java.lang.String = js.native
  /* "ThinThick" */ val thinThick: thinThick with java.lang.String = js.native
  /* "ThinThin" */ val thinThin: thinThin with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.ExcelNs.ShapeLineStyle with java.lang.String] = js.native
}

