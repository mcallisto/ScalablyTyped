package typings
package styledDashReactDashModalLib.styledDashReactDashModalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalProviderProps extends js.Object {
  var backgroundComponent: js.UndefOr[styledDashComponentsLib.styledDashComponentsMod.AnyStyledComponent] = js.undefined
  var children: reactLib.reactMod.ReactNode
}

object ModalProviderProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNode,
    backgroundComponent: styledDashComponentsLib.styledDashComponentsMod.AnyStyledComponent = null
  ): ModalProviderProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (backgroundComponent != null) __obj.updateDynamic("backgroundComponent")(backgroundComponent)
    __obj.asInstanceOf[ModalProviderProps]
  }
}

