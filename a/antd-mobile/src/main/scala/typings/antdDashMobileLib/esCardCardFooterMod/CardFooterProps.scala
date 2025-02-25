package typings
package antdDashMobileLib.esCardCardFooterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardFooterProps
  extends antdDashMobileLib.esCardPropsTypeMod.CardFooterPropsType {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
}

object CardFooterProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    content: reactLib.reactMod.ReactNode = null,
    extra: reactLib.reactMod.ReactNode = null,
    prefixCls: java.lang.String = null
  ): CardFooterProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    __obj.asInstanceOf[CardFooterProps]
  }
}

