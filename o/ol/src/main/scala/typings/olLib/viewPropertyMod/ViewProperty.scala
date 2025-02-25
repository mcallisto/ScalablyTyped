package typings
package olLib.viewPropertyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ViewProperty extends js.Object

@JSImport("ol/ViewProperty", "ViewProperty")
@js.native
object ViewProperty extends js.Object {
  @js.native
  sealed trait CENTER
    extends olLib.viewPropertyMod.ViewProperty
  
  @js.native
  sealed trait RESOLUTION
    extends olLib.viewPropertyMod.ViewProperty
  
  @js.native
  sealed trait ROTATION
    extends olLib.viewPropertyMod.ViewProperty
  
}

