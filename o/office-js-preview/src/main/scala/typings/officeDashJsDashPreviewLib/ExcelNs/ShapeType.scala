package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ShapeType extends js.Object

/**
  *
  * Specifies the type of a shape.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ShapeType")
@js.native
object ShapeType extends js.Object {
  @js.native
  sealed trait geometricShape
    extends officeDashJsDashPreviewLib.ExcelNs.ShapeType
  
  @js.native
  sealed trait group
    extends officeDashJsDashPreviewLib.ExcelNs.ShapeType
  
  @js.native
  sealed trait image
    extends officeDashJsDashPreviewLib.ExcelNs.ShapeType
  
  @js.native
  sealed trait line
    extends officeDashJsDashPreviewLib.ExcelNs.ShapeType
  
  @js.native
  sealed trait unsupported
    extends officeDashJsDashPreviewLib.ExcelNs.ShapeType
  
  /* "GeometricShape" */ val geometricShape: geometricShape with java.lang.String = js.native
  /* "Group" */ val group: group with java.lang.String = js.native
  /* "Image" */ val image: image with java.lang.String = js.native
  /* "Line" */ val line: line with java.lang.String = js.native
  /* "Unsupported" */ val unsupported: unsupported with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.ExcelNs.ShapeType with java.lang.String] = js.native
}

