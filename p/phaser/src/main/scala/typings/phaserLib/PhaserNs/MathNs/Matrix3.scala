package typings
package phaserLib.PhaserNs.MathNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A three-dimensional matrix.
  * 
  * Defaults to the identity matrix when instantiated.
  */
@JSGlobal("Phaser.Math.Matrix3")
@js.native
/**
  * 
  * @param m Optional Matrix3 to copy values from.
  */
class Matrix3 () extends js.Object {
  def this(m: Matrix3) = this()
  /**
    * The matrix values.
    */
  var `val`: stdLib.Float32Array = js.native
  /**
    * Calculate the adjoint, or adjugate, of this Matrix.
    */
  def adjoint(): Matrix3 = js.native
  /**
    * Copy the values of a given Matrix into this Matrix.
    * @param src The Matrix to copy the values from.
    */
  def copy(src: Matrix3): Matrix3 = js.native
  /**
    * Calculate the determinant of this Matrix.
    */
  def determinant(): scala.Double = js.native
  /**
    * Set the values of this Matrix from the given array.
    * @param a The array to copy the values from.
    */
  def fromArray(a: js.Array[_]): Matrix3 = js.native
  /**
    * Copy the values of a given Matrix4 into this Matrix3.
    * @param m The Matrix4 to copy the values from.
    */
  def fromMat4(m: Matrix4): Matrix3 = js.native
  /**
    * Set the values of this Matrix from the given Quaternion.
    * @param q The Quaternion to set the values of this Matrix from.
    */
  def fromQuat(q: Quaternion): Matrix3 = js.native
  /**
    * Reset this Matrix to an identity (default) matrix.
    */
  def identity(): Matrix3 = js.native
  /**
    * Invert this Matrix.
    */
  def invert(): Matrix3 = js.native
  /**
    * Multiply this Matrix by the given Matrix.
    * @param src The Matrix to multiply this Matrix by.
    */
  def multiply(src: Matrix3): Matrix3 = js.native
  /**
    * [description]
    * @param m [description]
    */
  def normalFromMat4(m: Matrix4): Matrix3 = js.native
  /**
    * Apply a rotation transformation to this Matrix.
    * @param rad The angle in radians to rotate by.
    */
  def rotate(rad: scala.Double): Matrix3 = js.native
  /**
    * Apply a scale transformation to this Matrix.
    * 
    * Uses the `x` and `y` components of the given Vector to scale the Matrix.
    * @param v The Vector to scale this Matrix with.
    */
  def scale(v: Vector2): Matrix3 = js.native
  def scale(v: Vector3): Matrix3 = js.native
  def scale(v: Vector4): Matrix3 = js.native
  /**
    * This method is an alias for `Matrix3.copy`.
    * @param src The Matrix to set the values of this Matrix's from.
    */
  def set(src: Matrix3): Matrix3 = js.native
  /**
    * Translate this Matrix using the given Vector.
    * @param v The Vector to translate this Matrix with.
    */
  def translate(v: Vector2): Matrix3 = js.native
  def translate(v: Vector3): Matrix3 = js.native
  def translate(v: Vector4): Matrix3 = js.native
  /**
    * Transpose this Matrix.
    */
  def transpose(): Matrix3 = js.native
}

