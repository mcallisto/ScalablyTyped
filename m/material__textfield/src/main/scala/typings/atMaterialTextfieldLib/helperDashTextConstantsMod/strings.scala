package typings
package atMaterialTextfieldLib.helperDashTextConstantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait strings
  extends atMaterialBaseLib.foundationMod.MDCStrings {
  var ARIA_HIDDEN: atMaterialTextfieldLib.atMaterialTextfieldLibStrings.`aria-hidden`
  var ROLE: atMaterialTextfieldLib.atMaterialTextfieldLibStrings.role
}

object strings {
  @scala.inline
  def apply(
    ARIA_HIDDEN: atMaterialTextfieldLib.atMaterialTextfieldLibStrings.`aria-hidden`,
    ROLE: atMaterialTextfieldLib.atMaterialTextfieldLibStrings.role,
    StringDictionary: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null
  ): strings = {
    val __obj = js.Dynamic.literal(ARIA_HIDDEN = ARIA_HIDDEN, ROLE = ROLE)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[strings]
  }
}

