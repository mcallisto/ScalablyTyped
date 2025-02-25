package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofmatrix extends js.Object {
  var EPSILON: scala.Double
  val INs: js.Any
  /**
    * 2x2 Matrix
    */
  val mat2Ns: Typeofmat2
  /**
    * 2x3 Matrix
    */
  val mat2dNs: Typeofmat2d
  /**
    * 3x3 Matrix
    */
  val mat3Ns: Typeofmat3
  /**
    * 4x4 Matrix
    */
  val mat4Ns: Typeofmat4
  /**
    * Quaternion
    */
  val quatNs: Typeofquat
  /**
    * 2 Dimensional Vector
    */
  val vec2Ns: Typeofvec2
  /**
    * 3 Dimensional Vector
    */
  val vec3Ns: Typeofvec3
  /**
    * 4 Dimensional Vector
    */
  val vec4Ns: Typeofvec4
  /**
    * Tests whether or not the arguments have approximately the same value, within an absolute
    * or relative tolerance of EPSILON (an absolute tolerance is used for values less
    * than or equal to 1.0, and a relative tolerance is used for larger values)
    *
    * @param a - The first number to test.
    * @param b - The second number to test.
    * @returns True if the numbers are approximately equal, false otherwise.
    */
  def equals(a: scala.Double, b: scala.Double): scala.Boolean
  /**
    * Convert Degree To Radian
    *
    * @param a - Angle in Degrees
    */
  def toRadian(a: scala.Double): scala.Double
}

object Typeofmatrix {
  @scala.inline
  def apply(
    EPSILON: scala.Double,
    INs: js.Any,
    equals: (scala.Double, scala.Double) => scala.Boolean,
    mat2Ns: Typeofmat2,
    mat2dNs: Typeofmat2d,
    mat3Ns: Typeofmat3,
    mat4Ns: Typeofmat4,
    quatNs: Typeofquat,
    toRadian: scala.Double => scala.Double,
    vec2Ns: Typeofvec2,
    vec3Ns: Typeofvec3,
    vec4Ns: Typeofvec4
  ): Typeofmatrix = {
    val __obj = js.Dynamic.literal(EPSILON = EPSILON, INs = INs, equals = js.Any.fromFunction2(equals), mat2Ns = mat2Ns, mat2dNs = mat2dNs, mat3Ns = mat3Ns, mat4Ns = mat4Ns, quatNs = quatNs, toRadian = js.Any.fromFunction1(toRadian), vec2Ns = vec2Ns, vec3Ns = vec3Ns, vec4Ns = vec4Ns)
  
    __obj.asInstanceOf[Typeofmatrix]
  }
}

