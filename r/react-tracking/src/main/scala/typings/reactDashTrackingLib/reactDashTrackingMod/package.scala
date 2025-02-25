package typings
package reactDashTrackingLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashTrackingMod {
  // Duplicated from ES6 lib to remove the `void` typing, otherwise `track` can’t be used as a HOC function that passes
  // through a JSX component that be used without casting.
  type ClassDecorator = js.Function1[/* target */ js.Function, js.Function]
  type Decorator = ClassDecorator with MethodDecorator
  /* Rewritten from type alias, can be one of: 
    - reactDashTrackingLib.reactDashTrackingLibNumbers.`false`
    - scala.Null
    - `js.undefined`
    - scala.Nothing
    - reactDashTrackingLib.reactDashTrackingLibStrings.Empty
  */
  type Falsy = js.UndefOr[_Falsy | scala.Null]
  type MethodDecorator = js.Function3[
    /* target */ js.Object, 
    /* propertyKey */ java.lang.String | js.Symbol, 
    /* descriptor */ stdLib.TypedPropertyDescriptor[js.Any], 
    stdLib.TypedPropertyDescriptor[js.Any]
  ]
  type Track[T, P, S] = js.Function2[
    /* trackingInfo */ js.UndefOr[TrackingInfo[stdLib.Pick[T, java.lang.String], P, S]], 
    /* options */ js.UndefOr[Options[stdLib.Partial[T]]], 
    Decorator
  ]
  type TrackingContext[T] = reactLib.reactMod.Context[reactDashTrackingLib.Anon_Tracking[T]]
  type TrackingInfo[T, P, S] = T | (js.Function3[
    /* props */ P, 
    /* state */ S, 
    /* import warning: ImportType.apply Failed type conversion: any[any] */ /* args */ js.Any, 
    T
  ])
}
