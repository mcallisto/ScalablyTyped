package typings
package reDashReselectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reDashReselectMod {
  type $Values[T] = /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any
  type KeySelector[S] = js.Function2[/* state */ S, /* repeated */ js.Any, js.Any]
  type KeySelectorCreator[S, C, D] = js.Function1[
    /* selectorInputs */ reDashReselectLib.Anon_InputSelectors[D, C, S], 
    KeySelector[S]
  ]
  type ObjectCacheKey = java.lang.String | scala.Double
  type OutputCachedSelector[S, R, C, D] = js.Function2[
    /* keySelector */ KeySelector[S], 
    /* optionsOrSelectorCreator */ js.UndefOr[Options[S, C, D]], 
    (OutputSelector[S, R, C, D]) with (reDashReselectLib.Anon_Args[S, R, C, D])
  ]
  type OutputParametricCachedSelector[S, P, R, C, D] = js.Function2[
    /* keySelector */ ParametricKeySelector[S, P], 
    /* optionsOrSelectorCreator */ js.UndefOr[ParametricOptions[S, P, C, D]], 
    (OutputParametricSelector[S, P, R, C, D]) with (reDashReselectLib.Anon_ArgsCache[C, R, P, S, D])
  ]
  type OutputParametricSelector[S, P, R, C, D] = (ParametricSelector[S, P, R]) with (reDashReselectLib.Anon_Dependencies[C, D])
  type OutputSelector[S, R, C, D] = (Selector[S, R]) with (reDashReselectLib.Anon_Dependencies[C, D])
  type ParametricKeySelector[S, P] = js.Function3[/* state */ S, /* props */ P, /* repeated */ js.Any, js.Any]
  type ParametricKeySelectorCreator[S, P, C, D] = js.Function1[
    /* selectorInputs */ reDashReselectLib.Anon_InputSelectorsKeySelector[D, C, S, P], 
    ParametricKeySelector[S, P]
  ]
  type ParametricSelector[S, P, R] = js.Function3[/* state */ S, /* props */ P, /* repeated */ js.Any, R]
  type Selector[S, R] = js.Function1[/* state */ S, R]
}
