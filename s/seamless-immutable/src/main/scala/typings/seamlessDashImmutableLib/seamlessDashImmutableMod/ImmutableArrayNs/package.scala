package typings
package seamlessDashImmutableLib.seamlessDashImmutableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ImmutableArrayNs {
  /** NOTE: These methods mutate data, but seamless-immutable does not ban them. We will ban them in our type definitions. */
  type AdditionalMutatingArrayMethods = stdLib.Extract[
    js.Array[java.lang.String], 
    seamlessDashImmutableLib.seamlessDashImmutableLibStrings.copyWithin | seamlessDashImmutableLib.seamlessDashImmutableLibStrings.fill
  ]
  /** These methods are banned by seamless-immutable. */
  type MutatingArrayMethods = stdLib.Extract[
    js.Array[java.lang.String], 
    seamlessDashImmutableLib.seamlessDashImmutableLibStrings.push | seamlessDashImmutableLib.seamlessDashImmutableLibStrings.pop | seamlessDashImmutableLib.seamlessDashImmutableLibStrings.sort | seamlessDashImmutableLib.seamlessDashImmutableLibStrings.splice | seamlessDashImmutableLib.seamlessDashImmutableLibStrings.shift | seamlessDashImmutableLib.seamlessDashImmutableLibStrings.unshift | seamlessDashImmutableLib.seamlessDashImmutableLibStrings.reverse | scala.Double
  ]
  /** The remaining properties on Array<T>, after we remove the mutating functions and the wrapped non-mutating functions. */
  type Remaining[T] = seamlessDashImmutableLib.seamlessDashImmutableMod.Omit[
    js.Array[T], 
    MutatingArrayMethods | AdditionalMutatingArrayMethods | java.lang.String
  ]
}
