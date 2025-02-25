package typings
package olLib.layerVectorRenderTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VectorRenderType extends js.Object

@JSImport("ol/layer/VectorRenderType", "VectorRenderType")
@js.native
object VectorRenderType extends js.Object {
  @js.native
  sealed trait IMAGE
    extends olLib.layerVectorRenderTypeMod.VectorRenderType
  
  @js.native
  sealed trait VECTOR
    extends olLib.layerVectorRenderTypeMod.VectorRenderType
  
}

