package typings
package reactDashMdlLib.reactDashMdlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogTitleProps
  extends reactLib.reactMod.HTMLProps[js.Any]
     with CustomRenderedComponent

object DialogTitleProps {
  @scala.inline
  def apply(
    CustomRenderedComponent: CustomRenderedComponent = null,
    HTMLProps: reactLib.reactMod.HTMLProps[js.Any] = null
  ): DialogTitleProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, CustomRenderedComponent)
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    __obj.asInstanceOf[DialogTitleProps]
  }
}

