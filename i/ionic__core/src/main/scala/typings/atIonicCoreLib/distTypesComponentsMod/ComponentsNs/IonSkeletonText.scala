package typings
package atIonicCoreLib.distTypesComponentsMod.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonSkeletonText extends js.Object {
  /**
    * If `true`, the skeleton text will animate.
    */
  var animated: scala.Boolean
  var width: js.UndefOr[java.lang.String] = js.undefined
}

object IonSkeletonText {
  @scala.inline
  def apply(animated: scala.Boolean, width: java.lang.String = null): IonSkeletonText = {
    val __obj = js.Dynamic.literal(animated = animated)
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[IonSkeletonText]
  }
}

