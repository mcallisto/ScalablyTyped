package typings
package atIonicCoreLib.distTypesComponentsMod.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonItemOptions extends js.Object {
  /**
    * The side the option button should be on. Possible values: `"start"` and `"end"`. If you have multiple `ion-item-options`, a side must be provided for each.
    */
  var side: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Side */ js.Any
  def fireSwipeEvent(): js.Promise[scala.Unit]
}

object IonItemOptions {
  @scala.inline
  def apply(
    fireSwipeEvent: () => js.Promise[scala.Unit],
    side: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Side */ js.Any
  ): IonItemOptions = {
    val __obj = js.Dynamic.literal(fireSwipeEvent = js.Any.fromFunction0(fireSwipeEvent), side = side)
  
    __obj.asInstanceOf[IonItemOptions]
  }
}

