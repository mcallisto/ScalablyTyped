package typings
package createDashEmotionLib.createDashEmotionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ K in csstype.csstype.Pseudos ]:? create-emotion.create-emotion.CSSObject} */ trait CSSObject
  extends csstypeLib.csstypeMod.PropertiesFallback[scala.Double | java.lang.String]
     with CSSOthersObject
     with _Interpolation

object CSSObject {
  @scala.inline
  def apply(
    CSSOthersObject: CSSOthersObject = null,
    PropertiesFallback: csstypeLib.csstypeMod.PropertiesFallback[scala.Double | java.lang.String] = null,
    _Interpolation: _Interpolation = null
  ): CSSObject = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, CSSOthersObject)
    js.Dynamic.global.Object.assign(__obj, PropertiesFallback)
    js.Dynamic.global.Object.assign(__obj, _Interpolation)
    __obj.asInstanceOf[CSSObject]
  }
}

