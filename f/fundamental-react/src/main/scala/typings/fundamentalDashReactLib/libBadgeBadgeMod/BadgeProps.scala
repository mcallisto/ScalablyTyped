package typings
package fundamentalDashReactLib.libBadgeBadgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BadgeProps
  extends /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var modifier: js.UndefOr[BadgeModifiers] = js.undefined
  var `type`: js.UndefOr[BadgeTypes] = js.undefined
}

object BadgeProps {
  @scala.inline
  def apply(
    StringDictionary: /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    className: java.lang.String = null,
    modifier: BadgeModifiers = null,
    `type`: BadgeTypes = null
  ): BadgeProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className)
    if (modifier != null) __obj.updateDynamic("modifier")(modifier)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BadgeProps]
  }
}

