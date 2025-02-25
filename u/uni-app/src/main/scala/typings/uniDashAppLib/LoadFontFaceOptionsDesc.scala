package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadFontFaceOptionsDesc extends js.Object {
  /**
    * 字体样式，可选值为 normal、italic、oblique
    */
  var style: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 设置小型大写字母的字体显示文本，可选值为 normal、small-caps、inherit
    */
  var variant: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 字体粗细，可选值为 normal、bold、100、200../ 900
    */
  var weight: js.UndefOr[java.lang.String] = js.undefined
}

object LoadFontFaceOptionsDesc {
  @scala.inline
  def apply(style: java.lang.String = null, variant: java.lang.String = null, weight: java.lang.String = null): LoadFontFaceOptionsDesc = {
    val __obj = js.Dynamic.literal()
    if (style != null) __obj.updateDynamic("style")(style)
    if (variant != null) __obj.updateDynamic("variant")(variant)
    if (weight != null) __obj.updateDynamic("weight")(weight)
    __obj.asInstanceOf[LoadFontFaceOptionsDesc]
  }
}

