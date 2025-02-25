package typings
package styledDashThemingLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object styledDashThemingMod {
  type ThemeMap = org.scalablytyped.runtime.StringDictionary[ThemeValue]
  type ThemeSet = js.Function1[/* props */ js.Object, java.lang.String]
  type ThemeValue = ThemeValueFn | ThemeValueResult
  type ThemeValueFn = js.Function1[/* props */ js.Object, ThemeValueResult]
  type ThemeValueResult = java.lang.String | (styledDashComponentsLib.styledDashComponentsMod.FlattenInterpolation[
    styledDashComponentsLib.styledDashComponentsMod.ThemeProps[js.Any] | (styledDashComponentsLib.styledDashComponentsMod.ThemedStyledProps[js.Any, js.Any])
  ])
  type VariantMap = org.scalablytyped.runtime.StringDictionary[ThemeMap]
  type VariantSet = js.Function1[/* props */ js.Object, java.lang.String]
}
