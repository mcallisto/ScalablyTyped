package typings
package atIonicCoreLib.distTypesComponentsMod.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonMenuToggle extends js.Object {
  /**
    * Automatically hides the content when the corresponding menu is not active.  By default, it's `true`. Change it to `false` in order to keep `ion-menu-toggle` always visible regardless the state of the menu.
    */
  var autoHide: scala.Boolean
  /**
    * Optional property that maps to a Menu's `menuId` prop. Can also be `start` or `end` for the menu side. This is used to find the correct menu to toggle.  If this property is not used, `ion-menu-toggle` will toggle the first menu that is active.
    */
  var menu: js.UndefOr[java.lang.String] = js.undefined
}

object IonMenuToggle {
  @scala.inline
  def apply(autoHide: scala.Boolean, menu: java.lang.String = null): IonMenuToggle = {
    val __obj = js.Dynamic.literal(autoHide = autoHide)
    if (menu != null) __obj.updateDynamic("menu")(menu)
    __obj.asInstanceOf[IonMenuToggle]
  }
}

