package typings
package threeLib.srcMathVector3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/math/Vector3", "Vector3")
@js.native
class Vector3 ()
  extends threeLib.srcMathVector2Mod.Vector {
  def this(x: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double, z: scala.Double) = this()
  var isVector3: threeLib.threeLibNumbers.`true` = js.native
  var x: scala.Double = js.native
  var y: scala.Double = js.native
  var z: scala.Double = js.native
  /**
  	 * Adds v to this vector.
  	 */
  def add(a: Vector3): this.type = js.native
  def add(a: Vector3, b: Vector3): this.type = js.native
  def addScaledVector(v: Vector3, s: scala.Double): this.type = js.native
  /**
  	 * Sets this vector to a + b.
  	 */
  def addVectors(a: Vector3, b: Vector3): this.type = js.native
  def angleTo(v: Vector3): scala.Double = js.native
  def applyAxisAngle(axis: Vector3, angle: scala.Double): this.type = js.native
  def applyEuler(euler: threeLib.srcMathEulerMod.Euler): this.type = js.native
  def applyMatrix3(m: threeLib.srcMathMatrix3Mod.Matrix3): this.type = js.native
  def applyMatrix4(m: threeLib.srcMathMatrix4Mod.Matrix4): this.type = js.native
  def applyQuaternion(q: threeLib.srcMathQuaternionMod.Quaternion): this.type = js.native
  def ceil(): this.type = js.native
  def clamp(min: Vector3, max: Vector3): this.type = js.native
  def clampLength(min: scala.Double, max: scala.Double): this.type = js.native
  def clampScalar(min: scala.Double, max: scala.Double): this.type = js.native
  /**
  	 * Copies value of v to this vector.
  	 */
  def copy(v: Vector3): this.type = js.native
  /**
  	 * Sets this vector to cross product of itself and v.
  	 */
  def cross(a: Vector3): this.type = js.native
  def cross(a: Vector3, w: Vector3): this.type = js.native
  /**
  	 * Sets this vector to cross product of a and b.
  	 */
  def crossVectors(a: Vector3, b: Vector3): this.type = js.native
  /**
  	 * @deprecated Use {@link Vector3#manhattanDistanceTo .manhattanDistanceTo()} instead.
  	 */
  def distanceToManhattan(v: Vector3): scala.Double = js.native
  /**
  	 * Computes squared distance of this vector to v.
  	 */
  @JSName("distanceToSquared")
  def distanceToSquared_MVector3(v: Vector3): scala.Double = js.native
  /**
  	 * Computes distance of this vector to v.
  	 */
  @JSName("distanceTo")
  def distanceTo_MVector3(v: Vector3): scala.Double = js.native
  def divide(v: Vector3): this.type = js.native
  /**
  	 * Computes dot product of this vector and v.
  	 */
  def dot(v: Vector3): scala.Double = js.native
  /**
  	 * Checks for strict equality of this vector and v.
  	 */
  def equals(v: Vector3): scala.Boolean = js.native
  def floor(): this.type = js.native
  def fromArray(xyz: js.Array[scala.Double]): Vector3 = js.native
  def fromArray(xyz: js.Array[scala.Double], offset: scala.Double): Vector3 = js.native
  def fromBufferAttribute(attribute: threeLib.srcCoreBufferAttributeMod.BufferAttribute, index: scala.Double): this.type = js.native
  def fromBufferAttribute(
    attribute: threeLib.srcCoreBufferAttributeMod.BufferAttribute,
    index: scala.Double,
    offset: scala.Double
  ): this.type = js.native
  /**
  	 * Computes Manhattan length of this vector.
  	 * http://en.wikipedia.org/wiki/Taxicab_geometry
  	 *
  	 * @deprecated Use {@link Vector3#manhattanLength .manhattanLength()} instead.
  	 */
  def lengthManhattan(): scala.Double = js.native
  def lerp(v: Vector3, alpha: scala.Double): this.type = js.native
  def lerpVectors(v1: Vector3, v2: Vector3, alpha: scala.Double): this.type = js.native
  /**
  	 * Computes the Manhattan length (distance) from this vector to the given vector v
  	 *
  	 * @param {Vector3} v
  	 *
  	 * @return {number}
  	 *
  	 * @see {@link http://en.wikipedia.org/wiki/Taxicab_geometry|Wikipedia: Taxicab Geometry}
  	 */
  def manhattanDistanceTo(v: Vector3): scala.Double = js.native
  /**
  	 * Computes the Manhattan length of this vector.
  	 *
  	 * @return {number}
  	 *
  	 * @see {@link http://en.wikipedia.org/wiki/Taxicab_geometry|Wikipedia: Taxicab Geometry}
  	 */
  def manhattanLength(): scala.Double = js.native
  def max(v: Vector3): this.type = js.native
  def min(v: Vector3): this.type = js.native
  def multiply(v: Vector3): this.type = js.native
  def multiplyVectors(a: Vector3, b: Vector3): this.type = js.native
  def project(camera: threeLib.srcCamerasCameraMod.Camera): this.type = js.native
  def projectOnPlane(planeNormal: Vector3): this.type = js.native
  def projectOnVector(v: Vector3): this.type = js.native
  def reflect(vector: Vector3): this.type = js.native
  def round(): this.type = js.native
  def roundToZero(): this.type = js.native
  /**
  	 * Sets value of this vector.
  	 */
  def set(x: scala.Double, y: scala.Double, z: scala.Double): this.type = js.native
  def setFromCylindrical(s: threeLib.srcMathCylindricalMod.Cylindrical): this.type = js.native
  def setFromMatrixColumn(matrix: threeLib.srcMathMatrix4Mod.Matrix4, index: scala.Double): this.type = js.native
  def setFromMatrixPosition(m: threeLib.srcMathMatrix4Mod.Matrix4): this.type = js.native
  def setFromMatrixScale(m: threeLib.srcMathMatrix4Mod.Matrix4): this.type = js.native
  def setFromSpherical(s: threeLib.srcMathSphericalMod.Spherical): this.type = js.native
  /**
  	 * Sets x value of this vector.
  	 */
  def setX(x: scala.Double): Vector3 = js.native
  /**
  	 * Sets y value of this vector.
  	 */
  def setY(y: scala.Double): Vector3 = js.native
  /**
  	 * Sets z value of this vector.
  	 */
  def setZ(z: scala.Double): Vector3 = js.native
  /**
  	 * Subtracts v from this vector.
  	 */
  def sub(a: Vector3): this.type = js.native
  def subScalar(s: scala.Double): this.type = js.native
  /**
  	 * Sets this vector to a - b.
  	 */
  def subVectors(a: Vector3, b: Vector3): this.type = js.native
  /**
  	 * Returns an array [x, y, z], or copies x, y and z into the provided array.
  	 * @param array (optional) array to store the vector to. If this is not provided, a new array will be created.
  	 * @param offset (optional) optional offset into the array.
  	 * @return The created or provided array.
  	 */
  def toArray(): js.Array[scala.Double] = js.native
  def toArray(xyz: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def toArray(xyz: js.Array[scala.Double], offset: scala.Double): js.Array[scala.Double] = js.native
  /**
  	 * Copies x, y and z into the provided array-like.
  	 * @param array array-like to store the vector to.
  	 * @param offset (optional) optional offset into the array.
  	 * @return The provided array-like.
  	 */
  def toArray(xyz: stdLib.ArrayLike[scala.Double]): stdLib.ArrayLike[scala.Double] = js.native
  def toArray(xyz: stdLib.ArrayLike[scala.Double], offset: scala.Double): stdLib.ArrayLike[scala.Double] = js.native
  def transformDirection(m: threeLib.srcMathMatrix4Mod.Matrix4): this.type = js.native
  def unproject(camera: threeLib.srcCamerasCameraMod.Camera): this.type = js.native
}

