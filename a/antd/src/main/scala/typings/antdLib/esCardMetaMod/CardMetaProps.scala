package typings
package antdLib.esCardMetaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardMetaProps extends js.Object {
  var avatar: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var description: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var title: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
}

object CardMetaProps {
  @scala.inline
  def apply(
    avatar: reactLib.reactMod.ReactNode = null,
    className: java.lang.String = null,
    description: reactLib.reactMod.ReactNode = null,
    prefixCls: java.lang.String = null,
    style: reactLib.reactMod.CSSProperties = null,
    title: reactLib.reactMod.ReactNode = null
  ): CardMetaProps = {
    val __obj = js.Dynamic.literal()
    if (avatar != null) __obj.updateDynamic("avatar")(avatar.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (style != null) __obj.updateDynamic("style")(style)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardMetaProps]
  }
}

