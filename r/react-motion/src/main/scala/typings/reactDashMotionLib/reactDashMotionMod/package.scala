package typings
package reactDashMotionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashMotionMod {
  type InterpolateFunction = js.Function1[
    /* previousInterpolatedStyles */ js.UndefOr[js.Array[TransitionPlainStyle]], 
    js.Array[TransitionStyle]
  ]
  type PlainStyle = org.scalablytyped.runtime.StringDictionary[scala.Double]
  type Style = org.scalablytyped.runtime.StringDictionary[scala.Double | OpaqueConfig]
  type Velocity = org.scalablytyped.runtime.StringDictionary[scala.Double]
}
