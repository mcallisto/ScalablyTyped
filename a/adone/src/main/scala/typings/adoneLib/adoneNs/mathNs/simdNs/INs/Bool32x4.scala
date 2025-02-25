package typings
package adoneLib.adoneNs.mathNs.simdNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A SIMD type representing 4 boolean values, as an intermediate value in manipulating 128-bit vectors.
  */
@js.native
/**
  * SIMD.Bool32x4 constructor
  * @param s0 A 32bit bool specifying the value of the lane.
  * @param s1 A 32bit bool specifying the value of the lane.
  * @param s2 A 32bit bool specifying the value of the lane.
  * @param s3 A 32bit bool specifying the value of the lane.
  * @return SIMD.Bool32x4 object
  */
trait Bool32x4 extends js.Object {
  @JSName("constructor")
  var constructor_Original: Bool32x4Constructor = js.native
  @JSName(scala.scalajs.js.Symbol.toPrimitive)
  var toPrimitive: (js.Function1[adoneLib.adoneLibStrings.string, java.lang.String]) with (js.Function1[adoneLib.adoneLibStrings.number, scala.Double]) with (js.Function1[adoneLib.adoneLibStrings.default, this.type]) with (js.Function1[/* hint */ java.lang.String, _]) = js.native
  /**
    * The initial value of the @@toStringTag property is the String value "SIMD.Bool32x4".
    */
  @JSName(scala.scalajs.js.Symbol.toStringTag)
  var toStringTag: java.lang.String = js.native
}

