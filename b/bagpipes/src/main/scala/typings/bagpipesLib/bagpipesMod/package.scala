package typings
package bagpipesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object bagpipesMod {
  type Fitting = js.Function2[/* context */ FittingContext, /* next */ bagpipesLib.Fn_Err, scala.Unit]
  type FittingFactory = js.Function2[/* fittingDef */ FittingDef, /* bagpipes */ js.Any, Fitting]
  /* Rewritten from type alias, can be one of: 
    - bagpipesLib.bagpipesLibStrings.system
    - bagpipesLib.bagpipesLibStrings.user
    - java.lang.String
  */
  type FittingType = _FittingType | java.lang.String
  type FittingTypesMap = org.scalablytyped.runtime.StringDictionary[FittingFactory]
  type PipeDef = js.Array[js.Any] | java.lang.String | FittingDef
  type PipeDefMap = org.scalablytyped.runtime.StringDictionary[PipeDef]
}
