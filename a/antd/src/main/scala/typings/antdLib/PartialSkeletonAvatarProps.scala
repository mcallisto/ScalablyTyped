package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<antd.antd/lib/skeleton/Avatar.SkeletonAvatarProps> */
trait PartialSkeletonAvatarProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var shape: js.UndefOr[antdLib.antdLibStrings.circle | antdLib.antdLibStrings.square] = js.undefined
  var size: js.UndefOr[
    antdLib.antdLibStrings.large | antdLib.antdLibStrings.small | antdLib.antdLibStrings.default
  ] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
}

object PartialSkeletonAvatarProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    prefixCls: java.lang.String = null,
    shape: antdLib.antdLibStrings.circle | antdLib.antdLibStrings.square = null,
    size: antdLib.antdLibStrings.large | antdLib.antdLibStrings.small | antdLib.antdLibStrings.default = null,
    style: js.Object = null
  ): PartialSkeletonAvatarProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[PartialSkeletonAvatarProps]
  }
}

