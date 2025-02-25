package typings
package createDashEmotionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object createDashEmotionMod {
  type CSSBaseObject = csstypeLib.csstypeMod.PropertiesFallback[scala.Double | java.lang.String]
  type CSSPseudoObject = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in csstype.csstype.Pseudos ]:? create-emotion.create-emotion.CSSObject}
    */ createDashEmotionLib.createDashEmotionLibStrings.CSSPseudoObject with js.Any
  type ClassNameArg = js.UndefOr[
    scala.Null | scala.Boolean | java.lang.String | (org.scalablytyped.runtime.StringDictionary[js.UndefOr[scala.Null | scala.Boolean | java.lang.String]]) | ArrayClassNameArg
  ]
  /* Rewritten from type alias, can be one of: 
    - `js.undefined`
    - scala.Nothing
    - scala.Null
    - scala.Boolean
    - java.lang.String
    - scala.Double
    - stdLib.TemplateStringsArray
    - CSSObject
    - ArrayInterpolation
    - ClassInterpolation
  */
  type Interpolation = js.UndefOr[
    _Interpolation | scala.Null | scala.Boolean | java.lang.String | scala.Double | stdLib.TemplateStringsArray
  ]
  type StylisPlugins = scala.Null | (js.Function1[/* repeated */ js.Any, js.Any]) | (js.Array[js.Function1[/* repeated */ js.Any, js.Any]])
}
